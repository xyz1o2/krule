package com.ph.controller;

import com.ph.common.Product;
import com.ph.entity.httovo.UserAuthSetRequest;
import com.ph.entity.urule.UserAuth;
import com.ph.service.domain.urule.UserAuthDomain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("permission")
public class PermissionController extends BaseController{

    @Autowired
    UserAuthDomain userAuthDomain;

    private static final Logger log = LoggerFactory.getLogger(PermissionController.class);


    //没有权限(该页面不需要enaccount登录拦截)
    @RequestMapping(value = "/error/noauth", method = RequestMethod.GET)
    public Object noAuth(HttpServletRequest request, ModelMap map) {
        String msg = request.getParameter("msg");
        String defaultMsg = "抱歉，您没有访问权限";
        if(StringUtils.isEmpty(msg)){
            map.put("msg",defaultMsg);
        }else{
            map.put("msg",msg);
        }
        return "noauth";
    }

    //权限主页面
    @RequestMapping(value = "/auth/index", method = RequestMethod.GET)
    public Object authIndex(HttpServletRequest request) {
        return "permission";
    }

    //查询所有用户信息
    @RequestMapping(value = "/auth/findAll", method = RequestMethod.GET)
    @ResponseBody
    public Object findAllUserAuth(HttpServletRequest request) {
        Map<String,Object> result = new HashMap();
        List<Map<String,Object>> qxList = userAuthDomain.findAllUserAuth();
        result.put("user_name",request.getAttribute("username").toString());
        result.put("qx_list",qxList);
        return result;
    }


    //新增用户权限页面
    @RequestMapping(value = "/auth/addDetail", method = RequestMethod.GET)
    public Object addUserAuthDetail(HttpServletRequest request) {
        //TODO 新增用户页面
        return "permission";
    }

    //新增用户逻辑
    @RequestMapping(value = "/auth/add", method = RequestMethod.GET)
    @ResponseBody
    public Object addUserAuth(UserAuthSetRequest request) {
        try {
            UserAuth userAuth = new UserAuth();
            userAuth.setUsername(request.getUsername());
            userAuth.setProjectName(request.getProjectName());
            userAuth.setStatus(0);
            userAuth.setIsAdmin(Product.IS_NOT_ADMIN);
            userAuthDomain.insert(userAuth);
            return "OK";
        } catch (Exception e) {
            return  e.getMessage();
        }
    }


    //修改用户权限逻辑
    @RequestMapping(value = "/auth/update", method = RequestMethod.GET)
    @ResponseBody
    public Object updateUserAuth(UserAuthSetRequest request) {
        try {
            UserAuth userAuth = userAuthDomain.findByUsername(request.getUsername());
            userAuth.setProjectName(request.getProjectName());
            userAuthDomain.update(userAuth);
            return "OK";
        } catch (Exception e) {
            return  e.getMessage();
        }
    }
}
