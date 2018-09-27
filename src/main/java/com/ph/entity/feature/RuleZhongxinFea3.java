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
 * <p>Title: rule_zhongxin_fea3 - 借款被拒数据特征表3 : Value Object</p> 
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
public class RuleZhongxinFea3 extends BaseEntity
{
	//****************************************************************************
	//fields
	//****************************************************************************
	@Label("Default_feature_time_Comment")
	private Date featureTime = null;
	@Label("Default_id_Comment")
	private Integer id = null;
	@Label("refused_0bct")
	private Double refused0bct = null;
	@Label("refused_0bitem_ct")
	private Double refused0bitemCt = null;
	@Label("十五天内借款平台数")
	private Double refused0ct = null;
	@Label("十五天内借款次数")
	private Double refused0itemCt = null;
	@Label("十五天内被拒绝次数")
	private Double refused0itemR = null;
	@Label("refused_1bct")
	private Double refused1bct = null;
	@Label("refused_1bitem_ct")
	private Double refused1bitemCt = null;
	@Label("十五天至一个月内借款平台数")
	private Double refused1ct = null;
	@Label("十五天至一个月内借款次数")
	private Double refused1itemCt = null;
	@Label("十五天至一个月内被拒绝次数")
	private Double refused1itemR = null;
	@Label("refused_2bct")
	private Double refused2bct = null;
	@Label("refused_2bitem_ct")
	private Double refused2bitemCt = null;
	@Label("一个月至两个月内借款平台数")
	private Double refused2ct = null;
	@Label("一个月至两个月内借款次数")
	private Double refused2itemCt = null;
	@Label("一个月至两个月内被拒绝次数")
	private Double refused2itemR = null;
	@Label("refused_3bct")
	private Double refused3bct = null;
	@Label("refused_3bitem_ct")
	private Double refused3bitemCt = null;
	@Label("两个月至三个月内借款平台数")
	private Double refused3ct = null;
	@Label("两个月至三个月内借款次数")
	private Double refused3itemCt = null;
	@Label("两个月至三个月内被拒绝次数")
	private Double refused3itemR = null;
	@Label("refused_4bct")
	private Double refused4bct = null;
	@Label("refused_4bitem_ct")
	private Double refused4bitemCt = null;
	@Label("三个月至六个月内借款平台数")
	private Double refused4ct = null;
	@Label("三个月至六个月内借款次数")
	private Double refused4itemCt = null;
	@Label("三个月至六个月内被拒绝次数")
	private Double refused4itemR = null;
	@Label("refused_5bct")
	private Double refused5bct = null;
	@Label("refused_5bitem_ct")
	private Double refused5bitemCt = null;
	@Label("六个月以上借款平台数")
	private Double refused5ct = null;
	@Label("六个月以上借款次数")
	private Double refused5itemCt = null;
	@Label("六个月以上被拒绝次数")
	private Double refused5itemR = null;
	@Label("总借款平台数")
	private Double refusedCt = null;
	@Label("总借款次数")
	private Double refusedItemCt = null;
	@Label("总被拒绝次数")
	private Double refusedItemR = null;
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
	public Double getRefused0bct()
	{
		return this.refused0bct;
	}
	public void setRefused0bct(Double refused0bct)
	{
		this.refused0bct = refused0bct;
	}
	public Double getRefused0bitemCt()
	{
		return this.refused0bitemCt;
	}
	public void setRefused0bitemCt(Double refused0bitemCt)
	{
		this.refused0bitemCt = refused0bitemCt;
	}
	public Double getRefused0ct()
	{
		return this.refused0ct;
	}
	public void setRefused0ct(Double refused0ct)
	{
		this.refused0ct = refused0ct;
	}
	public Double getRefused0itemCt()
	{
		return this.refused0itemCt;
	}
	public void setRefused0itemCt(Double refused0itemCt)
	{
		this.refused0itemCt = refused0itemCt;
	}
	public Double getRefused0itemR()
	{
		return this.refused0itemR;
	}
	public void setRefused0itemR(Double refused0itemR)
	{
		this.refused0itemR = refused0itemR;
	}
	public Double getRefused1bct()
	{
		return this.refused1bct;
	}
	public void setRefused1bct(Double refused1bct)
	{
		this.refused1bct = refused1bct;
	}
	public Double getRefused1bitemCt()
	{
		return this.refused1bitemCt;
	}
	public void setRefused1bitemCt(Double refused1bitemCt)
	{
		this.refused1bitemCt = refused1bitemCt;
	}
	public Double getRefused1ct()
	{
		return this.refused1ct;
	}
	public void setRefused1ct(Double refused1ct)
	{
		this.refused1ct = refused1ct;
	}
	public Double getRefused1itemCt()
	{
		return this.refused1itemCt;
	}
	public void setRefused1itemCt(Double refused1itemCt)
	{
		this.refused1itemCt = refused1itemCt;
	}
	public Double getRefused1itemR()
	{
		return this.refused1itemR;
	}
	public void setRefused1itemR(Double refused1itemR)
	{
		this.refused1itemR = refused1itemR;
	}
	public Double getRefused2bct()
	{
		return this.refused2bct;
	}
	public void setRefused2bct(Double refused2bct)
	{
		this.refused2bct = refused2bct;
	}
	public Double getRefused2bitemCt()
	{
		return this.refused2bitemCt;
	}
	public void setRefused2bitemCt(Double refused2bitemCt)
	{
		this.refused2bitemCt = refused2bitemCt;
	}
	public Double getRefused2ct()
	{
		return this.refused2ct;
	}
	public void setRefused2ct(Double refused2ct)
	{
		this.refused2ct = refused2ct;
	}
	public Double getRefused2itemCt()
	{
		return this.refused2itemCt;
	}
	public void setRefused2itemCt(Double refused2itemCt)
	{
		this.refused2itemCt = refused2itemCt;
	}
	public Double getRefused2itemR()
	{
		return this.refused2itemR;
	}
	public void setRefused2itemR(Double refused2itemR)
	{
		this.refused2itemR = refused2itemR;
	}
	public Double getRefused3bct()
	{
		return this.refused3bct;
	}
	public void setRefused3bct(Double refused3bct)
	{
		this.refused3bct = refused3bct;
	}
	public Double getRefused3bitemCt()
	{
		return this.refused3bitemCt;
	}
	public void setRefused3bitemCt(Double refused3bitemCt)
	{
		this.refused3bitemCt = refused3bitemCt;
	}
	public Double getRefused3ct()
	{
		return this.refused3ct;
	}
	public void setRefused3ct(Double refused3ct)
	{
		this.refused3ct = refused3ct;
	}
	public Double getRefused3itemCt()
	{
		return this.refused3itemCt;
	}
	public void setRefused3itemCt(Double refused3itemCt)
	{
		this.refused3itemCt = refused3itemCt;
	}
	public Double getRefused3itemR()
	{
		return this.refused3itemR;
	}
	public void setRefused3itemR(Double refused3itemR)
	{
		this.refused3itemR = refused3itemR;
	}
	public Double getRefused4bct()
	{
		return this.refused4bct;
	}
	public void setRefused4bct(Double refused4bct)
	{
		this.refused4bct = refused4bct;
	}
	public Double getRefused4bitemCt()
	{
		return this.refused4bitemCt;
	}
	public void setRefused4bitemCt(Double refused4bitemCt)
	{
		this.refused4bitemCt = refused4bitemCt;
	}
	public Double getRefused4ct()
	{
		return this.refused4ct;
	}
	public void setRefused4ct(Double refused4ct)
	{
		this.refused4ct = refused4ct;
	}
	public Double getRefused4itemCt()
	{
		return this.refused4itemCt;
	}
	public void setRefused4itemCt(Double refused4itemCt)
	{
		this.refused4itemCt = refused4itemCt;
	}
	public Double getRefused4itemR()
	{
		return this.refused4itemR;
	}
	public void setRefused4itemR(Double refused4itemR)
	{
		this.refused4itemR = refused4itemR;
	}
	public Double getRefused5bct()
	{
		return this.refused5bct;
	}
	public void setRefused5bct(Double refused5bct)
	{
		this.refused5bct = refused5bct;
	}
	public Double getRefused5bitemCt()
	{
		return this.refused5bitemCt;
	}
	public void setRefused5bitemCt(Double refused5bitemCt)
	{
		this.refused5bitemCt = refused5bitemCt;
	}
	public Double getRefused5ct()
	{
		return this.refused5ct;
	}
	public void setRefused5ct(Double refused5ct)
	{
		this.refused5ct = refused5ct;
	}
	public Double getRefused5itemCt()
	{
		return this.refused5itemCt;
	}
	public void setRefused5itemCt(Double refused5itemCt)
	{
		this.refused5itemCt = refused5itemCt;
	}
	public Double getRefused5itemR()
	{
		return this.refused5itemR;
	}
	public void setRefused5itemR(Double refused5itemR)
	{
		this.refused5itemR = refused5itemR;
	}
	public Double getRefusedCt()
	{
		return this.refusedCt;
	}
	public void setRefusedCt(Double refusedCt)
	{
		this.refusedCt = refusedCt;
	}
	public Double getRefusedItemCt()
	{
		return this.refusedItemCt;
	}
	public void setRefusedItemCt(Double refusedItemCt)
	{
		this.refusedItemCt = refusedItemCt;
	}
	public Double getRefusedItemR()
	{
		return this.refusedItemR;
	}
	public void setRefusedItemR(Double refusedItemR)
	{
		this.refusedItemR = refusedItemR;
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
