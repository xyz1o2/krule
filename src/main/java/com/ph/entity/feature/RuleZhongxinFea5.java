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
 * <p>Title: rule_zhongxin_fea5 - 多头借贷数据特征表 : Value Object</p> 
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
public class RuleZhongxinFea5 extends BaseEntity
{
	//****************************************************************************
	//fields
	//****************************************************************************
	@Label("dt_0bct")
	private Double dt0bct = null;
	@Label("dt_0bitem_ct")
	private Double dt0bitemCt = null;
	@Label("一个月内多头借款平台数")
	private Double dt0ct = null;
	@Label("一个月内多头借款金额")
	private Double dt0itemCt = null;
	@Label("dt_1bct")
	private Double dt1bct = null;
	@Label("dt_1bitem_ct")
	private Double dt1bitemCt = null;
	@Label("一个月至三个月内多头借款平台数")
	private Double dt1ct = null;
	@Label("一个月至三个月内多头借款金额")
	private Double dt1itemCt = null;
	@Label("dt_2bct")
	private Double dt2bct = null;
	@Label("dt_2bitem_ct")
	private Double dt2bitemCt = null;
	@Label("三月以上多头借款平台数")
	private Double dt2ct = null;
	@Label("三月以上多头借款金额")
	private Double dt2itemCt = null;
	@Label("总多头借款平台数")
	private Double dtCt = null;
	@Label("总多头借款金额")
	private Double dtItemCt = null;
	@Label("Default_feature_time_Comment")
	private Date featureTime = null;
	@Label("Default_id_Comment")
	private Integer id = null;
	@Label("借款单号")
	private Integer serialId = null;
	@Label("订单类型0:卡代偿 1:财小仙")
	private Short serialType = null;
	@Label("Default_user_id_Comment")
	private Integer userId = null;

	//****************************************************************************
	//accessors
	//****************************************************************************
	public Double getDt0bct()
	{
		return this.dt0bct;
	}
	public void setDt0bct(Double dt0bct)
	{
		this.dt0bct = dt0bct;
	}
	public Double getDt0bitemCt()
	{
		return this.dt0bitemCt;
	}
	public void setDt0bitemCt(Double dt0bitemCt)
	{
		this.dt0bitemCt = dt0bitemCt;
	}
	public Double getDt0ct()
	{
		return this.dt0ct;
	}
	public void setDt0ct(Double dt0ct)
	{
		this.dt0ct = dt0ct;
	}
	public Double getDt0itemCt()
	{
		return this.dt0itemCt;
	}
	public void setDt0itemCt(Double dt0itemCt)
	{
		this.dt0itemCt = dt0itemCt;
	}
	public Double getDt1bct()
	{
		return this.dt1bct;
	}
	public void setDt1bct(Double dt1bct)
	{
		this.dt1bct = dt1bct;
	}
	public Double getDt1bitemCt()
	{
		return this.dt1bitemCt;
	}
	public void setDt1bitemCt(Double dt1bitemCt)
	{
		this.dt1bitemCt = dt1bitemCt;
	}
	public Double getDt1ct()
	{
		return this.dt1ct;
	}
	public void setDt1ct(Double dt1ct)
	{
		this.dt1ct = dt1ct;
	}
	public Double getDt1itemCt()
	{
		return this.dt1itemCt;
	}
	public void setDt1itemCt(Double dt1itemCt)
	{
		this.dt1itemCt = dt1itemCt;
	}
	public Double getDt2bct()
	{
		return this.dt2bct;
	}
	public void setDt2bct(Double dt2bct)
	{
		this.dt2bct = dt2bct;
	}
	public Double getDt2bitemCt()
	{
		return this.dt2bitemCt;
	}
	public void setDt2bitemCt(Double dt2bitemCt)
	{
		this.dt2bitemCt = dt2bitemCt;
	}
	public Double getDt2ct()
	{
		return this.dt2ct;
	}
	public void setDt2ct(Double dt2ct)
	{
		this.dt2ct = dt2ct;
	}
	public Double getDt2itemCt()
	{
		return this.dt2itemCt;
	}
	public void setDt2itemCt(Double dt2itemCt)
	{
		this.dt2itemCt = dt2itemCt;
	}
	public Double getDtCt()
	{
		return this.dtCt;
	}
	public void setDtCt(Double dtCt)
	{
		this.dtCt = dtCt;
	}
	public Double getDtItemCt()
	{
		return this.dtItemCt;
	}
	public void setDtItemCt(Double dtItemCt)
	{
		this.dtItemCt = dtItemCt;
	}
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
