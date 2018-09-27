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
 * <p>Title: rule_zhongxin_fea1 - 逾期数据特征表1 : Value Object</p> 
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
public class RuleZhongxinFea1 extends BaseEntity
{
	//****************************************************************************
	//fields
	//****************************************************************************
	@Label("Default_feature_time_Comment")
	private Date featureTime = null;
	@Label("Default_id_Comment")
	private Integer id = null;
	@Label("overdue_0bct")
	private Double overdue0bct = null;
	@Label("overdue_0bitem_ct")
	private Double overdue0bitemCt = null;
	@Label("一个月内逾期平台数")
	private Double overdue0ct = null;
	@Label("一个月内逾期次数")
	private Double overdue0itemCt = null;
	@Label("overdue_1bct")
	private Double overdue1bct = null;
	@Label("overdue_1bitem_ct")
	private Double overdue1bitemCt = null;
	@Label("一个月到二个月内逾期平台数")
	private Double overdue1ct = null;
	@Label("一个月到二个月内逾期次数")
	private Double overdue1itemCt = null;
	@Label("overdue_2bct")
	private Double overdue2bct = null;
	@Label("overdue_2bitem_ct")
	private Double overdue2bitemCt = null;
	@Label("二个月到三个月内逾期平台数")
	private Double overdue2ct = null;
	@Label("二个月到三个月内逾期次数")
	private Double overdue2itemCt = null;
	@Label("overdue_3bct")
	private Double overdue3bct = null;
	@Label("overdue_3bitem_ct")
	private Double overdue3bitemCt = null;
	@Label("三个月到六个月内逾期平台数")
	private Double overdue3ct = null;
	@Label("三个月到六个月内逾期次数")
	private Double overdue3itemCt = null;
	@Label("overdue_4bct")
	private Double overdue4bct = null;
	@Label("overdue_4bitem_ct")
	private Double overdue4bitemCt = null;
	@Label("六个月至一年内逾期平台数")
	private Double overdue4ct = null;
	@Label("六个月至一年内逾期次数")
	private Double overdue4itemCt = null;
	@Label("overdue_5bct")
	private Double overdue5bct = null;
	@Label("overdue_5bitem_ct")
	private Double overdue5bitemCt = null;
	@Label("一年至两年内逾期平台数")
	private Double overdue5ct = null;
	@Label("一年至两年内逾期次数")
	private Double overdue5itemCt = null;
	@Label("overdue_7bct")
	private Double overdue7bct = null;
	@Label("overdue_7bitem_ct")
	private Double overdue7bitemCt = null;
	@Label("两年以上逾期平台数")
	private Double overdue7ct = null;
	@Label("两年以上逾期次数")
	private Double overdue7itemCt = null;
	@Label("总逾期平台数")
	private Double overdueCt = null;
	@Label("总逾期次数")
	private Double overdueItemCt = null;
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
	public Double getOverdue0bct()
	{
		return this.overdue0bct;
	}
	public void setOverdue0bct(Double overdue0bct)
	{
		this.overdue0bct = overdue0bct;
	}
	public Double getOverdue0bitemCt()
	{
		return this.overdue0bitemCt;
	}
	public void setOverdue0bitemCt(Double overdue0bitemCt)
	{
		this.overdue0bitemCt = overdue0bitemCt;
	}
	public Double getOverdue0ct()
	{
		return this.overdue0ct;
	}
	public void setOverdue0ct(Double overdue0ct)
	{
		this.overdue0ct = overdue0ct;
	}
	public Double getOverdue0itemCt()
	{
		return this.overdue0itemCt;
	}
	public void setOverdue0itemCt(Double overdue0itemCt)
	{
		this.overdue0itemCt = overdue0itemCt;
	}
	public Double getOverdue1bct()
	{
		return this.overdue1bct;
	}
	public void setOverdue1bct(Double overdue1bct)
	{
		this.overdue1bct = overdue1bct;
	}
	public Double getOverdue1bitemCt()
	{
		return this.overdue1bitemCt;
	}
	public void setOverdue1bitemCt(Double overdue1bitemCt)
	{
		this.overdue1bitemCt = overdue1bitemCt;
	}
	public Double getOverdue1ct()
	{
		return this.overdue1ct;
	}
	public void setOverdue1ct(Double overdue1ct)
	{
		this.overdue1ct = overdue1ct;
	}
	public Double getOverdue1itemCt()
	{
		return this.overdue1itemCt;
	}
	public void setOverdue1itemCt(Double overdue1itemCt)
	{
		this.overdue1itemCt = overdue1itemCt;
	}
	public Double getOverdue2bct()
	{
		return this.overdue2bct;
	}
	public void setOverdue2bct(Double overdue2bct)
	{
		this.overdue2bct = overdue2bct;
	}
	public Double getOverdue2bitemCt()
	{
		return this.overdue2bitemCt;
	}
	public void setOverdue2bitemCt(Double overdue2bitemCt)
	{
		this.overdue2bitemCt = overdue2bitemCt;
	}
	public Double getOverdue2ct()
	{
		return this.overdue2ct;
	}
	public void setOverdue2ct(Double overdue2ct)
	{
		this.overdue2ct = overdue2ct;
	}
	public Double getOverdue2itemCt()
	{
		return this.overdue2itemCt;
	}
	public void setOverdue2itemCt(Double overdue2itemCt)
	{
		this.overdue2itemCt = overdue2itemCt;
	}
	public Double getOverdue3bct()
	{
		return this.overdue3bct;
	}
	public void setOverdue3bct(Double overdue3bct)
	{
		this.overdue3bct = overdue3bct;
	}
	public Double getOverdue3bitemCt()
	{
		return this.overdue3bitemCt;
	}
	public void setOverdue3bitemCt(Double overdue3bitemCt)
	{
		this.overdue3bitemCt = overdue3bitemCt;
	}
	public Double getOverdue3ct()
	{
		return this.overdue3ct;
	}
	public void setOverdue3ct(Double overdue3ct)
	{
		this.overdue3ct = overdue3ct;
	}
	public Double getOverdue3itemCt()
	{
		return this.overdue3itemCt;
	}
	public void setOverdue3itemCt(Double overdue3itemCt)
	{
		this.overdue3itemCt = overdue3itemCt;
	}
	public Double getOverdue4bct()
	{
		return this.overdue4bct;
	}
	public void setOverdue4bct(Double overdue4bct)
	{
		this.overdue4bct = overdue4bct;
	}
	public Double getOverdue4bitemCt()
	{
		return this.overdue4bitemCt;
	}
	public void setOverdue4bitemCt(Double overdue4bitemCt)
	{
		this.overdue4bitemCt = overdue4bitemCt;
	}
	public Double getOverdue4ct()
	{
		return this.overdue4ct;
	}
	public void setOverdue4ct(Double overdue4ct)
	{
		this.overdue4ct = overdue4ct;
	}
	public Double getOverdue4itemCt()
	{
		return this.overdue4itemCt;
	}
	public void setOverdue4itemCt(Double overdue4itemCt)
	{
		this.overdue4itemCt = overdue4itemCt;
	}
	public Double getOverdue5bct()
	{
		return this.overdue5bct;
	}
	public void setOverdue5bct(Double overdue5bct)
	{
		this.overdue5bct = overdue5bct;
	}
	public Double getOverdue5bitemCt()
	{
		return this.overdue5bitemCt;
	}
	public void setOverdue5bitemCt(Double overdue5bitemCt)
	{
		this.overdue5bitemCt = overdue5bitemCt;
	}
	public Double getOverdue5ct()
	{
		return this.overdue5ct;
	}
	public void setOverdue5ct(Double overdue5ct)
	{
		this.overdue5ct = overdue5ct;
	}
	public Double getOverdue5itemCt()
	{
		return this.overdue5itemCt;
	}
	public void setOverdue5itemCt(Double overdue5itemCt)
	{
		this.overdue5itemCt = overdue5itemCt;
	}
	public Double getOverdue7bct()
	{
		return this.overdue7bct;
	}
	public void setOverdue7bct(Double overdue7bct)
	{
		this.overdue7bct = overdue7bct;
	}
	public Double getOverdue7bitemCt()
	{
		return this.overdue7bitemCt;
	}
	public void setOverdue7bitemCt(Double overdue7bitemCt)
	{
		this.overdue7bitemCt = overdue7bitemCt;
	}
	public Double getOverdue7ct()
	{
		return this.overdue7ct;
	}
	public void setOverdue7ct(Double overdue7ct)
	{
		this.overdue7ct = overdue7ct;
	}
	public Double getOverdue7itemCt()
	{
		return this.overdue7itemCt;
	}
	public void setOverdue7itemCt(Double overdue7itemCt)
	{
		this.overdue7itemCt = overdue7itemCt;
	}
	public Double getOverdueCt()
	{
		return this.overdueCt;
	}
	public void setOverdueCt(Double overdueCt)
	{
		this.overdueCt = overdueCt;
	}
	public Double getOverdueItemCt()
	{
		return this.overdueItemCt;
	}
	public void setOverdueItemCt(Double overdueItemCt)
	{
		this.overdueItemCt = overdueItemCt;
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
