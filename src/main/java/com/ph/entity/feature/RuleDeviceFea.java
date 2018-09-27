package com.ph.entity.feature;

import com.bstek.urule.model.Label;
import com.ph.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;


/**
 * 
 * <p>Title: rule_device_fea - user_env_info特征 : Value Object</p> 
 * 
 * <p>Copyright: Copyright (c) 2018</p> 
 * 
 * <p>Company: zhenrongbao.com</p>
 * 
 * @author 	wangkai
 * @date 	2018-09-05
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class RuleDeviceFea extends BaseEntity
{
	//****************************************************************************
	//fields
	//****************************************************************************
	@Label("app个数")
	private Integer appNum = null;
	@Label("app名字，英文逗号分隔")
	private String apps = null;
	@Label("同设备关联user_id个数")
	private Integer deviceIdNum = null;
	@Label("Default_feature_time_Comment")
	private Date featureTime = null;
	@Label("GPS信息所在城市")
	private String gpsCity = null;
	@Label("自增主键")
	private Integer id = null;
	@Label("同user_id关联设备个数")
	private Integer idDeviceNum = null;
	@Label("同ip关联设备个数")
	private Integer ipDeviceNum = null;
	@Label("信贷app个数，关键词[借,钱,贷,普惠,宝]")
	private Integer loanAppNum = null;
	@Label("订单号")
	private Integer serialId = null;
	@Label("用户ID")
	private Integer userId = null;

	//****************************************************************************
	//accessors
	//****************************************************************************
	public Integer getAppNum()
	{
		return this.appNum;
	}
	public void setAppNum(Integer appNum)
	{
		this.appNum = appNum;
	}
	public String getApps()
	{
		return this.apps;
	}
	public void setApps(String apps)
	{
		this.apps = apps;
	}
	public Integer getDeviceIdNum()
	{
		return this.deviceIdNum;
	}
	public void setDeviceIdNum(Integer deviceIdNum)
	{
		this.deviceIdNum = deviceIdNum;
	}
	public Date getFeatureTime()
	{
		return this.featureTime;
	}
	public void setFeatureTime(Date featureTime)
	{
		this.featureTime = featureTime;
	}
	public String getGpsCity()
	{
		return this.gpsCity;
	}
	public void setGpsCity(String gpsCity)
	{
		this.gpsCity = gpsCity;
	}
	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public Integer getIdDeviceNum()
	{
		return this.idDeviceNum;
	}
	public void setIdDeviceNum(Integer idDeviceNum)
	{
		this.idDeviceNum = idDeviceNum;
	}
	public Integer getIpDeviceNum()
	{
		return this.ipDeviceNum;
	}
	public void setIpDeviceNum(Integer ipDeviceNum)
	{
		this.ipDeviceNum = ipDeviceNum;
	}
	public Integer getLoanAppNum()
	{
		return this.loanAppNum;
	}
	public void setLoanAppNum(Integer loanAppNum)
	{
		this.loanAppNum = loanAppNum;
	}
	public Integer getSerialId()
	{
		return this.serialId;
	}
	public void setSerialId(Integer serialId)
	{
		this.serialId = serialId;
	}
	public Integer getUserId()
	{
		return this.userId;
	}
	public void setUserId(Integer userId)
	{
		this.userId = userId;
	}
	
}
