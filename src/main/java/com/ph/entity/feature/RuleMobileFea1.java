package com.ph.entity.feature;

import com.bstek.urule.model.Label;
import com.ph.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;


/**
 * 
 * <p>Title: rule_mobile_fea1 - 规则阶段手机运营商特征1 : Value Object</p> 
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
public class RuleMobileFea1 extends BaseEntity
{
	//****************************************************************************
	//fields
	//****************************************************************************
	@Label("历史通话详单中既有主叫又有被叫的手机号去重后个数")
	private Integer callCalled = null;
	@Label("通许录联系人手机号与历史通话详单主叫联系人手机号交集去重后个数")
	private Integer contactCall = null;
	@Label("通许录联系人手机号与历史通话详单被叫联系人手机号交集去重后个数")
	private Integer contactCalled = null;
	@Label("Default_feature_time_Comment")
	private Date featureTime = null;
	@Label("自增主键")
	private Integer id = null;
	@Label("近30天呼叫在40秒的通话次数")
	private Integer m1Call40lessTimes = null;
	@Label("近30天呼叫在40秒以下的，对所有通话次数占比")
	private Double m1Call40lessTimesRet = null;
	@Label("近30天的主叫通话分钟数")
	private Double m1CallLengths = null;
	@Label("近30天与通信运营商的通话次数")
	private Integer m1CallOperatorTimes = null;
	@Label("近30天的主叫通话次数")
	private Integer m1CallTimes = null;
	@Label("近30天的被叫通话分钟数")
	private Double m1CalledLengths = null;
	@Label("近30天的被叫通话次数")
	private Integer m1CalledTimes = null;
	@Label("近30天0-6点的主叫通话分钟数")
	private Double m1DawnCallLengths = null;
	@Label("近30天0-6点的主叫通话分钟数占近30天所有主叫通话分钟数的比例")
	private Double m1DawnCallLengthsRet = null;
	@Label("近30天0-6点的主叫通话次数")
	private Integer m1DawnCallTimes = null;
	@Label("近30天0-6点的主叫通话次数占近30天所有主叫通话次数的比例")
	private Double m1DawnCallTimesRet = null;
	@Label("近30天0-6点的被叫通话分钟数")
	private Double m1DawnCalledLengths = null;
	@Label("近30天0-6点的被叫通话分钟数占近30天所有被叫通话分钟数的比例")
	private Double m1DawnCalledLengthsRet = null;
	@Label("近30天0-6点的被叫通话次数")
	private Integer m1DawnCalledTimes = null;
	@Label("近30天0-6点的被叫通话次数占近30天所有被叫通话次数的比例")
	private Double m1DawnCalledTimesRet = null;
	@Label("近60天呼叫在40秒的通话次数")
	private Integer m2Call40lessTimes = null;
	@Label("近60天呼叫在40秒以下的，对所有通话次数占比")
	private Double m2Call40lessTimesRet = null;
	@Label("近60天的主叫通话分钟数")
	private Double m2CallLengths = null;
	@Label("近60天与通信运营商的通话次数")
	private Integer m2CallOperatorTimes = null;
	@Label("近60天的主叫通话次数")
	private Integer m2CallTimes = null;
	@Label("近60天的被叫通话分钟数")
	private Double m2CalledLengths = null;
	@Label("近60天的被叫通话次数")
	private Integer m2CalledTimes = null;
	@Label("近60天0-6点的主叫通话分钟数")
	private Double m2DawnCallLengths = null;
	@Label("近60天0-6点的主叫通话分钟数占近60天所有主叫通话分钟数的比例")
	private Double m2DawnCallLengthsRet = null;
	@Label("近60天0-6点的主叫通话次数")
	private Integer m2DawnCallTimes = null;
	@Label("近60天0-6点的主叫通话次数占近60天所有主叫通话次数的比例")
	private Double m2DawnCallTimesRet = null;
	@Label("近60天0-6点的被叫通话分钟数")
	private Double m2DawnCalledLengths = null;
	@Label("近60天0-6点的被叫通话分钟数占近60天所有被叫通话分钟数的比例")
	private Double m2DawnCalledLengthsRet = null;
	@Label("近60天0-6点的被叫通话次数")
	private Integer m2DawnCalledTimes = null;
	@Label("近60天0-6点的被叫通话次数占近60天所有被叫通话次数的比例")
	private Double m2DawnCalledTimesRet = null;
	@Label("近90天呼叫在40秒的通话次数")
	private Integer m3Call40lessTimes = null;
	@Label("近90天呼叫在40秒以下的，对所有通话次数占比")
	private Double m3Call40lessTimesRet = null;
	@Label("近90天的主叫通话分钟数")
	private Double m3CallLengths = null;
	@Label("近90天与通信运营商的通话次数")
	private Integer m3CallOperatorTimes = null;
	@Label("近90天的主叫通话次数")
	private Integer m3CallTimes = null;
	@Label("近90天的被叫通话分钟数")
	private Double m3CalledLengths = null;
	@Label("近90天的被叫通话次数")
	private Integer m3CalledTimes = null;
	@Label("近90天0-6点的主叫通话分钟数")
	private Double m3DawnCallLengths = null;
	@Label("近90天0-6点的主叫通话分钟数占近90天所有主叫通话分钟数的比例")
	private Double m3DawnCallLengthsRet = null;
	@Label("近90天0-6点的主叫通话次数")
	private Integer m3DawnCallTimes = null;
	@Label("近90天0-6点的主叫通话次数占近90天所有主叫通话次数的比例")
	private Double m3DawnCallTimesRet = null;
	@Label("近90天0-6点的被叫通话分钟数")
	private Double m3DawnCalledLengths = null;
	@Label("近90天0-6点的被叫通话分钟数占近90天所有被叫通话分钟数的比例")
	private Double m3DawnCalledLengthsRet = null;
	@Label("近90天0-6点的被叫通话次数")
	private Integer m3DawnCalledTimes = null;
	@Label("近90天0-6点的被叫通话次数占近90天所有被叫通话次数的比例")
	private Double m3DawnCalledTimesRet = null;
	@Label("在网时长 单位月")
	private Integer netAge = null;
	@Label("订单号")
	private Integer serialId = null;
	@Label("历史通话详单主叫联系人手机号去重后个数")
	private Integer totalCall = null;
	@Label("历史通话详单被叫联系人手机号去重后个数")
	private Integer totalCalled = null;
	@Label("通许录联系人手机号去重后个数")
	private Integer totalContact = null;
	@Label("用户ID")
	private Integer userId = null;

	//****************************************************************************
	//accessors
	//****************************************************************************
	public Integer getCallCalled()
	{
		return this.callCalled;
	}
	public void setCallCalled(Integer callCalled)
	{
		this.callCalled = callCalled;
	}
	public Integer getContactCall()
	{
		return this.contactCall;
	}
	public void setContactCall(Integer contactCall)
	{
		this.contactCall = contactCall;
	}
	public Integer getContactCalled()
	{
		return this.contactCalled;
	}
	public void setContactCalled(Integer contactCalled)
	{
		this.contactCalled = contactCalled;
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
	public Integer getM1Call40lessTimes()
	{
		return this.m1Call40lessTimes;
	}
	public void setM1Call40lessTimes(Integer m1Call40lessTimes)
	{
		this.m1Call40lessTimes = m1Call40lessTimes;
	}
	public Double getM1Call40lessTimesRet()
	{
		return this.m1Call40lessTimesRet;
	}
	public void setM1Call40lessTimesRet(Double m1Call40lessTimesRet)
	{
		this.m1Call40lessTimesRet = m1Call40lessTimesRet;
	}
	public Double getM1CallLengths()
	{
		return this.m1CallLengths;
	}
	public void setM1CallLengths(Double m1CallLengths)
	{
		this.m1CallLengths = m1CallLengths;
	}
	public Integer getM1CallOperatorTimes()
	{
		return this.m1CallOperatorTimes;
	}
	public void setM1CallOperatorTimes(Integer m1CallOperatorTimes)
	{
		this.m1CallOperatorTimes = m1CallOperatorTimes;
	}
	public Integer getM1CallTimes()
	{
		return this.m1CallTimes;
	}
	public void setM1CallTimes(Integer m1CallTimes)
	{
		this.m1CallTimes = m1CallTimes;
	}
	public Double getM1CalledLengths()
	{
		return this.m1CalledLengths;
	}
	public void setM1CalledLengths(Double m1CalledLengths)
	{
		this.m1CalledLengths = m1CalledLengths;
	}
	public Integer getM1CalledTimes()
	{
		return this.m1CalledTimes;
	}
	public void setM1CalledTimes(Integer m1CalledTimes)
	{
		this.m1CalledTimes = m1CalledTimes;
	}
	public Double getM1DawnCallLengths()
	{
		return this.m1DawnCallLengths;
	}
	public void setM1DawnCallLengths(Double m1DawnCallLengths)
	{
		this.m1DawnCallLengths = m1DawnCallLengths;
	}
	public Double getM1DawnCallLengthsRet()
	{
		return this.m1DawnCallLengthsRet;
	}
	public void setM1DawnCallLengthsRet(Double m1DawnCallLengthsRet)
	{
		this.m1DawnCallLengthsRet = m1DawnCallLengthsRet;
	}
	public Integer getM1DawnCallTimes()
	{
		return this.m1DawnCallTimes;
	}
	public void setM1DawnCallTimes(Integer m1DawnCallTimes)
	{
		this.m1DawnCallTimes = m1DawnCallTimes;
	}
	public Double getM1DawnCallTimesRet()
	{
		return this.m1DawnCallTimesRet;
	}
	public void setM1DawnCallTimesRet(Double m1DawnCallTimesRet)
	{
		this.m1DawnCallTimesRet = m1DawnCallTimesRet;
	}
	public Double getM1DawnCalledLengths()
	{
		return this.m1DawnCalledLengths;
	}
	public void setM1DawnCalledLengths(Double m1DawnCalledLengths)
	{
		this.m1DawnCalledLengths = m1DawnCalledLengths;
	}
	public Double getM1DawnCalledLengthsRet()
	{
		return this.m1DawnCalledLengthsRet;
	}
	public void setM1DawnCalledLengthsRet(Double m1DawnCalledLengthsRet)
	{
		this.m1DawnCalledLengthsRet = m1DawnCalledLengthsRet;
	}
	public Integer getM1DawnCalledTimes()
	{
		return this.m1DawnCalledTimes;
	}
	public void setM1DawnCalledTimes(Integer m1DawnCalledTimes)
	{
		this.m1DawnCalledTimes = m1DawnCalledTimes;
	}
	public Double getM1DawnCalledTimesRet()
	{
		return this.m1DawnCalledTimesRet;
	}
	public void setM1DawnCalledTimesRet(Double m1DawnCalledTimesRet)
	{
		this.m1DawnCalledTimesRet = m1DawnCalledTimesRet;
	}
	public Integer getM2Call40lessTimes()
	{
		return this.m2Call40lessTimes;
	}
	public void setM2Call40lessTimes(Integer m2Call40lessTimes)
	{
		this.m2Call40lessTimes = m2Call40lessTimes;
	}
	public Double getM2Call40lessTimesRet()
	{
		return this.m2Call40lessTimesRet;
	}
	public void setM2Call40lessTimesRet(Double m2Call40lessTimesRet)
	{
		this.m2Call40lessTimesRet = m2Call40lessTimesRet;
	}
	public Double getM2CallLengths()
	{
		return this.m2CallLengths;
	}
	public void setM2CallLengths(Double m2CallLengths)
	{
		this.m2CallLengths = m2CallLengths;
	}
	public Integer getM2CallOperatorTimes()
	{
		return this.m2CallOperatorTimes;
	}
	public void setM2CallOperatorTimes(Integer m2CallOperatorTimes)
	{
		this.m2CallOperatorTimes = m2CallOperatorTimes;
	}
	public Integer getM2CallTimes()
	{
		return this.m2CallTimes;
	}
	public void setM2CallTimes(Integer m2CallTimes)
	{
		this.m2CallTimes = m2CallTimes;
	}
	public Double getM2CalledLengths()
	{
		return this.m2CalledLengths;
	}
	public void setM2CalledLengths(Double m2CalledLengths)
	{
		this.m2CalledLengths = m2CalledLengths;
	}
	public Integer getM2CalledTimes()
	{
		return this.m2CalledTimes;
	}
	public void setM2CalledTimes(Integer m2CalledTimes)
	{
		this.m2CalledTimes = m2CalledTimes;
	}
	public Double getM2DawnCallLengths()
	{
		return this.m2DawnCallLengths;
	}
	public void setM2DawnCallLengths(Double m2DawnCallLengths)
	{
		this.m2DawnCallLengths = m2DawnCallLengths;
	}
	public Double getM2DawnCallLengthsRet()
	{
		return this.m2DawnCallLengthsRet;
	}
	public void setM2DawnCallLengthsRet(Double m2DawnCallLengthsRet)
	{
		this.m2DawnCallLengthsRet = m2DawnCallLengthsRet;
	}
	public Integer getM2DawnCallTimes()
	{
		return this.m2DawnCallTimes;
	}
	public void setM2DawnCallTimes(Integer m2DawnCallTimes)
	{
		this.m2DawnCallTimes = m2DawnCallTimes;
	}
	public Double getM2DawnCallTimesRet()
	{
		return this.m2DawnCallTimesRet;
	}
	public void setM2DawnCallTimesRet(Double m2DawnCallTimesRet)
	{
		this.m2DawnCallTimesRet = m2DawnCallTimesRet;
	}
	public Double getM2DawnCalledLengths()
	{
		return this.m2DawnCalledLengths;
	}
	public void setM2DawnCalledLengths(Double m2DawnCalledLengths)
	{
		this.m2DawnCalledLengths = m2DawnCalledLengths;
	}
	public Double getM2DawnCalledLengthsRet()
	{
		return this.m2DawnCalledLengthsRet;
	}
	public void setM2DawnCalledLengthsRet(Double m2DawnCalledLengthsRet)
	{
		this.m2DawnCalledLengthsRet = m2DawnCalledLengthsRet;
	}
	public Integer getM2DawnCalledTimes()
	{
		return this.m2DawnCalledTimes;
	}
	public void setM2DawnCalledTimes(Integer m2DawnCalledTimes)
	{
		this.m2DawnCalledTimes = m2DawnCalledTimes;
	}
	public Double getM2DawnCalledTimesRet()
	{
		return this.m2DawnCalledTimesRet;
	}
	public void setM2DawnCalledTimesRet(Double m2DawnCalledTimesRet)
	{
		this.m2DawnCalledTimesRet = m2DawnCalledTimesRet;
	}
	public Integer getM3Call40lessTimes()
	{
		return this.m3Call40lessTimes;
	}
	public void setM3Call40lessTimes(Integer m3Call40lessTimes)
	{
		this.m3Call40lessTimes = m3Call40lessTimes;
	}
	public Double getM3Call40lessTimesRet()
	{
		return this.m3Call40lessTimesRet;
	}
	public void setM3Call40lessTimesRet(Double m3Call40lessTimesRet)
	{
		this.m3Call40lessTimesRet = m3Call40lessTimesRet;
	}
	public Double getM3CallLengths()
	{
		return this.m3CallLengths;
	}
	public void setM3CallLengths(Double m3CallLengths)
	{
		this.m3CallLengths = m3CallLengths;
	}
	public Integer getM3CallOperatorTimes()
	{
		return this.m3CallOperatorTimes;
	}
	public void setM3CallOperatorTimes(Integer m3CallOperatorTimes)
	{
		this.m3CallOperatorTimes = m3CallOperatorTimes;
	}
	public Integer getM3CallTimes()
	{
		return this.m3CallTimes;
	}
	public void setM3CallTimes(Integer m3CallTimes)
	{
		this.m3CallTimes = m3CallTimes;
	}
	public Double getM3CalledLengths()
	{
		return this.m3CalledLengths;
	}
	public void setM3CalledLengths(Double m3CalledLengths)
	{
		this.m3CalledLengths = m3CalledLengths;
	}
	public Integer getM3CalledTimes()
	{
		return this.m3CalledTimes;
	}
	public void setM3CalledTimes(Integer m3CalledTimes)
	{
		this.m3CalledTimes = m3CalledTimes;
	}
	public Double getM3DawnCallLengths()
	{
		return this.m3DawnCallLengths;
	}
	public void setM3DawnCallLengths(Double m3DawnCallLengths)
	{
		this.m3DawnCallLengths = m3DawnCallLengths;
	}
	public Double getM3DawnCallLengthsRet()
	{
		return this.m3DawnCallLengthsRet;
	}
	public void setM3DawnCallLengthsRet(Double m3DawnCallLengthsRet)
	{
		this.m3DawnCallLengthsRet = m3DawnCallLengthsRet;
	}
	public Integer getM3DawnCallTimes()
	{
		return this.m3DawnCallTimes;
	}
	public void setM3DawnCallTimes(Integer m3DawnCallTimes)
	{
		this.m3DawnCallTimes = m3DawnCallTimes;
	}
	public Double getM3DawnCallTimesRet()
	{
		return this.m3DawnCallTimesRet;
	}
	public void setM3DawnCallTimesRet(Double m3DawnCallTimesRet)
	{
		this.m3DawnCallTimesRet = m3DawnCallTimesRet;
	}
	public Double getM3DawnCalledLengths()
	{
		return this.m3DawnCalledLengths;
	}
	public void setM3DawnCalledLengths(Double m3DawnCalledLengths)
	{
		this.m3DawnCalledLengths = m3DawnCalledLengths;
	}
	public Double getM3DawnCalledLengthsRet()
	{
		return this.m3DawnCalledLengthsRet;
	}
	public void setM3DawnCalledLengthsRet(Double m3DawnCalledLengthsRet)
	{
		this.m3DawnCalledLengthsRet = m3DawnCalledLengthsRet;
	}
	public Integer getM3DawnCalledTimes()
	{
		return this.m3DawnCalledTimes;
	}
	public void setM3DawnCalledTimes(Integer m3DawnCalledTimes)
	{
		this.m3DawnCalledTimes = m3DawnCalledTimes;
	}
	public Double getM3DawnCalledTimesRet()
	{
		return this.m3DawnCalledTimesRet;
	}
	public void setM3DawnCalledTimesRet(Double m3DawnCalledTimesRet)
	{
		this.m3DawnCalledTimesRet = m3DawnCalledTimesRet;
	}
	public Integer getNetAge()
	{
		return this.netAge;
	}
	public void setNetAge(Integer netAge)
	{
		this.netAge = netAge;
	}
	public Integer getSerialId()
	{
		return this.serialId;
	}
	public void setSerialId(Integer serialId)
	{
		this.serialId = serialId;
	}
	public Integer getTotalCall()
	{
		return this.totalCall;
	}
	public void setTotalCall(Integer totalCall)
	{
		this.totalCall = totalCall;
	}
	public Integer getTotalCalled()
	{
		return this.totalCalled;
	}
	public void setTotalCalled(Integer totalCalled)
	{
		this.totalCalled = totalCalled;
	}
	public Integer getTotalContact()
	{
		return this.totalContact;
	}
	public void setTotalContact(Integer totalContact)
	{
		this.totalContact = totalContact;
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
