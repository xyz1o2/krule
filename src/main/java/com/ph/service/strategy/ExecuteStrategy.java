package com.ph.service.strategy;

import com.bstek.urule.Utils;
import com.bstek.urule.model.rete.CriteriaNode;
import com.bstek.urule.model.rete.ObjectTypeNode;
import com.bstek.urule.model.rete.Rete;
import com.bstek.urule.model.rete.ReteNode;
import com.bstek.urule.model.rule.RuleInfo;
import com.bstek.urule.model.rule.lhs.Criteria;
import com.bstek.urule.model.rule.lhs.VariableLeftPart;
import com.bstek.urule.runtime.KnowledgePackage;
import com.bstek.urule.runtime.KnowledgeSession;
import com.bstek.urule.runtime.KnowledgeSessionFactory;
import com.bstek.urule.runtime.response.RuleExecutionResponse;
import com.bstek.urule.runtime.service.KnowledgeService;
import com.ph.common.exception.ErrCode;
import com.ph.common.exception.PruleException;
import com.ph.entity.strategy.RiskExecuteLog;
import com.ph.service.domain.strategy.RiskExecuteLogDomain;
import com.ph.service.strategy.data.LoadData;
import com.ph.tool.JsonTool;
import com.ph.tool.StringTool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ExecuteStrategy {

    private static final Logger log = LoggerFactory.getLogger(ExecuteStrategy.class);

    @Autowired
    private LoadData loadData;
    @Autowired
    private RiskExecuteLogDomain riskExecuteLogDomain;

    /**
     * 执行决策逻辑
     *
     * @param productLine
     * @param strategyType
     * @param packageId
     * @param flowId
     * @param serialId
     * @param isPreview true预览试跑
     * @return
     * @throws Exception
     */
    public Object execute(String productLine, String strategyType, String packageId, String flowId, Integer serialId, Boolean isPreview, Integer taskId) throws Exception {

        //1.加载需要引用的决策数据
        Map<String, Object> dataIn = loadData.loadData(serialId);
        Map<String, Object> dataOut = loadData.genData(serialId, productLine, packageId, flowId, taskId);

        //2.从Spring中获取KnowledgeService接口实例
        KnowledgeService service = (KnowledgeService) Utils.getApplicationContext().getBean(KnowledgeService.BEAN_ID);
        KnowledgePackage knowledgePackage = service.getKnowledge(productLine + "/" + packageId);
        KnowledgeSession session = KnowledgeSessionFactory.newKnowledgeSession(knowledgePackage);

        //3.将需要读取的数据插入到KnowledgeSession中
        for (Map.Entry<String, Object> iterater : dataIn.entrySet()) {
            String className = iterater.getKey();
            Object classBody = iterater.getValue();
            session.insert(classBody);
        }

        //4.将需要写入的数据新建对象，并写入session
        for (Map.Entry<String, Object> iterater : dataOut.entrySet()) {
            String className = iterater.getKey();
            Object classBody = iterater.getValue();
            session.insert(classBody);
        }

        //5.执行所有满足条件的规则
        String rulesMatch = "";
        try {
            RuleExecutionResponse response = session.fireRules();
            List<RuleInfo> ruleInfosFired = response.getFiredRules();
            if (ruleInfosFired.size() > 0) {
                for (RuleInfo ruleInfo : ruleInfosFired) {
                    rulesMatch = rulesMatch + ";" + ruleInfo.getName();
                }
            }
        } catch (Exception e) {
            rulesMatch = "发生错误，[" + e.getMessage() + "]";
            log.error("决策时系统异常",e);
            throw new PruleException(ErrCode.RULE_RUN_ERROR);
        } finally {
            this.writeLog(knowledgePackage, dataIn, dataOut, rulesMatch, session.getParameters(), isPreview);
        }

        //6.后续操作，写入表或者其他操作
        //6.1 获取返回值
        Object result = null;
        if (session.getParameter("RESULT") != null) {
            result = session.getParameter("RESULT");
        }
        //6.2 获取一些预定义参数
        Map<String, Object> param = new HashMap<>();
        if (session.getParameter("MAP_RISK_SCORE") != null) {
            param.put("MAP_RISK_SCORE", session.getParameter("MAP_RISK_SCORE"));
        }
        if (session.getParameter("MAP_RISK_CHAR") != null) {
            param.put("MAP_RISK_CHAR", session.getParameter("MAP_RISK_CHAR"));
        }
        if (session.getParameter("Risk_Result_Lable") != null) {
            param.put("Risk_Result_Lable", session.getParameter("Risk_Result_Lable"));
        }
        if (session.getParameter("Risk_Result_Reject") != null) {
            param.put("Risk_Result_Reject", session.getParameter("Risk_Result_Reject"));
        }
        if (session.getParameter("Risk_Result_Reject_Null") != null) {
            param.put("Risk_Result_Reject_Null", session.getParameter("Risk_Result_Reject_Null"));
        }
        if (result != null) {
            String js  = JsonTool.toJson(result);
            Map tmp = JsonTool.toObject(js, HashMap.class);
            if (tmp.get("risk_result_decision") != null) {
                param.put("Risk_Result_Decision", tmp.get("risk_result_decision"));
            }
            if (tmp.get("risk_state") != null) {
                param.put("Risk_State", tmp.get("risk_state"));
            }
        }
        loadData.writeBack(dataOut, param, isPreview);
        return result;
    }


    /**
     * 写入决策审计日志表
     *
     * @param knowledgePackage
     * @param dataIn
     * @param dataOut
     * @param rules
     * @param isPreview true预览试跑
     * @throws Exception
     */
    public void writeLog(KnowledgePackage knowledgePackage, Map<String, Object> dataIn, Map<String, Object> dataOut, String rules, Map<String, Object> params, Boolean isPreview) throws Exception {

        Rete rete = knowledgePackage.getRete();
        List<ObjectTypeNode> objectTypeNodes = rete.getObjectTypeNodes();
        Map<String, Map> dataSnap = new HashMap<>();
        if (!CollectionUtils.isEmpty(objectTypeNodes)) {

            for (ObjectTypeNode objectTypeNode : objectTypeNodes) {
                //取出策略类的类名
                String[] classNames = objectTypeNode.getObjectTypeClass().split("\\.");
                Map columnMap = new HashMap();
                if (classNames.length > 0) {

                    String className = classNames[classNames.length - 1];
                    //取出该策略类使用到的所有字段
                    List<ReteNode> reteNodelist = objectTypeNode.getChildrenNodes();
                    for (ReteNode reteNode : reteNodelist) {
                        Criteria criteria = ((CriteriaNode) reteNode).getCriteria();
                        VariableLeftPart leftPart = (VariableLeftPart) criteria.getLeft().getLeftPart();
                        String variableName = leftPart.getVariableName();

                        if (dataIn.containsKey(className)) {
                            Class<?> c = Class.forName(dataIn.get(className).getClass().getName());
                            Object obj = dataIn.get(className);
                            Method method = c.getMethod(StringTool.getMethodName("get", variableName));
                            columnMap.put(variableName, method.invoke(obj));
                        }
                    }

                    if (dataSnap.containsKey(className)) {
                        Map map = dataSnap.get(className);
                        map.putAll(columnMap);
                        dataSnap.put(className, map);
                    } else {
                        dataSnap.put(className, columnMap);
                    }
                }
            }
        }

        RiskExecuteLog riskExecuteLog = (RiskExecuteLog) dataOut.get("RiskExecuteLog");
        riskExecuteLog.setInput(JsonTool.toJson(dataSnap));
        riskExecuteLog.setRules(rules);
        riskExecuteLog.setParams(JsonTool.toJson(params));
        if(isPreview){
            riskExecuteLogDomain.insertPreview(riskExecuteLog);
        }else{
            riskExecuteLogDomain.insert(riskExecuteLog);
        }
    }
}
