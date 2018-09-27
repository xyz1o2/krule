package com.ph.common.enaccount;

import com.netease.common.util.HttpUtil;
import com.netease.common.util.MD5Util;
import com.ph.tool.EncodeUtils;
import com.ph.tool.JsonTool;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


/**
 * 内部账号系统接入工具类
 *
 * @author zhaofengying
 */
public class EnaccountUtil {

    /**
     * 为false,代表 登录走得是 真融宝的账号
     * 为true,代表走的是 新的账号系统
     */
    public static final boolean OPEN = true;
    private static final String SERVER_HOST = EnaccountPropertyLoad.getProperty("ph.prule.server.host");
    private static final String ENACCOUNT_LOGIN_URL = EnaccountPropertyLoad.getProperty("enaccount.login.url");
    private static final String ENACCOUNT_LOGOUT_URL = EnaccountPropertyLoad.getProperty("enaccount.logout.url");
    private static final String get_user_info_by_uss_url = EnaccountPropertyLoad.getProperty("enaccount.get_user_info_by_uss.url");
    private static final String get_user_info_by_puss_url = EnaccountPropertyLoad.getProperty("enaccount.get_user_info_by_puss.url");
    private static final String ENACCOUNT_APP_KEY = EnaccountPropertyLoad.getProperty("enaccount.app_key");
    private static final String ENACCOUNT_APP_SECRET = EnaccountPropertyLoad.getProperty("enaccount.app_secret");
    private static final String E_PUSS_COOKIE = "E_PUSS";
    private static final String E_USS_COOKIE = "E_USS";
    private static final Integer ENACCOUNT_SUCCESS_CODE = 0;

    private static final Logger log = LoggerFactory.getLogger("LOGIN_INFO");

    /**
     * 1.从当前请求参数中获取用户cookie信息 然后再调用内部账号系统验证cookie的有效性
     * 2.默认先取puss 如果取不到 再用uss
     * 3.只有校验成功 才会返回具体的用户数据 否则返回为空
     * @param request
     * @return
     */
    public static EnaccountData getCurrentEnaccountInfo(HttpServletRequest request) {
        String pussCookie = EnaccountUtil.getEPussCookie(request);
        String ussCookie = EnaccountUtil.getEUssCookie(request);
        EnaccountResponse checkPussResult = null;
        EnaccountResponse checkEussResult = null;
        EnaccountData enaccountData = null;

        String uri = request.getRequestURI();
        try {
            if (StringUtils.isNotBlank(pussCookie)) {
                checkPussResult = EnaccountUtil.getUserInfoByPuss(pussCookie);
            } else if (StringUtils.isNotBlank(ussCookie)) {
                checkEussResult = EnaccountUtil.getUserInfoByUss(ussCookie);
            }
            if (checkPussResult != null && EnaccountUtil.ENACCOUNT_SUCCESS_CODE.equals(checkPussResult.getErrorNo())) {
                enaccountData = checkPussResult.getEnaccountData();
            } else if (checkEussResult != null  && EnaccountUtil.ENACCOUNT_SUCCESS_CODE.equals(checkEussResult.getErrorNo())) {
                enaccountData = checkEussResult.getEnaccountData();
            }
        } catch (Exception e) {
            log.error("[ENACCOUNT登录过滤器] cookie中取登录信息出现异常", e);
        }

        log.info("[ENACCOUNT登录过滤器] cookie中取登录信息, uri:" + uri + " ,userInfo:" + JsonTool.getJsonStrFromObj(enaccountData));
        return enaccountData;
    }

    /**
     * 从内部账号系统登录后  获取https方式下的cookie信息
     * @param request
     * @return
     */
    public static String getEPussCookie(HttpServletRequest request) {
        if (request == null) {
            return null;
        }
        Cookie[] cookies = request.getCookies();
        //无cookie直接跳转到登录页
        if (null == cookies || cookies.length <= 0) {
            return null;
        }
        for (Cookie cookie : cookies) {
            String cookieName = cookie.getName();
            if (E_PUSS_COOKIE.equals(cookieName)) {
                return cookie.getValue();
            }
        }
        return null;
    }

