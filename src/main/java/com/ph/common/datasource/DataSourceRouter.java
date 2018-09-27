package com.ph.common.datasource;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Author: Hardy
 * Date:   2018/8/20 21:15
 * Description:
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface DataSourceRouter {
    DataSourceType type() default DataSourceType.STRATEGY;
}
