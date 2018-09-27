package com.ph.config;

import com.ph.common.datasource.DataSourceDynamicRouter;
import com.ph.common.datasource.DataSourceType;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;

/**
 * Author: Hardy
 * Date:   2018/8/20 19:37
 * Description:
 **/
@Configuration
public class DataSourceConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.pdl")
    public HikariConfig pdlHikariConfig() {
        return new HikariConfig();
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.feature")
    public HikariConfig featureHikariConfig() {
        return new HikariConfig();
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.strategy")
    public HikariConfig strategyHikariConfig() {
        return new HikariConfig();
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.preview")
    public HikariConfig strategyPreviewHikariConfig() {
        return new HikariConfig();
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.urule")
    public HikariConfig uruleHikariConfig() {
        return new HikariConfig();
    }

    @Bean
    @Primary
    public DataSource dataSource(@Qualifier("pdlHikariConfig") HikariConfig pdlHikariConfig,
                                 @Qualifier("featureHikariConfig") HikariConfig featureHikariConfig,
                                 @Qualifier("strategyHikariConfig") HikariConfig strategyHikariConfig,
                                 @Qualifier("strategyPreviewHikariConfig") HikariConfig strategyPreviewHikariConfig,
                                 @Qualifier("uruleHikariConfig") HikariConfig uruleHikariConfig
    ) {
        HashMap<Object, Object> sources = new HashMap<>();
        sources.put(DataSourceType.STRATEGY, new HikariDataSource(strategyHikariConfig));
        sources.put(DataSourceType.STRATEGY_PREVIEW, new HikariDataSource(strategyPreviewHikariConfig));
        sources.put(DataSourceType.PDL, new HikariDataSource(pdlHikariConfig));
        sources.put(DataSourceType.FEATURE, new HikariDataSource(featureHikariConfig));
        sources.put(DataSourceType.URULE, new HikariDataSource(uruleHikariConfig));

        DataSourceDynamicRouter sourceRouter = new DataSourceDynamicRouter();
        sourceRouter.setTargetDataSources(sources);
        sourceRouter.setDefaultTargetDataSource(sources.get(DataSourceType.URULE));
        return sourceRouter;
    }


    /**
     * 需要单独声明一个urule数据源，为了框架自动载入urule库
     * @param uruleHikariConfig
     * @return
     */
    @Bean
    @Qualifier("uruleDataSource")
    public HikariDataSource uruleDataSource(@Qualifier("uruleHikariConfig") HikariConfig uruleHikariConfig) {
        return new HikariDataSource(uruleHikariConfig);
    }
}