    /**
     * 从内部账号系统登录后  获取http方式下的cookie信息
     * @param request
     * @return
     */
    public static String getEUssCookie(HttpServletRequest request) {
        if (request == null) {
            return null;
        }
        Cookie[] cookies = request.getCookies();
        //无cookie直接跳转到登录页
        if (null == cookies || cookies.length <= 0) {
            return null;
        }
        for (Cookie cookie : cookies) {
            String cookieName = cookie.getName();
            if (E_USS_COOKIE.equals(cookieName)) {
                return cookie.getValue();
            }
        }
        return null;
    }

    /**
     * uss session接口（https应用）
     * 通过uss获取用户信息
     * @param uss
     */
    public static EnaccountResponse getUserInfoByUss(String uss) {
        if (StringUtils.isBlank(uss)) {
            return null;
        }
        if (StringUtils.isBlank(get_user_info_by_uss_url)) {
            return null;
        }
        Map<String, Object> paramsMap = new HashMap<String, Object>();
        paramsMap.put("uss", uss);
        paramsMap.put("app_key", ENACCOUNT_APP_KEY);
        paramsMap.put("app_time", System.currentTimeMillis() / 1000);
        paramsMap.put("app_sign", generateAppSign(paramsMap));

        String queryStr = generateHttpQuery(paramsMap);
        log.info("[ENACCOUNT登录过滤器] enaccount get user info by uss request url:" + get_user_info_by_uss_url + ",contents:" + queryStr);
        String responseStr = HttpUtil.sendPostRequest(get_user_info_by_uss_url, queryStr, "UTF-8", 400000, 400000, false);
        log.info("[ENACCOUNT登录过滤器] enaccount get user info by uss response:" + responseStr);

        if (StringUtils.isBlank(responseStr)) {
            return null;
        }
        return parseEnaccountResponseData(responseStr);
    }

    /**
     * puss session接口（http应用使用）
     * 通过puss获取用户信息
     * @param puss
     */
    public static EnaccountResponse getUserInfoByPuss(String puss) {
        if (StringUtils.isBlank(puss)) {
            return null;
        }
        if (StringUtils.isBlank(get_user_info_by_puss_url)) {
            return null;
        }

        Map<String, Object> paramsMap = new HashMap<String, Object>();
        paramsMap.put("puss", puss);
        paramsMap.put("app_key", ENACCOUNT_APP_KEY);
        paramsMap.put("app_time", System.currentTimeMillis() / 1000);
        paramsMap.put("app_sign", generateAppSign(paramsMap));

        String queryStr = generateHttpQuery(paramsMap);
        log.info("[ENACCOUNT登录过滤器] enaccount get user info by puss request url:" + get_user_info_by_puss_url + ",contents:" + queryStr);
        String responseStr = HttpUtil.sendPostRequest(get_user_info_by_puss_url, queryStr, "UTF-8", 400000, 400000, false);
        log.info("[ENACCOUNT登录过滤器] enaccount get user info by puss response:" + responseStr);

        if (StringUtils.isBlank(responseStr)) {
            return null;
        }
        return parseEnaccountResponseData(responseStr);

    }

    /**
     * 根据当前请求uri及附带的请求参数 在需要重新登录的情况下 先跳转到内部账号系统进行登录
     * 然后再重新跳转到登录前要登录的页面 并且带着登录前要请求页面的完整请求参数
     * @param request
     * @return
     */
    public static String getRedirectUrl(HttpServletRequest request) {

        String uri = request.getRequestURI();

        StringBuilder stb = new StringBuilder();
        Map<String, String[]> paramMap = request.getParameterMap();
        if (null == paramMap || paramMap.isEmpty()) {
            return SERVER_HOST + uri;
        }

        Iterator<String> it = paramMap.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            String value = null == paramMap.get(key) || paramMap.get(key).length <= 0 ? "" : (String) (paramMap.get(key)[0]);
            stb = stb.append(key).append("=").append(EncodeUtils.urlEncode(value)).append("&");
        }
        String queryParams = stb.substring(0, stb.length() - 1);
        String redirect = uri.endsWith("?") ? uri + queryParams : "?" + uri + queryParams;
        redirect = EncodeUtils.urlEncode(redirect, "utf-8");
        redirect = SERVER_HOST + redirect;

