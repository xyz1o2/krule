package com.ph.common.enaccount;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class EnaccountPropertyLoad {

	private static Logger log = LoggerFactory.getLogger("LOGIN_INFO");

	public static String config = "enaccount.properties";
	private static Map<String, String> config_map = new HashMap<String, String>();	

	static {
		auto_load(config);		
	}	

	private static void auto_load(String name) {
		InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(name);
		Properties p = new Properties();
		try {
			p.load(is);
			if (config.equals(name)) {
				for (Map.Entry e : p.entrySet()) {
					config_map.put((String)e.getKey(), (String)e.getValue());
				}
			}			
		} catch (IOException e) {
			log.error("[ENACCOUNT登录过滤器] 载入enaccount配置文件失败: " + name, e);
		}
	}
	
	public static String getProperty(String key) {
		if (StringUtils.isBlank(key)) {
			return null;
		}
		return config_map.get(key);
	}
	
}