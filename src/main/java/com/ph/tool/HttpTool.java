package com.ph.tool;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import java.util.Iterator;
import java.util.Map;

/**
 * Author:   lzy
 * Date:     2018-09-10 15:32
 * Description:  http请求工具类
 **/
public class HttpTool {

    private static final Logger log = LoggerFactory.getLogger(HttpTool.class);

    public static String get(String url,
                             Integer connTimeout,
                             Integer soTimeout) throws Exception {

        HttpClient client = new HttpClient();
        client.getHttpConnectionManager().getParams().setConnectionTimeout(connTimeout);
        client.getHttpConnectionManager().getParams().setSoTimeout(soTimeout);
        client.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "UTF-8");
        GetMethod getMethod = new GetMethod(url);
        getMethod.setRequestHeader("Connection", "close");
        int statusCode = client.executeMethod(getMethod);
        if(statusCode==200){
            return getMethod.getResponseBodyAsString();
        }
        return "";
    }

    public static String post(String url,
                              Map<String, String> params,
                              Integer connTimeout,
                              Integer soTimeout) throws Exception {
        HttpClient client = new HttpClient();
        PostMethod post = new PostMethod(url);
        post.setRequestHeader("Connection", "close");
        post.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "UTF-8");
        client.getHttpConnectionManager().getParams().setConnectionTimeout(connTimeout);
        client.getHttpConnectionManager().getParams().setSoTimeout(soTimeout);
        Iterator iterator = params.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            Object key = entry.getKey();
            Object val = entry.getValue();
            if (key == null || key.toString().trim().length() == 0
                    || val == null || val.toString().trim().length() == 0) continue;
            String paramName = key.toString();
            String paramValue = val.toString();
            post.addParameter(paramName, paramValue);
        }
        client.executeMethod(post);
        int statusCode = post.getStatusCode();
        String res = post.getResponseBodyAsString();
        post.releaseConnection();
        return res;
    }


    public static String getFullUrl(HttpServletRequest request) {
        StringBuilder requestURL = new StringBuilder(request.getRequestURL().toString());
        String queryString = request.getQueryString();
        if (queryString == null) {
            return requestURL.toString();
        } else {
            return requestURL.append('?').append(queryString).toString();
        }
    }

    public static String requestToStr(HttpServletRequest request, Object o) {
        if ("GET".equals(request.getMethod()))
            return StringTool.formatStr("[Request] url: {}, method: {}", HttpTool.getFullUrl(request), request.getMethod());
        else
            return StringTool.formatStr("[Request] url: {}, method: {}, body: {}", HttpTool.getFullUrl(request), request.getMethod(), JsonTool.toJson(o));
    }

    public static String reponseToStr(HttpServletRequest request, Object o) {
        return StringTool.formatStr("[Response] url: {}, resp: {}", HttpTool.getFullUrl(request), JsonTool.toJson(o));
    }

}
