package com.ph.entity.strategy;

import com.bstek.urule.model.Label;
import com.ph.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.math.BigDecimal;
import java.io.Serializable;



/**
 * 
 * <p>Title: risk_decision_result - 特征值记录表 : Value Object</p> 
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
public class RiskDecisionResult extends BaseEntity
{
	//****************************************************************************
	//fields
	//****************************************************************************
	@Label("对应进件表中的进件号(serial_id)")
	private Integer applyNo = null;
	@Label("开始跑此次风控流程的时间")
	private Integer createTime = null;
	@Label("决策引擎返回值")
	private String decisionReturn = null;
	@Label("自动生成")
	private Integer id = null;
	@Label("指标计算返回值")
	private String indexReturn = null;
	@Label("是否写表，空不写，填入任意值都写表")
	private String isInsert = null;
	@Label("每一次跑风控对应的唯一风控分析ID")
	private String riskAnalysisId = null;
	@Label("风控主流程ID")
	private String riskProcessNo = null;
	@Label("风控子流程ID")
	private String riskProcessSubNo = null;
	@Label("主流程状态")
	private String riskState = null;
	@Label("子流程状态")
	private String riskSubState = null;
	@Label("对应User表的user ID")
	private Integer riskUserId = null;
	@Label("完成此次风控流程并更新结果的时间")
	private Integer updateTime = null;

	//****************************************************************************
	//accessors
	//****************************************************************************
	public Integer getApplyNo()
	{
		return this.applyNo;
	}
	public void setApplyNo(Integer applyNo)
	{
		this.applyNo = applyNo;
	}
	public Integer getCreateTime()
	{
		return this.createTime;
	}
	public void setCreateTime(Integer createTime)
	{
		this.createTime = createTime;
	}
	public String getDecisionReturn()
	{
		return this.decisionReturn;
	}
	public void setDecisionReturn(String decisionReturn)
	{
		this.decisionReturn = decisionReturn;
	}
	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public String getIndexReturn()
	{
		return this.indexReturn;
	}
	public void setIndexReturn(String indexReturn)
	{
		this.indexReturn = indexReturn;
	}
	public String getIsInsert()
	{
		return this.isInsert;
	}
	public void setIsInsert(String isInsert)
	{
		this.isInsert = isInsert;
	}
	public String getRiskAnalysisId()
	{
		return this.riskAnalysisId;
	}
	public void setRiskAnalysisId(String riskAnalysisId)
	{
		this.riskAnalysisId = riskAnalysisId;
	}
	public String getRiskProcessNo()
	{
		return this.riskProcessNo;
	}
	public void setRiskProcessNo(String riskProcessNo)
	{
		this.riskProcessNo = riskProcessNo;
	}
	public String getRiskProcessSubNo()
	{
		return this.riskProcessSubNo;
	}
	public void setRiskProcessSubNo(String riskProcessSubNo)
	{
		this.riskProcessSubNo = riskProcessSubNo;
	}
	public String getRiskState()
	{
		return this.riskState;
	}
	public void setRiskState(String riskState)
	{
		this.riskState = riskState;
	}
	public String getRiskSubState()
	{
		return this.riskSubState;
	}
	public void setRiskSubState(String riskSubState)
	{
		this.riskSubState = riskSubState;
	}
	public Integer getRiskUserId()
	{
		return this.riskUserId;
	}
	public void setRiskUserId(Integer riskUserId)
	{
		this.riskUserId = riskUserId;
	}
	public Integer getUpdateTime()
	{
		return this.updateTime;
	}
	public void setUpdateTime(Integer updateTime)
	{
		this.updateTime = updateTime;
	}
	
}
