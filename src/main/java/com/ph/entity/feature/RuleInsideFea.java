package com.ph.entity.feature;

import com.bstek.urule.model.Label;
import com.ph.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;


/**
 * 
 * <p>Title: rule_inside_fea - 规则阶段--内部匹配特征 : Value Object</p> 
 * 
 * <p>Copyright: Copyright (c) 2018</p> 
 * 
 * <p>Company: zhenrongbao.com</p>
 * 
 * @author 	wangkai
 * @date 	2018-09-27
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class RuleInsideFea extends BaseEntity
{
	//****************************************************************************
	//fields
	//****************************************************************************
	@Label("单位名称包含非目标客户关键词 是1，否0")
	private Integer companyNameHit = null;
	@Label("任意一个联系人被超过两个其他申贷用户也填写为联系人 是1，否0")
	private Integer contactOver2 = null;
	@Label("用户是否有逾期超过10天的记录 有1，否0")
	private Integer d10Overdue = null;
	@Label("该产品历史还款存在逾期超过15天的记录 是1，否0")
	private Integer d15Overdue = null;
	@Label("近90天申请被拒的次数超过5次 是1，否0")
	private Integer d90RefuseOver5 = null;
	@Label("Default_feature_time_Comment")
	private Date featureTime = null;
	@Label("身份证是否命中内部黑名单 是1 否0")
	private Integer hitBlackIdcard = null;
	@Label("申请人手机号是否命中黑名单 有1，否0")
	private Integer hitBlackMobile = null;
	@Label("历史通话详单被叫联系人手机号去重后触碰黑名单个数")
	private Integer hitContactMobile = null;
	@Label("历史通话详单被叫联系人手机号去重后触碰黑名单个数")
	private Integer hitInMobile = null;
	@Label("历史通话详单主叫联系人手机号去重后触碰黑名单个数")
	private Integer hitOutMobile = null;
	@Label("自增主键")
	private Integer id = null;
	@Label("身份证号码在本平台内注册账号数")
	private Integer idcardRegisterCt = null;
	@Label("有联系人在本平台还款不良 是1，否0")
	private Integer overdueContact = null;
	@Label("订单号")
	private Integer serialId = null;
	@Label("用户是否在催收建议拒绝名单 是1，否0")
	private Integer suggestRefuse = null;
	@Label("用户ID")
	private Integer userId = null;

	//****************************************************************************
	//accessors
	//****************************************************************************
	public Integer getCompanyNameHit()
	{
		return this.companyNameHit;
	}
	public void setCompanyNameHit(Integer companyNameHit)
	{
		this.companyNameHit = companyNameHit;
	}
	public Integer getContactOver2()
	{
		return this.contactOver2;
	}
	public void setContactOver2(Integer contactOver2)
	{
		this.contactOver2 = contactOver2;
	}
	public Integer getD10Overdue()
	{
		return this.d10Overdue;
	}
	public void setD10Overdue(Integer d10Overdue)
	{
		this.d10Overdue = d10Overdue;
	}
	public Integer getD15Overdue()
	{
		return this.d15Overdue;
	}
	public void setD15Overdue(Integer d15Overdue)
	{
		this.d15Overdue = d15Overdue;
	}
	public Integer getD90RefuseOver5()
	{
		return this.d90RefuseOver5;
	}
	public void setD90RefuseOver5(Integer d90RefuseOver5)
	{
		this.d90RefuseOver5 = d90RefuseOver5;
	}
	public Date getFeatureTime()
	{
		return this.featureTime;
	}
	public void setFeatureTime(Date featureTime)
	{
		this.featureTime = featureTime;
	}
	public Integer getHitBlackIdcard()
	{
		return this.hitBlackIdcard;
	}
	public void setHitBlackIdcard(Integer hitBlackIdcard)
	{
		this.hitBlackIdcard = hitBlackIdcard;
	}
	public Integer getHitBlackMobile()
	{
		return this.hitBlackMobile;
	}
	public void setHitBlackMobile(Integer hitBlackMobile)
	{
		this.hitBlackMobile = hitBlackMobile;
	}
	public Integer getHitContactMobile()
	{
		return this.hitContactMobile;
	}
	public void setHitContactMobile(Integer hitContactMobile)
	{
		this.hitContactMobile = hitContactMobile;
	}
	public Integer getHitInMobile()
	{
		return this.hitInMobile;
	}
	public void setHitInMobile(Integer hitInMobile)
	{
		this.hitInMobile = hitInMobile;
	}
	public Integer getHitOutMobile()
	{
		return this.hitOutMobile;
	}
	public void setHitOutMobile(Integer hitOutMobile)
	{
		this.hitOutMobile = hitOutMobile;
	}
	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public Integer getIdcardRegisterCt()
	{
		return this.idcardRegisterCt;
	}
	public void setIdcardRegisterCt(Integer idcardRegisterCt)
	{
		this.idcardRegisterCt = idcardRegisterCt;
	}
	public Integer getOverdueContact()
	{
		return this.overdueContact;
	}
	public void setOverdueContact(Integer overdueContact)
	{
		this.overdueContact = overdueContact;
	}
	public Integer getSerialId()
	{
		return this.serialId;
	}
	public void setSerialId(Integer serialId)
	{
		this.serialId = serialId;
	}
	public Integer getSuggestRefuse()
	{
		return this.suggestRefuse;
	}
	public void setSuggestRefuse(Integer suggestRefuse)
	{
		this.suggestRefuse = suggestRefuse;
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
