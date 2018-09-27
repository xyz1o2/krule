package com.ph.entity.httovo;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Author:  Hardy
 * Date:    2018/7/18 20:05
 * Description: Rest Api 统一返基础类
 **/
@Data
public class RestResponse<T> {

    @JSONField(name = "error_no")
    @JsonProperty("error_no")
    private int code;

    @JSONField(name = "error_message")
    @JsonProperty("error_message")
    private String message;

    private T data;

    public RestResponse() {
    }

    public RestResponse(int code) {
        this.code = code;
    }

    public RestResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public RestResponse<T> data(T data) {
        this.data = data;
        return this;
    }
}
