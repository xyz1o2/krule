package com.ph.entity.strategy;

import com.bstek.urule.model.Label;
import com.ph.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;



/**
 * 
 * <p>Title: risk_execute_log - 日志记录表 : Value Object</p> 
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
public class RiskExecuteLog extends BaseEntity
{
	//****************************************************************************
	//fields
	//****************************************************************************
	@Label("对应进件表中的进件号(serial_id)")
	private Integer applyNo = null;
	@Label("开始跑此次风控流程的时间")
	private Integer createTime = null;
	@Label("自动生成")
	private Integer id = null;
	@Label("决策引入数据快照")
	private String input = null;
	@Label("每一次跑风控对应的唯一风控分析ID")
	private String riskAnalysisId = null;
	@Label("决策匹配规则")
	private String rules = null;
	@Label("暑促参数表")
	private String params = null;

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
	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public String getInput()
	{
		return this.input;
	}
	public void setInput(String input)
	{
		this.input = input;
	}
	public String getRiskAnalysisId()
	{
		return this.riskAnalysisId;
	}
	public void setRiskAnalysisId(String riskAnalysisId)
	{
		this.riskAnalysisId = riskAnalysisId;
	}
	public String getRules()
	{
		return this.rules;
	}
	public void setRules(String rules)
	{
		this.rules = rules;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}
}
