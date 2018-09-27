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
 * <p>Title: rule_pingan_fea1 - 凭安逾期特征表 : Value Object</p> 
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
public class RulePinganFea1 extends BaseEntity
{
	//****************************************************************************
	//fields
	//****************************************************************************
	@Label("Default_feature_time_Comment")
	private Date featureTime = null;
	@Label("自增主键")
	private Integer id = null;
	@Label("近12月凭安逾期次数")
	private Integer last12mOverdueCt = null;
	@Label("近24月凭安逾期次数")
	private Integer last24mOverdueCt = null;
	@Label("近3月凭安逾期次数")
	private Integer last3mOverdueCt = null;
	@Label("近6月凭安逾期次数")
	private Integer last6mOverdueCt = null;
	@Label("近9月凭安逾期次数")
	private Integer last9mOverdueCt = null;
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
	public Integer getLast12mOverdueCt()
	{
		return this.last12mOverdueCt;
	}
	public void setLast12mOverdueCt(Integer last12mOverdueCt)
	{
		this.last12mOverdueCt = last12mOverdueCt;
	}
	public Integer getLast24mOverdueCt()
	{
		return this.last24mOverdueCt;
	}
	public void setLast24mOverdueCt(Integer last24mOverdueCt)
	{
		this.last24mOverdueCt = last24mOverdueCt;
	}
	public Integer getLast3mOverdueCt()
	{
		return this.last3mOverdueCt;
	}
	public void setLast3mOverdueCt(Integer last3mOverdueCt)
	{
		this.last3mOverdueCt = last3mOverdueCt;
	}
	public Integer getLast6mOverdueCt()
	{
		return this.last6mOverdueCt;
	}
	public void setLast6mOverdueCt(Integer last6mOverdueCt)
	{
		this.last6mOverdueCt = last6mOverdueCt;
	}
	public Integer getLast9mOverdueCt()
	{
		return this.last9mOverdueCt;
	}
	public void setLast9mOverdueCt(Integer last9mOverdueCt)
	{
		this.last9mOverdueCt = last9mOverdueCt;
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
