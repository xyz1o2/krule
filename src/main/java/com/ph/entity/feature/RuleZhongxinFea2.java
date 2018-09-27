package com.ph.entity.feature;

import com.bstek.urule.model.Label;
import com.ph.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.math.BigDecimal;
import java.io.Serializable;

import java.util.Date;


/**
 * 
 * <p>Title: rule_zhongxin_fea2 - 逾期还清数据特征表2 : Value Object</p> 
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
public class RuleZhongxinFea2 extends BaseEntity
{
	//****************************************************************************
	//fields
	//****************************************************************************
	@Label("Default_feature_time_Comment")
	private Date featureTime = null;
	@Label("Default_id_Comment")
	private Integer id = null;
	@Label("一个月内逾期还清平台数")
	private Double overdueClear0bct = null;
	@Label("一个月内逾期还清次数")
	private Double overdueClear0bitemCt = null;
	@Label("一个月内逾期平台数")
	private Double overdueClear0ct = null;
	@Label("一个月内逾期次数")
	private Double overdueClear0itemCt = null;
	@Label("一个月到二个月内逾期还清平台数")
	private Double overdueClear1bct = null;
	@Label("一个月到二个月内逾期还清次数")
	private Double overdueClear1bitemCt = null;
	@Label("一个月到二个月内逾期平台数")
	private Double overdueClear1ct = null;
	@Label("一个月到二个月内逾期次数")
	private Double overdueClear1itemCt = null;
	@Label("二个月到三个月内逾期还清平台数")
	private Double overdueClear2bct = null;
	@Label("二个月到三个月内逾期还清次数")
	private Double overdueClear2bitemCt = null;
	@Label("二个月到三个月内逾期平台数")
	private Double overdueClear2ct = null;
	@Label("二个月到三个月内逾期次数")
	private Double overdueClear2itemCt = null;
	@Label("三个月到六个月内逾期还清平台数")
	private Double overdueClear3bct = null;
	@Label("三个月到六个月内逾期还清次数")
	private Double overdueClear3bitemCt = null;
	@Label("三个月到六个月内逾期平台数")
	private Double overdueClear3ct = null;
	@Label("三个月到六个月内逾期次数")
	private Double overdueClear3itemCt = null;
	@Label("六个月至一年内逾期还清平台数")
	private Double overdueClear4bct = null;
	@Label("六个月至一年内逾期还清次数")
	private Double overdueClear4bitemCt = null;
	@Label("六个月至一年内逾期平台数")
	private Double overdueClear4ct = null;
	@Label("六个月至一年内逾期次数")
	private Double overdueClear4itemCt = null;
	@Label("一年至两年内逾期还清平台数")
	private Double overdueClear5bct = null;
	@Label("一年至两年内逾期还清次数")
	private Double overdueClear5bitemCt = null;
	@Label("一年至两年内逾期平台数")
	private Double overdueClear5ct = null;
	@Label("一年至两年内逾期次数")
	private Double overdueClear5itemCt = null;
	@Label("两年以上逾期还清平台数")
	private Double overdueClear7bct = null;
	@Label("两年以上逾期还清次数")
	private Double overdueClear7bitemCt = null;
	@Label("两年以上逾期平台数")
	private Double overdueClear7ct = null;
	@Label("两年以上逾期次数")
	private Double overdueClear7itemCt = null;
	@Label("总逾期平台数")
	private Double overdueClearCt = null;
	@Label("总逾期次数")
	private Double overdueClearItemCt = null;
	@Label("借款单号")
	private Integer serialId = null;
	@Label("订单类型0:卡代偿 1:财小仙")
	private Short serialType = null;
	@Label("Default_user_id_Comment")
	private Integer userId = null;

	//****************************************************************************
	//accessors
	//****************************************************************************
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
	public Double getOverdueClear0bct()
	{
		return this.overdueClear0bct;
	}
	public void setOverdueClear0bct(Double overdueClear0bct)
	{
		this.overdueClear0bct = overdueClear0bct;
	}
	public Double getOverdueClear0bitemCt()
	{
		return this.overdueClear0bitemCt;
	}
	public void setOverdueClear0bitemCt(Double overdueClear0bitemCt)
	{
		this.overdueClear0bitemCt = overdueClear0bitemCt;
	}
	public Double getOverdueClear0ct()
	{
		return this.overdueClear0ct;
	}
	public void setOverdueClear0ct(Double overdueClear0ct)
	{
		this.overdueClear0ct = overdueClear0ct;
	}
	public Double getOverdueClear0itemCt()
	{
		return this.overdueClear0itemCt;
	}
	public void setOverdueClear0itemCt(Double overdueClear0itemCt)
	{
		this.overdueClear0itemCt = overdueClear0itemCt;
	}
	public Double getOverdueClear1bct()
	{
		return this.overdueClear1bct;
	}
	public void setOverdueClear1bct(Double overdueClear1bct)
	{
		this.overdueClear1bct = overdueClear1bct;
	}
	public Double getOverdueClear1bitemCt()
	{
		return this.overdueClear1bitemCt;
	}
	public void setOverdueClear1bitemCt(Double overdueClear1bitemCt)
	{
		this.overdueClear1bitemCt = overdueClear1bitemCt;
	}
	public Double getOverdueClear1ct()
	{
		return this.overdueClear1ct;
	}
	public void setOverdueClear1ct(Double overdueClear1ct)
	{
		this.overdueClear1ct = overdueClear1ct;
	}
	public Double getOverdueClear1itemCt()
	{
		return this.overdueClear1itemCt;
	}
	public void setOverdueClear1itemCt(Double overdueClear1itemCt)
	{
		this.overdueClear1itemCt = overdueClear1itemCt;
	}
	public Double getOverdueClear2bct()
	{
		return this.overdueClear2bct;
	}
	public void setOverdueClear2bct(Double overdueClear2bct)
	{
		this.overdueClear2bct = overdueClear2bct;
	}
	public Double getOverdueClear2bitemCt()
	{
		return this.overdueClear2bitemCt;
	}
	public void setOverdueClear2bitemCt(Double overdueClear2bitemCt)
	{
		this.overdueClear2bitemCt = overdueClear2bitemCt;
	}
	public Double getOverdueClear2ct()
	{
		return this.overdueClear2ct;
	}
	public void setOverdueClear2ct(Double overdueClear2ct)
	{
		this.overdueClear2ct = overdueClear2ct;
	}
	public Double getOverdueClear2itemCt()
	{
		return this.overdueClear2itemCt;
	}
	public void setOverdueClear2itemCt(Double overdueClear2itemCt)
	{
		this.overdueClear2itemCt = overdueClear2itemCt;
	}
	public Double getOverdueClear3bct()
	{
		return this.overdueClear3bct;
	}
	public void setOverdueClear3bct(Double overdueClear3bct)
	{
		this.overdueClear3bct = overdueClear3bct;
	}
	public Double getOverdueClear3bitemCt()
	{
		return this.overdueClear3bitemCt;
	}
	public void setOverdueClear3bitemCt(Double overdueClear3bitemCt)
	{
		this.overdueClear3bitemCt = overdueClear3bitemCt;
	}
	public Double getOverdueClear3ct()
	{
		return this.overdueClear3ct;
	}
	public void setOverdueClear3ct(Double overdueClear3ct)
	{
		this.overdueClear3ct = overdueClear3ct;
	}
	public Double getOverdueClear3itemCt()
	{
		return this.overdueClear3itemCt;
	}
	public void setOverdueClear3itemCt(Double overdueClear3itemCt)
	{
		this.overdueClear3itemCt = overdueClear3itemCt;
	}
	public Double getOverdueClear4bct()
	{
		return this.overdueClear4bct;
	}
	public void setOverdueClear4bct(Double overdueClear4bct)
	{
		this.overdueClear4bct = overdueClear4bct;
	}
	public Double getOverdueClear4bitemCt()
	{
		return this.overdueClear4bitemCt;
	}
	public void setOverdueClear4bitemCt(Double overdueClear4bitemCt)
	{
		this.overdueClear4bitemCt = overdueClear4bitemCt;
	}
	public Double getOverdueClear4ct()
	{
		return this.overdueClear4ct;
	}
	public void setOverdueClear4ct(Double overdueClear4ct)
	{
		this.overdueClear4ct = overdueClear4ct;
	}
	public Double getOverdueClear4itemCt()
	{
		return this.overdueClear4itemCt;
	}
	public void setOverdueClear4itemCt(Double overdueClear4itemCt)
	{
		this.overdueClear4itemCt = overdueClear4itemCt;
	}
	public Double getOverdueClear5bct()
	{
		return this.overdueClear5bct;
	}
	public void setOverdueClear5bct(Double overdueClear5bct)
	{
		this.overdueClear5bct = overdueClear5bct;
	}
	public Double getOverdueClear5bitemCt()
	{
		return this.overdueClear5bitemCt;
	}
	public void setOverdueClear5bitemCt(Double overdueClear5bitemCt)
	{
		this.overdueClear5bitemCt = overdueClear5bitemCt;
	}
	public Double getOverdueClear5ct()
	{
		return this.overdueClear5ct;
	}
	public void setOverdueClear5ct(Double overdueClear5ct)
	{
		this.overdueClear5ct = overdueClear5ct;
	}
	public Double getOverdueClear5itemCt()
	{
		return this.overdueClear5itemCt;
	}
	public void setOverdueClear5itemCt(Double overdueClear5itemCt)
	{
		this.overdueClear5itemCt = overdueClear5itemCt;
	}
	public Double getOverdueClear7bct()
	{
		return this.overdueClear7bct;
	}
	public void setOverdueClear7bct(Double overdueClear7bct)
	{
		this.overdueClear7bct = overdueClear7bct;
	}
	public Double getOverdueClear7bitemCt()
	{
		return this.overdueClear7bitemCt;
	}
	public void setOverdueClear7bitemCt(Double overdueClear7bitemCt)
	{
		this.overdueClear7bitemCt = overdueClear7bitemCt;
	}
	public Double getOverdueClear7ct()
	{
		return this.overdueClear7ct;
	}
	public void setOverdueClear7ct(Double overdueClear7ct)
	{
		this.overdueClear7ct = overdueClear7ct;
	}
	public Double getOverdueClear7itemCt()
	{
		return this.overdueClear7itemCt;
	}
	public void setOverdueClear7itemCt(Double overdueClear7itemCt)
	{
		this.overdueClear7itemCt = overdueClear7itemCt;
	}
	public Double getOverdueClearCt()
	{
		return this.overdueClearCt;
	}
	public void setOverdueClearCt(Double overdueClearCt)
	{
		this.overdueClearCt = overdueClearCt;
	}
	public Double getOverdueClearItemCt()
	{
		return this.overdueClearItemCt;
	}
	public void setOverdueClearItemCt(Double overdueClearItemCt)
	{
		this.overdueClearItemCt = overdueClearItemCt;
	}
	public Integer getSerialId()
	{
		return this.serialId;
	}
	public void setSerialId(Integer serialId)
	{
		this.serialId = serialId;
	}
	public Short getSerialType()
	{
		return this.serialType;
	}
	public void setSerialType(Short serialType)
	{
		this.serialType = serialType;
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