        return redirect;
    }

    /**
     * 获取登录内部账号中心完整的url
     * @param request
     * @return
     */
    public static String getEnaccountLoginUrl(HttpServletRequest request) {
        String redirect = getRedirectUrl(request);
        return ENACCOUNT_LOGIN_URL + (ENACCOUNT_LOGIN_URL.endsWith("?") ? redirect : "?") + "redirect=" + redirect;
    }

    /**
     * 获取退出内部账号中心完整的url
     * @param request
     * @return
     */
    public static String getEnaccountLogoutUrl(HttpServletRequest request) {
        String redirect = getRedirectUrl(request);
        redirect = SERVER_HOST + redirect;
        return ENACCOUNT_LOGOUT_URL + (ENACCOUNT_LOGIN_URL.endsWith("?") ? redirect : "?" + redirect);
    }

    /**
     * 根据请求参数获取签名信息
     * 注：
     * 1.如果请求参数中已经包含了app_sign或app_secret字段 则这些字段不参与签名
     * 2.除了1中的字段外 其它字段按字母升序排序
     * 3.排序后 按param1=value1&param2=value2....的形式拼接
     * 4.最后Md5(3中形成的字符串+app_screte)得到签名串
     * @param paramsMap
     * @return
     */
    private static String generateAppSign(Map<String, Object> paramsMap) {
        if (null == paramsMap || paramsMap.isEmpty()) {
            return null;
        }

        Object[] sortedKeys = paramsMap.keySet().toArray();
        Arrays.sort(sortedKeys);

        StringBuilder stb = new StringBuilder();
        for (Object key : sortedKeys) {
            if ("app_sign".equals(key.toString())
                    || "app_secret".equals(key.toString())) {
                continue;
            }

            String tmpKey = key.toString();
            Object value = paramsMap.get(tmpKey);
            stb = stb.append(tmpKey).append("=").append(null == value ? "" : value.toString()).append("&");
        }

        stb = stb.append("app_secret").append("=").append(ENACCOUNT_APP_SECRET);

        log.debug("[ENACCOUNT登录过滤器] Enaccount gen app_sign source:" + stb.toString());

        return MD5Util.get(stb.toString(), "utf-8");
    }

    /**
     * 根据请求参数封装成可发送的param1=value1&param2=value2形式的请求串
     *
     * @param paramsAndValues
     * @return
     */
    private static String generateHttpQuery(Map<String, Object> paramsAndValues) {
        if (null == paramsAndValues || paramsAndValues.isEmpty()) {
            return null;
        }

        Object[] sortedKeys = paramsAndValues.keySet().toArray();
        Arrays.sort(sortedKeys);

        StringBuilder stb = new StringBuilder();
        for (Object key : sortedKeys) {
            String tmpKey = key.toString();
            Object value = paramsAndValues.get(tmpKey);
            stb = stb.append(tmpKey).append("=").append(null == value ? "" : value.toString()).append("&");
        }

        return stb.substring(0, stb.length() - 1);
    }

    /**
     * 解析 账号中心返回结果
     *
     * @param response
     * @return
     */
    public static EnaccountResponse parseEnaccountResponseData(String response) {
        if (StringUtils.isBlank(response)) {
            return null;
        }
        EnaccountResponse enaccountRes = new EnaccountResponse();
        try {
            JSONObject jsonObj = JsonTool.getJSOnObject(response);
            Integer errorNo = jsonObj.getInt("error_no");
            String errorMessage = jsonObj.getString("error_message");

            enaccountRes.setErrorNo(errorNo);
            enaccountRes.setErrorMessage(errorMessage);
            if (!ENACCOUNT_SUCCESS_CODE.equals(errorNo)) {
                return enaccountRes;
            }

            JSONObject dataJsonObj = jsonObj.getJSONObject("data");
            if (null == dataJsonObj) {
                return enaccountRes;
            }

            Long time = dataJsonObj.getLong("time");
            String ip = dataJsonObj.getString("ip");
            String userName = dataJsonObj.getString("user_name");
            String userId = dataJsonObj.getString("user_id");

            EnaccountData data = new EnaccountData();
            data.setTime(time);
            data.setIp(ip);
            data.setUserName(userName);
            data.setUserId(userId);

            enaccountRes.setEnaccountData(data);

            return enaccountRes;
        } catch (Exception e) {
            log.error("[ENACCOUNT登录过滤器] 解析内部账号返回结果异常,response:" + response, e);
            return null;
        }
    }

}
