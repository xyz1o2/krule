package com.ph.common.datasource;

import com.ph.common.datasource.DataSourceType;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Author: Hardy
 * Date:   2018/8/20 20:29
 * Description:
 **/
public class DataSourceDynamicRouter extends AbstractRoutingDataSource {

    private static final ThreadLocal<DataSourceType> contextHolder = new ThreadLocal<>();

    public static void setType(DataSourceType type) {
        if (type == null) throw new NullPointerException();
        contextHolder.set(type);
    }

    public static void clear() {
        contextHolder.remove();
    }

    @Override
    protected Object determineCurrentLookupKey() {
        return contextHolder.get() == null ? DataSourceType.STRATEGY : contextHolder.get();
    }
}
