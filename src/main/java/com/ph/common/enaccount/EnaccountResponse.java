package com.ph.common.enaccount;

import java.io.Serializable;


public class EnaccountResponse implements Serializable{

	private static final long serialVersionUID = -4894298804753579847L;
	
	/**
	 * 错误码
	 */
	private Integer errorNo;
	/**
	 * 错误信息描述
	 */
	private String errorMessage;
	/**
	 * 返回的用户信息数据
	 */
	private EnaccountData enaccountData;

	public Integer getErrorNo() {
		return errorNo;
	}

	public void setErrorNo(Integer errorNo) {
		this.errorNo = errorNo;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public EnaccountData getEnaccountData() {
		return enaccountData;
	}

	public void setEnaccountData(EnaccountData enaccountData) {
		this.enaccountData = enaccountData;
	}
}
