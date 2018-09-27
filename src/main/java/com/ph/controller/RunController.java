package com.ph.controller;

import com.ph.entity.httovo.RestResponse;
import com.ph.entity.httovo.RuleRunRequest;
import com.ph.service.strategy.ExecuteRouter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@RestController
@RequestMapping("run")
public class RunController extends BaseController{

    private static final Logger log = LoggerFactory.getLogger(RunController.class);

    @Autowired
    private ExecuteRouter executeRouter;


    //订单策略执行
    @RequestMapping(value = "/strategy", method = RequestMethod.GET)
    public RestResponse runStrategy(@Valid RuleRunRequest request) throws Exception {

        String productLine = request.getProduct_line();
        String strategyType = request.getStrategy_type();
        String packageId = request.getPackage_id();
        String flowId = request.getFlow_id();
        Integer serialId = request.getSerial_id();

        return executeRouter.dispatcher(productLine, strategyType, packageId, flowId, serialId, false, -1);
    }

    //订单策略单例试跑
    @RequestMapping(value = "/preview/strategy/single", method = RequestMethod.GET)
    @ResponseBody
    public RestResponse runStrategySingle(@Valid RuleRunRequest request) throws Exception {

        String productLine = request.getProduct_line();
        String strategyType = request.getStrategy_type();
        String packageId = request.getPackage_id();
        String flowId = request.getFlow_id();
        Integer serialId = request.getSerial_id();

        return executeRouter.dispatcher(productLine, strategyType, packageId, flowId, serialId, true, -1);
    }

    //订单策略批量试跑
    @RequestMapping(value = "/preview/strategy/task", method = RequestMethod.GET)
    @ResponseBody
    public RestResponse runStrategyTask(HttpServletRequest request) throws Exception {
        if("1".equals(request.getParameter("cmd"))){
            if(ExecuteRouter.previewRunFlag == 1){
                return new RestResponse<>().data(0);
            }
            ExecuteRouter.previewRunFlag = 1;
            executeRouter.previewRun();
        } else if("0".equals(request.getParameter("cmd"))){
            ExecuteRouter.previewRunFlag = 0;
        }
        return new RestResponse<>().data(1);
    }

}
