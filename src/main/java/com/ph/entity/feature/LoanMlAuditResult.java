package com.ph.entity.feature;

import com.bstek.urule.model.Label;
import com.ph.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.math.BigDecimal;
import java.io.Serializable;



/**
 * 
 * <p>Title: loan_ml_audit_result - 模型结果记录表 : Value Object</p> 
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
public class LoanMlAuditResult extends BaseEntity
{
	//****************************************************************************
	//fields
	//****************************************************************************
	@Label("订单创建时间")
	private Integer applyTime = null;
	@Label("Default_id_Comment")
	private Integer id = null;
	@Label("模型预测分")
	private Integer predScore = null;
	@Label("模型准确率")
	private Double prob = null;
	@Label("产品类型2信用卡1现金分期")
	private Short productId = null;
	@Label("模型结果 0:拒绝 1:通过 2:人工审核")
	private Short res = null;
	@Label("借款单号")
	private Long serialId = null;
	@Label("数据阶段表")
	private String stage = null;
	@Label("0:创建订单 1:feature_start 2:feature finish")
	private Short status = null;
	@Label("记录创建时间")
	private Integer time = null;
	@Label("记录更新时间")
	private Integer updateTime = null;
	@Label("Default_user_id_Comment")
	private Integer userId = null;

	//****************************************************************************
	//accessors
	//****************************************************************************
	public Integer getApplyTime()
	{
		return this.applyTime;
	}
	public void setApplyTime(Integer applyTime)
	{
		this.applyTime = applyTime;
	}
	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public Integer getPredScore()
	{
		return this.predScore;
	}
	public void setPredScore(Integer predScore)
	{
		this.predScore = predScore;
	}
	public Double getProb()
	{
		return this.prob;
	}
	public void setProb(Double prob)
	{
		this.prob = prob;
	}
	public Short getProductId()
	{
		return this.productId;
	}
	public void setProductId(Short productId)
	{
		this.productId = productId;
	}
	public Short getRes()
	{
		return this.res;
	}
	public void setRes(Short res)
	{
		this.res = res;
	}
	public Long getSerialId()
	{
		return this.serialId;
	}
	public void setSerialId(Long serialId)
	{
		this.serialId = serialId;
	}
	public String getStage()
	{
		return this.stage;
	}
	public void setStage(String stage)
	{
		this.stage = stage;
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
	public Integer getUserId()
	{
		return this.userId;
	}
	public void setUserId(Integer userId)
	{
		this.userId = userId;
	}
	
}
