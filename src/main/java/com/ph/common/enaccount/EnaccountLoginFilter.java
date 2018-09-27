package com.ph.common.enaccount;

import com.ph.tool.JsonTool;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/**
 * Author:   lzy
 * Date:     2018-09-12 21:03
 * Description:  登录过滤器
 **/
@Component
public class EnaccountLoginFilter implements Filter {

    private static Logger log = LoggerFactory.getLogger("LOGIN_INFO");

    @Value("${profile-env}")
    String profileEnv;

    @Autowired
    AuthManager authManager;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        response.setDateHeader("Expires", 0);
        response.setHeader("Pragma", "no-cache");
        response.addHeader("Cache-Control", "no-cache");//浏览器和缓存服务器都不应该缓存页面信息
        response.addHeader("Cache-Control", "no-store");//请求和响应的信息都不应该被存储在对方的磁盘系统中；
        response.addHeader("Cache-Control", "must-revalidate");//于客户机的每次请求，代理服务器必须想服务器验证缓存是否过时；

        Map params = request.getParameterMap();
        String paramStr = "";
        Iterator iterator = params.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next().toString();
            String value = request.getParameter(key);
            if (!"".equals(value) && value != null) {
                paramStr = paramStr + key + "=" + value + "&";
            }
        }
        String requestURI = request.getRequestURI();
        if (requestURI.contains("/run/strategy")) {
            filterChain.doFilter(servletRequest,servletResponse);
            return;
        }
        //如果加载静态资源(*.js,*.gif,*.jpg,*.png,*.css,*.ico)，过滤器放过
        if (requestURI.contains(".js") || requestURI.contains(".gif")|| requestURI.contains(".jpg")
                || requestURI.contains(".png")|| requestURI.contains(".css")|| requestURI.contains(".ico")) {
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }

        EnaccountData enaccountData = EnaccountUtil.getCurrentEnaccountInfo(request);
        log.info("[ENACCOUNT登录过滤器] ,uri:" + requestURI + " ,user:" + JsonTool.toJson(enaccountData) + " ,paramStr:" + paramStr);

        if (enaccountData == null || StringUtils.isBlank(enaccountData.getUserName())) {
            this.toLogin(request, response);
            return;
        }

        String username = enaccountData.getUserName();
        String userId = enaccountData.getUserId();
        request.setAttribute("username", username);
        request.setAttribute("userId", userId);

        //如果是管理员就不传projectListStr，默认展示所有项目
        if(!authManager.vefityAdminUser(username)){
            request.setAttribute("projectListStr", authManager.getProjectsByUsername(username));
        }

        //如果是权限管理功能，必须是管理员
        if(requestURI.contains("/permission/auth") && !authManager.vefityAdminUser(username)){
            String msgTmp = "抱歉，您没有权限管理访问权限";
            String msg = java.net.URLEncoder.encode(msgTmp,"utf-8");
            log.error("[ENACCOUNT登录过滤器] 非法访问纪录 ,userId=" + userId + " ,url=" + request.getRequestURI() + " ,params=" + paramStr);
            response.sendRedirect("/permission/error/noauth?msg=" + msg);
            return;
        }

        //用户有没有项目列表访问权限
        if(requestURI.contains("/urule/frame") && !authManager.vefityAdminUser(username) && !authManager.vefityUserAnyProject(username)){
            String msgTmp = "抱歉，您没有项目列表访问权限";
            String msg = java.net.URLEncoder.encode(msgTmp,"utf-8");
            log.error("[ENACCOUNT登录过滤器] 非法访问纪录 ,userId=" + userId + " ,url=" + request.getRequestURI() + " ,params=" + paramStr);
            response.sendRedirect("/permission/error/noauth?msg=" + msg);
            return;
        }


        //用户有没有访问权限
        if((requestURI.contains("/urule/frame") || requestURI.contains("/run/test"))  && !authManager.vefityUserAnyProject(username)){
            log.error("[ENACCOUNT登录过滤器] 非法访问纪录 ,userId=" + userId + " ,url=" + request.getRequestURI() + " ,params=" + paramStr);
            response.sendRedirect("/permission/error/noauth");
            return;
        }

        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
    }

    /**
     * 跳转到登录页面
     * @param request
     * @param response
     */
    private void toLogin(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.sendRedirect(EnaccountUtil.getEnaccountLoginUrl(request));
        } catch (Exception e) {
            log.error("[ENACCOUNT登录过滤器] 跳转登录页面失败", e);
        }
    }




}
