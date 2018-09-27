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
 * <p>Title: rule_basic_fea - 规则阶段-基础信息特征 : Value Object</p> 
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
public class RuleBasicFea extends BaseEntity
{
	//****************************************************************************
	//fields
	//****************************************************************************
	@Label("年龄")
	private Integer age = null;
	@Label("贷款金额")
	private Integer amount = null;
	@Label("申请城市")
	private String city = null;
	@Label("家庭住址")
	private String commonAddress = null;
	@Label("公司")
	private String company = null;
	@Label("公司地址")
	private String companyAddress = null;
	@Label("学历 0:小学及其它,1: 小学及其它,2: 初中,3: 高中/职高/技校,4: 大专,5: 本科,6: 硕士,7: 博士及以上")
	private Integer education = null;
	@Label("Default_feature_time_Comment")
	private Date featureTime = null;
	@Label("自增主键")
	private Integer id = null;
	@Label("1未婚2已婚3离异4丧偶")
	private Integer married = null;
	@Label("岗位")
	private String post = null;
	@Label("订单号")
	private Integer serialId = null;
	@Label("性别")
	private String sex = null;
	@Label("紧急联系人1的电话号码")
	private String urgencyMobile1 = null;
	@Label("紧急联系人2的电话号码")
	private String urgencyMobile2 = null;
	@Label("紧急联系人3的电话号码")
	private String urgencyMobile3 = null;
	@Label("用户ID")
	private Integer userId = null;
	@Label("身份证号")
	private String userIdcard = null;
	@Label("手机号")
	private String userMobile = null;
	@Label("工作年限")
	private Integer workYear = null;

	//****************************************************************************
	//accessors
	//****************************************************************************
	public Integer getAge()
	{
		return this.age;
	}
	public void setAge(Integer age)
	{
		this.age = age;
	}
	public Integer getAmount()
	{
		return this.amount;
	}
	public void setAmount(Integer amount)
	{
		this.amount = amount;
	}
	public String getCity()
	{
		return this.city;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	public String getCommonAddress()
	{
		return this.commonAddress;
	}
	public void setCommonAddress(String commonAddress)
	{
		this.commonAddress = commonAddress;
	}
	public String getCompany()
	{
		return this.company;
	}
	public void setCompany(String company)
	{
		this.company = company;
	}
	public String getCompanyAddress()
	{
		return this.companyAddress;
	}
	public void setCompanyAddress(String companyAddress)
	{
		this.companyAddress = companyAddress;
	}
	public Integer getEducation()
	{
		return this.education;
	}
	public void setEducation(Integer education)
	{
		this.education = education;
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
	public Integer getMarried()
	{
		return this.married;
	}
	public void setMarried(Integer married)
	{
		this.married = married;
	}
	public String getPost()
	{
		return this.post;
	}
	public void setPost(String post)
	{
		this.post = post;
	}
	public Integer getSerialId()
	{
		return this.serialId;
	}
	public void setSerialId(Integer serialId)
	{
		this.serialId = serialId;
	}
	public String getSex()
	{
		return this.sex;
	}
	public void setSex(String sex)
	{
		this.sex = sex;
	}
	public String getUrgencyMobile1()
	{
		return this.urgencyMobile1;
	}
	public void setUrgencyMobile1(String urgencyMobile1)
	{
		this.urgencyMobile1 = urgencyMobile1;
	}
	public String getUrgencyMobile2()
	{
		return this.urgencyMobile2;
	}
	public void setUrgencyMobile2(String urgencyMobile2)
	{
		this.urgencyMobile2 = urgencyMobile2;
	}
	public String getUrgencyMobile3()
	{
		return this.urgencyMobile3;
	}
	public void setUrgencyMobile3(String urgencyMobile3)
	{
		this.urgencyMobile3 = urgencyMobile3;
	}
	public Integer getUserId()
	{
		return this.userId;
	}
	public void setUserId(Integer userId)
	{
		this.userId = userId;
	}
	public String getUserIdcard()
	{
		return this.userIdcard;
	}
	public void setUserIdcard(String userIdcard)
	{
		this.userIdcard = userIdcard;
	}
	public String getUserMobile()
	{
		return this.userMobile;
	}
	public void setUserMobile(String userMobile)
	{
		this.userMobile = userMobile;
	}
	public Integer getWorkYear()
	{
		return this.workYear;
	}
	public void setWorkYear(Integer workYear)
	{
		this.workYear = workYear;
	}
	
}
