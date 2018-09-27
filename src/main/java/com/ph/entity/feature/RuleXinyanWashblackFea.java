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
 * <p>Title: rule_xinyan_washblack_fea - 规则阶段--新颜黑名单特征 : Value Object</p> 
 * 
 * <p>Copyright: Copyright (c) 2018</p> 
 * 
 * <p>Company: zhenrongbao.com</p>
 * 
 * @author 	wangkai
 * @date 	2018-09-12
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class RuleXinyanWashblackFea extends BaseEntity
{
	//****************************************************************************
	//fields
	//****************************************************************************
	@Label("账户异常")
	private Integer abnormal = null;
	@Label("当前逾期")
	private Integer cntBadMember = null;
	@Label("当前履约")
	private Integer cntGoodMember = null;
	@Label("Default_feature_time_Comment")
	private Date featureTime = null;
	@Label("最近逾期时间")
	private String firstDay = null;
	@Label("自增主键")
	private Integer id = null;
	@Label("最长逾期时间")
	private String maxDays = null;
	@Label("最大逾期金额")
	private String maxMoney = null;
	@Label("订单号")
	private Integer serialId = null;
	@Label("睡眠账户")
	private String sleep = null;
	@Label("数据更新时间")
	private String startDay = null;
	@Label("探查结论")
	private String tag = null;
	@Label("探查明细")
	private String tagDesc = null;
	@Label("用户ID")
	private Integer userId = null;

	//****************************************************************************
	//accessors
	//****************************************************************************
	public Integer getAbnormal()
	{
		return this.abnormal;
	}
	public void setAbnormal(Integer abnormal)
	{
		this.abnormal = abnormal;
	}
	public Integer getCntBadMember()
	{
		return this.cntBadMember;
	}
	public void setCntBadMember(Integer cntBadMember)
	{
		this.cntBadMember = cntBadMember;
	}
	public Integer getCntGoodMember()
	{
		return this.cntGoodMember;
	}
	public void setCntGoodMember(Integer cntGoodMember)
	{
		this.cntGoodMember = cntGoodMember;
	}
	public Date getFeatureTime()
	{
		return this.featureTime;
	}
	public void setFeatureTime(Date featureTime)
	{
		this.featureTime = featureTime;
	}
	public String getFirstDay()
	{
		return this.firstDay;
	}
	public void setFirstDay(String firstDay)
	{
		this.firstDay = firstDay;
	}
	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public String getMaxDays()
	{
		return this.maxDays;
	}
	public void setMaxDays(String maxDays)
	{
		this.maxDays = maxDays;
	}
	public String getMaxMoney()
	{
		return this.maxMoney;
	}
	public void setMaxMoney(String maxMoney)
	{
		this.maxMoney = maxMoney;
	}
	public Integer getSerialId()
	{
		return this.serialId;
	}
	public void setSerialId(Integer serialId)
	{
		this.serialId = serialId;
	}
	public String getSleep()
	{
		return this.sleep;
	}
	public void setSleep(String sleep)
	{
		this.sleep = sleep;
	}
	public String getStartDay()
	{
		return this.startDay;
	}
	public void setStartDay(String startDay)
	{
		this.startDay = startDay;
	}
	public String getTag()
	{
		return this.tag;
	}
	public void setTag(String tag)
	{
		this.tag = tag;
	}
	public String getTagDesc()
	{
		return this.tagDesc;
	}
	public void setTagDesc(String tagDesc)
	{
		this.tagDesc = tagDesc;
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
