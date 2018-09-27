package com.ph.common.exception;

import com.ph.tool.StringTool;

/**
 * Author:  Hardy
 * Date:    2018/7/18 20:05
 * Description: 业务异常
 **/
public class PruleException extends RuntimeException {

    private ErrCode errCode;

    public PruleException(ErrCode errCode) {
        super(errCode.message());
        this.errCode = errCode;
    }

    public PruleException(ErrCode errCode, String message) {
        super(message);
        this.errCode = errCode;
    }

    public PruleException(ErrCode errCode, String format, Object... args) {
        super(StringTool.formatStr(format, args));
        this.errCode = errCode;
    }

    public int getCode() {
        return errCode.code();
    }
}
