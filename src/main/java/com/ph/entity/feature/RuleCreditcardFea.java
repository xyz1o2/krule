package com.ph.entity.feature;

import com.bstek.urule.model.Label;
import com.ph.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;


/**
 * 
 * <p>Title: rule_creditcard_fea - 信用卡信息表 : Value Object</p> 
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
public class RuleCreditcardFea extends BaseEntity
{
	//****************************************************************************
	//fields
	//****************************************************************************
	@Label("账单是否连续，card 和 card：Y-连续，N-不连续")
	private String accountConsecutive = null;
	@Label("信用卡账单类型：1-一手账单，2-非一手账单")
	private Integer accountType = null;
	@Label("信用卡使用率")
	private BigDecimal creditUseRate = null;
	@Label("账龄：最远账单月到当前月自然月数")
	private Integer creditcardAge = null;
	@Label("信用卡最高额度，max all card")
	private BigDecimal creditcardMaxLimit = null;
	@Label("信用卡最低额度，min all card")
	private BigDecimal creditcardMinLimit = null;
	@Label("信用卡持卡人姓名")
	private String creditcardName = null;
	@Label("信用卡数")
	private Integer creditcardNum = null;
	@Label("信用卡账单来源：bank-网银账单，email-信用卡账单，bank[and]email-网银+邮箱")
	private String creditcardSource = null;
	@Label("信用卡总授信额度，sum all card")
	private BigDecimal creditcardTotalLimit = null;
	@Label("信用卡总可用额度，sum all card")
	private BigDecimal creditcardTotalUsable = null;
	@Label("Default_feature_time_Comment")
	private Date featureTime = null;
	@Label("自增主键")
	private Integer id = null;
	@Label("最近12期滞纳金卡数")
	private Integer last12periodLateCardNum = null;
	@Label("最近12期滞纳金期数，count(distinct(trade hit keywords(滞纳金;违约金))")
	private Integer last12periodLateNum = null;
	@Label("最近12期存在交易月数，不包含关键词：违约金、滞纳金、利息")
	private Integer last12periodTradeMonthNum = null;
	@Label("最近12期交易次数，不包含关键词：违约金、滞纳金、利息")
	private Integer last12periodTradeNum = null;
	@Label("最近3期滞纳金卡数")
	private Integer last3periodLateCardNum = null;
	@Label("最近3期滞纳金期数，count(distinct(trade hit keywords(滞纳金;违约金))")
	private Integer last3periodLateNum = null;
	@Label("通过近3期判断用户类型：C-有过取现，R-未全额还款但无取现，T-全额还款")
	private String last3periodUserType = null;
	@Label("近3个月取现金额")
	private BigDecimal last3preriodWithdrawAmount = null;
	@Label("近3个月取现次数")
	private Integer last3preriodWithdrawTime = null;
	@Label("最近6期滞纳金卡数")
	private Integer last6periodLateCardNum = null;
	@Label("最近6期滞纳金期数，count(distinct(trade hit keywords(滞纳金、违约金))")
	private Integer last6periodLateNum = null;
	@Label("最近6期存在交易月数，不包含关键词：违约金、滞纳金、利息")
	private Integer last6periodTradeMonthNum = null;
	@Label("最近6期交易次数，不包含关键词：违约金、滞纳金、利息")
	private Integer last6periodTradeNum = null;
	@Label("通过近6期判断用户类型：C-有过取现，R-未全额还款但无取现，T-全额还款")
	private String last6periodUserType = null;
	@Label("最新6期高取现率（50%以上）期数，单卡满足即可")
	private Integer last6preriodHighWithdrawRateNum = null;
	@Label("近6个月取现金额")
	private BigDecimal last6preriodWithdrawAmount = null;
	@Label("近6个月取现次数")
	private Integer last6preriodWithdrawTime = null;
	@Label("最新一期账单距当前时间自然月数")
	private Integer lastPeriodReachNow = null;
	@Label("最新一期滞纳金卡数")
	private BigDecimal lastPreriodLateCardNum = null;
	@Label("最新一期滞纳金，max(sum(trade hit keywords(滞纳金、违约金)))")
	private BigDecimal lastPreriodLateFee = null;
	@Label("最新一期取现金额")
	private BigDecimal lastPreriodWithdrawAmount = null;
	@Label("最新一期取现率")
	private BigDecimal lastPreriodWithdrawRate = null;
	@Label("最新一期取现次数")
	private Integer lastPreriodWithdrawTime = null;
	@Label("订单号")
	private Integer serialId = null;
	@Label("用户ID")
	private Integer userId = null;

	//****************************************************************************
	//accessors
	//****************************************************************************
	public String getAccountConsecutive()
	{
		return this.accountConsecutive;
	}
	public void setAccountConsecutive(String accountConsecutive)
	{
		this.accountConsecutive = accountConsecutive;
	}
	public Integer getAccountType()
	{
		return this.accountType;
	}
	public void setAccountType(Integer accountType)
	{
		this.accountType = accountType;
	}
	public BigDecimal getCreditUseRate()
	{
		return this.creditUseRate;
	}
	public void setCreditUseRate(BigDecimal creditUseRate)
	{
		this.creditUseRate = creditUseRate;
	}
	public Integer getCreditcardAge()
	{
		return this.creditcardAge;
	}
	public void setCreditcardAge(Integer creditcardAge)
	{
		this.creditcardAge = creditcardAge;
	}
	public BigDecimal getCreditcardMaxLimit()
	{
		return this.creditcardMaxLimit;
	}
	public void setCreditcardMaxLimit(BigDecimal creditcardMaxLimit)
	{
		this.creditcardMaxLimit = creditcardMaxLimit;
	}
	public BigDecimal getCreditcardMinLimit()
	{
		return this.creditcardMinLimit;
	}
	public void setCreditcardMinLimit(BigDecimal creditcardMinLimit)
	{
		this.creditcardMinLimit = creditcardMinLimit;
	}
	public String getCreditcardName()
	{
		return this.creditcardName;
	}
	public void setCreditcardName(String creditcardName)
	{
		this.creditcardName = creditcardName;
	}
	public Integer getCreditcardNum()
	{
		return this.creditcardNum;
	}
	public void setCreditcardNum(Integer creditcardNum)
	{
		this.creditcardNum = creditcardNum;
	}
	public String getCreditcardSource()
	{
		return this.creditcardSource;
	}
	public void setCreditcardSource(String creditcardSource)
	{
		this.creditcardSource = creditcardSource;
	}
	public BigDecimal getCreditcardTotalLimit()
	{
		return this.creditcardTotalLimit;
	}
	public void setCreditcardTotalLimit(BigDecimal creditcardTotalLimit)
	{
		this.creditcardTotalLimit = creditcardTotalLimit;
	}
	public BigDecimal getCreditcardTotalUsable()
	{
		return this.creditcardTotalUsable;
	}
	public void setCreditcardTotalUsable(BigDecimal creditcardTotalUsable)
	{
		this.creditcardTotalUsable = creditcardTotalUsable;
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
	public Integer getLast12periodLateCardNum()
	{
		return this.last12periodLateCardNum;
	}
	public void setLast12periodLateCardNum(Integer last12periodLateCardNum)
	{
		this.last12periodLateCardNum = last12periodLateCardNum;
	}
	public Integer getLast12periodLateNum()
	{
		return this.last12periodLateNum;
	}
	public void setLast12periodLateNum(Integer last12periodLateNum)
	{
		this.last12periodLateNum = last12periodLateNum;
	}
	public Integer getLast12periodTradeMonthNum()
	{
		return this.last12periodTradeMonthNum;
	}
	public void setLast12periodTradeMonthNum(Integer last12periodTradeMonthNum)
	{
		this.last12periodTradeMonthNum = last12periodTradeMonthNum;
	}
	public Integer getLast12periodTradeNum()
	{
		return this.last12periodTradeNum;
	}
	public void setLast12periodTradeNum(Integer last12periodTradeNum)
	{
		this.last12periodTradeNum = last12periodTradeNum;
	}
	public Integer getLast3periodLateCardNum()
	{
		return this.last3periodLateCardNum;
	}
	public void setLast3periodLateCardNum(Integer last3periodLateCardNum)
	{
		this.last3periodLateCardNum = last3periodLateCardNum;
	}
	public Integer getLast3periodLateNum()
	{
		return this.last3periodLateNum;
	}
	public void setLast3periodLateNum(Integer last3periodLateNum)
	{
		this.last3periodLateNum = last3periodLateNum;
	}
	public String getLast3periodUserType()
	{
		return this.last3periodUserType;
	}
	public void setLast3periodUserType(String last3periodUserType)
	{
		this.last3periodUserType = last3periodUserType;
	}
	public BigDecimal getLast3preriodWithdrawAmount()
	{
		return this.last3preriodWithdrawAmount;
	}
	public void setLast3preriodWithdrawAmount(BigDecimal last3preriodWithdrawAmount)
	{
		this.last3preriodWithdrawAmount = last3preriodWithdrawAmount;
	}
	public Integer getLast3preriodWithdrawTime()
	{
		return this.last3preriodWithdrawTime;
	}
	public void setLast3preriodWithdrawTime(Integer last3preriodWithdrawTime)
	{
		this.last3preriodWithdrawTime = last3preriodWithdrawTime;
	}
	public Integer getLast6periodLateCardNum()
	{
		return this.last6periodLateCardNum;
	}
	public void setLast6periodLateCardNum(Integer last6periodLateCardNum)
	{
		this.last6periodLateCardNum = last6periodLateCardNum;
	}
	public Integer getLast6periodLateNum()
	{
		return this.last6periodLateNum;
	}
	public void setLast6periodLateNum(Integer last6periodLateNum)
	{
		this.last6periodLateNum = last6periodLateNum;
	}
	public Integer getLast6periodTradeMonthNum()
	{
		return this.last6periodTradeMonthNum;
	}
	public void setLast6periodTradeMonthNum(Integer last6periodTradeMonthNum)
	{
		this.last6periodTradeMonthNum = last6periodTradeMonthNum;
	}
	public Integer getLast6periodTradeNum()
	{
		return this.last6periodTradeNum;
	}
	public void setLast6periodTradeNum(Integer last6periodTradeNum)
	{
		this.last6periodTradeNum = last6periodTradeNum;
	}
	public String getLast6periodUserType()
	{
		return this.last6periodUserType;
	}
	public void setLast6periodUserType(String last6periodUserType)
	{
		this.last6periodUserType = last6periodUserType;
	}
	public Integer getLast6preriodHighWithdrawRateNum()
	{
		return this.last6preriodHighWithdrawRateNum;
	}
	public void setLast6preriodHighWithdrawRateNum(Integer last6preriodHighWithdrawRateNum)
	{
		this.last6preriodHighWithdrawRateNum = last6preriodHighWithdrawRateNum;
	}
	public BigDecimal getLast6preriodWithdrawAmount()
	{
		return this.last6preriodWithdrawAmount;
	}
	public void setLast6preriodWithdrawAmount(BigDecimal last6preriodWithdrawAmount)
	{
		this.last6preriodWithdrawAmount = last6preriodWithdrawAmount;
	}
	public Integer getLast6preriodWithdrawTime()
	{
		return this.last6preriodWithdrawTime;
	}
	public void setLast6preriodWithdrawTime(Integer last6preriodWithdrawTime)
	{
		this.last6preriodWithdrawTime = last6preriodWithdrawTime;
	}
	public Integer getLastPeriodReachNow()
	{
		return this.lastPeriodReachNow;
	}
	public void setLastPeriodReachNow(Integer lastPeriodReachNow)
	{
		this.lastPeriodReachNow = lastPeriodReachNow;
	}
	public BigDecimal getLastPreriodLateCardNum()
	{
		return this.lastPreriodLateCardNum;
	}
	public void setLastPreriodLateCardNum(BigDecimal lastPreriodLateCardNum)
	{
		this.lastPreriodLateCardNum = lastPreriodLateCardNum;
	}
	public BigDecimal getLastPreriodLateFee()
	{
		return this.lastPreriodLateFee;
	}
	public void setLastPreriodLateFee(BigDecimal lastPreriodLateFee)
	{
		this.lastPreriodLateFee = lastPreriodLateFee;
	}
	public BigDecimal getLastPreriodWithdrawAmount()
	{
		return this.lastPreriodWithdrawAmount;
	}
	public void setLastPreriodWithdrawAmount(BigDecimal lastPreriodWithdrawAmount)
	{
		this.lastPreriodWithdrawAmount = lastPreriodWithdrawAmount;
	}
	public BigDecimal getLastPreriodWithdrawRate()
	{
		return this.lastPreriodWithdrawRate;
	}
	public void setLastPreriodWithdrawRate(BigDecimal lastPreriodWithdrawRate)
	{
		this.lastPreriodWithdrawRate = lastPreriodWithdrawRate;
	}
	public Integer getLastPreriodWithdrawTime()
	{
		return this.lastPreriodWithdrawTime;
	}
	public void setLastPreriodWithdrawTime(Integer lastPreriodWithdrawTime)
	{
		this.lastPreriodWithdrawTime = lastPreriodWithdrawTime;
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
