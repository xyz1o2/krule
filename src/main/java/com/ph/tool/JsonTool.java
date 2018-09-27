package com.ph.tool;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import net.sf.json.JSONObject;
import org.springframework.util.StringUtils;

/**
 * Author:  Hardy
 * Date:    2018/7/18 20:05
 * Description:
 **/
public class JsonTool {

    public static String toJson(Object o) {
        if (o == null) return null;
        return JSON.toJSONString(o,
                SerializerFeature.WriteEnumUsingName,
                SerializerFeature.WriteNullNumberAsZero,
                SerializerFeature.WriteNullBooleanAsFalse,
                SerializerFeature.WriteDateUseDateFormat,
                SerializerFeature.WriteBigDecimalAsPlain);
    }

    public static String toJsonExclude(Object o, Class clazz, String... excludes) {
        if (o == null) return null;

        SimplePropertyPreFilter filter = new SimplePropertyPreFilter();

        for (String exclude : excludes) {
            filter.getExcludes().add(exclude);
        }

        return JSON.toJSONString(o, filter,
                SerializerFeature.WriteEnumUsingName,
                SerializerFeature.WriteNullNumberAsZero,
                SerializerFeature.WriteNullBooleanAsFalse,
                SerializerFeature.WriteDateUseDateFormat);
    }

    public static <T> T toObject(String json, Class<T> clazz) {
        json = json == null ? "" : json.trim();

        if (StringUtils.isEmpty(json)) {
            return null;
        }
        return JSON.parseObject(json, clazz, Feature.IgnoreNotMatch);
    }



    /**
     * 根据原始的jsonStr得到JSONObject对象，供程序自行处理JSONObject对象
     * @param jsonStr
     * @return
     */
    public static JSONObject getJSOnObject(String jsonStr){
        JSONObject jsonObj = JSONObject.fromObject(jsonStr);

        return jsonObj;
    }

    /**
     * 根据Object生成json字符串
     * @param object
     * @return
     */
    public static String getJsonStrFromObj(Object object){
        JSONObject jsonObj = JSONObject.fromObject(object);
        return jsonObj.toString();
    }
}
