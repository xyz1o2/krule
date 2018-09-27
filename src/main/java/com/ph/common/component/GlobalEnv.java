package com.ph.common.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Author: Hardy
 * Date:   2018/7/23 15:32
 * Description:
 **/
@Component
public class GlobalEnv {

    public final String env;

    @Autowired
    public GlobalEnv(@Value("profile-env") String env) {
        this.env = env;
    }

    public boolean isProd() {
        return "prod".equals(env);
    }
}
