package com.ph.service.strategy.data;

import com.ph.common.Product;
import com.ph.common.exception.ErrCode;
import com.ph.common.exception.PruleException;
import com.ph.entity.feature.*;
import com.ph.entity.pdl.PdlLoan;
import com.ph.entity.strategy.*;
import com.ph.entity.urule.RunTestTaskDetail;
import com.ph.service.domain.feature.*;
import com.ph.service.domain.pdl.PdlLoanDomain;
import com.ph.service.domain.strategy.*;
import com.ph.service.domain.urule.RunTestTaskDetailDomain;
import com.ph.tool.DateTool;
import com.ph.tool.UUIDTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class LoadData {

    @Autowired
    private PdlLoanDomain pdlLoanDomain;
    @Autowired
    private CreditcardSalaryFeaDomain creditcardSalaryFeaDomain;
    @Autowired
    private CreditcardSalaryFeaMaxDomain creditcardSalaryFeaMaxDomain;
    @Autowired
    private CreditcardSalaryFeaMinDomain creditcardSalaryFeaMinDomain;
    @Autowired
    private CreditcardSalaryFeaMeanDomain creditcardSalaryFeaMeanDomain;
    @Autowired
    private CreditcardSalaryFeaSumDomain creditcardSalaryFeaSumDomain;
    @Autowired
    private LoanMlAuditResultDomain loanMlAuditResultDomain;
    @Autowired
    private PdlMobileFea1Domain pdlMobileFea1Domain;
    @Autowired
    private PdlMobileFea2Domain pdlMobileFea2Domain;
    @Autowired
    private RuleBaiqishiFeaDomain ruleBaiqishiFeaDomain;
    @Autowired
    private RuleBangshengFeaDomain ruleBangshengFeaDomain;
    @Autowired
    private RuleBasicFeaDomain ruleBasicFeaDomain;
    @Autowired
    private RuleCreditcardFeaDomain ruleCreditcardFeaDomain;
    @Autowired
    private RuleDeviceFeaDomain ruleDeviceFeaDomain;
    @Autowired
    private RuleHousefundFeaDomain ruleHousefundFeaDomain;
    @Autowired
    private RuleInsideFeaDomain ruleInsideFeaDomain;
    @Autowired
    private RuleMobileFeaDomain ruleMobileFeaDomain;
    @Autowired
    private RulePaipaixinFeaDomain rulePaipaixinFeaDomain;
    @Autowired
    private RulePhoneContactFeaDomain rulePhoneContactFeaDomain;
    @Autowired
    private RulePhoneMessageFeaDomain rulePhoneMessageFeaDomain;
    @Autowired
    private RulePinganFea1Domain rulePinganFea1Domain;
    @Autowired
    private RulePinganFea3Domain rulePinganFea3Domain;
    @Autowired
    private RulePinganFea9Domain rulePinganFea9Domain;
    @Autowired
    private RuleShzxFeaDomain ruleShzxFeaDomain;
    @Autowired
    private RuleSuanhuaFeaDomain ruleSuanhuaFeaDomain;
    @Autowired
    private RuleTencentFeaDomain ruleTencentFeaDomain;
    @Autowired
    private RuleTianjiFeaDomain ruleTianjiFeaDomain;
    @Autowired
    private RuleTongdunFeaDomain ruleTongdunFeaDomain;
    @Autowired
    private RuleZhongxinFea1Domain ruleZhongxinFea1Domain;
    @Autowired
    private RuleZhongxinFea2Domain ruleZhongxinFea2Domain;
    @Autowired
    private RuleZhongxinFea3Domain ruleZhongxinFea3Domain;
    @Autowired
    private RuleZhongxinFea4Domain ruleZhongxinFea4Domain;
    @Autowired
    private RuleZhongxinFea5Domain ruleZhongxinFea5Domain;
    @Autowired
    private RuleZmxyFeaDomain ruleZmxyFeaDomain;

    @Autowired
    private RiskDecisionResultDomain riskDecisionResultDomain;
    @Autowired
    private RiskAnalysisDomain riskAnalysisDomain;
    @Autowired
    private RiskScoreDomain riskScoreDomain;
    @Autowired
    private RiskCharacteristicsDomain riskCharacteristicsDomain;
    @Autowired
    private RiskExecuteLogDomain riskExecuteLogDomain;
    @Autowired
    private RunTestTaskDetailDomain runTestTaskDetailDomain;

    //0912新增特征
    @Autowired
    private RuleCreditBankFeaDomain ruleCreditBankFeaDomain;
    @Autowired
    private RuleXinyanReportFeaDomain ruleXinyanReportFeaDomain;
    @Autowired
    private RuleXinyanWashblackFeaDomain ruleXinyanWashblackFeaDomain;

    //0914新增特征
    @Autowired
    private RuleYoumengFeaDomain ruleYoumengFeaDomain;

    //09.19新增特征
    @Autowired
    private RuleTaobaoFeaDomain ruleTaobaoFeaDomain;

    //09.27新增特征
    @Autowired
    private RuleMobileFea1Domain ruleMobileFea1Domain;


    /**
     * 载入特征对象
     *
     * @param serialId
     * @return
     * @throws Exception
     */
    public Map<String, Object> loadData(Integer serialId) throws Exception {

        Map<String, Object> data = new HashMap<>();

        PdlLoan pdlLoan = pdlLoanDomain.findBySerialId(serialId);
        if (pdlLoan == null) {
            throw new PruleException(ErrCode.PDL_LOAN_UNFOUND);
        }
        CreditcardSalaryFea creditcardSalaryFea = creditcardSalaryFeaDomain.findBySerialId(serialId);
        CreditcardSalaryFeaMin creditcardSalaryFeaMin = creditcardSalaryFeaMinDomain.findBySerialId(serialId);
        CreditcardSalaryFeaMax creditcardSalaryFeaMax = creditcardSalaryFeaMaxDomain.findBySerialId(serialId);
        CreditcardSalaryFeaMean creditcardSalaryFeaMean = creditcardSalaryFeaMeanDomain.findBySerialId(serialId);
        CreditcardSalaryFeaSum creditcardSalaryFeaSum = creditcardSalaryFeaSumDomain.findBySerialId(serialId);
        LoanMlAuditResult loanMlAuditResult = loanMlAuditResultDomain.findBySerialId(serialId);
        PdlMobileFea1 pdlMobileFea1 = pdlMobileFea1Domain.findBySerialId(serialId);
        PdlMobileFea2 pdlMobileFea2 = pdlMobileFea2Domain.findBySerialId(serialId);
        RuleBaiqishiFea ruleBaiqishiFea = ruleBaiqishiFeaDomain.findBySerialId(serialId);
        RuleBangshengFea ruleBangshengFea = ruleBangshengFeaDomain.findBySerialId(serialId);
        RuleBasicFea ruleBasicFea = ruleBasicFeaDomain.findBySerialId(serialId);
        RuleCreditcardFea ruleCreditcardFea = ruleCreditcardFeaDomain.findBySerialId(serialId);
        RuleDeviceFea ruleDeviceFea = ruleDeviceFeaDomain.findBySerialId(serialId);
        RuleHousefundFea ruleHousefundFea = ruleHousefundFeaDomain.findBySerialId(serialId);
        RuleInsideFea ruleInsideFea = ruleInsideFeaDomain.findBySerialId(serialId);
        RuleMobileFea ruleMobileFea = ruleMobileFeaDomain.findBySerialId(serialId);
        RulePaipaixinFea rulePaipaixinFea = rulePaipaixinFeaDomain.findBySerialId(serialId);
        RulePhoneContactFea rulePhoneContactFea = rulePhoneContactFeaDomain.findBySerialId(serialId);
        RulePhoneMessageFea rulePhoneMessageFea = rulePhoneMessageFeaDomain.findBySerialId(serialId);
        RulePinganFea1 rulePinganFea1 = rulePinganFea1Domain.findBySerialId(serialId);
        RulePinganFea3 rulePinganFea3 = rulePinganFea3Domain.findBySerialId(serialId);
        RulePinganFea9 rulePinganFea9 = rulePinganFea9Domain.findBySerialId(serialId);
        RuleShzxFea ruleShzxFea = ruleShzxFeaDomain.findBySerialId(serialId);
        RuleSuanhuaFea ruleSuanhuaFea = ruleSuanhuaFeaDomain.findBySerialId(serialId);
        RuleTencentFea ruleTencentFea = ruleTencentFeaDomain.findBySerialId(serialId);
        RuleTianjiFea ruleTianjiFea = ruleTianjiFeaDomain.findBySerialId(serialId);
        RuleTongdunFea ruleTongdunFea = ruleTongdunFeaDomain.findBySerialId(serialId);
        RuleZhongxinFea1 ruleZhongxinFea1 = ruleZhongxinFea1Domain.findBySerialId(serialId);
        RuleZhongxinFea2 ruleZhongxinFea2 = ruleZhongxinFea2Domain.findBySerialId(serialId);
        RuleZhongxinFea3 ruleZhongxinFea3 = ruleZhongxinFea3Domain.findBySerialId(serialId);
        RuleZhongxinFea4 ruleZhongxinFea4 = ruleZhongxinFea4Domain.findBySerialId(serialId);
        RuleZhongxinFea5 ruleZhongxinFea5 = ruleZhongxinFea5Domain.findBySerialId(serialId);
        RuleZmxyFea ruleZmxyFea = ruleZmxyFeaDomain.findBySerialId(serialId);
        RuleCreditBankFea ruleCreditBankFea = ruleCreditBankFeaDomain.findBySerialId(serialId);
        RuleXinyanReportFea ruleXinyanReportFea = ruleXinyanReportFeaDomain.findBySerialId(serialId);
        RuleXinyanWashblackFea ruleXinyanWashblackFea = ruleXinyanWashblackFeaDomain.findBySerialId(serialId);
        RuleYoumengFea ruleYoumengFea = ruleYoumengFeaDomain.findBySerialId(serialId);
        RuleTaobaoFea ruleTaobaoFea = ruleTaobaoFeaDomain.findBySerialId(serialId);
        RuleMobileFea1 ruleMobileFea1 = ruleMobileFea1Domain.findBySerialId(serialId);

        data.put("PdlLoan", pdlLoan);
        if (ruleMobileFea1 != null) {
            data.put("RuleMobileFea1", ruleMobileFea1);
        }
        if (ruleYoumengFea != null) {
            data.put("RuleYoumengFea", ruleYoumengFea);
        }
        if (ruleTaobaoFea != null) {
            data.put("RuleTaobaoFea", ruleTaobaoFea);
        }
        if (ruleCreditBankFea != null) {
            data.put("RuleCreditBankFea", ruleCreditBankFea);
        }
        if (ruleXinyanReportFea != null) {
            data.put("RuleXinyanReportFea", ruleXinyanReportFea);
        }
        if (ruleXinyanWashblackFea != null) {
            data.put("RuleXinyanWashblackFea", ruleXinyanWashblackFea);
        }
        if (creditcardSalaryFea != null) {
            data.put("CreditcardSalaryFea", creditcardSalaryFea);
        }
        if (creditcardSalaryFeaMin != null) {
            data.put("CreditcardSalaryFeaMin", creditcardSalaryFeaMin);
        }
        if (creditcardSalaryFeaMax != null) {
            data.put("CreditcardSalaryFeaMax", creditcardSalaryFeaMax);
        }
        if (creditcardSalaryFeaMean != null) {
            data.put("CreditcardSalaryFeaMean", creditcardSalaryFeaMean);
        }
        if (creditcardSalaryFeaSum != null) {
            data.put("CreditcardSalaryFeaSum", creditcardSalaryFeaSum);
        }
        if (loanMlAuditResult != null) {
            data.put("LoanMlAuditResult", loanMlAuditResult);
        }
        if (pdlMobileFea1 != null) {
            data.put("PdlMobileFea1", pdlMobileFea1);
        }
        if (pdlMobileFea2 != null) {
            data.put("PdlMobileFea2", pdlMobileFea2);
        }
        if (ruleBaiqishiFea != null) {
            data.put("RuleBaiqishiFea", ruleBaiqishiFea);
        }
        if (ruleBangshengFea != null) {
            data.put("RuleBangshengFea", ruleBangshengFea);
        }
        if (ruleBasicFea != null) {
            data.put("RuleBasicFea", ruleBasicFea);
        }
        if (ruleCreditcardFea != null) {
            data.put("RuleCreditcardFea", ruleCreditcardFea);
        }
        if (ruleDeviceFea != null) {
            data.put("RuleDeviceFea", ruleDeviceFea);
        }
        if (ruleHousefundFea != null) {
            data.put("RuleHousefundFea", ruleHousefundFea);
        }
        if (ruleInsideFea != null) {
            data.put("RuleInsideFea", ruleInsideFea);
        }
        if (ruleMobileFea != null) {
            data.put("RuleMobileFea", ruleMobileFea);
        }
        if (rulePaipaixinFea != null) {
            data.put("RulePaipaixinFea", rulePaipaixinFea);
        }
        if (rulePhoneMessageFea != null) {
            data.put("RulePhoneMessageFea", rulePhoneMessageFea);
        }
        if (rulePhoneContactFea != null) {
            data.put("RulePhoneContactFea", rulePhoneContactFea);
        }
        if (rulePinganFea1 != null) {
            data.put("RulePinganFea1", rulePinganFea1);
        }
        if (rulePinganFea3 != null) {
            data.put("RulePinganFea3", rulePinganFea3);
        }
        if (rulePinganFea9 != null) {
            data.put("RulePinganFea9", rulePinganFea9);
        }
        if (ruleShzxFea != null) {
            data.put("RuleShzxFea", ruleShzxFea);
        }
        if (ruleSuanhuaFea != null) {
            data.put("RuleSuanhuaFea", ruleSuanhuaFea);
        }
        if (ruleTencentFea != null) {
            data.put("RuleTencentFea", ruleTencentFea);
        }
        if (ruleTianjiFea != null) {
            data.put("RuleTianjiFea", ruleTianjiFea);
        }
        if (ruleTongdunFea != null) {
            data.put("RuleTongdunFea", ruleTongdunFea);
        }
        if (ruleZhongxinFea1 != null) {
            data.put("RuleZhongxinFea1", ruleZhongxinFea1);
        }
        if (ruleZhongxinFea2 != null) {
            data.put("RuleZhongxinFea2", ruleZhongxinFea2);
        }
        if (ruleZhongxinFea3 != null) {
            data.put("RuleZhongxinFea3", ruleZhongxinFea3);
        }
        if (ruleZhongxinFea4 != null) {
            data.put("RuleZhongxinFea4", ruleZhongxinFea4);
        }
        if (ruleZhongxinFea5 != null) {
            data.put("RuleZhongxinFea5", ruleZhongxinFea5);
        }
        if (ruleZmxyFea != null) {
            data.put("RuleZmxyFea", ruleZmxyFea);
        }

        return data;
    }


    /**
     * 生成决策结果对象
     *
     * @param serialId
     * @param product
     * @param packageId
     * @return
     * @throws Exception
     */
    public Map<String, Object> genData(Integer serialId, String product, String packageId, String flowId, Integer taskId) throws Exception {

        PdlLoan pdlLoan = pdlLoanDomain.findBySerialId(serialId);
        if (pdlLoan == null) {
            throw new PruleException(ErrCode.PDL_LOAN_UNFOUND);
        }
        String uuid = UUIDTool.genUUID();

        String riskProcessNo = product + "/" + packageId;
        if (flowId != null && !"".equals(flowId)) {
            riskProcessNo = riskProcessNo + "/" + flowId;
        }

        Map<String, Object> data = new HashMap<>();

        RiskDecisionResult riskDecisionResult = new RiskDecisionResult();
        riskDecisionResult.setApplyNo(serialId);
        riskDecisionResult.setCreateTime(DateTool.getCurrentTime());
        riskDecisionResult.setUpdateTime(DateTool.getCurrentTime());
        riskDecisionResult.setRiskUserId(pdlLoan.getUserId());
        riskDecisionResult.setRiskAnalysisId(uuid);
        riskDecisionResult.setRiskProcessNo(riskProcessNo);

        RiskScore riskScore = new RiskScore();
        riskScore.setApplyNo(serialId);
        riskScore.setCreateTime(DateTool.getCurrentTime());
        riskScore.setUpdateTime(DateTool.getCurrentTime());
        riskScore.setRiskUserId(pdlLoan.getUserId());
        riskScore.setRiskAnalysisId(uuid);
        riskScore.setRiskProcessNo(riskProcessNo);

        RiskAnalysis riskAnalysis = new RiskAnalysis();
        riskAnalysis.setApplyNo(serialId);
        riskAnalysis.setCreateTime(DateTool.getCurrentTime());
        riskAnalysis.setUpdateTime(DateTool.getCurrentTime());
        riskAnalysis.setRiskUserId(pdlLoan.getUserId());
        riskAnalysis.setRiskAnalysisId(uuid);
        riskAnalysis.setRiskProcessNo(riskProcessNo);

        RiskCharacteristics riskCharacteristics = new RiskCharacteristics();
        riskCharacteristics.setApplyNo(serialId);
        riskCharacteristics.setCreateTime(DateTool.getCurrentTime());
        riskCharacteristics.setUpdateTime(DateTool.getCurrentTime());
        riskCharacteristics.setRiskUserId(pdlLoan.getUserId());
        riskCharacteristics.setRiskAnalysisId(uuid);
        riskCharacteristics.setRiskProcessNo(riskProcessNo);

        RiskExecuteLog riskExecuteLog = new RiskExecuteLog();
        riskExecuteLog.setApplyNo(serialId);
        riskExecuteLog.setCreateTime(DateTool.getCurrentTime());
        riskExecuteLog.setRiskAnalysisId(uuid);

        RunTestTaskDetail runTestTaskDetail = new RunTestTaskDetail();
        runTestTaskDetail.setTaskId(taskId);
        runTestTaskDetail.setSerialId(serialId);
        runTestTaskDetail.setUuid(uuid);
        runTestTaskDetail.setCreateTime(DateTool.getCurrentTime());
        runTestTaskDetail.setUpTime(DateTool.getCurrentTime());
        runTestTaskDetail.setStatus(Product.RUN_TEST_INIT);

        data.put("RiskDecisionResult", riskDecisionResult);
        data.put("RiskScore", riskScore);
        data.put("RiskAnalysis", riskAnalysis);
        data.put("RiskCharacteristics", riskCharacteristics);
        data.put("RiskExecuteLog", riskExecuteLog);
        data.put("RunTestTaskDetail", runTestTaskDetail);

        return data;
    }

    /**
     * 写入决策结果表
     *
     * @param data
     * @param param
     * @param isPreview true预览试跑
     * @throws Exception
     */
    public void writeBack(Map<String, Object> data, Map<String, Object> param, boolean isPreview) throws Exception {
        for (Map.Entry<String, Object> iterater : data.entrySet()) {
            String className = iterater.getKey();
            Object classBody = iterater.getValue();

            switch (className) {
                case "RiskDecisionResult" : {
                    RiskDecisionResult riskDecisionResult = (RiskDecisionResult) classBody;
                    riskDecisionResult.setUpdateTime(DateTool.getCurrentTime());
                    if(isPreview){
                        riskDecisionResultDomain.insertPreview(riskDecisionResult);
                    }else{
                        riskDecisionResultDomain.insert(riskDecisionResult);
                    }
                } break;
                case "RiskAnalysis" : {
                    RiskAnalysis riskAnalysis = (RiskAnalysis) classBody;
                    riskAnalysis.setUpdateTime(DateTool.getCurrentTime());
                    if (param.get("Risk_Result_Lable") != null) {
                        riskAnalysis.setRiskResultLabel(param.get("Risk_Result_Lable").toString());
                    }
                    if (param.get("Risk_Result_Reject") != null) {
                        riskAnalysis.setRiskResultReject(param.get("Risk_Result_Reject").toString());
                    }
                    if (param.get("Risk_Result_Reject_Null") != null) {
                        riskAnalysis.setRiskResultRejectNull(param.get("Risk_Result_Reject_Null").toString());
                    }
                    if (param.get("Risk_Result_Decision") != null) {
                        riskAnalysis.setRiskResultDecision(param.get("Risk_Result_Decision").toString());
                    }
                    if (param.get("Risk_State") != null) {
                        riskAnalysis.setRiskState(param.get("Risk_State").toString());
                    }
                    if(isPreview){
                        riskAnalysisDomain.insertPreview(riskAnalysis);
                    }else{
                        riskAnalysisDomain.insert(riskAnalysis);
                    }
                } break;
                case "RiskScore" : {
                    RiskScore riskScore = (RiskScore) classBody;
                    riskScore.setUpdateTime(DateTool.getCurrentTime());
                    //risk_score表，需要根据MAP_RISK_SCORE分裂
                    Map<Object, Object> MAP_RISK_SCORE = (HashMap)param.get("MAP_RISK_SCORE");
                    if (MAP_RISK_SCORE != null && MAP_RISK_SCORE.size() > 0) {
                        for(Map.Entry<Object, Object> iter : MAP_RISK_SCORE.entrySet()) {
                            String key = iter.getKey() == null ? "" : iter.getKey().toString();
                            String value = iter.getValue() == null ? "" : iter.getValue().toString();
                            riskScore.setId(null);
                            riskScore.setKey(key);
                            riskScore.setValue(value);
                            if(isPreview){
                                riskScoreDomain.insertPreview(riskScore);
                            }else{
                                riskScoreDomain.insert(riskScore);
                            }
                        }
                    }
                } break;
                case "RiskCharacteristics" : {
                    RiskCharacteristics riskCharacteristics = (RiskCharacteristics) classBody;
                    riskCharacteristics.setUpdateTime(DateTool.getCurrentTime());
                    //risk_charactertics表，需要根据MAP_RISK_CHAR分裂
                    Map<Object, Object> MAP_RISK_CHAR = (HashMap)param.get("MAP_RISK_CHAR");
                    if (MAP_RISK_CHAR != null && MAP_RISK_CHAR.size() > 0) {
                        for(Map.Entry<Object, Object> iter : MAP_RISK_CHAR.entrySet()) {
                            String key = iter.getKey() == null ? "" : iter.getKey().toString();
                            String value = iter.getValue() == null ? "" : iter.getValue().toString();
                            riskCharacteristics.setId(null);
                            riskCharacteristics.setKey(key);
                            riskCharacteristics.setValue(value);
                            if(isPreview){
                                riskCharacteristicsDomain.insertPreview(riskCharacteristics);
                            }else{
                                riskCharacteristicsDomain.insert(riskCharacteristics);
                            }
                        }
                    }
                } break;
                case "RunTestTaskDetail": {
                    //批量试跑任务才会进入此分支
                    RunTestTaskDetail runTestTaskDetail = (RunTestTaskDetail) classBody;
                    runTestTaskDetail.setStatus(Product.RUN_TEST_SUC);
                    runTestTaskDetail.setUpTime(DateTool.getCurrentTime());
                    if (isPreview) {
                        runTestTaskDetailDomain.insert(runTestTaskDetail);
                    }
                }
                break;
            }
        }
    }

}
