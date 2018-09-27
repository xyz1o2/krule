package com.ph.entity.strategy;

import com.bstek.urule.model.Label;
import com.ph.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.math.BigDecimal;
import java.io.Serializable;



/**
 * 
 * <p>Title: risk_characteristics - 特征值记录表 : Value Object</p> 
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
public class RiskCharacteristics extends BaseEntity
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
	@Label("是否写表，空不写，填入任意值都写表")
	private String isInsert = null;
	@Label("分数名")
	private String key = null;
	@Label("每一次跑风控对应的唯一风控分析ID")
	private String riskAnalysisId = null;
	@Label("所跑的风控主流程编号（区分5种不同的流程及版本：REG001,MAT001,ACT001,USE001，REV001）")
	private String riskProcessNo = null;
	@Label("此风控主流程中所包含的子流程编号,多个流程以逗号相隔（如ACTINT001,ACTTRD001,ACTAUD001)")
	private String riskProcessSubNo = null;
	@Label("对应User表的user ID")
	private Integer riskUserId = null;
	@Label("完成此次风控流程并更新结果的时间")
	private Integer updateTime = null;
	@Label("指标值")
	private String value = null;

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
	public String getIsInsert()
	{
		return this.isInsert;
	}
	public void setIsInsert(String isInsert)
	{
		this.isInsert = isInsert;
	}
	public String getKey()
	{
		return this.key;
	}
	public void setKey(String key)
	{
		this.key = key;
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
	public String getValue()
	{
		return this.value;
	}
	public void setValue(String value)
	{
		this.value = value;
	}
	
}
