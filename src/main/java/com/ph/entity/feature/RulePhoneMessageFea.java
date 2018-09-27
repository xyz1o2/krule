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
 * <p>Title: rule_phone_message_fea - 规则-短信特征 : Value Object</p> 
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
public class RulePhoneMessageFea extends BaseEntity
{
	//****************************************************************************
	//fields
	//****************************************************************************
	@Label("Default_feature_time_Comment")
	private Date featureTime = null;
	@Label("自增主键")
	private Integer id = null;
	@Label("最近一条短信距离当前天数")
	private Integer lastMessageDate = null;
	@Label("短信含关键字：冻结的个数")
	private Integer messageDongjieCnt = null;
	@Label("短信含关键字：逾期的个数")
	private Integer messageDueCnt = null;
	@Label("发信人为手机号的条数")
	private Integer messageFromPhone = null;
	@Label("占比")
	private Double messageFromPhoneRet = null;
	@Label("短信含关键字：扣款失败的个数")
	private Integer messageKksbaiCnt = null;
	@Label("短信条数")
	private Integer messageNum = null;
	@Label("短信含关键字：欠款的个数")
	private Integer messageQiankuanCnt = null;
	@Label("短信回复条数")
	private Integer messageRebackCnt = null;
	@Label("最新一次短信回复距离当前天数")
	private Integer messageRebackDay = null;
	@Label("短信含关键字：拖欠的个数")
	private Integer messageTuoqianCnt = null;
	@Label("短信含关键字：未还的个数")
	private Integer messageWeihuanCnt = null;
	@Label("订单号")
	private Integer serialId = null;
	@Label("用户ID")
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
	public Integer getLastMessageDate()
	{
		return this.lastMessageDate;
	}
	public void setLastMessageDate(Integer lastMessageDate)
	{
		this.lastMessageDate = lastMessageDate;
	}
	public Integer getMessageDongjieCnt()
	{
		return this.messageDongjieCnt;
	}
	public void setMessageDongjieCnt(Integer messageDongjieCnt)
	{
		this.messageDongjieCnt = messageDongjieCnt;
	}
	public Integer getMessageDueCnt()
	{
		return this.messageDueCnt;
	}
	public void setMessageDueCnt(Integer messageDueCnt)
	{
		this.messageDueCnt = messageDueCnt;
	}
	public Integer getMessageFromPhone()
	{
		return this.messageFromPhone;
	}
	public void setMessageFromPhone(Integer messageFromPhone)
	{
		this.messageFromPhone = messageFromPhone;
	}
	public Double getMessageFromPhoneRet()
	{
		return this.messageFromPhoneRet;
	}
	public void setMessageFromPhoneRet(Double messageFromPhoneRet)
	{
		this.messageFromPhoneRet = messageFromPhoneRet;
	}
	public Integer getMessageKksbaiCnt()
	{
		return this.messageKksbaiCnt;
	}
	public void setMessageKksbaiCnt(Integer messageKksbaiCnt)
	{
		this.messageKksbaiCnt = messageKksbaiCnt;
	}
	public Integer getMessageNum()
	{
		return this.messageNum;
	}
	public void setMessageNum(Integer messageNum)
	{
		this.messageNum = messageNum;
	}
	public Integer getMessageQiankuanCnt()
	{
		return this.messageQiankuanCnt;
	}
	public void setMessageQiankuanCnt(Integer messageQiankuanCnt)
	{
		this.messageQiankuanCnt = messageQiankuanCnt;
	}
	public Integer getMessageRebackCnt()
	{
		return this.messageRebackCnt;
	}
	public void setMessageRebackCnt(Integer messageRebackCnt)
	{
		this.messageRebackCnt = messageRebackCnt;
	}
	public Integer getMessageRebackDay()
	{
		return this.messageRebackDay;
	}
	public void setMessageRebackDay(Integer messageRebackDay)
	{
		this.messageRebackDay = messageRebackDay;
	}
	public Integer getMessageTuoqianCnt()
	{
		return this.messageTuoqianCnt;
	}
	public void setMessageTuoqianCnt(Integer messageTuoqianCnt)
	{
		this.messageTuoqianCnt = messageTuoqianCnt;
	}
	public Integer getMessageWeihuanCnt()
	{
		return this.messageWeihuanCnt;
	}
	public void setMessageWeihuanCnt(Integer messageWeihuanCnt)
	{
		this.messageWeihuanCnt = messageWeihuanCnt;
	}
	public Integer getSerialId()
	{
		return this.serialId;
	}
	public void setSerialId(Integer serialId)
	{
		this.serialId = serialId;
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
