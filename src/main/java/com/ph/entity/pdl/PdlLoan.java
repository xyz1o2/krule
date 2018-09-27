package com.ph.entity.pdl;

import com.bstek.urule.model.Label;
import com.ph.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
public class PdlLoan extends BaseEntity
{
	//****************************************************************************
	//fields
	//****************************************************************************
	@Label("贷款金额")
	private BigDecimal amount = null;
	@Label("申请金额")
	private BigDecimal applyAmount = null;
	@Label("申请时间")
	private Integer applyTime = null;
	@Label("手续费")
	private BigDecimal brokerage = null;
	@Label("手续费总额")
	private BigDecimal brokerageAmount = null;
	@Label("确认提现  30等待确认提现  31已经确认提现  32确认提现成功  33确认提现失败")
	private Short confirmWithdraw = null;
	@Label("应还款金额")
	private BigDecimal expectPayAmount = null;
	@Label("预计还款时间")
	private Integer expectPayTime = null;
	@Label("服务费")
	private BigDecimal fee = null;
	@Label("服务费总额")
	private BigDecimal feeAmount = null;
	@Label("融资服务费率")
	private BigDecimal financingFee = null;
	@Label("融资服务费用")
	private BigDecimal financingFeeAmount = null;
	@Label("产品渠道 1财小仙 2小额单期")
	private Short fromChannel = null;
	@Label("Default_id_Comment")
	private Integer id = null;
	@Label("IP")
	private String ip = null;
	@Label("最后结算时间(逾期用)")
	private Integer lastCalculateTime = null;
	@Label("开始放款时间")
	private Integer loanStartTime = null;
	@Label("放款成功时间")
	private Integer loanSuccessTime = null;
	@Label("贷款时长 :天")
	private Integer loanTime = null;
	@Label("1首贷 2续贷")
	private Short loanType = null;
	@Label("锁状态 0未加锁 1加锁")
	private Short lock = null;
	@Label("月费用")
	private BigDecimal monthFeeAmount = null;
	@Label("月费率")
	private BigDecimal monthRate = null;
	@Label("操作者ID")
	private Long operator = null;
	@Label("成功还款时间")
	private Integer paySuccessTime = null;
	@Label("总期数")
	private Short periods = null;
	@Label("1pc2wap3ios4android")
	private String platform = null;
	@Label("产品编号")
	private Short productId = null;
	@Label("利息")
	private BigDecimal rate = null;
	@Label("利息总额")
	private BigDecimal rateAmount = null;
	@Label("实际放款金额(扣手续费)")
	private BigDecimal realAmount = null;
	@Label("贷款单号")
	private Integer serialId = null;
	@Label("0创建借款请求 1待审核 2审核通过等待提现 3 提现中  4 审核失败 5 提现成功 6提现失败 7还款成功 8已逾期 9取消申请 20信审处理中 ")
	private Short status = null;
	@Label("创建时间")
	private Integer time = null;
	@Label("更新时间")
	private Integer updateTime = null;
	@Label("借款用途")
	private String useWay = null;
	@Label("用户ID")
	private Integer userId = null;
	@Label("提现渠道 1财小仙内部 2真金服 3新网")
	private Integer withdrawChannel = null;

