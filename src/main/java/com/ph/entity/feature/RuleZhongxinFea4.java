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
 * <p>Title: rule_zhongxin_fea4 - 网贷人员数据特征表4 : Value Object</p> 
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
public class RuleZhongxinFea4 extends BaseEntity
{
	//****************************************************************************
	//fields
	//****************************************************************************
	@Label("Default_feature_time_Comment")
	private Date featureTime = null;
	@Label("Default_id_Comment")
	private Integer id = null;
	@Label("p_query_0bct")
	private Double pQuery0bct = null;
	@Label("p_query_0bitem_ct")
	private Double pQuery0bitemCt = null;
	@Label("一个月内借款平台数")
	private Double pQuery0ct = null;
	@Label("一个月内借款金额")
	private Double pQuery0itemCt = null;
	@Label("p_query_1bct")
	private Double pQuery1bct = null;
	@Label("p_query_1bitem_ct")
	private Double pQuery1bitemCt = null;
	@Label("一个月至三个月内借款平台数")
	private Double pQuery1ct = null;
	@Label("一个月至三个月内借款金额")
	private Double pQuery1itemCt = null;
	@Label("p_query_2bct")
	private Double pQuery2bct = null;
	@Label("p_query_2bitem_ct")
	private Double pQuery2bitemCt = null;
	@Label("三月以上借款平台数")
	private Double pQuery2ct = null;
	@Label("三月以上借款金额")
	private Double pQuery2itemCt = null;
	@Label("总借款平台数")
	private Double pQueryCt = null;
	@Label("总借款金额")
	private Double pQueryItemCt = null;
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
	public Double getPQuery0bct()
	{
		return this.pQuery0bct;
	}
	public void setPQuery0bct(Double pQuery0bct)
	{
		this.pQuery0bct = pQuery0bct;
	}
	public Double getPQuery0bitemCt()
	{
		return this.pQuery0bitemCt;
	}
	public void setPQuery0bitemCt(Double pQuery0bitemCt)
	{
		this.pQuery0bitemCt = pQuery0bitemCt;
	}
	public Double getPQuery0ct()
	{
		return this.pQuery0ct;
	}
	public void setPQuery0ct(Double pQuery0ct)
	{
		this.pQuery0ct = pQuery0ct;
	}
	public Double getPQuery0itemCt()
	{
		return this.pQuery0itemCt;
	}
	public void setPQuery0itemCt(Double pQuery0itemCt)
	{
		this.pQuery0itemCt = pQuery0itemCt;
	}
	public Double getPQuery1bct()
	{
		return this.pQuery1bct;
	}
	public void setPQuery1bct(Double pQuery1bct)
	{
		this.pQuery1bct = pQuery1bct;
	}
	public Double getPQuery1bitemCt()
	{
		return this.pQuery1bitemCt;
	}
	public void setPQuery1bitemCt(Double pQuery1bitemCt)
	{
		this.pQuery1bitemCt = pQuery1bitemCt;
	}
	public Double getPQuery1ct()
	{
		return this.pQuery1ct;
	}
	public void setPQuery1ct(Double pQuery1ct)
	{
		this.pQuery1ct = pQuery1ct;
	}
	public Double getPQuery1itemCt()
	{
		return this.pQuery1itemCt;
	}
	public void setPQuery1itemCt(Double pQuery1itemCt)
	{
		this.pQuery1itemCt = pQuery1itemCt;
	}
	public Double getPQuery2bct()
	{
		return this.pQuery2bct;
	}
	public void setPQuery2bct(Double pQuery2bct)
	{
		this.pQuery2bct = pQuery2bct;
	}
	public Double getPQuery2bitemCt()
	{
		return this.pQuery2bitemCt;
	}
	public void setPQuery2bitemCt(Double pQuery2bitemCt)
	{
		this.pQuery2bitemCt = pQuery2bitemCt;
	}
	public Double getPQuery2ct()
	{
		return this.pQuery2ct;
	}
	public void setPQuery2ct(Double pQuery2ct)
	{
		this.pQuery2ct = pQuery2ct;
	}
	public Double getPQuery2itemCt()
	{
		return this.pQuery2itemCt;
	}
	public void setPQuery2itemCt(Double pQuery2itemCt)
	{
		this.pQuery2itemCt = pQuery2itemCt;
	}
	public Double getPQueryCt()
	{
		return this.pQueryCt;
	}
	public void setPQueryCt(Double pQueryCt)
	{
		this.pQueryCt = pQueryCt;
	}
	public Double getPQueryItemCt()
	{
		return this.pQueryItemCt;
	}
	public void setPQueryItemCt(Double pQueryItemCt)
	{
		this.pQueryItemCt = pQueryItemCt;
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
