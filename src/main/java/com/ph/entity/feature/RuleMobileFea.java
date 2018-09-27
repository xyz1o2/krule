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
 * <p>Title: rule_mobile_fea - 规则阶段pdl_mobile特征 : Value Object</p> 
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
public class RuleMobileFea extends BaseEntity
{
	//****************************************************************************
	//fields
	//****************************************************************************
	@Label("日均主叫时长")
	private Double aviDayContacts = null;
	@Label("最大套餐金额")
	private Double billMax = null;
	@Label("本地通话时长占比")
	private Double callRatlinLocal = null;
	@Label("被叫联系人个数占比")
	private Double calledRate = null;
	@Label("晚间18-23被叫时长比")
	private Double calledRateInNight = null;
	@Label("上午9-13被叫次数比")
	private Double calledrateInMorning = null;
	@Label("下午13-18主叫时长比")
	private Double callrateInAfternoon = null;
	@Label("Default_callrate_in_day_Comment")
	private Double callrateInDay = null;
	@Label("最长通话城市top1")
	private String cityTop1 = null;
	@Label("最长通话城市top2")
	private String cityTop2 = null;
	@Label("最长通话城市top3")
	private String cityTop3 = null;
	@Label("近150天通话天数")
	private Integer d150CallCountday = null;
	@Label("近150天夜间24-6主叫次数")
	private Integer d150CallInnightCount = null;
	@Label("近6个月累计上网流量 单位M")
	private Double d180SumSubflow = null;
	@Label("近30天日均主叫时长")
	private Double d30AviDayContacts = null;
	@Label("近30天短信发送次数比")
	private Double d30RateofCountsend = null;
	@Label("7天内通话次数")
	private Integer d7CallCt = null;
	@Label("7天内通话号码未在通讯录中个数所占比例")
	private Double d7CallNotInBookRet = null;
	@Label("7天内被动联系人个数")
	private Integer d7PassiveCallNumbers = null;
	@Label("7天内主动联系座机固话个数")
	private Integer d7TeleVolunCallNumbers = null;
	@Label("7天内主动联系人个数")
	private Integer d7VolunCallNumbers = null;
	@Label("近90天内平均主叫时长占比")
	private Double d90AvgCallrate = null;
	@Label("近90天主被叫联系人比")
	private Double d90RateofDialingCalled = null;
	@Label("通话天数")
	private Integer dayCallCountday = null;
	@Label("Default_feature_time_Comment")
	private Date featureTime = null;
	@Label("自增主键")
	private Integer id = null;
	@Label("最近3月总通话手机号数量")
	private Integer last3monthTotalCallMobiles = null;
	@Label("最近3月总通话时长，单位分")
	private Double last3monthTotalCallTime = null;
	@Label("最近3月总通话次数")
	private Integer last3monthTotalCallTimes = null;
	@Label("紧急联系人1近三月通话次数")
	private Integer last3monthUrgencyMobile1CallTimes = null;
	@Label("紧急联系人2近三月通话次数")
	private Integer last3monthUrgencyMobile2CallTimes = null;
	@Label("紧急联系人3近三月通话次数")
	private Integer last3monthUrgencyMobile3CallTimes = null;
	@Label("紧急联系人近三月通话次数占比")
	private Double last3monthUrgencyMobileCallRate = null;
	@Label("最近半年月均话费")
	private Double last6monthAverageFee = null;
	@Label("30天内通话次数")
	private Integer m1CallCt = null;
	@Label("30天内夜间通话次数")
	private Integer m1CallDawnTimes = null;
	@Label("30天内通话号码未在通讯录中个数所占比例")
	private Double m1CallNotInBookRet = null;
	@Label("30天内被动联系人个数")
	private Integer m1PassiveCallNumbers = null;
	@Label("30天内主动联系座机固话个数")
	private Integer m1TeleVolunCallNumbers = null;
	@Label("30天内主动联系人个数")
	private Integer m1VolunCallNumbers = null;
	@Label("90天内通话次数")
	private Integer m3CallCt = null;
	@Label("90天内通话号码未在通讯录中个数所占比例")
	private Double m3CallNotInBookRet = null;
	@Label("90天内主动联系座机固话个数")
	private Integer m3TeleVolunCallNumbers = null;
	@Label("90天内主动联系人个数")
	private Integer m3VolunCallNumbers = null;
	@Label("近5个月套餐金额占比")
	private Double m5CallbillSumContacts = null;
	@Label("手机号码归属地")
	private String mobileCity = null;
	@Label("抓取身份证号码")
	private String mobileIdcard = null;
	@Label("是否实名：0-否，1-是")
	private Integer mobileIdentification = null;
	@Label("抓取姓名")
	private String mobileName = null;
	@Label("手机在网时长，自然月数")
	private Integer netAge = null;
	@Label("手机在网状态 0未知1正常2停机3单向停机4预销户5销户6过户7改号8此号码不存在9挂失/冻结")
	private Integer phonestatus = null;
	@Label("订单号")
	private Integer serialId = null;
	@Label("累计夜晚主叫时长比")
	private Double sumNightcountCall = null;
	@Label("用户ID")
	private Integer userId = null;

