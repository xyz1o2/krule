package com.ph.entity.feature;

import com.bstek.urule.model.Label;
import com.ph.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.math.BigDecimal;
import java.io.Serializable;

import java.util.Date;


/**
 * 
 * <p>Title: rule_suanhua_fea - 外部黑名单--算话 : Value Object</p> 
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
public class RuleSuanhuaFea extends BaseEntity
{
	//****************************************************************************
	//fields
	//****************************************************************************
	@Label("算话欺诈分")
	private Integer appRst = null;
	@Label("Default_feature_time_Comment")
	private Date featureTime = null;
	@Label("自增主键")
	private Integer id = null;
	@Label("订单号")
	private Integer serialId = null;
	@Label("算话风险等级")
	private String stanRiskRate = null;
	@Label("用户ID")
	private Integer userId = null;

	//****************************************************************************
	//accessors
	//****************************************************************************
	public Integer getAppRst()
	{
		return this.appRst;
	}
	public void setAppRst(Integer appRst)
	{
		this.appRst = appRst;
	}
	public Date getFeatureTime()
	{
		return this.featureTime;
	}
	public void setFeatureTime(Date featureTime)
	{
		this.featureTime = featureTime;
	}
	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public Integer getSerialId()
	{
		return this.serialId;
	}
	public void setSerialId(Integer serialId)
	{
		this.serialId = serialId;
	}
	public String getStanRiskRate()
	{
		return this.stanRiskRate;
	}
	public void setStanRiskRate(String stanRiskRate)
	{
		this.stanRiskRate = stanRiskRate;
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