	//****************************************************************************
	//accessors
	//****************************************************************************
	public BigDecimal getAmount()
	{
		return this.amount;
	}
	public void setAmount(BigDecimal amount)
	{
		this.amount = amount;
	}
	public BigDecimal getApplyAmount()
	{
		return this.applyAmount;
	}
	public void setApplyAmount(BigDecimal applyAmount)
	{
		this.applyAmount = applyAmount;
	}
	public Integer getApplyTime()
	{
		return this.applyTime;
	}
	public void setApplyTime(Integer applyTime)
	{
		this.applyTime = applyTime;
	}
	public BigDecimal getBrokerage()
	{
		return this.brokerage;
	}
	public void setBrokerage(BigDecimal brokerage)
	{
		this.brokerage = brokerage;
	}
	public BigDecimal getBrokerageAmount()
	{
		return this.brokerageAmount;
	}
	public void setBrokerageAmount(BigDecimal brokerageAmount)
	{
		this.brokerageAmount = brokerageAmount;
	}
	public Short getConfirmWithdraw()
	{
		return this.confirmWithdraw;
	}
	public void setConfirmWithdraw(Short confirmWithdraw)
	{
		this.confirmWithdraw = confirmWithdraw;
	}
	public BigDecimal getExpectPayAmount()
	{
		return this.expectPayAmount;
	}
	public void setExpectPayAmount(BigDecimal expectPayAmount)
	{
		this.expectPayAmount = expectPayAmount;
	}
	public Integer getExpectPayTime()
	{
		return this.expectPayTime;
	}
	public void setExpectPayTime(Integer expectPayTime)
	{
		this.expectPayTime = expectPayTime;
	}
	public BigDecimal getFee()
	{
		return this.fee;
	}
	public void setFee(BigDecimal fee)
	{
		this.fee = fee;
	}
	public BigDecimal getFeeAmount()
	{
		return this.feeAmount;
	}
	public void setFeeAmount(BigDecimal feeAmount)
	{
		this.feeAmount = feeAmount;
	}
	public BigDecimal getFinancingFee()
	{
		return this.financingFee;
	}
	public void setFinancingFee(BigDecimal financingFee)
	{
		this.financingFee = financingFee;
	}
	public BigDecimal getFinancingFeeAmount()
	{
		return this.financingFeeAmount;
	}
	public void setFinancingFeeAmount(BigDecimal financingFeeAmount)
	{
		this.financingFeeAmount = financingFeeAmount;
	}
	public Short getFromChannel()
	{
		return this.fromChannel;
	}
	public void setFromChannel(Short fromChannel)
	{
		this.fromChannel = fromChannel;
	}
	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public String getIp()
	{
		return this.ip;
	}
	public void setIp(String ip)
	{
		this.ip = ip;
	}
	public Integer getLastCalculateTime()
	{
		return this.lastCalculateTime;
	}
	public void setLastCalculateTime(Integer lastCalculateTime)
	{
		this.lastCalculateTime = lastCalculateTime;
	}
	public Integer getLoanStartTime()
	{
		return this.loanStartTime;
	}
	public void setLoanStartTime(Integer loanStartTime)
	{
		this.loanStartTime = loanStartTime;
	}
	public Integer getLoanSuccessTime()
	{
		return this.loanSuccessTime;
	}
	public void setLoanSuccessTime(Integer loanSuccessTime)
	{
		this.loanSuccessTime = loanSuccessTime;
	}
	public Integer getLoanTime()
	{
		return this.loanTime;
	}
	public void setLoanTime(Integer loanTime)
	{
		this.loanTime = loanTime;
	}
	public Short getLoanType()
	{
		return this.loanType;
	}
	public void setLoanType(Short loanType)
	{
		this.loanType = loanType;
	}
	public Short getLock()
	{
		return this.lock;
	}
	public void setLock(Short lock)
	{
		this.lock = lock;
	}
	public BigDecimal getMonthFeeAmount()
	{
		return this.monthFeeAmount;
	}
	public void setMonthFeeAmount(BigDecimal monthFeeAmount)
	{
		this.monthFeeAmount = monthFeeAmount;
	}
	public BigDecimal getMonthRate()
	{
		return this.monthRate;
	}
	public void setMonthRate(BigDecimal monthRate)
	{
		this.monthRate = monthRate;
	}
	public Long getOperator()
	{
		return this.operator;
	}
	public void setOperator(Long operator)
	{
		this.operator = operator;
	}
	public Integer getPaySuccessTime()
	{
		return this.paySuccessTime;
	}
	public void setPaySuccessTime(Integer paySuccessTime)
	{
		this.paySuccessTime = paySuccessTime;
	}
	public Short getPeriods()
	{
		return this.periods;
	}
	public void setPeriods(Short periods)
	{
		this.periods = periods;
	}
	public String getPlatform()
	{
		return this.platform;
	}
	public void setPlatform(String platform)
	{
		this.platform = platform;
	}
	public Short getProductId()
	{
		return this.productId;
	}
	public void setProductId(Short productId)
	{
		this.productId = productId;
	}
	public BigDecimal getRate()
	{
		return this.rate;
	}
	public void setRate(BigDecimal rate)
	{
		this.rate = rate;
	}
	public BigDecimal getRateAmount()
	{
		return this.rateAmount;
	}
	public void setRateAmount(BigDecimal rateAmount)
	{
		this.rateAmount = rateAmount;
	}
	public BigDecimal getRealAmount()
	{
		return this.realAmount;
	}
	public void setRealAmount(BigDecimal realAmount)
	{
		this.realAmount = realAmount;
	}
	public Integer getSerialId()
	{
		return this.serialId;
	}
	public void setSerialId(Integer serialId)
	{
		this.serialId = serialId;
	}
	public Short getStatus()
	{
		return this.status;
	}
	public void setStatus(Short status)
	{
		this.status = status;
	}
	public Integer getTime()
	{
		return this.time;
	}
	public void setTime(Integer time)
	{
		this.time = time;
	}
	public Integer getUpdateTime()
	{
		return this.updateTime;
	}
	public void setUpdateTime(Integer updateTime)
	{
		this.updateTime = updateTime;
	}
	public String getUseWay()
	{
		return this.useWay;
	}
	public void setUseWay(String useWay)
	{
		this.useWay = useWay;
	}
	public Integer getUserId()
	{
		return this.userId;
	}
	public void setUserId(Integer userId)
	{
		this.userId = userId;
	}
	public Integer getWithdrawChannel()
	{
		return this.withdrawChannel;
	}
	public void setWithdrawChannel(Integer withdrawChannel)
	{
		this.withdrawChannel = withdrawChannel;
	}
	
}
