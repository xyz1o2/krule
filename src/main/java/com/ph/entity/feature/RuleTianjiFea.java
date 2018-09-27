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
 * <p>Title: rule_tianji_fea - 天机r : Value Object</p> 
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
public class RuleTianjiFea extends BaseEntity
{
	//****************************************************************************
	//fields
	//****************************************************************************
	@Label("逾期5000-9999笔数")
	private Integer due10000Times = null;
	@Label("逾期大于10000笔数")
	private Integer due10000moreTimes = null;
	@Label("逾期121-150天笔数")
	private Integer due121150Time = null;
	@Label("逾期151-180天笔数")
	private Integer due151180Time = null;
	@Label("逾期大于180天笔数")
	private Integer due180moreTime = null;
	@Label("逾期500-1999笔数")
	private Integer due2000Times = null;
	@Label("逾期31-60天笔数")
	private Integer due3160Time = null;
	@Label("逾期2000-4999笔数")
	private Integer due5000Times = null;
	@Label("逾期0-500笔数")
	private Integer due500Times = null;
	@Label("逾期61-90天笔数")
	private Integer due6190Time = null;
	@Label("逾期91-120天笔数")
	private Integer due91120Time = null;
	@Label("逾期总额")
	private Integer dueAllLimit = null;
	@Label("逾期已结清金额")
	private Integer dueClearLimit = null;
	@Label("逾期已结清笔数")
	private Integer dueClearTimes = null;
	@Label("逾期未结清金额")
	private Integer dueNoclearLimit = null;
	@Label("逾期未结清笔数")
	private Integer dueNoclearTimes = null;
	@Label("逾期笔数")
	private Integer dueTime = null;
	@Label("逾期未知状态金额")
	private Integer dueUnknLimit = null;
	@Label("逾期未知状态笔数")
	private Integer dueUnknTimes = null;
	@Label("最后1笔贷款时间")
	private String endLoanTime = null;
	@Label("Default_feature_time_Comment")
	private Date featureTime = null;
	@Label("首次贷款时间")
	private String firstLoanTime = null;
	@Label("自增主键")
	private Integer id = null;
	@Label("订单号")
	private Integer serialId = null;
	@Label("用户ID")
	private Integer userId = null;

	//****************************************************************************
	//accessors
	//****************************************************************************
	public Integer getDue10000Times()
	{
		return this.due10000Times;
	}
	public void setDue10000Times(Integer due10000Times)
	{
		this.due10000Times = due10000Times;
	}
	public Integer getDue10000moreTimes()
	{
		return this.due10000moreTimes;
	}
	public void setDue10000moreTimes(Integer due10000moreTimes)
	{
		this.due10000moreTimes = due10000moreTimes;
	}
	public Integer getDue121150Time()
	{
		return this.due121150Time;
	}
	public void setDue121150Time(Integer due121150Time)
	{
		this.due121150Time = due121150Time;
	}
	public Integer getDue151180Time()
	{
		return this.due151180Time;
	}
	public void setDue151180Time(Integer due151180Time)
	{
		this.due151180Time = due151180Time;
	}
	public Integer getDue180moreTime()
	{
		return this.due180moreTime;
	}
	public void setDue180moreTime(Integer due180moreTime)
	{
		this.due180moreTime = due180moreTime;
	}
	public Integer getDue2000Times()
	{
		return this.due2000Times;
	}
	public void setDue2000Times(Integer due2000Times)
	{
		this.due2000Times = due2000Times;
	}
	public Integer getDue3160Time()
	{
		return this.due3160Time;
	}
	public void setDue3160Time(Integer due3160Time)
	{
		this.due3160Time = due3160Time;
	}
	public Integer getDue5000Times()
	{
		return this.due5000Times;
	}
	public void setDue5000Times(Integer due5000Times)
	{
		this.due5000Times = due5000Times;
	}
	public Integer getDue500Times()
	{
		return this.due500Times;
	}
	public void setDue500Times(Integer due500Times)
	{
		this.due500Times = due500Times;
	}
	public Integer getDue6190Time()
	{
		return this.due6190Time;
	}
	public void setDue6190Time(Integer due6190Time)
	{
		this.due6190Time = due6190Time;
	}
	public Integer getDue91120Time()
	{
		return this.due91120Time;
	}
	public void setDue91120Time(Integer due91120Time)
	{
		this.due91120Time = due91120Time;
	}
	public Integer getDueAllLimit()
	{
		return this.dueAllLimit;
	}
	public void setDueAllLimit(Integer dueAllLimit)
	{
		this.dueAllLimit = dueAllLimit;
	}
	public Integer getDueClearLimit()
	{
		return this.dueClearLimit;
	}
	public void setDueClearLimit(Integer dueClearLimit)
	{
		this.dueClearLimit = dueClearLimit;
	}
	public Integer getDueClearTimes()
	{
		return this.dueClearTimes;
	}
	public void setDueClearTimes(Integer dueClearTimes)
	{
		this.dueClearTimes = dueClearTimes;
	}
	public Integer getDueNoclearLimit()
	{
		return this.dueNoclearLimit;
	}
	public void setDueNoclearLimit(Integer dueNoclearLimit)
	{
		this.dueNoclearLimit = dueNoclearLimit;
	}
	public Integer getDueNoclearTimes()
	{
		return this.dueNoclearTimes;
	}
	public void setDueNoclearTimes(Integer dueNoclearTimes)
	{
		this.dueNoclearTimes = dueNoclearTimes;
	}
	public Integer getDueTime()
	{
		return this.dueTime;
	}
	public void setDueTime(Integer dueTime)
	{
		this.dueTime = dueTime;
	}
	public Integer getDueUnknLimit()
	{
		return this.dueUnknLimit;
	}
	public void setDueUnknLimit(Integer dueUnknLimit)
	{
		this.dueUnknLimit = dueUnknLimit;
	}
	public Integer getDueUnknTimes()
	{
		return this.dueUnknTimes;
	}
	public void setDueUnknTimes(Integer dueUnknTimes)
	{
		this.dueUnknTimes = dueUnknTimes;
	}
	public String getEndLoanTime()
	{
		return this.endLoanTime;
	}
	public void setEndLoanTime(String endLoanTime)
	{
		this.endLoanTime = endLoanTime;
	}
	public Date getFeatureTime()
	{
		return this.featureTime;
	}
	public void setFeatureTime(Date featureTime)
	{
		this.featureTime = featureTime;
	}
	public String getFirstLoanTime()
	{
		return this.firstLoanTime;
	}
	public void setFirstLoanTime(String firstLoanTime)
	{
		this.firstLoanTime = firstLoanTime;
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
	public Integer getUserId()
	{
		return this.userId;
	}
	public void setUserId(Integer userId)
	{
		this.userId = userId;
	}
	
}
