package com.ph.config;

import com.bstek.urule.URulePropertyPlaceholderConfigurer;
import org.springframework.beans.factory.InitializingBean;

import java.util.Properties;

/**
 * @author Jacky.gao
 * @since 2016年10月12日
 */
//@Component
public class PropertiesConfiguration extends URulePropertyPlaceholderConfigurer implements InitializingBean {
	@Override
	public void afterPropertiesSet() throws Exception {
		Properties props=new Properties();
		props.setProperty("urule.repository.xml", "classpath:mysql.xml");
		setProperties(props);
	}
}
