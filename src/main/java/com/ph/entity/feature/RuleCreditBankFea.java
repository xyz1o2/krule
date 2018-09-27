package com.ph.entity.feature;

import com.bstek.urule.model.Label;
import com.ph.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;


/**
 * 
 * <p>Title: rule_credit_bank_fea - 信用卡信息表 : Value Object</p> 
 * 
 * <p>Copyright: Copyright (c) 2018</p> 
 * 
 * <p>Company: zhenrongbao.com</p>
 * 
 * @author 	wangkai
 * @date 	2018-09-11
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class RuleCreditBankFea extends BaseEntity
{
	//****************************************************************************
	//fields
	//****************************************************************************
	@Label("是否签约自动还款1是0否")
	private Short autoPay = null;
	@Label("是否签约自动还款1是0否")
	private Short autoPayFail = null;
	@Label("信用卡可用额度")
	private BigDecimal balance = null;
	@Label("发卡银行")
	private String bankName = null;
	@Label("账龄")
	private Integer cardAge = null;
	@Label("信用卡持卡人姓名")
	private String cardName = null;
	@Label("卡号")
	private String cardNo = null;
	@Label("信用卡数")
	private Integer cardNum = null;
	@Label("信用卡额度")
	private BigDecimal creditLimit = null;
	@Label("信用卡账单来源")
	private String creditcardSource = null;
	@Label("本期账单金额")
	private BigDecimal currentBillAmt = null;
	@Label("本期账单金额")
	private BigDecimal currentBillPaidAmt = null;
	@Label("本期剩余最低应还金额")
	private BigDecimal currentBillRemainMinPayment = null;
	@Label("Default_feature_time_Comment")
	private Date featureTime = null;
	@Label("是否有车1是0否")
	private Short hasCar = null;
	@Label("是否有房1是0否")
	private Short hasHouse = null;
	@Label("是否有保险1是0否")
	private Short hasInsurance = null;
	@Label("自增主键")
	private Integer id = null;
	@Label("是否套现1是0否")
	private Short isTaoxian = null;
	@Label("最新一期滞纳金1有0无")
	private Integer lastPerionHasZhijin = null;
	@Label("最新一期账单距离当前月数")
	private Integer lastperiodReachNow = null;
	@Label("信用卡使用率")
	private Double limitUserRet = null;
	@Label("账单日")
	private String loanDate = null;
	@Label("近1期消费大于100的次数")
	private Integer m1100moreTimes = null;
	@Label("近1期消费大于1000的次数")
	private Integer m11kmoreTimes = null;
	@Label("近1期消费大于500的次数")
	private Integer m1500moreTimes = null;
	@Label("近1期分期还款金额")
	private Double m1BystageRepamentMoney = null;
	@Label("近1期分期还款次数")
	private Integer m1BystageRepamentTimes = null;
	@Label("近1期平均每笔消费金额")
	private Double m1ConsumeAvgMon = null;
	@Label("近1期单天最大消费金额")
	private Double m1ConsumeMaxMoney = null;
	@Label("近1期单天最大消费的次数")
	private Integer m1ConsumeMaxTimes = null;
	@Label("近1期消费金额")
	private Double m1ConsumeMoney = null;
	@Label("近1期消费次数")
	private Integer m1ConsumeTimes = null;
	@Label("近1期分期金额")
	private Double m1DevideMoney = null;
	@Label("近1期分期次数")
	private Integer m1DevideTimes = null;
	@Label("近1期还款比率")
	private Integer m1RepayRet = null;
	@Label("近1期累计还款金额")
	private Double m1RepaymentMoney = null;
	@Label("近1期转账金额")
	private Double m1TransMoney = null;
	@Label("近1期转账次数")
	private Integer m1TransTimes = null;
	@Label("近1期取现金额")
	private Double m1WithdrawMoney = null;
	@Label("近1期取现次数")
	private Integer m1WithdrawTimes = null;
	@Label("近3期消费大于100的次数")
	private Integer m3100moreTimes = null;
	@Label("近3期消费大于1000的次数")
	private Integer m31kmoreTimes = null;
	@Label("近3期消费大于500的次数")
	private Integer m3500moreTimes = null;
	@Label("近3期用户全额还款比例")
	private String m3AllPayRet = null;
	@Label("近3期平均账单金额")
	private Double m3AvgBill = null;
	@Label("近3期分期还款金额")
	private Double m3BystageRepamentMoney = null;
	@Label("近3期分期还款次数")
	private Integer m3BystageRepamentTimes = null;
	@Label("近3期平均每笔消费金额")
	private Double m3ConsumeAvgMon = null;
	@Label("近3期单天最大消费金额")
	private Double m3ConsumeMaxMoney = null;
	@Label("近3期单天最大消费的次数")
	private Integer m3ConsumeMaxTimes = null;
	@Label("近3期消费金额")
	private Double m3ConsumeMoney = null;
	@Label("近3期消费次数")
	private Integer m3ConsumeTimes = null;
	@Label("近3期分期金额")
	private Double m3DevideMoney = null;
	@Label("近3期分期次数")
	private Integer m3DevideTimes = null;
	@Label("近3期娱乐消费金额")
	private Double m3EnjoyMoney = null;
	@Label("近3期娱乐消费次数")
	private Integer m3EnjoyTimes = null;
	@Label("近3期医疗消费金额")
	private Double m3HospitalMoney = null;
	@Label("近3期医疗消费次数")
	private Integer m3HospitalTimes = null;
	@Label("近3期消费最高金额")
	private Double m3MaxMoney = null;
	@Label("近3期最高取现率")
	private Double m3MaxWithdrawRet = null;
	@Label("近3期还款比率")
	private Integer m3RepayRet = null;
	@Label("近3期累计还款金额")
	private Double m3RepaymentMoney = null;
	@Label("近3期转账金额")
	private Double m3TransMoney = null;
	@Label("近3期转账次数")
	private Integer m3TransTimes = null;
	@Label("近3期用户类型")
	private String m3UserType = null;
	@Label("近3期取现金额")
	private Double m3WithdrawMoney = null;
	@Label("近3期取现次数")
	private Integer m3WithdrawTimes = null;
	@Label("近3期滞纳金次数")
	private Integer m3ZhijinTimes = null;
	@Label("近6期消费大于100的次数")
	private Integer m6100moreTimes = null;
	@Label("近6期消费大于1000的次数")
	private Integer m61kmoreTimes = null;
	@Label("近6期消费大于500的次数")
	private Integer m6500moreTimes = null;
	@Label("近6期用户全额还款比例")
	private String m6AllPayRet = null;
	@Label("近6期平均账单金额")
	private Double m6AvgBill = null;
	@Label("近6期分期还款金额")
	private Double m6BystageRepamentMoney = null;
	@Label("近6期分期还款次数")
	private Integer m6BystageRepamentTimes = null;
	@Label("近6期平均每笔消费金额")
	private Double m6ConsumeAvgMon = null;
	@Label("近6期单天最大消费金额")
	private Double m6ConsumeMaxMoney = null;
	@Label("近6期单天最大消费的次数")
	private Integer m6ConsumeMaxTimes = null;
	@Label("近6期消费金额")
	private Double m6ConsumeMoney = null;
	@Label("近6期消费次数")
	private Integer m6ConsumeTimes = null;
	@Label("近6期分期金额")
	private Double m6DevideMoney = null;
	@Label("近6期分期次数")
	private Integer m6DevideTimes = null;
	@Label("近6期娱乐消费金额")
	private Double m6EnjoyMoney = null;
	@Label("近6期娱乐消费次数")
	private Integer m6EnjoyTimes = null;
	@Label("近6期医疗消费金额")
	private Double m6HospitalMoney = null;
	@Label("近6期医疗消费次数")
	private Integer m6HospitalTimes = null;
	@Label("近6期消费最高金额")
	private Double m6MaxMoney = null;
	@Label("近6期最高取现率")
	private Double m6MaxWithdrawRet = null;
	@Label("近6期还款比率")
	private Integer m6RepayRet = null;
	@Label("近6期累计还款金额")
	private Double m6RepaymentMoney = null;
	@Label("近6期转账金额")
	private Double m6TransMoney = null;
	@Label("近6期转账次数")
	private Integer m6TransTimes = null;
	@Label("近6期用户类型")
	private String m6UserType = null;
	@Label("近6期取现金额")
	private Double m6WithdrawMoney = null;
	@Label("近6期取现次数")
	private Integer m6WithdrawTimes = null;
	@Label("近6期滞纳金次数")
	private Integer m6ZhijinTimes = null;
	@Label("临时额度")
	private BigDecimal provisionalQuota = null;
	@Label("临时额度失效时间")
	private String provisionalQuotaEndDate = null;
	@Label("临时额度生效时间")
	private String provisionalQuotaStartDate = null;
	@Label("订单号")
	private Integer serialId = null;
	@Label("套现金额")
	private Double taoxianMoney = null;
	@Label("最新更新时间")
	private String updateTime = null;
	@Label("用户ID")
	private Integer userId = null;

	//****************************************************************************
	//accessors
	//****************************************************************************
	public Short getAutoPay()
	{
		return this.autoPay;
	}
	public void setAutoPay(Short autoPay)
	{
		this.autoPay = autoPay;
	}
	public Short getAutoPayFail()
	{
		return this.autoPayFail;
	}
	public void setAutoPayFail(Short autoPayFail)
	{
		this.autoPayFail = autoPayFail;
	}
	public BigDecimal getBalance()
	{
		return this.balance;
	}
	public void setBalance(BigDecimal balance)
	{
		this.balance = balance;
	}
	public String getBankName()
	{
		return this.bankName;
	}
	public void setBankName(String bankName)
	{
		this.bankName = bankName;
	}
	public Integer getCardAge()
	{
		return this.cardAge;
	}
	public void setCardAge(Integer cardAge)
	{
		this.cardAge = cardAge;
	}
	public String getCardName()
	{
		return this.cardName;
	}
	public void setCardName(String cardName)
	{
		this.cardName = cardName;
	}
	public String getCardNo()
	{
		return this.cardNo;
	}
	public void setCardNo(String cardNo)
	{
		this.cardNo = cardNo;
	}
	public Integer getCardNum()
	{
		return this.cardNum;
	}
	public void setCardNum(Integer cardNum)
	{
		this.cardNum = cardNum;
	}
	public BigDecimal getCreditLimit()
	{
		return this.creditLimit;
	}
	public void setCreditLimit(BigDecimal creditLimit)
	{
		this.creditLimit = creditLimit;
	}
	public String getCreditcardSource()
	{
		return this.creditcardSource;
	}
	public void setCreditcardSource(String creditcardSource)
	{
		this.creditcardSource = creditcardSource;
	}
	public BigDecimal getCurrentBillAmt()
	{
		return this.currentBillAmt;
	}
	public void setCurrentBillAmt(BigDecimal currentBillAmt)
	{
		this.currentBillAmt = currentBillAmt;
	}
	public BigDecimal getCurrentBillPaidAmt()
	{
		return this.currentBillPaidAmt;
	}
	public void setCurrentBillPaidAmt(BigDecimal currentBillPaidAmt)
	{
		this.currentBillPaidAmt = currentBillPaidAmt;
	}
	public BigDecimal getCurrentBillRemainMinPayment()
	{
		return this.currentBillRemainMinPayment;
	}
	public void setCurrentBillRemainMinPayment(BigDecimal currentBillRemainMinPayment)
	{
		this.currentBillRemainMinPayment = currentBillRemainMinPayment;
	}
	public Date getFeatureTime()
	{
		return this.featureTime;
	}
	public void setFeatureTime(Date featureTime)
	{
		this.featureTime = featureTime;
	}
	public Short getHasCar()
	{
		return this.hasCar;
	}
	public void setHasCar(Short hasCar)
	{
		this.hasCar = hasCar;
	}
	public Short getHasHouse()
	{
		return this.hasHouse;
	}
	public void setHasHouse(Short hasHouse)
	{
		this.hasHouse = hasHouse;
	}
	public Short getHasInsurance()
	{
		return this.hasInsurance;
	}
	public void setHasInsurance(Short hasInsurance)
	{
		this.hasInsurance = hasInsurance;
	}
	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public Short getIsTaoxian()
	{
		return this.isTaoxian;
	}
	public void setIsTaoxian(Short isTaoxian)
	{
		this.isTaoxian = isTaoxian;
	}
	public Integer getLastPerionHasZhijin()
	{
		return this.lastPerionHasZhijin;
	}
	public void setLastPerionHasZhijin(Integer lastPerionHasZhijin)
	{
		this.lastPerionHasZhijin = lastPerionHasZhijin;
	}
	public Integer getLastperiodReachNow()
	{
		return this.lastperiodReachNow;
	}
	public void setLastperiodReachNow(Integer lastperiodReachNow)
	{
		this.lastperiodReachNow = lastperiodReachNow;
	}
	public Double getLimitUserRet()
	{
		return this.limitUserRet;
	}
	public void setLimitUserRet(Double limitUserRet)
	{
		this.limitUserRet = limitUserRet;
	}
	public String getLoanDate()
	{
		return this.loanDate;
	}
	public void setLoanDate(String loanDate)
	{
		this.loanDate = loanDate;
	}
	public Integer getM1100moreTimes()
	{
		return this.m1100moreTimes;
	}
	public void setM1100moreTimes(Integer m1100moreTimes)
	{
		this.m1100moreTimes = m1100moreTimes;
	}
	public Integer getM11kmoreTimes()
	{
		return this.m11kmoreTimes;
	}
	public void setM11kmoreTimes(Integer m11kmoreTimes)
	{
		this.m11kmoreTimes = m11kmoreTimes;
	}
	public Integer getM1500moreTimes()
	{
		return this.m1500moreTimes;
	}
	public void setM1500moreTimes(Integer m1500moreTimes)
	{
		this.m1500moreTimes = m1500moreTimes;
	}
	public Double getM1BystageRepamentMoney()
	{
		return this.m1BystageRepamentMoney;
	}
	public void setM1BystageRepamentMoney(Double m1BystageRepamentMoney)
	{
		this.m1BystageRepamentMoney = m1BystageRepamentMoney;
	}
	public Integer getM1BystageRepamentTimes()
	{
		return this.m1BystageRepamentTimes;
	}
	public void setM1BystageRepamentTimes(Integer m1BystageRepamentTimes)
	{
		this.m1BystageRepamentTimes = m1BystageRepamentTimes;
	}
	public Double getM1ConsumeAvgMon()
	{
		return this.m1ConsumeAvgMon;
	}
	public void setM1ConsumeAvgMon(Double m1ConsumeAvgMon)
	{
		this.m1ConsumeAvgMon = m1ConsumeAvgMon;
	}
	public Double getM1ConsumeMaxMoney()
	{
		return this.m1ConsumeMaxMoney;
	}
	public void setM1ConsumeMaxMoney(Double m1ConsumeMaxMoney)
	{
		this.m1ConsumeMaxMoney = m1ConsumeMaxMoney;
	}
	public Integer getM1ConsumeMaxTimes()
	{
		return this.m1ConsumeMaxTimes;
	}
	public void setM1ConsumeMaxTimes(Integer m1ConsumeMaxTimes)
	{
		this.m1ConsumeMaxTimes = m1ConsumeMaxTimes;
	}
	public Double getM1ConsumeMoney()
	{
		return this.m1ConsumeMoney;
	}
	public void setM1ConsumeMoney(Double m1ConsumeMoney)
	{
		this.m1ConsumeMoney = m1ConsumeMoney;
	}
	public Integer getM1ConsumeTimes()
	{
		return this.m1ConsumeTimes;
	}
	public void setM1ConsumeTimes(Integer m1ConsumeTimes)
	{
		this.m1ConsumeTimes = m1ConsumeTimes;
	}
	public Double getM1DevideMoney()
	{
		return this.m1DevideMoney;
	}
	public void setM1DevideMoney(Double m1DevideMoney)
	{
		this.m1DevideMoney = m1DevideMoney;
	}
	public Integer getM1DevideTimes()
	{
		return this.m1DevideTimes;
	}
	public void setM1DevideTimes(Integer m1DevideTimes)
	{
		this.m1DevideTimes = m1DevideTimes;
	}
	public Integer getM1RepayRet()
	{
		return this.m1RepayRet;
	}
	public void setM1RepayRet(Integer m1RepayRet)
	{
		this.m1RepayRet = m1RepayRet;
	}
	public Double getM1RepaymentMoney()
	{
		return this.m1RepaymentMoney;
	}
	public void setM1RepaymentMoney(Double m1RepaymentMoney)
	{
		this.m1RepaymentMoney = m1RepaymentMoney;
	}
	public Double getM1TransMoney()
	{
		return this.m1TransMoney;
	}
	public void setM1TransMoney(Double m1TransMoney)
	{
		this.m1TransMoney = m1TransMoney;
	}
	public Integer getM1TransTimes()
	{
		return this.m1TransTimes;
	}
	public void setM1TransTimes(Integer m1TransTimes)
	{
		this.m1TransTimes = m1TransTimes;
	}
	public Double getM1WithdrawMoney()
	{
		return this.m1WithdrawMoney;
	}
	public void setM1WithdrawMoney(Double m1WithdrawMoney)
	{
		this.m1WithdrawMoney = m1WithdrawMoney;
	}
	public Integer getM1WithdrawTimes()
	{
		return this.m1WithdrawTimes;
	}
	public void setM1WithdrawTimes(Integer m1WithdrawTimes)
	{
		this.m1WithdrawTimes = m1WithdrawTimes;
	}
	public Integer getM3100moreTimes()
	{
		return this.m3100moreTimes;
	}
	public void setM3100moreTimes(Integer m3100moreTimes)
	{
		this.m3100moreTimes = m3100moreTimes;
	}
	public Integer getM31kmoreTimes()
	{
		return this.m31kmoreTimes;
	}
	public void setM31kmoreTimes(Integer m31kmoreTimes)
	{
		this.m31kmoreTimes = m31kmoreTimes;
	}
	public Integer getM3500moreTimes()
	{
		return this.m3500moreTimes;
	}
	public void setM3500moreTimes(Integer m3500moreTimes)
	{
		this.m3500moreTimes = m3500moreTimes;
	}
	public String getM3AllPayRet()
	{
		return this.m3AllPayRet;
	}
	public void setM3AllPayRet(String m3AllPayRet)
	{
		this.m3AllPayRet = m3AllPayRet;
	}
	public Double getM3AvgBill()
	{
		return this.m3AvgBill;
	}
	public void setM3AvgBill(Double m3AvgBill)
	{
		this.m3AvgBill = m3AvgBill;
	}
	public Double getM3BystageRepamentMoney()
	{
		return this.m3BystageRepamentMoney;
	}
	public void setM3BystageRepamentMoney(Double m3BystageRepamentMoney)
	{
		this.m3BystageRepamentMoney = m3BystageRepamentMoney;
	}
	public Integer getM3BystageRepamentTimes()
	{
		return this.m3BystageRepamentTimes;
	}
	public void setM3BystageRepamentTimes(Integer m3BystageRepamentTimes)
	{
		this.m3BystageRepamentTimes = m3BystageRepamentTimes;
	}
	public Double getM3ConsumeAvgMon()
	{
		return this.m3ConsumeAvgMon;
	}
	public void setM3ConsumeAvgMon(Double m3ConsumeAvgMon)
	{
		this.m3ConsumeAvgMon = m3ConsumeAvgMon;
	}
	public Double getM3ConsumeMaxMoney()
	{
		return this.m3ConsumeMaxMoney;
	}
	public void setM3ConsumeMaxMoney(Double m3ConsumeMaxMoney)
	{
		this.m3ConsumeMaxMoney = m3ConsumeMaxMoney;
	}
	public Integer getM3ConsumeMaxTimes()
	{
		return this.m3ConsumeMaxTimes;
	}
	public void setM3ConsumeMaxTimes(Integer m3ConsumeMaxTimes)
	{
		this.m3ConsumeMaxTimes = m3ConsumeMaxTimes;
	}
	public Double getM3ConsumeMoney()
	{
		return this.m3ConsumeMoney;
	}
	public void setM3ConsumeMoney(Double m3ConsumeMoney)
	{
		this.m3ConsumeMoney = m3ConsumeMoney;
	}
	public Integer getM3ConsumeTimes()
	{
		return this.m3ConsumeTimes;
	}
	public void setM3ConsumeTimes(Integer m3ConsumeTimes)
	{
		this.m3ConsumeTimes = m3ConsumeTimes;
	}
	public Double getM3DevideMoney()
	{
		return this.m3DevideMoney;
	}
	public void setM3DevideMoney(Double m3DevideMoney)
	{
		this.m3DevideMoney = m3DevideMoney;
	}
	public Integer getM3DevideTimes()
	{
		return this.m3DevideTimes;
	}
	public void setM3DevideTimes(Integer m3DevideTimes)
	{
		this.m3DevideTimes = m3DevideTimes;
	}
	public Double getM3EnjoyMoney()
	{
		return this.m3EnjoyMoney;
	}
	public void setM3EnjoyMoney(Double m3EnjoyMoney)
	{
		this.m3EnjoyMoney = m3EnjoyMoney;
	}
	public Integer getM3EnjoyTimes()
	{
		return this.m3EnjoyTimes;
	}
	public void setM3EnjoyTimes(Integer m3EnjoyTimes)
	{
		this.m3EnjoyTimes = m3EnjoyTimes;
	}
	public Double getM3HospitalMoney()
	{
		return this.m3HospitalMoney;
	}
	public void setM3HospitalMoney(Double m3HospitalMoney)
	{
		this.m3HospitalMoney = m3HospitalMoney;
	}
	public Integer getM3HospitalTimes()
	{
		return this.m3HospitalTimes;
	}
	public void setM3HospitalTimes(Integer m3HospitalTimes)
	{
		this.m3HospitalTimes = m3HospitalTimes;
	}
	public Double getM3MaxMoney()
	{
		return this.m3MaxMoney;
	}
	public void setM3MaxMoney(Double m3MaxMoney)
	{
		this.m3MaxMoney = m3MaxMoney;
	}
	public Double getM3MaxWithdrawRet()
	{
		return this.m3MaxWithdrawRet;
	}
	public void setM3MaxWithdrawRet(Double m3MaxWithdrawRet)
	{
		this.m3MaxWithdrawRet = m3MaxWithdrawRet;
	}
	public Integer getM3RepayRet()
	{
		return this.m3RepayRet;
	}
	public void setM3RepayRet(Integer m3RepayRet)
	{
		this.m3RepayRet = m3RepayRet;
	}
	public Double getM3RepaymentMoney()
	{
		return this.m3RepaymentMoney;
	}
	public void setM3RepaymentMoney(Double m3RepaymentMoney)
	{
		this.m3RepaymentMoney = m3RepaymentMoney;
	}
	public Double getM3TransMoney()
	{
		return this.m3TransMoney;
	}
	public void setM3TransMoney(Double m3TransMoney)
	{
		this.m3TransMoney = m3TransMoney;
	}
	public Integer getM3TransTimes()
	{
		return this.m3TransTimes;
	}
	public void setM3TransTimes(Integer m3TransTimes)
	{
		this.m3TransTimes = m3TransTimes;
	}
	public String getM3UserType()
	{
		return this.m3UserType;
	}
	public void setM3UserType(String m3UserType)
	{
		this.m3UserType = m3UserType;
	}
	public Double getM3WithdrawMoney()
	{
		return this.m3WithdrawMoney;
	}
	public void setM3WithdrawMoney(Double m3WithdrawMoney)
	{
		this.m3WithdrawMoney = m3WithdrawMoney;
	}
	public Integer getM3WithdrawTimes()
	{
		return this.m3WithdrawTimes;
	}
	public void setM3WithdrawTimes(Integer m3WithdrawTimes)
	{
		this.m3WithdrawTimes = m3WithdrawTimes;
	}
	public Integer getM3ZhijinTimes()
	{
		return this.m3ZhijinTimes;
	}
	public void setM3ZhijinTimes(Integer m3ZhijinTimes)
	{
		this.m3ZhijinTimes = m3ZhijinTimes;
	}
	public Integer getM6100moreTimes()
	{
		return this.m6100moreTimes;
	}
	public void setM6100moreTimes(Integer m6100moreTimes)
	{
		this.m6100moreTimes = m6100moreTimes;
	}
	public Integer getM61kmoreTimes()
	{
		return this.m61kmoreTimes;
	}
	public void setM61kmoreTimes(Integer m61kmoreTimes)
	{
		this.m61kmoreTimes = m61kmoreTimes;
	}
	public Integer getM6500moreTimes()
	{
		return this.m6500moreTimes;
	}
	public void setM6500moreTimes(Integer m6500moreTimes)
	{
		this.m6500moreTimes = m6500moreTimes;
	}
	public String getM6AllPayRet()
	{
		return this.m6AllPayRet;
	}
	public void setM6AllPayRet(String m6AllPayRet)
	{
		this.m6AllPayRet = m6AllPayRet;
	}
	public Double getM6AvgBill()
	{
		return this.m6AvgBill;
	}
	public void setM6AvgBill(Double m6AvgBill)
	{
		this.m6AvgBill = m6AvgBill;
	}
	public Double getM6BystageRepamentMoney()
	{
		return this.m6BystageRepamentMoney;
	}
	public void setM6BystageRepamentMoney(Double m6BystageRepamentMoney)
	{
		this.m6BystageRepamentMoney = m6BystageRepamentMoney;
	}
	public Integer getM6BystageRepamentTimes()
	{
		return this.m6BystageRepamentTimes;
	}
	public void setM6BystageRepamentTimes(Integer m6BystageRepamentTimes)
	{
		this.m6BystageRepamentTimes = m6BystageRepamentTimes;
	}
	public Double getM6ConsumeAvgMon()
	{
		return this.m6ConsumeAvgMon;
	}
	public void setM6ConsumeAvgMon(Double m6ConsumeAvgMon)
	{
		this.m6ConsumeAvgMon = m6ConsumeAvgMon;
	}
	public Double getM6ConsumeMaxMoney()
	{
		return this.m6ConsumeMaxMoney;
	}
	public void setM6ConsumeMaxMoney(Double m6ConsumeMaxMoney)
	{
		this.m6ConsumeMaxMoney = m6ConsumeMaxMoney;
	}
	public Integer getM6ConsumeMaxTimes()
	{
		return this.m6ConsumeMaxTimes;
	}
	public void setM6ConsumeMaxTimes(Integer m6ConsumeMaxTimes)
	{
		this.m6ConsumeMaxTimes = m6ConsumeMaxTimes;
	}
	public Double getM6ConsumeMoney()
	{
		return this.m6ConsumeMoney;
	}
	public void setM6ConsumeMoney(Double m6ConsumeMoney)
	{
		this.m6ConsumeMoney = m6ConsumeMoney;
	}
	public Integer getM6ConsumeTimes()
	{
		return this.m6ConsumeTimes;
	}
	public void setM6ConsumeTimes(Integer m6ConsumeTimes)
	{
		this.m6ConsumeTimes = m6ConsumeTimes;
	}
	public Double getM6DevideMoney()
	{
		return this.m6DevideMoney;
	}
	public void setM6DevideMoney(Double m6DevideMoney)
	{
		this.m6DevideMoney = m6DevideMoney;
	}
	public Integer getM6DevideTimes()
	{
		return this.m6DevideTimes;
	}
	public void setM6DevideTimes(Integer m6DevideTimes)
	{
		this.m6DevideTimes = m6DevideTimes;
	}
	public Double getM6EnjoyMoney()
	{
		return this.m6EnjoyMoney;
	}
	public void setM6EnjoyMoney(Double m6EnjoyMoney)
	{
		this.m6EnjoyMoney = m6EnjoyMoney;
	}
	public Integer getM6EnjoyTimes()
	{
		return this.m6EnjoyTimes;
	}
	public void setM6EnjoyTimes(Integer m6EnjoyTimes)
	{
		this.m6EnjoyTimes = m6EnjoyTimes;
	}
	public Double getM6HospitalMoney()
	{
		return this.m6HospitalMoney;
	}
	public void setM6HospitalMoney(Double m6HospitalMoney)
	{
		this.m6HospitalMoney = m6HospitalMoney;
	}
	public Integer getM6HospitalTimes()
	{
		return this.m6HospitalTimes;
	}
	public void setM6HospitalTimes(Integer m6HospitalTimes)
	{
		this.m6HospitalTimes = m6HospitalTimes;
	}
	public Double getM6MaxMoney()
	{
		return this.m6MaxMoney;
	}
	public void setM6MaxMoney(Double m6MaxMoney)
	{
		this.m6MaxMoney = m6MaxMoney;
	}
	public Double getM6MaxWithdrawRet()
	{
		return this.m6MaxWithdrawRet;
	}
	public void setM6MaxWithdrawRet(Double m6MaxWithdrawRet)
	{
		this.m6MaxWithdrawRet = m6MaxWithdrawRet;
	}
	public Integer getM6RepayRet()
	{
		return this.m6RepayRet;
	}
	public void setM6RepayRet(Integer m6RepayRet)
	{
		this.m6RepayRet = m6RepayRet;
	}
	public Double getM6RepaymentMoney()
	{
		return this.m6RepaymentMoney;
	}
	public void setM6RepaymentMoney(Double m6RepaymentMoney)
	{
		this.m6RepaymentMoney = m6RepaymentMoney;
	}
	public Double getM6TransMoney()
	{
		return this.m6TransMoney;
	}
	public void setM6TransMoney(Double m6TransMoney)
	{
		this.m6TransMoney = m6TransMoney;
	}
	public Integer getM6TransTimes()
	{
		return this.m6TransTimes;
	}
	public void setM6TransTimes(Integer m6TransTimes)
	{
		this.m6TransTimes = m6TransTimes;
	}
	public String getM6UserType()
	{
		return this.m6UserType;
	}
	public void setM6UserType(String m6UserType)
	{
		this.m6UserType = m6UserType;
	}
	public Double getM6WithdrawMoney()
	{
		return this.m6WithdrawMoney;
	}
	public void setM6WithdrawMoney(Double m6WithdrawMoney)
	{
		this.m6WithdrawMoney = m6WithdrawMoney;
	}
	public Integer getM6WithdrawTimes()
	{
		return this.m6WithdrawTimes;
	}
	public void setM6WithdrawTimes(Integer m6WithdrawTimes)
	{
		this.m6WithdrawTimes = m6WithdrawTimes;
	}
	public Integer getM6ZhijinTimes()
	{
		return this.m6ZhijinTimes;
	}
	public void setM6ZhijinTimes(Integer m6ZhijinTimes)
	{
		this.m6ZhijinTimes = m6ZhijinTimes;
	}
	public BigDecimal getProvisionalQuota()
	{
		return this.provisionalQuota;
	}
	public void setProvisionalQuota(BigDecimal provisionalQuota)
	{
		this.provisionalQuota = provisionalQuota;
	}
	public String getProvisionalQuotaEndDate()
	{
		return this.provisionalQuotaEndDate;
	}
	public void setProvisionalQuotaEndDate(String provisionalQuotaEndDate)
	{
		this.provisionalQuotaEndDate = provisionalQuotaEndDate;
	}
	public String getProvisionalQuotaStartDate()
	{
		return this.provisionalQuotaStartDate;
	}
	public void setProvisionalQuotaStartDate(String provisionalQuotaStartDate)
	{
		this.provisionalQuotaStartDate = provisionalQuotaStartDate;
	}
	public Integer getSerialId()
	{
		return this.serialId;
	}
	public void setSerialId(Integer serialId)
	{
		this.serialId = serialId;
	}
	public Double getTaoxianMoney()
	{
		return this.taoxianMoney;
	}
	public void setTaoxianMoney(Double taoxianMoney)
	{
		this.taoxianMoney = taoxianMoney;
	}
	public String getUpdateTime()
	{
		return this.updateTime;
	}
	public void setUpdateTime(String updateTime)
	{
		this.updateTime = updateTime;
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
