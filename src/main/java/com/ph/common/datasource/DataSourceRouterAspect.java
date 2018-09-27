package com.ph.common.datasource;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Author: Hardy
 * Date:   2018/8/20 21:11
 * Description:
 **/
@Aspect
@Component
public class DataSourceRouterAspect {

    @Pointcut("@annotation(com.ph.common.datasource.DataSourceRouter)")
    public void point() {
    }

    @Around("point() && @annotation(router)")
    public Object around(ProceedingJoinPoint pj, DataSourceRouter router) throws Throwable {
        try {
            DataSourceDynamicRouter.setType(router.type());
            return pj.proceed();
        } finally {
            DataSourceDynamicRouter.clear();
        }
    }
}