	//****************************************************************************
	//accessors
	//****************************************************************************
	public Double getAviDayContacts()
	{
		return this.aviDayContacts;
	}
	public void setAviDayContacts(Double aviDayContacts)
	{
		this.aviDayContacts = aviDayContacts;
	}
	public Double getBillMax()
	{
		return this.billMax;
	}
	public void setBillMax(Double billMax)
	{
		this.billMax = billMax;
	}
	public Double getCallRatlinLocal()
	{
		return this.callRatlinLocal;
	}
	public void setCallRatlinLocal(Double callRatlinLocal)
	{
		this.callRatlinLocal = callRatlinLocal;
	}
	public Double getCalledRate()
	{
		return this.calledRate;
	}
	public void setCalledRate(Double calledRate)
	{
		this.calledRate = calledRate;
	}
	public Double getCalledRateInNight()
	{
		return this.calledRateInNight;
	}
	public void setCalledRateInNight(Double calledRateInNight)
	{
		this.calledRateInNight = calledRateInNight;
	}
	public Double getCalledrateInMorning()
	{
		return this.calledrateInMorning;
	}
	public void setCalledrateInMorning(Double calledrateInMorning)
	{
		this.calledrateInMorning = calledrateInMorning;
	}
	public Double getCallrateInAfternoon()
	{
		return this.callrateInAfternoon;
	}
	public void setCallrateInAfternoon(Double callrateInAfternoon)
	{
		this.callrateInAfternoon = callrateInAfternoon;
	}
	public Double getCallrateInDay()
	{
		return this.callrateInDay;
	}
	public void setCallrateInDay(Double callrateInDay)
	{
		this.callrateInDay = callrateInDay;
	}
	public String getCityTop1()
	{
		return this.cityTop1;
	}
	public void setCityTop1(String cityTop1)
	{
		this.cityTop1 = cityTop1;
	}
	public String getCityTop2()
	{
		return this.cityTop2;
	}
	public void setCityTop2(String cityTop2)
	{
		this.cityTop2 = cityTop2;
	}
	public String getCityTop3()
	{
		return this.cityTop3;
	}
	public void setCityTop3(String cityTop3)
	{
		this.cityTop3 = cityTop3;
	}
	public Integer getD150CallCountday()
	{
		return this.d150CallCountday;
	}
	public void setD150CallCountday(Integer d150CallCountday)
	{
		this.d150CallCountday = d150CallCountday;
	}
	public Integer getD150CallInnightCount()
	{
		return this.d150CallInnightCount;
	}
	public void setD150CallInnightCount(Integer d150CallInnightCount)
	{
		this.d150CallInnightCount = d150CallInnightCount;
	}
	public Double getD180SumSubflow()
	{
		return this.d180SumSubflow;
	}
	public void setD180SumSubflow(Double d180SumSubflow)
	{
		this.d180SumSubflow = d180SumSubflow;
	}
	public Double getD30AviDayContacts()
	{
		return this.d30AviDayContacts;
	}
	public void setD30AviDayContacts(Double d30AviDayContacts)
	{
		this.d30AviDayContacts = d30AviDayContacts;
	}
	public Double getD30RateofCountsend()
	{
		return this.d30RateofCountsend;
	}
	public void setD30RateofCountsend(Double d30RateofCountsend)
	{
		this.d30RateofCountsend = d30RateofCountsend;
	}
	public Integer getD7CallCt()
	{
		return this.d7CallCt;
	}
	public void setD7CallCt(Integer d7CallCt)
	{
		this.d7CallCt = d7CallCt;
	}
	public Double getD7CallNotInBookRet()
	{
		return this.d7CallNotInBookRet;
	}
	public void setD7CallNotInBookRet(Double d7CallNotInBookRet)
	{
		this.d7CallNotInBookRet = d7CallNotInBookRet;
	}
	public Integer getD7PassiveCallNumbers()
	{
		return this.d7PassiveCallNumbers;
	}
	public void setD7PassiveCallNumbers(Integer d7PassiveCallNumbers)
	{
		this.d7PassiveCallNumbers = d7PassiveCallNumbers;
	}
	public Integer getD7TeleVolunCallNumbers()
	{
		return this.d7TeleVolunCallNumbers;
	}
	public void setD7TeleVolunCallNumbers(Integer d7TeleVolunCallNumbers)
	{
		this.d7TeleVolunCallNumbers = d7TeleVolunCallNumbers;
	}
	public Integer getD7VolunCallNumbers()
	{
		return this.d7VolunCallNumbers;
	}
	public void setD7VolunCallNumbers(Integer d7VolunCallNumbers)
	{
		this.d7VolunCallNumbers = d7VolunCallNumbers;
	}
	public Double getD90AvgCallrate()
	{
		return this.d90AvgCallrate;
	}
	public void setD90AvgCallrate(Double d90AvgCallrate)
	{
		this.d90AvgCallrate = d90AvgCallrate;
	}
	public Double getD90RateofDialingCalled()
	{
		return this.d90RateofDialingCalled;
	}
	public void setD90RateofDialingCalled(Double d90RateofDialingCalled)
	{
		this.d90RateofDialingCalled = d90RateofDialingCalled;
	}
	public Integer getDayCallCountday()
	{
		return this.dayCallCountday;
	}
	public void setDayCallCountday(Integer dayCallCountday)
	{
		this.dayCallCountday = dayCallCountday;
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
	public Integer getLast3monthTotalCallMobiles()
	{
		return this.last3monthTotalCallMobiles;
	}
	public void setLast3monthTotalCallMobiles(Integer last3monthTotalCallMobiles)
	{
		this.last3monthTotalCallMobiles = last3monthTotalCallMobiles;
	}
	public Double getLast3monthTotalCallTime()
	{
		return this.last3monthTotalCallTime;
	}
	public void setLast3monthTotalCallTime(Double last3monthTotalCallTime)
	{
		this.last3monthTotalCallTime = last3monthTotalCallTime;
	}
	public Integer getLast3monthTotalCallTimes()
	{
		return this.last3monthTotalCallTimes;
	}
	public void setLast3monthTotalCallTimes(Integer last3monthTotalCallTimes)
	{
		this.last3monthTotalCallTimes = last3monthTotalCallTimes;
	}
	public Integer getLast3monthUrgencyMobile1CallTimes()
	{
		return this.last3monthUrgencyMobile1CallTimes;
	}
	public void setLast3monthUrgencyMobile1CallTimes(Integer last3monthUrgencyMobile1CallTimes)
	{
		this.last3monthUrgencyMobile1CallTimes = last3monthUrgencyMobile1CallTimes;
	}
	public Integer getLast3monthUrgencyMobile2CallTimes()
	{
		return this.last3monthUrgencyMobile2CallTimes;
	}
	public void setLast3monthUrgencyMobile2CallTimes(Integer last3monthUrgencyMobile2CallTimes)
	{
		this.last3monthUrgencyMobile2CallTimes = last3monthUrgencyMobile2CallTimes;
	}
	public Integer getLast3monthUrgencyMobile3CallTimes()
	{
		return this.last3monthUrgencyMobile3CallTimes;
	}
	public void setLast3monthUrgencyMobile3CallTimes(Integer last3monthUrgencyMobile3CallTimes)
	{
		this.last3monthUrgencyMobile3CallTimes = last3monthUrgencyMobile3CallTimes;
	}
	public Double getLast3monthUrgencyMobileCallRate()
	{
		return this.last3monthUrgencyMobileCallRate;
	}
	public void setLast3monthUrgencyMobileCallRate(Double last3monthUrgencyMobileCallRate)
	{
		this.last3monthUrgencyMobileCallRate = last3monthUrgencyMobileCallRate;
	}
	public Double getLast6monthAverageFee()
	{
		return this.last6monthAverageFee;
	}
	public void setLast6monthAverageFee(Double last6monthAverageFee)
	{
		this.last6monthAverageFee = last6monthAverageFee;
	}
	public Integer getM1CallCt()
	{
		return this.m1CallCt;
	}
	public void setM1CallCt(Integer m1CallCt)
	{
		this.m1CallCt = m1CallCt;
	}
	public Integer getM1CallDawnTimes()
	{
		return this.m1CallDawnTimes;
	}
	public void setM1CallDawnTimes(Integer m1CallDawnTimes)
	{
		this.m1CallDawnTimes = m1CallDawnTimes;
	}
	public Double getM1CallNotInBookRet()
	{
		return this.m1CallNotInBookRet;
	}
	public void setM1CallNotInBookRet(Double m1CallNotInBookRet)
	{
		this.m1CallNotInBookRet = m1CallNotInBookRet;
	}
	public Integer getM1PassiveCallNumbers()
	{
		return this.m1PassiveCallNumbers;
	}
	public void setM1PassiveCallNumbers(Integer m1PassiveCallNumbers)
	{
		this.m1PassiveCallNumbers = m1PassiveCallNumbers;
	}
	public Integer getM1TeleVolunCallNumbers()
	{
		return this.m1TeleVolunCallNumbers;
	}
	public void setM1TeleVolunCallNumbers(Integer m1TeleVolunCallNumbers)
	{
		this.m1TeleVolunCallNumbers = m1TeleVolunCallNumbers;
	}
	public Integer getM1VolunCallNumbers()
	{
		return this.m1VolunCallNumbers;
	}
	public void setM1VolunCallNumbers(Integer m1VolunCallNumbers)
	{
		this.m1VolunCallNumbers = m1VolunCallNumbers;
	}
	public Integer getM3CallCt()
	{
		return this.m3CallCt;
	}
	public void setM3CallCt(Integer m3CallCt)
	{
		this.m3CallCt = m3CallCt;
	}
	public Double getM3CallNotInBookRet()
	{
		return this.m3CallNotInBookRet;
	}
	public void setM3CallNotInBookRet(Double m3CallNotInBookRet)
	{
		this.m3CallNotInBookRet = m3CallNotInBookRet;
	}
	public Integer getM3TeleVolunCallNumbers()
	{
		return this.m3TeleVolunCallNumbers;
	}
	public void setM3TeleVolunCallNumbers(Integer m3TeleVolunCallNumbers)
	{
		this.m3TeleVolunCallNumbers = m3TeleVolunCallNumbers;
	}
	public Integer getM3VolunCallNumbers()
	{
		return this.m3VolunCallNumbers;
	}
	public void setM3VolunCallNumbers(Integer m3VolunCallNumbers)
	{
		this.m3VolunCallNumbers = m3VolunCallNumbers;
	}
	public Double getM5CallbillSumContacts()
	{
		return this.m5CallbillSumContacts;
	}
	public void setM5CallbillSumContacts(Double m5CallbillSumContacts)
	{
		this.m5CallbillSumContacts = m5CallbillSumContacts;
	}
	public String getMobileCity()
	{
		return this.mobileCity;
	}
	public void setMobileCity(String mobileCity)
	{
		this.mobileCity = mobileCity;
	}
	public String getMobileIdcard()
	{
		return this.mobileIdcard;
	}
	public void setMobileIdcard(String mobileIdcard)
	{
		this.mobileIdcard = mobileIdcard;
	}
	public Integer getMobileIdentification()
	{
		return this.mobileIdentification;
	}
	public void setMobileIdentification(Integer mobileIdentification)
	{
		this.mobileIdentification = mobileIdentification;
	}
	public String getMobileName()
	{
		return this.mobileName;
	}
	public void setMobileName(String mobileName)
	{
		this.mobileName = mobileName;
	}
	public Integer getNetAge()
	{
		return this.netAge;
	}
	public void setNetAge(Integer netAge)
	{
		this.netAge = netAge;
	}
	public Integer getPhonestatus()
	{
		return this.phonestatus;
	}
	public void setPhonestatus(Integer phonestatus)
	{
		this.phonestatus = phonestatus;
	}
	public Integer getSerialId()
	{
		return this.serialId;
	}
	public void setSerialId(Integer serialId)
	{
		this.serialId = serialId;
	}
	public Double getSumNightcountCall()
	{
		return this.sumNightcountCall;
	}
	public void setSumNightcountCall(Double sumNightcountCall)
	{
		this.sumNightcountCall = sumNightcountCall;
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
