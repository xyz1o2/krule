package com.ph.entity.feature;

import com.bstek.urule.model.Label;
import com.ph.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.math.BigDecimal;
import java.io.Serializable;

import java.math.BigDecimal;
import java.util.Date;


/**
 * 
 * <p>Title: rule_shzx_fea - 上海资信特征 : Value Object</p> 
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
public class RuleShzxFea extends BaseEntity
{
	//****************************************************************************
	//fields
	//****************************************************************************
	@Label("最新地址")
	private String address = null;
	@Label("贷款授信总额度")
	private BigDecimal bankAllLimit = null;
	@Label("贷款授信最大额度")
	private BigDecimal bankMaxLimit = null;
	@Label("逾期180天以上未归还本金")
	private BigDecimal due180moreNochar = null;
	@Label("逾期31-60天未归还本金")
	private BigDecimal due3160Nochar = null;
	@Label("逾期61-90天未归还本金")
	private BigDecimal due6190Nochar = null;
	@Label("逾期61-90天未归还本金")
	private BigDecimal due91180Nochar = null;
	@Label("当前逾期总额")
	private BigDecimal dueAllLimit = null;
	@Label("近1年最大逾期期数")
	private Integer dueM12Periods = null;
	@Label("近1年逾期次数")
	private Integer dueM12Times = null;
	@Label("近2年最大逾期期数")
	private Integer dueM24Periods = null;
	@Label("近2年逾期次数")
	private Integer dueM24Times = null;
	@Label("近3月最大逾期期数")
	private Integer dueM3Periods = null;
	@Label("近3月逾期次数")
	private Integer dueM3Times = null;
	@Label("近6月最大逾期期数")
	private Integer dueM6Periods = null;
	@Label("近6月逾期次数")
	private Integer dueM6Times = null;
	@Label("当前逾期最大额度")
	private BigDecimal dueMaxLimit = null;
	@Label("最高学历")
	private String education = null;
	@Label("近1年机构放款数")
	private Integer fangkuanM12Times = null;
	@Label("半年内机构放款数")
	private Integer fangkuanM6Times = null;
	@Label("Default_feature_time_Comment")
	private Date featureTime = null;
	@Label("首次贷款时间")
	private String firstLoantime = null;
	@Label("自增主键")
	private Integer id = null;
	@Label("最新工作")
	private String job = null;
	@Label("近12月还款状态出现两个2有则1，否则0")
	private Integer loan12mHaved2 = null;
	@Label("近24月还款状态出现3 有则1，否则0")
	private Integer loan24mHave3 = null;
	@Label("近6月还款状态出现一个2 有则1，否则0")
	private Integer loan6mHave2 = null;
	@Label("贷款总记录条数")
	private Integer loanTimes = null;
	@Label("近1年地址变更次数")
	private Integer m12AdrchTimes = null;
	@Label("近1年工作单位变更次数")
	private Integer m12JobchTimes = null;
	@Label("近半年地址变更次数")
	private Integer m6AdrchTimes = null;
	@Label("近半年工作单位变更次数")
	private Integer m6JobchTimes = null;
	@Label("婚姻")
	private String mary = null;
	@Label("最新一次查询时间")
	private String queryLastTime = null;
	@Label("最新一次查询贷款状态1成功2失败")
	private Integer queryLoanStatus = null;
	@Label("近1年查询次数")
	private Integer queryM12Times = null;
	@Label("近6月查询次数")
	private Integer queryM6Times = null;
	@Label("报告时间")
	private String registTime = null;
	@Label("订单号")
	private Integer serialId = null;
	@Label("未结清总额度")
	private BigDecimal unclearAllLimit = null;
	@Label("未结清月应还")
	private BigDecimal unclearMonLimit = null;
	@Label("用户ID")
	private Integer userId = null;
	@Label("姓名")
	private String zixinName = null;

	//****************************************************************************
	//accessors
	//****************************************************************************
	public String getAddress()
	{
		return this.address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public BigDecimal getBankAllLimit()
	{
		return this.bankAllLimit;
	}
	public void setBankAllLimit(BigDecimal bankAllLimit)
	{
		this.bankAllLimit = bankAllLimit;
	}
	public BigDecimal getBankMaxLimit()
	{
		return this.bankMaxLimit;
	}
	public void setBankMaxLimit(BigDecimal bankMaxLimit)
	{
		this.bankMaxLimit = bankMaxLimit;
	}
	public BigDecimal getDue180moreNochar()
	{
		return this.due180moreNochar;
	}
	public void setDue180moreNochar(BigDecimal due180moreNochar)
	{
		this.due180moreNochar = due180moreNochar;
	}
	public BigDecimal getDue3160Nochar()
	{
		return this.due3160Nochar;
	}
	public void setDue3160Nochar(BigDecimal due3160Nochar)
	{
		this.due3160Nochar = due3160Nochar;
	}
	public BigDecimal getDue6190Nochar()
	{
		return this.due6190Nochar;
	}
	public void setDue6190Nochar(BigDecimal due6190Nochar)
	{
		this.due6190Nochar = due6190Nochar;
	}
	public BigDecimal getDue91180Nochar()
	{
		return this.due91180Nochar;
	}
	public void setDue91180Nochar(BigDecimal due91180Nochar)
	{
		this.due91180Nochar = due91180Nochar;
	}
	public BigDecimal getDueAllLimit()
	{
		return this.dueAllLimit;
	}
	public void setDueAllLimit(BigDecimal dueAllLimit)
	{
		this.dueAllLimit = dueAllLimit;
	}
	public Integer getDueM12Periods()
	{
		return this.dueM12Periods;
	}
	public void setDueM12Periods(Integer dueM12Periods)
	{
		this.dueM12Periods = dueM12Periods;
	}
	public Integer getDueM12Times()
	{
		return this.dueM12Times;
	}
	public void setDueM12Times(Integer dueM12Times)
	{
		this.dueM12Times = dueM12Times;
	}
	public Integer getDueM24Periods()
	{
		return this.dueM24Periods;
	}
	public void setDueM24Periods(Integer dueM24Periods)
	{
		this.dueM24Periods = dueM24Periods;
	}
	public Integer getDueM24Times()
	{
		return this.dueM24Times;
	}
	public void setDueM24Times(Integer dueM24Times)
	{
		this.dueM24Times = dueM24Times;
	}
	public Integer getDueM3Periods()
	{
		return this.dueM3Periods;
	}
	public void setDueM3Periods(Integer dueM3Periods)
	{
		this.dueM3Periods = dueM3Periods;
	}
	public Integer getDueM3Times()
	{
		return this.dueM3Times;
	}
	public void setDueM3Times(Integer dueM3Times)
	{
		this.dueM3Times = dueM3Times;
	}
	public Integer getDueM6Periods()
	{
		return this.dueM6Periods;
	}
	public void setDueM6Periods(Integer dueM6Periods)
	{
		this.dueM6Periods = dueM6Periods;
	}
	public Integer getDueM6Times()
	{
		return this.dueM6Times;
	}
	public void setDueM6Times(Integer dueM6Times)
	{
		this.dueM6Times = dueM6Times;
	}
	public BigDecimal getDueMaxLimit()
	{
		return this.dueMaxLimit;
	}
	public void setDueMaxLimit(BigDecimal dueMaxLimit)
	{
		this.dueMaxLimit = dueMaxLimit;
	}
	public String getEducation()
	{
		return this.education;
	}
	public void setEducation(String education)
	{
		this.education = education;
	}
	public Integer getFangkuanM12Times()
	{
		return this.fangkuanM12Times;
	}
	public void setFangkuanM12Times(Integer fangkuanM12Times)
	{
		this.fangkuanM12Times = fangkuanM12Times;
	}
	public Integer getFangkuanM6Times()
	{
		return this.fangkuanM6Times;
	}
	public void setFangkuanM6Times(Integer fangkuanM6Times)
	{
		this.fangkuanM6Times = fangkuanM6Times;
	}
	public Date getFeatureTime()
	{
		return this.featureTime;
	}
	public void setFeatureTime(Date featureTime)
	{
		this.featureTime = featureTime;
	}
	public String getFirstLoantime()
	{
		return this.firstLoantime;
	}
	public void setFirstLoantime(String firstLoantime)
	{
		this.firstLoantime = firstLoantime;
	}
	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public String getJob()
	{
		return this.job;
	}
	public void setJob(String job)
	{
		this.job = job;
	}
	public Integer getLoan12mHaved2()
	{
		return this.loan12mHaved2;
	}
	public void setLoan12mHaved2(Integer loan12mHaved2)
	{
		this.loan12mHaved2 = loan12mHaved2;
	}
	public Integer getLoan24mHave3()
	{
		return this.loan24mHave3;
	}
	public void setLoan24mHave3(Integer loan24mHave3)
	{
		this.loan24mHave3 = loan24mHave3;
	}
	public Integer getLoan6mHave2()
	{
		return this.loan6mHave2;
	}
	public void setLoan6mHave2(Integer loan6mHave2)
	{
		this.loan6mHave2 = loan6mHave2;
	}
	public Integer getLoanTimes()
	{
		return this.loanTimes;
	}
	public void setLoanTimes(Integer loanTimes)
	{
		this.loanTimes = loanTimes;
	}
	public Integer getM12AdrchTimes()
	{
		return this.m12AdrchTimes;
	}
	public void setM12AdrchTimes(Integer m12AdrchTimes)
	{
		this.m12AdrchTimes = m12AdrchTimes;
	}
	public Integer getM12JobchTimes()
	{
		return this.m12JobchTimes;
	}
	public void setM12JobchTimes(Integer m12JobchTimes)
	{
		this.m12JobchTimes = m12JobchTimes;
	}
	public Integer getM6AdrchTimes()
	{
		return this.m6AdrchTimes;
	}
	public void setM6AdrchTimes(Integer m6AdrchTimes)
	{
		this.m6AdrchTimes = m6AdrchTimes;
	}
	public Integer getM6JobchTimes()
	{
		return this.m6JobchTimes;
	}
	public void setM6JobchTimes(Integer m6JobchTimes)
	{
		this.m6JobchTimes = m6JobchTimes;
	}
	public String getMary()
	{
		return this.mary;
	}
	public void setMary(String mary)
	{
		this.mary = mary;
	}
	public String getQueryLastTime()
	{
		return this.queryLastTime;
	}
	public void setQueryLastTime(String queryLastTime)
	{
		this.queryLastTime = queryLastTime;
	}
	public Integer getQueryLoanStatus()
	{
		return this.queryLoanStatus;
	}
	public void setQueryLoanStatus(Integer queryLoanStatus)
	{
		this.queryLoanStatus = queryLoanStatus;
	}
	public Integer getQueryM12Times()
	{
		return this.queryM12Times;
	}
	public void setQueryM12Times(Integer queryM12Times)
	{
		this.queryM12Times = queryM12Times;
	}
	public Integer getQueryM6Times()
	{
		return this.queryM6Times;
	}
	public void setQueryM6Times(Integer queryM6Times)
	{
		this.queryM6Times = queryM6Times;
	}
	public String getRegistTime()
	{
		return this.registTime;
	}
	public void setRegistTime(String registTime)
	{
		this.registTime = registTime;
	}
	public Integer getSerialId()
	{
		return this.serialId;
	}
	public void setSerialId(Integer serialId)
	{
		this.serialId = serialId;
	}
	public BigDecimal getUnclearAllLimit()
	{
		return this.unclearAllLimit;
	}
	public void setUnclearAllLimit(BigDecimal unclearAllLimit)
	{
		this.unclearAllLimit = unclearAllLimit;
	}
	public BigDecimal getUnclearMonLimit()
	{
		return this.unclearMonLimit;
	}
	public void setUnclearMonLimit(BigDecimal unclearMonLimit)
	{
		this.unclearMonLimit = unclearMonLimit;
	}
	public Integer getUserId()
	{
		return this.userId;
	}
	public void setUserId(Integer userId)
	{
		this.userId = userId;
	}
	public String getZixinName()
	{
		return this.zixinName;
	}
	public void setZixinName(String zixinName)
	{
		this.zixinName = zixinName;
	}
	
}
