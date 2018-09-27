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
 * <p>Title: rule_tencent_fea - 规则阶段-腾讯云风险特征 : Value Object</p> 
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
public class RuleTencentFea extends BaseEntity
{
	//****************************************************************************
	//fields
	//****************************************************************************
	@Label("Default_feature_time_Comment")
	private Date featureTime = null;
	@Label("自增主键")
	private Integer id = null;
	@Label("风险码为1对应的风险等级 1最低，3最高，-9999999表示未命中")
	private Integer riskCode1Value = null;
	@Label("风险码为2对应的风险等级 1最低，3最高，-9999999表示未命中")
	private Integer riskCode2Value = null;
	@Label("风险码为301对应的风险等级 1最低，3最高，-9999999表示未命中")
	private Integer riskCode301Value = null;
	@Label("风险码为3对应的风险等级 1最低，3最高，-9999999表示未命中")
	private Integer riskCode3Value = null;
	@Label("风险码为4对应的风险等级 1最低，3最高，-9999999表示未命中")
	private Integer riskCode4Value = null;
	@Label("风险码为503对应的风险等级 1最低，3最高，-9999999表示未命中")
	private Integer riskCode503Value = null;
	@Label("风险码为5对应的风险等级 1最低，3最高，-9999999表示未命中")
	private Integer riskCode5Value = null;
	@Label("风险码为6对应的风险等级 1最低，3最高，-9999999表示未命中")
	private Integer riskCode6Value = null;
	@Label("风险码为7对应的风险等级 1最低，3最高，-9999999表示未命中")
	private Integer riskCode7Value = null;
	@Label("风险码为8对应的风险等级 1最低，3最高，-9999999表示未命中")
	private Integer riskCode8Value = null;
	@Label("欺诈分值 值越高欺诈可能性越大")
	private Integer riskScore = null;
	@Label("订单号")
	private Integer serialId = null;
	@Label("用户ID")
	private Integer userId = null;

	//****************************************************************************
	//accessors
	//****************************************************************************
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
	public Integer getRiskCode1Value()
	{
		return this.riskCode1Value;
	}
	public void setRiskCode1Value(Integer riskCode1Value)
	{
		this.riskCode1Value = riskCode1Value;
	}
	public Integer getRiskCode2Value()
	{
		return this.riskCode2Value;
	}
	public void setRiskCode2Value(Integer riskCode2Value)
	{
		this.riskCode2Value = riskCode2Value;
	}
	public Integer getRiskCode301Value()
	{
		return this.riskCode301Value;
	}
	public void setRiskCode301Value(Integer riskCode301Value)
	{
		this.riskCode301Value = riskCode301Value;
	}
	public Integer getRiskCode3Value()
	{
		return this.riskCode3Value;
	}
	public void setRiskCode3Value(Integer riskCode3Value)
	{
		this.riskCode3Value = riskCode3Value;
	}
	public Integer getRiskCode4Value()
	{
		return this.riskCode4Value;
	}
	public void setRiskCode4Value(Integer riskCode4Value)
	{
		this.riskCode4Value = riskCode4Value;
	}
	public Integer getRiskCode503Value()
	{
		return this.riskCode503Value;
	}
	public void setRiskCode503Value(Integer riskCode503Value)
	{
		this.riskCode503Value = riskCode503Value;
	}
	public Integer getRiskCode5Value()
	{
		return this.riskCode5Value;
	}
	public void setRiskCode5Value(Integer riskCode5Value)
	{
		this.riskCode5Value = riskCode5Value;
	}
	public Integer getRiskCode6Value()
	{
		return this.riskCode6Value;
	}
	public void setRiskCode6Value(Integer riskCode6Value)
	{
		this.riskCode6Value = riskCode6Value;
	}
	public Integer getRiskCode7Value()
	{
		return this.riskCode7Value;
	}
	public void setRiskCode7Value(Integer riskCode7Value)
	{
		this.riskCode7Value = riskCode7Value;
	}
	public Integer getRiskCode8Value()
	{
		return this.riskCode8Value;
	}
	public void setRiskCode8Value(Integer riskCode8Value)
	{
		this.riskCode8Value = riskCode8Value;
	}
	public Integer getRiskScore()
	{
		return this.riskScore;
	}
	public void setRiskScore(Integer riskScore)
	{
		this.riskScore = riskScore;
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
