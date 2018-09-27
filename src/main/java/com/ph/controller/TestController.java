package com.ph.controller;

import com.ph.entity.httovo.RestResponse;
import com.ph.tool.UUIDTool;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Author: Hardy
 * Date:   2018/7/19 17:25
 * Description:
 **/
@RestController
public class TestController {

    @RequestMapping(value = "/alive", method = RequestMethod.GET)
    public RestResponse alive(HttpServletRequest request) throws Exception{

        return new RestResponse<>().data("OK");
    }

    @RequestMapping(value = "/uuid", method = RequestMethod.GET)
    public RestResponse uuid(HttpServletRequest request) throws Exception{
        return new RestResponse<>().data(UUIDTool.genUUID());
    }

}