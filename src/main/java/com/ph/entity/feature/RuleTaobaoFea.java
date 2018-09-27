package com.ph.entity.feature;

import com.bstek.urule.model.Label;
import com.ph.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;


/**
 * 
 * <p>Title: rule_taobao_fea - 规则阶段--淘宝 : Value Object</p> 
 * 
 * <p>Copyright: Copyright (c) 2018</p> 
 * 
 * <p>Company: zhenrongbao.com</p>
 * 
 * @author 	wangkai
 * @date 	2018-09-20
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class RuleTaobaoFea extends BaseEntity
{
	//****************************************************************************
	//fields
	//****************************************************************************
	@Label("支付宝账户类型是否个人账户 是0 否1")
	private Integer accountType = null;
	@Label("是否已完成身份认证")
	private Integer authentication = null;
	@Label("支付宝余额")
	private Double balance = null;
	@Label("淘宝买家级别")
	private Integer buyerCredit = null;
	@Label("保存的收货地址数量")
	private Integer deliverAddrsCt = null;
	@Label("Default_feature_time_Comment")
	private Date featureTime = null;
	@Label("花呗可用额度")
	private Double huabeiCreditAmount = null;
	@Label("花呗总额度")
	private Double huabeiTotalCreditAmount = null;
	@Label("自增主键")
	private Integer id = null;
	@Label("绑定手机与用户手机是否模糊匹配 是0 否1")
	private Integer mobileAuth = null;
	@Label("近180天交易关闭单数")
	private Integer order180CloseCt = null;
	@Label("近180天交易关闭单数占总单数的比例")
	private Double order180CloseCtRate = null;
	@Label("近180天交易成功的交易总金额")
	private Double order180SuccAmt = null;
	@Label("近180天交易成功的交易总次数")
	private Integer order180SuccCt = null;
	@Label("近180天的成功交易中充值金额")
	private Double order180SuccRechargeAmt = null;
	@Label("近180天的成功交易中充值金额的占比")
	private Double order180SuccRechargeAmtRate = null;
	@Label("近180天的成功交易中充值次数")
	private Integer order180SuccRechargeCt = null;
	@Label("近180天的成功交易中充值次数的占比")
	private Double order180SuccRechargeCtRate = null;
	@Label("近30天交易关闭单数")
	private Integer order30CloseCt = null;
	@Label("近30天交易关闭单数占总单数的比例")
	private Double order30CloseCtRate = null;
	@Label("近30天交易成功的交易总金额")
	private Double order30SuccAmt = null;
	@Label("近30天交易成功的交易总次数")
	private Integer order30SuccCt = null;
	@Label("近30天的成功交易中充值金额")
	private Double order30SuccRechargeAmt = null;
	@Label("近30天的成功交易中充值金额的占比")
	private Double order30SuccRechargeAmtRate = null;
	@Label("近30天的成功交易中充值次数")
	private Integer order30SuccRechargeCt = null;
	@Label("近30天的成功交易中充值次数的占比")
	private Double order30SuccRechargeCtRate = null;
	@Label("近60天交易关闭单数")
	private Integer order60CloseCt = null;
	@Label("近60天交易关闭单数占总单数的比例")
	private Double order60CloseCtRate = null;
	@Label("近60天交易成功的交易总金额")
	private Double order60SuccAmt = null;
	@Label("近60天交易成功的交易总次数")
	private Integer order60SuccCt = null;
	@Label("近60天的成功交易中充值金额")
	private Double order60SuccRechargeAmt = null;
	@Label("近60天的成功交易中充值金额的占比")
	private Double order60SuccRechargeAmtRate = null;
	@Label("近60天的成功交易中充值次数")
	private Integer order60SuccRechargeCt = null;
	@Label("近60天的成功交易中充值次数的占比")
	private Double order60SuccRechargeCtRate = null;
	@Label("近90天交易关闭单数")
	private Integer order90CloseCt = null;
	@Label("近90天交易关闭单数占总单数的比例")
	private Double order90CloseCtRate = null;
	@Label("近90天交易成功的交易总金额")
	private Double order90SuccAmt = null;
	@Label("近90天交易成功的交易总次数")
	private Integer order90SuccCt = null;
	@Label("近90天的成功交易中充值金额")
	private Double order90SuccRechargeAmt = null;
	@Label("近90天的成功交易中充值金额的占比")
	private Double order90SuccRechargeAmtRate = null;
	@Label("近90天的成功交易中充值次数")
	private Integer order90SuccRechargeCt = null;
	@Label("近90天的成功交易中充值次数的占比")
	private Double order90SuccRechargeCtRate = null;
	@Label("历史交易关闭单数")
	private Integer orderCloseCt = null;
	@Label("历史交易关闭单数占总单数的比例")
	private Double orderCloseCtRate = null;
	@Label("历史交易成功的交易总金额")
	private Double orderSuccAmt = null;
	@Label("历史交易成功的交易总次数")
	private Integer orderSuccCt = null;
	@Label("历史成功交易中充值金额")
	private Double orderSuccRechargeAmt = null;
	@Label("历史成功交易中充值金额的占比")
	private Double orderSuccRechargeAmtRate = null;
	@Label("历史成功交易中充值次数")
	private Integer orderSuccRechargeCt = null;
	@Label("历史成功交易中充值次数的占比")
	private Double orderSuccRechargeCtRate = null;
	@Label("好评率")
	private String rateSummary = null;
	@Label("历史累计收货地址数量")
	private Integer receiverAddrsCt = null;
	@Label("最近6个月差评")
	private Integer recentBadEval = null;
	@Label("最近6个月好评")
	private Integer recentGoodEval = null;
	@Label("最近6个月中评")
	private Integer recentNeutralEval = null;
	@Label("淘气值")
	private Integer score = null;
	@Label("订单号")
	private Integer serialId = null;
	@Label("天猫积分")
	private Integer tianmaoGrade = null;
	@Label("总共差评")
	private Integer totalBadEval = null;
	@Label("总共好评")
	private Integer totalGoodEval = null;
	@Label("总共中评")
	private Integer totalNeutralEval = null;
	@Label("余额宝账户余额")
	private Double totalQuotient = null;
	@Label("用户ID")
	private Integer userId = null;
	@Label("真实姓名与申请人姓名是否模糊匹配 是0 否1")
	private Integer userNameAuth = null;
	@Label("支付宝实名认证的身份证号与用户身份证号是否模糊匹配 是0 否1")
	private Integer zfbIdcardAuth = null;
	@Label("支付宝实名认证的姓名与用户姓名是否模糊匹配 是0 否1")
	private Integer zfbNameAuth = null;

	//****************************************************************************
	//accessors
	//****************************************************************************
	public Integer getAccountType()
	{
		return this.accountType;
	}
	public void setAccountType(Integer accountType)
	{
		this.accountType = accountType;
	}
	public Integer getAuthentication()
	{
		return this.authentication;
	}
	public void setAuthentication(Integer authentication)
	{
		this.authentication = authentication;
	}
	public Double getBalance()
	{
		return this.balance;
	}
	public void setBalance(Double balance)
	{
		this.balance = balance;
	}
	public Integer getBuyerCredit()
	{
		return this.buyerCredit;
	}
	public void setBuyerCredit(Integer buyerCredit)
	{
		this.buyerCredit = buyerCredit;
	}
	public Integer getDeliverAddrsCt()
	{
		return this.deliverAddrsCt;
	}
	public void setDeliverAddrsCt(Integer deliverAddrsCt)
	{
		this.deliverAddrsCt = deliverAddrsCt;
	}
	public Date getFeatureTime()
	{
		return this.featureTime;
	}
	public void setFeatureTime(Date featureTime)
	{
		this.featureTime = featureTime;
	}
	public Double getHuabeiCreditAmount()
	{
		return this.huabeiCreditAmount;
	}
	public void setHuabeiCreditAmount(Double huabeiCreditAmount)
	{
		this.huabeiCreditAmount = huabeiCreditAmount;
	}
	public Double getHuabeiTotalCreditAmount()
	{
		return this.huabeiTotalCreditAmount;
	}
	public void setHuabeiTotalCreditAmount(Double huabeiTotalCreditAmount)
	{
		this.huabeiTotalCreditAmount = huabeiTotalCreditAmount;
	}
	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public Integer getMobileAuth()
	{
		return this.mobileAuth;
	}
	public void setMobileAuth(Integer mobileAuth)
	{
		this.mobileAuth = mobileAuth;
	}
	public Integer getOrder180CloseCt()
	{
		return this.order180CloseCt;
	}
	public void setOrder180CloseCt(Integer order180CloseCt)
	{
		this.order180CloseCt = order180CloseCt;
	}
	public Double getOrder180CloseCtRate()
	{
		return this.order180CloseCtRate;
	}
	public void setOrder180CloseCtRate(Double order180CloseCtRate)
	{
		this.order180CloseCtRate = order180CloseCtRate;
	}
	public Double getOrder180SuccAmt()
	{
		return this.order180SuccAmt;
	}
	public void setOrder180SuccAmt(Double order180SuccAmt)
	{
		this.order180SuccAmt = order180SuccAmt;
	}
	public Integer getOrder180SuccCt()
	{
		return this.order180SuccCt;
	}
	public void setOrder180SuccCt(Integer order180SuccCt)
	{
		this.order180SuccCt = order180SuccCt;
	}
	public Double getOrder180SuccRechargeAmt()
	{
		return this.order180SuccRechargeAmt;
	}
	public void setOrder180SuccRechargeAmt(Double order180SuccRechargeAmt)
	{
		this.order180SuccRechargeAmt = order180SuccRechargeAmt;
	}
	public Double getOrder180SuccRechargeAmtRate()
	{
		return this.order180SuccRechargeAmtRate;
	}
	public void setOrder180SuccRechargeAmtRate(Double order180SuccRechargeAmtRate)
	{
		this.order180SuccRechargeAmtRate = order180SuccRechargeAmtRate;
	}
	public Integer getOrder180SuccRechargeCt()
	{
		return this.order180SuccRechargeCt;
	}
	public void setOrder180SuccRechargeCt(Integer order180SuccRechargeCt)
	{
		this.order180SuccRechargeCt = order180SuccRechargeCt;
	}
	public Double getOrder180SuccRechargeCtRate()
	{
		return this.order180SuccRechargeCtRate;
	}
	public void setOrder180SuccRechargeCtRate(Double order180SuccRechargeCtRate)
	{
		this.order180SuccRechargeCtRate = order180SuccRechargeCtRate;
	}
	public Integer getOrder30CloseCt()
	{
		return this.order30CloseCt;
	}
	public void setOrder30CloseCt(Integer order30CloseCt)
	{
		this.order30CloseCt = order30CloseCt;
	}
	public Double getOrder30CloseCtRate()
	{
		return this.order30CloseCtRate;
	}
	public void setOrder30CloseCtRate(Double order30CloseCtRate)
	{
		this.order30CloseCtRate = order30CloseCtRate;
	}
	public Double getOrder30SuccAmt()
	{
		return this.order30SuccAmt;
	}
	public void setOrder30SuccAmt(Double order30SuccAmt)
	{
		this.order30SuccAmt = order30SuccAmt;
	}
	public Integer getOrder30SuccCt()
	{
		return this.order30SuccCt;
	}
	public void setOrder30SuccCt(Integer order30SuccCt)
	{
		this.order30SuccCt = order30SuccCt;
	}
	public Double getOrder30SuccRechargeAmt()
	{
		return this.order30SuccRechargeAmt;
	}
	public void setOrder30SuccRechargeAmt(Double order30SuccRechargeAmt)
	{
		this.order30SuccRechargeAmt = order30SuccRechargeAmt;
	}
	public Double getOrder30SuccRechargeAmtRate()
	{
		return this.order30SuccRechargeAmtRate;
	}
	public void setOrder30SuccRechargeAmtRate(Double order30SuccRechargeAmtRate)
	{
		this.order30SuccRechargeAmtRate = order30SuccRechargeAmtRate;
	}
	public Integer getOrder30SuccRechargeCt()
	{
		return this.order30SuccRechargeCt;
	}
	public void setOrder30SuccRechargeCt(Integer order30SuccRechargeCt)
	{
		this.order30SuccRechargeCt = order30SuccRechargeCt;
	}
	public Double getOrder30SuccRechargeCtRate()
	{
		return this.order30SuccRechargeCtRate;
	}
	public void setOrder30SuccRechargeCtRate(Double order30SuccRechargeCtRate)
	{
		this.order30SuccRechargeCtRate = order30SuccRechargeCtRate;
	}
	public Integer getOrder60CloseCt()
	{
		return this.order60CloseCt;
	}
	public void setOrder60CloseCt(Integer order60CloseCt)
	{
		this.order60CloseCt = order60CloseCt;
	}
	public Double getOrder60CloseCtRate()
	{
		return this.order60CloseCtRate;
	}
	public void setOrder60CloseCtRate(Double order60CloseCtRate)
	{
		this.order60CloseCtRate = order60CloseCtRate;
	}
	public Double getOrder60SuccAmt()
	{
		return this.order60SuccAmt;
	}
	public void setOrder60SuccAmt(Double order60SuccAmt)
	{
		this.order60SuccAmt = order60SuccAmt;
	}
	public Integer getOrder60SuccCt()
	{
		return this.order60SuccCt;
	}
	public void setOrder60SuccCt(Integer order60SuccCt)
	{
		this.order60SuccCt = order60SuccCt;
	}
	public Double getOrder60SuccRechargeAmt()
	{
		return this.order60SuccRechargeAmt;
	}
	public void setOrder60SuccRechargeAmt(Double order60SuccRechargeAmt)
	{
		this.order60SuccRechargeAmt = order60SuccRechargeAmt;
	}
	public Double getOrder60SuccRechargeAmtRate()
	{
		return this.order60SuccRechargeAmtRate;
	}
	public void setOrder60SuccRechargeAmtRate(Double order60SuccRechargeAmtRate)
	{
		this.order60SuccRechargeAmtRate = order60SuccRechargeAmtRate;
	}
	public Integer getOrder60SuccRechargeCt()
	{
		return this.order60SuccRechargeCt;
	}
	public void setOrder60SuccRechargeCt(Integer order60SuccRechargeCt)
	{
		this.order60SuccRechargeCt = order60SuccRechargeCt;
	}
	public Double getOrder60SuccRechargeCtRate()
	{
		return this.order60SuccRechargeCtRate;
	}
	public void setOrder60SuccRechargeCtRate(Double order60SuccRechargeCtRate)
	{
		this.order60SuccRechargeCtRate = order60SuccRechargeCtRate;
	}
	public Integer getOrder90CloseCt()
	{
		return this.order90CloseCt;
	}
	public void setOrder90CloseCt(Integer order90CloseCt)
	{
		this.order90CloseCt = order90CloseCt;
	}
	public Double getOrder90CloseCtRate()
	{
		return this.order90CloseCtRate;
	}
	public void setOrder90CloseCtRate(Double order90CloseCtRate)
	{
		this.order90CloseCtRate = order90CloseCtRate;
	}
	public Double getOrder90SuccAmt()
	{
		return this.order90SuccAmt;
	}
	public void setOrder90SuccAmt(Double order90SuccAmt)
	{
		this.order90SuccAmt = order90SuccAmt;
	}
	public Integer getOrder90SuccCt()
	{
		return this.order90SuccCt;
	}
	public void setOrder90SuccCt(Integer order90SuccCt)
	{
		this.order90SuccCt = order90SuccCt;
	}
	public Double getOrder90SuccRechargeAmt()
	{
		return this.order90SuccRechargeAmt;
	}
	public void setOrder90SuccRechargeAmt(Double order90SuccRechargeAmt)
	{
		this.order90SuccRechargeAmt = order90SuccRechargeAmt;
	}
	public Double getOrder90SuccRechargeAmtRate()
	{
		return this.order90SuccRechargeAmtRate;
	}
	public void setOrder90SuccRechargeAmtRate(Double order90SuccRechargeAmtRate)
	{
		this.order90SuccRechargeAmtRate = order90SuccRechargeAmtRate;
	}
	public Integer getOrder90SuccRechargeCt()
	{
		return this.order90SuccRechargeCt;
	}
	public void setOrder90SuccRechargeCt(Integer order90SuccRechargeCt)
	{
		this.order90SuccRechargeCt = order90SuccRechargeCt;
	}
	public Double getOrder90SuccRechargeCtRate()
	{
		return this.order90SuccRechargeCtRate;
	}
	public void setOrder90SuccRechargeCtRate(Double order90SuccRechargeCtRate)
	{
		this.order90SuccRechargeCtRate = order90SuccRechargeCtRate;
	}
	public Integer getOrderCloseCt()
	{
		return this.orderCloseCt;
	}
	public void setOrderCloseCt(Integer orderCloseCt)
	{
		this.orderCloseCt = orderCloseCt;
	}
	public Double getOrderCloseCtRate()
	{
		return this.orderCloseCtRate;
	}
	public void setOrderCloseCtRate(Double orderCloseCtRate)
	{
		this.orderCloseCtRate = orderCloseCtRate;
	}
	public Double getOrderSuccAmt()
	{
		return this.orderSuccAmt;
	}
	public void setOrderSuccAmt(Double orderSuccAmt)
	{
		this.orderSuccAmt = orderSuccAmt;
	}
	public Integer getOrderSuccCt()
	{
		return this.orderSuccCt;
	}
	public void setOrderSuccCt(Integer orderSuccCt)
	{
		this.orderSuccCt = orderSuccCt;
	}
	public Double getOrderSuccRechargeAmt()
	{
		return this.orderSuccRechargeAmt;
	}
	public void setOrderSuccRechargeAmt(Double orderSuccRechargeAmt)
	{
		this.orderSuccRechargeAmt = orderSuccRechargeAmt;
	}
	public Double getOrderSuccRechargeAmtRate()
	{
		return this.orderSuccRechargeAmtRate;
	}
	public void setOrderSuccRechargeAmtRate(Double orderSuccRechargeAmtRate)
	{
		this.orderSuccRechargeAmtRate = orderSuccRechargeAmtRate;
	}
	public Integer getOrderSuccRechargeCt()
	{
		return this.orderSuccRechargeCt;
	}
	public void setOrderSuccRechargeCt(Integer orderSuccRechargeCt)
	{
		this.orderSuccRechargeCt = orderSuccRechargeCt;
	}
	public Double getOrderSuccRechargeCtRate()
	{
		return this.orderSuccRechargeCtRate;
	}
	public void setOrderSuccRechargeCtRate(Double orderSuccRechargeCtRate)
	{
		this.orderSuccRechargeCtRate = orderSuccRechargeCtRate;
	}
	public String getRateSummary()
	{
		return this.rateSummary;
	}
	public void setRateSummary(String rateSummary)
	{
		this.rateSummary = rateSummary;
	}
	public Integer getReceiverAddrsCt()
	{
		return this.receiverAddrsCt;
	}
	public void setReceiverAddrsCt(Integer receiverAddrsCt)
	{
		this.receiverAddrsCt = receiverAddrsCt;
	}
	public Integer getRecentBadEval()
	{
		return this.recentBadEval;
	}
	public void setRecentBadEval(Integer recentBadEval)
	{
		this.recentBadEval = recentBadEval;
	}
	public Integer getRecentGoodEval()
	{
		return this.recentGoodEval;
	}
	public void setRecentGoodEval(Integer recentGoodEval)
	{
		this.recentGoodEval = recentGoodEval;
	}
	public Integer getRecentNeutralEval()
	{
		return this.recentNeutralEval;
	}
	public void setRecentNeutralEval(Integer recentNeutralEval)
	{
		this.recentNeutralEval = recentNeutralEval;
	}
	public Integer getScore()
	{
		return this.score;
	}
	public void setScore(Integer score)
	{
		this.score = score;
	}
	public Integer getSerialId()
	{
		return this.serialId;
	}
	public void setSerialId(Integer serialId)
	{
		this.serialId = serialId;
	}
	public Integer getTianmaoGrade()
	{
		return this.tianmaoGrade;
	}
	public void setTianmaoGrade(Integer tianmaoGrade)
	{
		this.tianmaoGrade = tianmaoGrade;
	}
	public Integer getTotalBadEval()
	{
		return this.totalBadEval;
	}
	public void setTotalBadEval(Integer totalBadEval)
	{
		this.totalBadEval = totalBadEval;
	}
	public Integer getTotalGoodEval()
	{
		return this.totalGoodEval;
	}
	public void setTotalGoodEval(Integer totalGoodEval)
	{
		this.totalGoodEval = totalGoodEval;
	}
	public Integer getTotalNeutralEval()
	{
		return this.totalNeutralEval;
	}
	public void setTotalNeutralEval(Integer totalNeutralEval)
	{
		this.totalNeutralEval = totalNeutralEval;
	}
	public Double getTotalQuotient()
	{
		return this.totalQuotient;
	}
	public void setTotalQuotient(Double totalQuotient)
	{
		this.totalQuotient = totalQuotient;
	}
	public Integer getUserId()
	{
		return this.userId;
	}
	public void setUserId(Integer userId)
	{
		this.userId = userId;
	}
	public Integer getUserNameAuth()
	{
		return this.userNameAuth;
	}
	public void setUserNameAuth(Integer userNameAuth)
	{
		this.userNameAuth = userNameAuth;
	}
	public Integer getZfbIdcardAuth()
	{
		return this.zfbIdcardAuth;
	}
	public void setZfbIdcardAuth(Integer zfbIdcardAuth)
	{
		this.zfbIdcardAuth = zfbIdcardAuth;
	}
	public Integer getZfbNameAuth()
	{
		return this.zfbNameAuth;
	}
	public void setZfbNameAuth(Integer zfbNameAuth)
	{
		this.zfbNameAuth = zfbNameAuth;
	}
	
}
