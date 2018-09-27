package com.ph.controller;

import com.ph.entity.httovo.RestResponse;
import com.ph.entity.httovo.RuleRunTaskRequest;
import com.ph.entity.urule.RunTestTask;
import com.ph.service.domain.urule.RunTestTaskDomain;
import com.ph.service.domain.urule.UserAuthDomain;
import com.ph.tool.DateTool;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("run/test")
public class RunTestController extends BaseController {

    private static final Logger log = LoggerFactory.getLogger(RunTestController.class);

    @Autowired
    private RunTestTaskDomain runTestTaskDomain;
    @Autowired
    private UserAuthDomain userAuthDomain;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Object testPage() {
        return "test";
    }

    @ApiOperation("获取用户有权限的项目列表")
    @RequestMapping(value = "/page/getAuthProjectList", method = RequestMethod.GET)
    @ResponseBody
    public Object getAuthProjectList(HttpServletRequest req) {
        String username = req.getAttribute("username").toString();
        return userAuthDomain.findAuthProjectList(username);
    }

    @ApiOperation("获取用户的任务列表")
    @RequestMapping(value = "/page/getAuthTestTask", method = RequestMethod.GET)
    @ResponseBody
    public Object getAuthTestTask(HttpServletRequest req) {
        String username = req.getAttribute("username").toString();
        return runTestTaskDomain.findTaskByUsername(username);
    }

    @ApiOperation("策略试跑任务添加")
    @RequestMapping(value = "/page/addStrategyTask", method = RequestMethod.GET)
    @ResponseBody
    public Object addStrategyTask(@Valid RuleRunTaskRequest request, HttpServletRequest req) {

        try {
            Integer nowTs = DateTool.getCurrentTime();
            String username = req.getAttribute("username").toString();
            String productLine = request.getProduct_line();
            String strategyType = request.getStrategy_type();
            String packageId = request.getPackage_id();
            String flowId = request.getFlow_id();
            Integer type = request.getType();
            Integer serialId = request.getSerial_id();
            Integer startTime = request.getStart_time();
            Integer endTime = request.getEnd_time();

            RunTestTask runTestTask = new RunTestTask(null, username, productLine, strategyType, packageId, flowId, type,
                    serialId, startTime, endTime, 0, nowTs, nowTs);
            runTestTaskDomain.insert(runTestTask);
            return new RestResponse<>().data("OK");
        } catch (Exception e) {
            return new RestResponse<>().data(e.getMessage());
        }
    }


    @ApiOperation("获取任务结果")
    @RequestMapping(value = "/page/getTestTaskResult", method = RequestMethod.GET)
    @ResponseBody
    public Object getTestTaskResult(HttpServletRequest req) throws Exception {

        //TODO 传入taskId 获取taskId执行结果 username&taskId不能越权
        String username = req.getAttribute("username").toString();
        return runTestTaskDomain.findTaskByUsername(username);
    }

}
