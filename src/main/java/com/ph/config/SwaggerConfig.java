package com.ph.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.HashSet;

/**
 * Author:  Hardy
 * Date:    2018/7/18 20:05
 * Description: Rest Api 自动生成工具 http://{domain}/swagger-ui.html
 **/
@Configuration
@EnableSwagger2
@ConditionalOnExpression("'${profile-env}'!='prod'")
public class SwaggerConfig {
    @Bean
    public Docket createRestApi(@Value("${swagger.domain}") String domian,
                                @Value("${swagger.api-ver}") String version) {
        return new Docket(DocumentationType.SWAGGER_2)
                .host(domian)
                .apiInfo(apiInfo(version))
                .useDefaultResponseMessages(false)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.ph.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(String version) {
        return new ApiInfoBuilder()
                .title("Trade Dollar Rest Api Doc")
                .version(version)
                .build();
    }
}