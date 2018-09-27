package com.ph.controller;


import com.ph.entity.httovo.RuleRunRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
public class IndexController extends BaseController{


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Object home(HttpServletRequest request) throws Exception{
        return "index";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public Object index(HttpServletRequest request) throws Exception{
        return "index";
    }

    @RequestMapping(value = "/username", method = RequestMethod.GET)
    @ResponseBody
    public Object username(HttpServletRequest request) throws Exception{
        return request.getAttribute("username") == null ? "" : request.getAttribute("username").toString();
    }

}
