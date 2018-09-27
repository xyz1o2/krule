package com.ph.entity.feature;

import com.bstek.urule.model.Label;
import com.ph.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;


/**
 * 
 * <p>Title: rule_tongdun_fea - rule-同盾特征 : Value Object</p> 
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
public class RuleTongdunFea extends BaseEntity
{
	//****************************************************************************
	//fields
	//****************************************************************************
	@Label("1个月内申请人在小额贷款公司申请数")
	private Integer d30XiaoeDk = null;
	@Label("7天内申请人在小额贷款公司申请数")
	private Integer d7XiaoeDk = null;
	@Label("3个月内申请人在小额贷款公司申请数")
	private Integer d90XiaoeDk = null;
	@Label("Default_feature_time_Comment")
	private Date featureTime = null;
	@Label("自增主键")
	private Integer id = null;
	@Label("订单号")
	private Integer serialId = null;
	@Label("同盾1个月在N个平台借款")
	private Integer tongdun1mMultiLoan = null;
	@Label("同盾3个月在N个平台借款")
	private Integer tongdun3mMultiLoan = null;
	@Label("同盾6个月在N个平台借款")
	private Integer tongdun6mMultiLoan = null;
	@Label("同盾7天在N个平台借款")
	private Integer tongdun7dMultiLoan = null;
	@Label("7天内多头详情(互联网金融，消费平台，小额，p2p)")
	private Integer tongdunDetial30d = null;
	@Label("7天内多头详情(互联网金融，消费平台，小额，p2p)")
	private Integer tongdunDetial7d = null;
	@Label("同盾欺诈分")
	private Double tongdunScore = null;
	@Label("用户ID")
	private Integer userId = null;
	@Label("7天内申请人 财产保险")
	private Integer d7CaichanBx = null;
	@Label("7天内申请人 信用卡中心")
	private Integer d7XinykaZx = null;

	//****************************************************************************
	//accessors
	//****************************************************************************
	public Integer getD30XiaoeDk()
	{
		return this.d30XiaoeDk;
	}
	public void setD30XiaoeDk(Integer d30XiaoeDk)
	{
		this.d30XiaoeDk = d30XiaoeDk;
	}
	public Integer getD7XiaoeDk()
	{
		return this.d7XiaoeDk;
	}
	public void setD7XiaoeDk(Integer d7XiaoeDk)
	{
		this.d7XiaoeDk = d7XiaoeDk;
	}
	public Integer getD90XiaoeDk()
	{
		return this.d90XiaoeDk;
	}
	public void setD90XiaoeDk(Integer d90XiaoeDk)
	{
		this.d90XiaoeDk = d90XiaoeDk;
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
	public Integer getTongdun1mMultiLoan()
	{
		return this.tongdun1mMultiLoan;
	}
	public void setTongdun1mMultiLoan(Integer tongdun1mMultiLoan)
	{
		this.tongdun1mMultiLoan = tongdun1mMultiLoan;
	}
	public Integer getTongdun3mMultiLoan()
	{
		return this.tongdun3mMultiLoan;
	}
	public void setTongdun3mMultiLoan(Integer tongdun3mMultiLoan)
	{
		this.tongdun3mMultiLoan = tongdun3mMultiLoan;
	}
	public Integer getTongdun6mMultiLoan()
	{
		return this.tongdun6mMultiLoan;
	}
	public void setTongdun6mMultiLoan(Integer tongdun6mMultiLoan)
	{
		this.tongdun6mMultiLoan = tongdun6mMultiLoan;
	}
	public Integer getTongdun7dMultiLoan()
	{
		return this.tongdun7dMultiLoan;
	}
	public void setTongdun7dMultiLoan(Integer tongdun7dMultiLoan)
	{
		this.tongdun7dMultiLoan = tongdun7dMultiLoan;
	}
	public Integer getTongdunDetial30d()
	{
		return this.tongdunDetial30d;
	}
	public void setTongdunDetial30d(Integer tongdunDetial30d)
	{
		this.tongdunDetial30d = tongdunDetial30d;
	}
	public Integer getTongdunDetial7d()
	{
		return this.tongdunDetial7d;
	}
	public void setTongdunDetial7d(Integer tongdunDetial7d)
	{
		this.tongdunDetial7d = tongdunDetial7d;
	}
	public Double getTongdunScore()
	{
		return this.tongdunScore;
	}
	public void setTongdunScore(Double tongdunScore)
	{
		this.tongdunScore = tongdunScore;
	}
	public Integer getUserId()
	{
		return this.userId;
	}
	public void setUserId(Integer userId)
	{
		this.userId = userId;
	}

	public Integer getD7CaichanBx() {
		return d7CaichanBx;
	}

	public void setD7CaichanBx(Integer d7CaichanBx) {
		this.d7CaichanBx = d7CaichanBx;
	}

	public Integer getD7XinykaZx() {
		return d7XinykaZx;
	}

	public void setD7XinykaZx(Integer d7XinykaZx) {
		this.d7XinykaZx = d7XinykaZx;
	}
}
