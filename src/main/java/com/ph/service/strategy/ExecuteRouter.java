package com.ph.service.strategy;

import com.ph.common.Product;
import com.ph.common.exception.ErrCode;
import com.ph.common.exception.PruleException;
import com.ph.entity.httovo.RestResponse;
import com.ph.entity.pdl.PdlLoan;
import com.ph.entity.urule.RunTestTask;
import com.ph.service.domain.pdl.PdlLoanDomain;
import com.ph.service.domain.urule.RunTestTaskDomain;
import com.ph.tool.DateTool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Component
public class ExecuteRouter {

    //0停止 1运行
    public static Integer previewRunFlag = 0;
    private static final Logger log = LoggerFactory.getLogger(ExecuteRouter.class);

    @Autowired
    private StrategyFactory strategyFactory;
    @Autowired
    private RunTestTaskDomain runTestTaskDomain;
    @Autowired
    private PdlLoanDomain pdlLoanDomain;

    /**
     * 决策任务分发，根据决策类型执行决策逻辑
     *
     * @param productLine
     * @param strategyType
     * @param packageId
     * @param flowId
     * @param serialId
     * @param isPreview    true预览试跑
     * @return
     * @throws Exception
     */
    public RestResponse dispatcher(String productLine, String strategyType, String packageId, String flowId, Integer serialId, Boolean isPreview, Integer taskId) throws Exception {

        ExecuteStrategy executeStrategy = strategyFactory.getInstance(strategyType);
        Object result = executeStrategy.execute(productLine, strategyType, packageId, flowId, serialId, isPreview, taskId);
        return new RestResponse<>().data(result);
    }


    /**
     * 决策任务试跑
     *
     * @return
     * @throws Exception
     */
    public RestResponse previewRun() throws Exception {

        log.info("[PREVEIW_TEST_RUN] 试跑任务被开启....");
        while (true) {
            if (previewRunFlag == 0) {
                log.info("[PREVEIW_TEST_RUN] 试跑任务被关停....");
                return new RestResponse<>().data("[PREVEIW_TEST_RUN] 试跑任务被关停");
            }
            List<RunTestTask> runTestTaskList = runTestTaskDomain.findAllTask();
            if (CollectionUtils.isEmpty(runTestTaskList)) {
                Thread.sleep(10);
                log.info("[PREVEIW_TEST_RUN] 当前没有试跑任务....");
                continue;
            }

            for (RunTestTask runTestTask : runTestTaskList) {
                previewRunSingleTask(runTestTask);
            }
        }

    }


    /**
     * 决策任务试跑(单个任务事务控制)
     *
     * @return
     * @throws Exception
     */
    @Transactional
    public boolean previewRunSingleTask(RunTestTask runTestTask) throws Exception {
        try {
            int type = runTestTask.getType();
            if (type == Product.PREVIEW_TYPE_SINGLE) {
                int serialId = runTestTask.getSerialId();
                if (serialId <= 0) {
                    throw new PruleException(ErrCode.PARAM_ERR_SERIAL_ID);
                }
                this.dispatcher(runTestTask.getProductLine(), runTestTask.getStrategyType(), runTestTask.getPackageId(),
                        runTestTask.getFlowId(), runTestTask.getSerialId(), true, runTestTask.getId());

            } else {
                int startTime = runTestTask.getStartTime();
                int endTime = runTestTask.getEndTime();
                if (startTime <= 0 || endTime <= 0 || startTime < endTime) {
                    throw new PruleException(ErrCode.PARAM_ERR_SERIAL_ID);
                }
                List<PdlLoan> pdlLoanList = pdlLoanDomain.findListByTime(startTime, endTime);
                if (!CollectionUtils.isEmpty(pdlLoanList)) {
                    for(PdlLoan pdlLoan : pdlLoanList){
                        this.dispatcher(runTestTask.getProductLine(), runTestTask.getStrategyType(), runTestTask.getPackageId(),
                                runTestTask.getFlowId(), pdlLoan.getSerialId(), true, runTestTask.getId());
                    }
                }

            }
            runTestTask.setStatus(Product.RUN_TEST_SUC);
            runTestTask.setUpTime(DateTool.getCurrentTime());
            runTestTaskDomain.update(runTestTask);
            log.info("[PREVEIW_TEST_RUN] 试跑任务执行成功 taskId=" + runTestTask.getId());
        } catch (Exception e) {
            runTestTask.setStatus(Product.RUN_TEST_FAIL);
            runTestTask.setUpTime(DateTool.getCurrentTime());
            runTestTaskDomain.update(runTestTask);
            log.error("[PREVEIW_TEST_RUN] 试跑任务执行失败 taskId=" + runTestTask.getId(), e);
            return false;
        }
        return true;
    }

}
