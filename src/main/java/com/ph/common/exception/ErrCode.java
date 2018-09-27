package com.ph.common.exception;

/**
 * Author:  Hardy
 * Date:    2018/7/18 20:05
 * Description: 业务异常码
 **/
public enum ErrCode {

    //业务异常
    RULE_RUN_ERROR(100000, "规则执行错误"),
    PARAM_ERR_SERIAL_ID(100001, "参数：serialId错误，未填写或格式错误"),
    PARAM_ERR_PRODUCT_LINE(100002, "参数：productLine错误，未填写或格式错误"),
    PARAM_ERR_STRATEGY_TYPE(100003, "参数：strategyType错误，未填写或格式错误"),
    PARAM_ERR_PACKAGE_ID(100004, "参数：packageId错误，未填写或格式错误"),
    PARAM_ERR_FLOW_ID(100005, "参数：flowId错误，未填写或格式错误"),
    STRATEGY_TYPE_MATCH_ERR(100006, "参数：strategyType适配错误"),
    PDL_LOAN_UNFOUND(100007, "pdlLoan找不到订单"),
    PARAM_ERR_TEST_TIME(100008, "参数：time错误，未填写或格式错误"),

    // 非业务异常
    BAD_PARAM(4000, "参数错误"),
    SYS_ERROR(6000, "系统错误");

    private int code;
    private String message;

    ErrCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int code() {
        return code;
    }

    public String message() {
        return message;
    }
}
