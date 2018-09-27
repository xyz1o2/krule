package com.ph.common.enaccount;

import java.io.Serializable;

public class EnaccountData implements Serializable{

	private static final long serialVersionUID = 4059500537905287258L;
	
	/**登录时间**/
	private Long time;
	/**登录ip**/
	private String ip;
	/**用户名**/
	private String userName;
	/**用户id**/
	private String userId;
	
	public Long getTime() {
		return time;
	}
	public void setTime(Long time) {
		this.time = time;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
}
