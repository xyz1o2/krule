package com.ph.tool;

import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

/**
 * Author:  Hardy
 * Date:    2018/7/18 20:05
 * Description: 异常打印工具类
 **/
public class DebugTool {
    public static String getMessage(MethodArgumentNotValidException e) {
        StringBuilder sb = new StringBuilder();
        for (ObjectError error : e.getBindingResult().getAllErrors()) {
            sb.append(error.getDefaultMessage());
        }
        return sb.toString();
    }

    public static String getMessage(BindException e) {
        StringBuilder sb = new StringBuilder();
        for (ObjectError error : e.getBindingResult().getAllErrors()) {
            if (error instanceof FieldError) {
                FieldError fieldError = (FieldError) error;
                sb.append(fieldError.getField());
            }
            sb.append(error.getDefaultMessage()).append(";");
        }
        return sb.toString();
    }

    public static String getMessage(MethodArgumentTypeMismatchException e) {
        return StringTool.formatStr("{} required type {}", e.getName(), e.getRequiredType());
    }

    public static String getMessage(Exception e) {
        StackTraceElement[] stackTrace = e.getStackTrace();
        return stackTrace[0].toString() + "::" + e.getMessage();
    }
}
