package com.ph.entity.feature;

import com.bstek.urule.model.Label;
import com.ph.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;


/**
 * 
 * <p>Title: rule_xinyan_report_fea - 规则阶段--新颜报告特征 : Value Object</p> 
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
public class RuleXinyanReportFea extends BaseEntity
{
	//****************************************************************************
	//fields
	//****************************************************************************
	@Label("申请准入置信度")
	private String applyCredibility = null;
	@Label("申请准入分")
	private String applyScore = null;
	@Label("贷款行为置信度")
	private String behaviorLoansCredibility = null;
	@Label("网贷额度置信度")
	private String currentLoansCredibility = null;
	@Label("Default_feature_time_Comment")
	private Date featureTime = null;
	@Label("历史贷款机构失败扣款笔数")
	private String historyFailFee = null;
	@Label("历史贷款机构成功扣款笔数")
	private String historySucFee = null;
	@Label("自增主键")
	private Integer id = null;
	@Label("近1个月贷款机构失败扣款笔数")
	private String latestOneMonthFail = null;
	@Label("近1个月贷款机构成功扣款笔数")
	private String latestOneMonthSuc = null;
	@Label("贷款放款总订单数")
	private String loansCount = null;
	@Label("12个月内贷款逾期订单数")
	private String loansOverdueCount = null;
	@Label("贷款行为分")
	private String loansScore = null;
	@Label("12个月内贷款结清订单数")
	private String loansSettleCount = null;
	@Label("订单号")
	private Integer serialId = null;
	@Label("用户ID")
	private Integer userId = null;

	//****************************************************************************
	//accessors
	//****************************************************************************
	public String getApplyCredibility()
	{
		return this.applyCredibility;
	}
	public void setApplyCredibility(String applyCredibility)
	{
		this.applyCredibility = applyCredibility;
	}
	public String getApplyScore()
	{
		return this.applyScore;
	}
	public void setApplyScore(String applyScore)
	{
		this.applyScore = applyScore;
	}
	public String getBehaviorLoansCredibility()
	{
		return this.behaviorLoansCredibility;
	}
	public void setBehaviorLoansCredibility(String behaviorLoansCredibility)
	{
		this.behaviorLoansCredibility = behaviorLoansCredibility;
	}
	public String getCurrentLoansCredibility()
	{
		return this.currentLoansCredibility;
	}
	public void setCurrentLoansCredibility(String currentLoansCredibility)
	{
		this.currentLoansCredibility = currentLoansCredibility;
	}
	public Date getFeatureTime()
	{
		return this.featureTime;
	}
	public void setFeatureTime(Date featureTime)
	{
		this.featureTime = featureTime;
	}
	public String getHistoryFailFee()
	{
		return this.historyFailFee;
	}
	public void setHistoryFailFee(String historyFailFee)
	{
		this.historyFailFee = historyFailFee;
	}
	public String getHistorySucFee()
	{
		return this.historySucFee;
	}
	public void setHistorySucFee(String historySucFee)
	{
		this.historySucFee = historySucFee;
	}
	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public String getLatestOneMonthFail()
	{
		return this.latestOneMonthFail;
	}
	public void setLatestOneMonthFail(String latestOneMonthFail)
	{
		this.latestOneMonthFail = latestOneMonthFail;
	}
	public String getLatestOneMonthSuc()
	{
		return this.latestOneMonthSuc;
	}
	public void setLatestOneMonthSuc(String latestOneMonthSuc)
	{
		this.latestOneMonthSuc = latestOneMonthSuc;
	}
	public String getLoansCount()
	{
		return this.loansCount;
	}
	public void setLoansCount(String loansCount)
	{
		this.loansCount = loansCount;
	}
	public String getLoansOverdueCount()
	{
		return this.loansOverdueCount;
	}
	public void setLoansOverdueCount(String loansOverdueCount)
	{
		this.loansOverdueCount = loansOverdueCount;
	}
	public String getLoansScore()
	{
		return this.loansScore;
	}
	public void setLoansScore(String loansScore)
	{
		this.loansScore = loansScore;
	}
	public String getLoansSettleCount()
	{
		return this.loansSettleCount;
	}
	public void setLoansSettleCount(String loansSettleCount)
	{
		this.loansSettleCount = loansSettleCount;
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
