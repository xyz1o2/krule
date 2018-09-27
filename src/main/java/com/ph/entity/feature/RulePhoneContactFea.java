package com.ph.entity.feature;

import com.bstek.urule.model.Label;
import com.ph.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;


/**
 * 
 * <p>Title: rule_phone_contact_fea - 规则-短信特征 : Value Object</p> 
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
public class RulePhoneContactFea extends BaseEntity
{
	//****************************************************************************
	//fields
	//****************************************************************************
	@Label("联系人个数")
	private Integer concateNum = null;
	@Label("Default_feature_time_Comment")
	private Date featureTime = null;
	@Label("自增主键")
	private Integer id = null;
	@Label("连号个数")
	private Integer lianhao = null;
	@Label("占比")
	private Double lianhaoRet = null;
	@Label("name备注含有黑名单cnt")
	private Integer nameBlacklistCnt = null;
	@Label("name为数值的个数")
	private Integer nameCnt = null;
	@Label("占比")
	private Double nameCntRet = null;
	@Label("name备注含有信用卡cnt")
	private Integer nameCreditCnt = null;
	@Label("name备注含有贷cnt")
	private Integer nameDaiCnt = null;
	@Label("name备注含有担保cnt")
	private Integer nameDanbaoCnt = null;
	@Label("name备注含有黑白户cnt")
	private Integer nameHeibaihuCnt = null;
	@Label("name备注含有黑户cnt")
	private Integer nameHeihuCnt = null;
	@Label("name备注含有利息cnt")
	private Integer nameLixiCnt = null;
	@Label("name备注含有贷款cnt")
	private Integer nameLoanCnt = null;
	@Label("name备注含有套现cnt")
	private Integer nameTaoxianCnt = null;
	@Label("name备注含有洗白cnt")
	private Integer nameXibaiCnt = null;
	@Label("name备注含有逾期cnt")
	private Integer nameYuqiCnt = null;
	@Label("name备注含有债务cnt")
	private Integer nameZhaiwuCnt = null;
	@Label("name备注含有征信cnt")
	private Integer nameZhengxinCnt = null;
	@Label("非手机号和座机")
	private Integer notPhone = null;
	@Label("占比")
	private Double notPhoneRet = null;
	@Label("订单号")
	private Integer serialId = null;
	@Label("为座机cnt")
	private Integer telePhone = null;
	@Label("占比")
	private Double telePhoneRet = null;
	@Label("用户ID")
	private Integer userId = null;

	//****************************************************************************
	//accessors
	//****************************************************************************
	public Integer getConcateNum()
	{
		return this.concateNum;
	}
	public void setConcateNum(Integer concateNum)
	{
		this.concateNum = concateNum;
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
	public Integer getLianhao()
	{
		return this.lianhao;
	}
	public void setLianhao(Integer lianhao)
	{
		this.lianhao = lianhao;
	}
	public Double getLianhaoRet()
	{
		return this.lianhaoRet;
	}
	public void setLianhaoRet(Double lianhaoRet)
	{
		this.lianhaoRet = lianhaoRet;
	}
	public Integer getNameBlacklistCnt()
	{
		return this.nameBlacklistCnt;
	}
	public void setNameBlacklistCnt(Integer nameBlacklistCnt)
	{
		this.nameBlacklistCnt = nameBlacklistCnt;
	}
	public Integer getNameCnt()
	{
		return this.nameCnt;
	}
	public void setNameCnt(Integer nameCnt)
	{
		this.nameCnt = nameCnt;
	}
	public Double getNameCntRet()
	{
		return this.nameCntRet;
	}
	public void setNameCntRet(Double nameCntRet)
	{
		this.nameCntRet = nameCntRet;
	}
	public Integer getNameCreditCnt()
	{
		return this.nameCreditCnt;
	}
	public void setNameCreditCnt(Integer nameCreditCnt)
	{
		this.nameCreditCnt = nameCreditCnt;
	}
	public Integer getNameDaiCnt()
	{
		return this.nameDaiCnt;
	}
	public void setNameDaiCnt(Integer nameDaiCnt)
	{
		this.nameDaiCnt = nameDaiCnt;
	}
	public Integer getNameDanbaoCnt()
	{
		return this.nameDanbaoCnt;
	}
	public void setNameDanbaoCnt(Integer nameDanbaoCnt)
	{
		this.nameDanbaoCnt = nameDanbaoCnt;
	}
	public Integer getNameHeibaihuCnt()
	{
		return this.nameHeibaihuCnt;
	}
	public void setNameHeibaihuCnt(Integer nameHeibaihuCnt)
	{
		this.nameHeibaihuCnt = nameHeibaihuCnt;
	}
	public Integer getNameHeihuCnt()
	{
		return this.nameHeihuCnt;
	}
	public void setNameHeihuCnt(Integer nameHeihuCnt)
	{
		this.nameHeihuCnt = nameHeihuCnt;
	}
	public Integer getNameLixiCnt()
	{
		return this.nameLixiCnt;
	}
	public void setNameLixiCnt(Integer nameLixiCnt)
	{
		this.nameLixiCnt = nameLixiCnt;
	}
	public Integer getNameLoanCnt()
	{
		return this.nameLoanCnt;
	}
	public void setNameLoanCnt(Integer nameLoanCnt)
	{
		this.nameLoanCnt = nameLoanCnt;
	}
	public Integer getNameTaoxianCnt()
	{
		return this.nameTaoxianCnt;
	}
	public void setNameTaoxianCnt(Integer nameTaoxianCnt)
	{
		this.nameTaoxianCnt = nameTaoxianCnt;
	}
	public Integer getNameXibaiCnt()
	{
		return this.nameXibaiCnt;
	}
	public void setNameXibaiCnt(Integer nameXibaiCnt)
	{
		this.nameXibaiCnt = nameXibaiCnt;
	}
	public Integer getNameYuqiCnt()
	{
		return this.nameYuqiCnt;
	}
	public void setNameYuqiCnt(Integer nameYuqiCnt)
	{
		this.nameYuqiCnt = nameYuqiCnt;
	}
	public Integer getNameZhaiwuCnt()
	{
		return this.nameZhaiwuCnt;
	}
	public void setNameZhaiwuCnt(Integer nameZhaiwuCnt)
	{
		this.nameZhaiwuCnt = nameZhaiwuCnt;
	}
	public Integer getNameZhengxinCnt()
	{
		return this.nameZhengxinCnt;
	}
	public void setNameZhengxinCnt(Integer nameZhengxinCnt)
	{
		this.nameZhengxinCnt = nameZhengxinCnt;
	}
	public Integer getNotPhone()
	{
		return this.notPhone;
	}
	public void setNotPhone(Integer notPhone)
	{
		this.notPhone = notPhone;
	}
	public Double getNotPhoneRet()
	{
		return this.notPhoneRet;
	}
	public void setNotPhoneRet(Double notPhoneRet)
	{
		this.notPhoneRet = notPhoneRet;
	}
	public Integer getSerialId()
	{
		return this.serialId;
	}
	public void setSerialId(Integer serialId)
	{
		this.serialId = serialId;
	}
	public Integer getTelePhone()
	{
		return this.telePhone;
	}
	public void setTelePhone(Integer telePhone)
	{
		this.telePhone = telePhone;
	}
	public Double getTelePhoneRet()
	{
		return this.telePhoneRet;
	}
	public void setTelePhoneRet(Double telePhoneRet)
	{
		this.telePhoneRet = telePhoneRet;
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
