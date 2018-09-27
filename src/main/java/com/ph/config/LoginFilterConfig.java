package com.ph.config;

import com.ph.common.enaccount.EnaccountLoginFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoginFilterConfig{

	@Autowired
	EnaccountLoginFilter enaccountLoginFilter;

	@Bean
	public FilterRegistrationBean loginFilterRegistration() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(enaccountLoginFilter);
		//registration.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico, /run/*");
		registration.addUrlPatterns("/", "/index", "/username", "/permission/auth/*", "/urule/*", "/run/test/page/*");

		return registration;
	}

}
