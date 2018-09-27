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
 * <p>Title: rule_housefund_fea - 公积金特征变量数据 : Value Object</p> 
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
public class RuleHousefundFea extends BaseEntity
{
	//****************************************************************************
	//fields
	//****************************************************************************
	@Label("目前缴费是否连续（目前账户状态）")
	private Integer accStatus = null;
	@Label("账号")
	private String acctNo = null;
	@Label("省市")
	private String area = null;
	@Label("开户至今缴费地区个数")
	private Integer areaCt = null;
	@Label("余额")
	private String bal = null;
	@Label("当前公积金缴纳基数")
	private String baseDeposit = null;
	@Label("所属单位")
	private String corpName = null;
	@Label("Default_feature_time_Comment")
	private Date featureTime = null;
	@Label("过去有无用过公积金贷款")
	private Integer hasLoanRecord = null;
	@Label("过去使用公积金是否有逾期记录")
	private Integer hasOverdueRecord = null;
	@Label("历史缴费是非连续")
	private Integer historyAccStatus = null;
	@Label("Default_id_Comment")
	private Integer id = null;
	@Label("实名信息状态 1 不符合 0 符合")
	private Integer idCardAuth = null;
	@Label("最近一次公积金缴纳日期距离最近一次公积金认证日期间隔")
	private Integer intervalDay = null;
	@Label("末次缴存年月")
	private String lastDepositDate = null;
	@Label("最后一次断缴至今时长")
	private Double lastOffDepositMonths = null;
	@Label("最近一次连缴周期内月缴存款最大值")
	private Double lastOnPeriodMaxAmt = null;
	@Label("最近一次连缴周期内月缴存款均值")
	private Double lastOnPeriodMeanAmt = null;
	@Label("最近一次连缴周期内账户存款余额均值")
	private Double lastOnPeriodMeanBal = null;
	@Label("最近一次连缴周期内月缴存款最小值")
	private Double lastOnPeriodMinAmt = null;
	@Label("过去12个月内缴纳补充公积金的月数")
	private Integer m12AddDepositMonths = null;
	@Label("过去12个月缴费地区数")
	private Integer m12AreaCt = null;
	@Label("过去12个月公积金缴费所属单位个数")
	private Integer m12CorpCt = null;
	@Label("目前月缴存基数较12个缴费月之前的数值关系")
	private Double m12DiffAmt = null;
	@Label("目前月缴存基数较12个缴费月之前的数值关系")
	private Double m12DiffBaseDeposit = null;
	@Label("过去12个月月缴存款最大值")
	private Double m12MaxAmt = null;
	@Label("过去12个月月缴存款基数最大值")
	private Double m12MaxBaseDeposit = null;
	@Label("过去12个月最长断缴周期")
	private Integer m12MaxOffDepositMonths = null;
	@Label("过去12个月最长连缴周期")
	private Integer m12MaxOnDepositMonths = null;
	@Label("过去12个月月缴存款均值")
	private Double m12MeanAmt = null;
	@Label("过去12个月月缴存款基数均值")
	private Double m12MeanBaseDeposit = null;
	@Label("过去12个月月缴存款最小值")
	private Double m12MinAmt = null;
	@Label("过去12个月月缴存款基数最小值")
	private Double m12MinBaseDeposit = null;
	@Label("过去12个月断缴次数")
	private Integer m12OffDepositCt = null;
	@Label("过去12个月缴费是否在同一个地区")
	private Integer m12SameArea = null;
	@Label("过去12个月内补缴月数")
	private Integer m12SupplyMonths = null;
	@Label("过去18个月内缴纳补充公积金的月数")
	private Integer m18AddDepositMonths = null;
	@Label("过去18个月缴费地区数")
	private Integer m18AreaCt = null;
	@Label("过去18个月公积金缴费所属单位个数")
	private Integer m18CorpCt = null;
	@Label("目前月缴存基数较18个缴费月之前的数值关系")
	private Double m18DiffAmt = null;
	@Label("目前月缴存基数较18个缴费月之前的数值关系")
	private Double m18DiffBaseDeposit = null;
	@Label("过去18个月月缴存款最大值")
	private Double m18MaxAmt = null;
	@Label("过去18个月月缴存款基数最大值")
	private Double m18MaxBaseDeposit = null;
	@Label("过去18个月最长断缴周期")
	private Integer m18MaxOffDepositMonths = null;
	@Label("过去18个月最长连缴周期")
	private Integer m18MaxOnDepositMonths = null;
	@Label("过去18个月月缴存款均值")
	private Double m18MeanAmt = null;
	@Label("过去18个月月缴存款基数均值")
	private Double m18MeanBaseDeposit = null;
	@Label("过去18个月月缴存款最小值")
	private Double m18MinAmt = null;
	@Label("过去18个月月缴存款基数最小值")
	private Double m18MinBaseDeposit = null;
	@Label("过去18个月断缴次数")
	private Integer m18OffDepositCt = null;
	@Label("过去18个月缴费是否在同一个地区")
	private Integer m18SameArea = null;
	@Label("过去18个月内补缴月数")
	private Integer m18SupplyMonths = null;
	@Label("过去24个月内缴纳补充公积金的月数")
	private Integer m24AddDepositMonths = null;
	@Label("过去24个月缴费地区数")
	private Integer m24AreaCt = null;
	@Label("过去24个月公积金缴费所属单位个数")
	private Integer m24CorpCt = null;
	@Label("目前月缴存基数较24个缴费月之前的数值关系")
	private Double m24DiffAmt = null;
	@Label("目前月缴存基数较24个缴费月之前的数值关系")
	private Double m24DiffBaseDeposit = null;
	@Label("过去24个月月缴存款最大值")
	private Double m24MaxAmt = null;
	@Label("过去24个月月缴存款基数最大值")
	private Double m24MaxBaseDeposit = null;
	@Label("过去24个月最长断缴周期")
	private Integer m24MaxOffDepositMonths = null;
	@Label("过去24个月最长连缴周期")
	private Integer m24MaxOnDepositMonths = null;
	@Label("过去24个月月缴存款均值")
	private Double m24MeanAmt = null;
	@Label("过去24个月月缴存款基数均值")
	private Double m24MeanBaseDeposit = null;
	@Label("过去24个月月缴存款最小值")
	private Double m24MinAmt = null;
	@Label("过去24个月月缴存款基数最小值")
	private Double m24MinBaseDeposit = null;
	@Label("过去24个月断缴次数")
	private Integer m24OffDepositCt = null;
	@Label("过去24个月缴费是否在同一个地区")
	private Integer m24SameArea = null;
	@Label("过去24个月内补缴月数")
	private Integer m24SupplyMonths = null;
	@Label("过去30个月内缴纳补充公积金的月数")
	private Integer m30AddDepositMonths = null;
	@Label("过去30个月缴费地区数")
	private Integer m30AreaCt = null;
	@Label("过去30个月公积金缴费所属单位个数")
	private Integer m30CorpCt = null;
	@Label("目前月缴存基数较30个缴费月之前的数值关系")
	private Double m30DiffAmt = null;
	@Label("目前月缴存基数较30个缴费月之前的数值关系")
	private Double m30DiffBaseDeposit = null;
	@Label("过去30个月月缴存款最大值")
	private Double m30MaxAmt = null;
	@Label("过去30个月月缴存款基数最大值")
	private Double m30MaxBaseDeposit = null;
	@Label("过去30个月最长断缴周期")
	private Integer m30MaxOffDepositMonths = null;
	@Label("过去30个月最长连缴周期")
	private Integer m30MaxOnDepositMonths = null;
	@Label("过去30个月月缴存款均值")
	private Double m30MeanAmt = null;
	@Label("过去30个月月缴存款基数均值")
	private Double m30MeanBaseDeposit = null;
	@Label("过去30个月月缴存款最小值")
	private Double m30MinAmt = null;
	@Label("过去30个月月缴存款基数最小值")
	private Double m30MinBaseDeposit = null;
	@Label("过去30个月断缴次数")
	private Integer m30OffDepositCt = null;
	@Label("过去30个月缴费是否在同一个地区")
	private Integer m30SameArea = null;
	@Label("过去30个月内补缴月数")
	private Integer m30SupplyMonths = null;
	@Label("过去36个月内缴纳补充公积金的月数")
	private Integer m36AddDepositMonths = null;
	@Label("过去36个月缴费地区数")
	private Integer m36AreaCt = null;
	@Label("过去36个月公积金缴费所属单位个数")
	private Integer m36CorpCt = null;
	@Label("目前月缴存基数较36个缴费月之前的数值关系")
	private Double m36DiffAmt = null;
	@Label("目前月缴存基数较36个缴费月之前的数值关系")
	private Double m36DiffBaseDeposit = null;
	@Label("过去36个月月缴存款最大值")
	private Double m36MaxAmt = null;
	@Label("过去36个月月缴存款基数最大值")
	private Double m36MaxBaseDeposit = null;
	@Label("过去36个月最长断缴周期")
	private Integer m36MaxOffDepositMonths = null;
	@Label("过去36个月最长连缴周期")
	private Integer m36MaxOnDepositMonths = null;
	@Label("过去36个月月缴存款均值")
	private Double m36MeanAmt = null;
	@Label("过去36个月月缴存款基数均值")
	private Double m36MeanBaseDeposit = null;
	@Label("过去36个月月缴存款最小值")
	private Double m36MinAmt = null;
	@Label("过去36个月月缴存款基数最小值")
	private Double m36MinBaseDeposit = null;
	@Label("过去36个月断缴次数")
	private Integer m36OffDepositCt = null;
	@Label("过去36个月缴费是否在同一个地区")
	private Integer m36SameArea = null;
	@Label("过去36个月内补缴月数")
	private Integer m36SupplyMonths = null;
	@Label("过去3个月内缴纳补充公积金的月数")
	private Integer m3AddDepositMonths = null;
	@Label("过去3个月缴费地区数")
	private Integer m3AreaCt = null;
	@Label("过去3个月公积金缴费所属单位个数")
	private Integer m3CorpCt = null;
	@Label("目前月缴存基数较3个缴费月之前的数值关系")
	private Double m3DiffAmt = null;
	@Label("目前月缴存基数较3个缴费月之前的数值关系")
	private Double m3DiffBaseDeposit = null;
	@Label("过去3个月月缴存款最大值")
	private Double m3MaxAmt = null;
	@Label("过去3个月月缴存款基数最大值")
	private Double m3MaxBaseDeposit = null;
	@Label("过去3个月最长断缴周期")
	private Integer m3MaxOffDepositMonths = null;
	@Label("过去3个月最长连缴周期")
	private Integer m3MaxOnDepositMonths = null;
	@Label("过去3个月月缴存款均值")
	private Double m3MeanAmt = null;
	@Label("过去3个月月缴存款基数均值")
	private Double m3MeanBaseDeposit = null;
	@Label("过去3个月月缴存款最小值")
	private Double m3MinAmt = null;
	@Label("过去3个月月缴存款基数最小值")
	private Double m3MinBaseDeposit = null;
	@Label("过去3个月断缴次数")
	private Integer m3OffDepositCt = null;
	@Label("过去3个月缴费是否在同一个地区")
	private Integer m3SameArea = null;
	@Label("过去3个月内补缴月数")
	private Integer m3SupplyMonths = null;
	@Label("过去6个月内缴纳补充公积金的月数")
	private Integer m6AddDepositMonths = null;
	@Label("过去6个月缴费地区数")
	private Integer m6AreaCt = null;
	@Label("过去6个月公积金缴费所属单位个数")
	private Integer m6CorpCt = null;
	@Label("目前月缴存基数较6个缴费月之前的数值关系")
	private Double m6DiffAmt = null;
	@Label("目前月缴存基数较6个缴费月之前的数值关系")
	private Double m6DiffBaseDeposit = null;
	@Label("过去6个月月缴存款最大值")
	private Double m6MaxAmt = null;
	@Label("过去6个月月缴存款基数最大值")
	private Double m6MaxBaseDeposit = null;
	@Label("过去6个月最长断缴周期")
	private Integer m6MaxOffDepositMonths = null;
	@Label("过去6个月最长连缴周期")
	private Integer m6MaxOnDepositMonths = null;
	@Label("过去6个月月缴存款均值")
	private Double m6MeanAmt = null;
	@Label("过去6个月月缴存款基数均值")
	private Double m6MeanBaseDeposit = null;
	@Label("过去6个月月缴存款最小值")
	private Double m6MinAmt = null;
	@Label("过去6个月月缴存款基数最小值")
	private Double m6MinBaseDeposit = null;
	@Label("过去6个月断缴次数")
	private Integer m6OffDepositCt = null;
	@Label("过去6个月缴费是否在同一个地区")
	private Integer m6SameArea = null;
	@Label("过去6个月内补缴月数")
	private Integer m6SupplyMonths = null;
	@Label("开户至今账户余额最大值")
	private Double maxBal = null;
	@Label("开户至今账户余额均值")
	private Double meanBal = null;
	@Label("开户至今账户余额最小值")
	private Double minBal = null;
	@Label("当前月缴存款")
	private String monthlyDeposit = null;
	@Label("开户至今月缴存款存款最大值")
	private Double monthlyMaxAmt = null;
	@Label("开户至今月缴存款均值")
	private Double monthlyMeanAmt = null;
	@Label("开户至今月缴存款最小值")
	private Double monthlyMinAmt = null;
	@Label("公积金在当前单位缴纳的时长")
	private Integer nowCorpDepositDay = null;
	@Label("开户至今总共断缴次数")
	private Double offDepositCt = null;
	@Label("开户日期")
	private String openDate = null;
	@Label("开户时长")
	private Integer openLenMonths = null;
	@Label("订单id")
	private Integer serialId = null;
	@Label("用户id")
	private Integer userId = null;

	//****************************************************************************
	//accessors
	//****************************************************************************
	public Integer getAccStatus()
	{
		return this.accStatus;
	}
	public void setAccStatus(Integer accStatus)
	{
		this.accStatus = accStatus;
	}
	public String getAcctNo()
	{
		return this.acctNo;
	}
	public void setAcctNo(String acctNo)
	{
		this.acctNo = acctNo;
	}
	public String getArea()
	{
		return this.area;
	}
	public void setArea(String area)
	{
		this.area = area;
	}
	public Integer getAreaCt()
	{
		return this.areaCt;
	}
	public void setAreaCt(Integer areaCt)
	{
		this.areaCt = areaCt;
	}
	public String getBal()
	{
		return this.bal;
	}
	public void setBal(String bal)
	{
		this.bal = bal;
	}
	public String getBaseDeposit()
	{
		return this.baseDeposit;
	}
	public void setBaseDeposit(String baseDeposit)
	{
		this.baseDeposit = baseDeposit;
	}
	public String getCorpName()
	{
		return this.corpName;
	}
	public void setCorpName(String corpName)
	{
		this.corpName = corpName;
	}
	public Date getFeatureTime()
	{
		return this.featureTime;
	}
	public void setFeatureTime(Date featureTime)
	{
		this.featureTime = featureTime;
	}
	public Integer getHasLoanRecord()
	{
		return this.hasLoanRecord;
	}
	public void setHasLoanRecord(Integer hasLoanRecord)
	{
		this.hasLoanRecord = hasLoanRecord;
	}
	public Integer getHasOverdueRecord()
	{
		return this.hasOverdueRecord;
	}
	public void setHasOverdueRecord(Integer hasOverdueRecord)
	{
		this.hasOverdueRecord = hasOverdueRecord;
	}
	public Integer getHistoryAccStatus()
	{
		return this.historyAccStatus;
	}
	public void setHistoryAccStatus(Integer historyAccStatus)
	{
		this.historyAccStatus = historyAccStatus;
	}
	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public Integer getIdCardAuth()
	{
		return this.idCardAuth;
	}
	public void setIdCardAuth(Integer idCardAuth)
	{
		this.idCardAuth = idCardAuth;
	}
	public Integer getIntervalDay()
	{
		return this.intervalDay;
	}
	public void setIntervalDay(Integer intervalDay)
	{
		this.intervalDay = intervalDay;
	}
	public String getLastDepositDate()
	{
		return this.lastDepositDate;
	}
	public void setLastDepositDate(String lastDepositDate)
	{
		this.lastDepositDate = lastDepositDate;
	}
	public Double getLastOffDepositMonths()
	{
		return this.lastOffDepositMonths;
	}
	public void setLastOffDepositMonths(Double lastOffDepositMonths)
	{
		this.lastOffDepositMonths = lastOffDepositMonths;
	}
	public Double getLastOnPeriodMaxAmt()
	{
		return this.lastOnPeriodMaxAmt;
	}
	public void setLastOnPeriodMaxAmt(Double lastOnPeriodMaxAmt)
	{
		this.lastOnPeriodMaxAmt = lastOnPeriodMaxAmt;
	}
	public Double getLastOnPeriodMeanAmt()
	{
		return this.lastOnPeriodMeanAmt;
	}
	public void setLastOnPeriodMeanAmt(Double lastOnPeriodMeanAmt)
	{
		this.lastOnPeriodMeanAmt = lastOnPeriodMeanAmt;
	}
	public Double getLastOnPeriodMeanBal()
	{
		return this.lastOnPeriodMeanBal;
	}
	public void setLastOnPeriodMeanBal(Double lastOnPeriodMeanBal)
	{
		this.lastOnPeriodMeanBal = lastOnPeriodMeanBal;
	}
	public Double getLastOnPeriodMinAmt()
	{
		return this.lastOnPeriodMinAmt;
	}
	public void setLastOnPeriodMinAmt(Double lastOnPeriodMinAmt)
	{
		this.lastOnPeriodMinAmt = lastOnPeriodMinAmt;
	}
	public Integer getM12AddDepositMonths()
	{
		return this.m12AddDepositMonths;
	}
	public void setM12AddDepositMonths(Integer m12AddDepositMonths)
	{
		this.m12AddDepositMonths = m12AddDepositMonths;
	}
	public Integer getM12AreaCt()
	{
		return this.m12AreaCt;
	}
	public void setM12AreaCt(Integer m12AreaCt)
	{
		this.m12AreaCt = m12AreaCt;
	}
	public Integer getM12CorpCt()
	{
		return this.m12CorpCt;
	}
	public void setM12CorpCt(Integer m12CorpCt)
	{
		this.m12CorpCt = m12CorpCt;
	}
	public Double getM12DiffAmt()
	{
		return this.m12DiffAmt;
	}
	public void setM12DiffAmt(Double m12DiffAmt)
	{
		this.m12DiffAmt = m12DiffAmt;
	}
	public Double getM12DiffBaseDeposit()
	{
		return this.m12DiffBaseDeposit;
	}
	public void setM12DiffBaseDeposit(Double m12DiffBaseDeposit)
	{
		this.m12DiffBaseDeposit = m12DiffBaseDeposit;
	}
	public Double getM12MaxAmt()
	{
		return this.m12MaxAmt;
	}
	public void setM12MaxAmt(Double m12MaxAmt)
	{
		this.m12MaxAmt = m12MaxAmt;
	}
	public Double getM12MaxBaseDeposit()
	{
		return this.m12MaxBaseDeposit;
	}
	public void setM12MaxBaseDeposit(Double m12MaxBaseDeposit)
	{
		this.m12MaxBaseDeposit = m12MaxBaseDeposit;
	}
	public Integer getM12MaxOffDepositMonths()
	{
		return this.m12MaxOffDepositMonths;
	}
	public void setM12MaxOffDepositMonths(Integer m12MaxOffDepositMonths)
	{
		this.m12MaxOffDepositMonths = m12MaxOffDepositMonths;
	}
	public Integer getM12MaxOnDepositMonths()
	{
		return this.m12MaxOnDepositMonths;
	}
	public void setM12MaxOnDepositMonths(Integer m12MaxOnDepositMonths)
	{
		this.m12MaxOnDepositMonths = m12MaxOnDepositMonths;
	}
	public Double getM12MeanAmt()
	{
		return this.m12MeanAmt;
	}
	public void setM12MeanAmt(Double m12MeanAmt)
	{
		this.m12MeanAmt = m12MeanAmt;
	}
	public Double getM12MeanBaseDeposit()
	{
		return this.m12MeanBaseDeposit;
	}
	public void setM12MeanBaseDeposit(Double m12MeanBaseDeposit)
	{
		this.m12MeanBaseDeposit = m12MeanBaseDeposit;
	}
	public Double getM12MinAmt()
	{
		return this.m12MinAmt;
	}
	public void setM12MinAmt(Double m12MinAmt)
	{
		this.m12MinAmt = m12MinAmt;
	}
	public Double getM12MinBaseDeposit()
	{
		return this.m12MinBaseDeposit;
	}
	public void setM12MinBaseDeposit(Double m12MinBaseDeposit)
	{
		this.m12MinBaseDeposit = m12MinBaseDeposit;
	}
	public Integer getM12OffDepositCt()
	{
		return this.m12OffDepositCt;
	}
	public void setM12OffDepositCt(Integer m12OffDepositCt)
	{
		this.m12OffDepositCt = m12OffDepositCt;
	}
	public Integer getM12SameArea()
	{
		return this.m12SameArea;
	}
	public void setM12SameArea(Integer m12SameArea)
	{
		this.m12SameArea = m12SameArea;
	}
	public Integer getM12SupplyMonths()
	{
		return this.m12SupplyMonths;
	}
	public void setM12SupplyMonths(Integer m12SupplyMonths)
	{
		this.m12SupplyMonths = m12SupplyMonths;
	}
	public Integer getM18AddDepositMonths()
	{
		return this.m18AddDepositMonths;
	}
	public void setM18AddDepositMonths(Integer m18AddDepositMonths)
	{
		this.m18AddDepositMonths = m18AddDepositMonths;
	}
	public Integer getM18AreaCt()
	{
		return this.m18AreaCt;
	}
	public void setM18AreaCt(Integer m18AreaCt)
	{
		this.m18AreaCt = m18AreaCt;
	}
	public Integer getM18CorpCt()
	{
		return this.m18CorpCt;
	}
	public void setM18CorpCt(Integer m18CorpCt)
	{
		this.m18CorpCt = m18CorpCt;
	}
	public Double getM18DiffAmt()
	{
		return this.m18DiffAmt;
	}
	public void setM18DiffAmt(Double m18DiffAmt)
	{
		this.m18DiffAmt = m18DiffAmt;
	}
	public Double getM18DiffBaseDeposit()
	{
		return this.m18DiffBaseDeposit;
	}
	public void setM18DiffBaseDeposit(Double m18DiffBaseDeposit)
	{
		this.m18DiffBaseDeposit = m18DiffBaseDeposit;
	}
	public Double getM18MaxAmt()
	{
		return this.m18MaxAmt;
	}
	public void setM18MaxAmt(Double m18MaxAmt)
	{
		this.m18MaxAmt = m18MaxAmt;
	}
	public Double getM18MaxBaseDeposit()
	{
		return this.m18MaxBaseDeposit;
	}
	public void setM18MaxBaseDeposit(Double m18MaxBaseDeposit)
	{
		this.m18MaxBaseDeposit = m18MaxBaseDeposit;
	}
	public Integer getM18MaxOffDepositMonths()
	{
		return this.m18MaxOffDepositMonths;
	}
	public void setM18MaxOffDepositMonths(Integer m18MaxOffDepositMonths)
	{
		this.m18MaxOffDepositMonths = m18MaxOffDepositMonths;
	}
	public Integer getM18MaxOnDepositMonths()
	{
		return this.m18MaxOnDepositMonths;
	}
	public void setM18MaxOnDepositMonths(Integer m18MaxOnDepositMonths)
	{
		this.m18MaxOnDepositMonths = m18MaxOnDepositMonths;
	}
	public Double getM18MeanAmt()
	{
		return this.m18MeanAmt;
	}
	public void setM18MeanAmt(Double m18MeanAmt)
	{
		this.m18MeanAmt = m18MeanAmt;
	}
	public Double getM18MeanBaseDeposit()
	{
		return this.m18MeanBaseDeposit;
	}
	public void setM18MeanBaseDeposit(Double m18MeanBaseDeposit)
	{
		this.m18MeanBaseDeposit = m18MeanBaseDeposit;
	}
	public Double getM18MinAmt()
	{
		return this.m18MinAmt;
	}
	public void setM18MinAmt(Double m18MinAmt)
	{
		this.m18MinAmt = m18MinAmt;
	}
	public Double getM18MinBaseDeposit()
	{
		return this.m18MinBaseDeposit;
	}
	public void setM18MinBaseDeposit(Double m18MinBaseDeposit)
	{
		this.m18MinBaseDeposit = m18MinBaseDeposit;
	}
	public Integer getM18OffDepositCt()
	{
		return this.m18OffDepositCt;
	}
	public void setM18OffDepositCt(Integer m18OffDepositCt)
	{
		this.m18OffDepositCt = m18OffDepositCt;
	}
	public Integer getM18SameArea()
	{
		return this.m18SameArea;
	}
	public void setM18SameArea(Integer m18SameArea)
	{
		this.m18SameArea = m18SameArea;
	}
	public Integer getM18SupplyMonths()
	{
		return this.m18SupplyMonths;
	}
	public void setM18SupplyMonths(Integer m18SupplyMonths)
	{
		this.m18SupplyMonths = m18SupplyMonths;
	}
	public Integer getM24AddDepositMonths()
	{
		return this.m24AddDepositMonths;
	}
	public void setM24AddDepositMonths(Integer m24AddDepositMonths)
	{
		this.m24AddDepositMonths = m24AddDepositMonths;
	}
	public Integer getM24AreaCt()
	{
		return this.m24AreaCt;
	}
	public void setM24AreaCt(Integer m24AreaCt)
	{
		this.m24AreaCt = m24AreaCt;
	}
	public Integer getM24CorpCt()
	{
		return this.m24CorpCt;
	}
	public void setM24CorpCt(Integer m24CorpCt)
	{
		this.m24CorpCt = m24CorpCt;
	}
	public Double getM24DiffAmt()
	{
		return this.m24DiffAmt;
	}
	public void setM24DiffAmt(Double m24DiffAmt)
	{
		this.m24DiffAmt = m24DiffAmt;
	}
	public Double getM24DiffBaseDeposit()
	{
		return this.m24DiffBaseDeposit;
	}
	public void setM24DiffBaseDeposit(Double m24DiffBaseDeposit)
	{
		this.m24DiffBaseDeposit = m24DiffBaseDeposit;
	}
	public Double getM24MaxAmt()
	{
		return this.m24MaxAmt;
	}
	public void setM24MaxAmt(Double m24MaxAmt)
	{
		this.m24MaxAmt = m24MaxAmt;
	}
	public Double getM24MaxBaseDeposit()
	{
		return this.m24MaxBaseDeposit;
	}
	public void setM24MaxBaseDeposit(Double m24MaxBaseDeposit)
	{
		this.m24MaxBaseDeposit = m24MaxBaseDeposit;
	}
	public Integer getM24MaxOffDepositMonths()
	{
		return this.m24MaxOffDepositMonths;
	}
	public void setM24MaxOffDepositMonths(Integer m24MaxOffDepositMonths)
	{
		this.m24MaxOffDepositMonths = m24MaxOffDepositMonths;
	}
	public Integer getM24MaxOnDepositMonths()
	{
		return this.m24MaxOnDepositMonths;
	}
	public void setM24MaxOnDepositMonths(Integer m24MaxOnDepositMonths)
	{
		this.m24MaxOnDepositMonths = m24MaxOnDepositMonths;
	}
	public Double getM24MeanAmt()
	{
		return this.m24MeanAmt;
	}
	public void setM24MeanAmt(Double m24MeanAmt)
	{
		this.m24MeanAmt = m24MeanAmt;
	}
	public Double getM24MeanBaseDeposit()
	{
		return this.m24MeanBaseDeposit;
	}
	public void setM24MeanBaseDeposit(Double m24MeanBaseDeposit)
	{
		this.m24MeanBaseDeposit = m24MeanBaseDeposit;
	}
	public Double getM24MinAmt()
	{
		return this.m24MinAmt;
	}
	public void setM24MinAmt(Double m24MinAmt)
	{
		this.m24MinAmt = m24MinAmt;
	}
	public Double getM24MinBaseDeposit()
	{
		return this.m24MinBaseDeposit;
	}
	public void setM24MinBaseDeposit(Double m24MinBaseDeposit)
	{
		this.m24MinBaseDeposit = m24MinBaseDeposit;
	}
	public Integer getM24OffDepositCt()
	{
		return this.m24OffDepositCt;
	}
	public void setM24OffDepositCt(Integer m24OffDepositCt)
	{
		this.m24OffDepositCt = m24OffDepositCt;
	}
	public Integer getM24SameArea()
	{
		return this.m24SameArea;
	}
	public void setM24SameArea(Integer m24SameArea)
	{
		this.m24SameArea = m24SameArea;
	}
	public Integer getM24SupplyMonths()
	{
		return this.m24SupplyMonths;
	}
	public void setM24SupplyMonths(Integer m24SupplyMonths)
	{
		this.m24SupplyMonths = m24SupplyMonths;
	}
	public Integer getM30AddDepositMonths()
	{
		return this.m30AddDepositMonths;
	}
	public void setM30AddDepositMonths(Integer m30AddDepositMonths)
	{
		this.m30AddDepositMonths = m30AddDepositMonths;
	}
	public Integer getM30AreaCt()
	{
		return this.m30AreaCt;
	}
	public void setM30AreaCt(Integer m30AreaCt)
	{
		this.m30AreaCt = m30AreaCt;
	}
	public Integer getM30CorpCt()
	{
		return this.m30CorpCt;
	}
	public void setM30CorpCt(Integer m30CorpCt)
	{
		this.m30CorpCt = m30CorpCt;
	}
	public Double getM30DiffAmt()
	{
		return this.m30DiffAmt;
	}
	public void setM30DiffAmt(Double m30DiffAmt)
	{
		this.m30DiffAmt = m30DiffAmt;
	}
	public Double getM30DiffBaseDeposit()
	{
		return this.m30DiffBaseDeposit;
	}
	public void setM30DiffBaseDeposit(Double m30DiffBaseDeposit)
	{
		this.m30DiffBaseDeposit = m30DiffBaseDeposit;
	}
	public Double getM30MaxAmt()
	{
		return this.m30MaxAmt;
	}
	public void setM30MaxAmt(Double m30MaxAmt)
	{
		this.m30MaxAmt = m30MaxAmt;
	}
	public Double getM30MaxBaseDeposit()
	{
		return this.m30MaxBaseDeposit;
	}
	public void setM30MaxBaseDeposit(Double m30MaxBaseDeposit)
	{
		this.m30MaxBaseDeposit = m30MaxBaseDeposit;
	}
	public Integer getM30MaxOffDepositMonths()
	{
		return this.m30MaxOffDepositMonths;
	}
	public void setM30MaxOffDepositMonths(Integer m30MaxOffDepositMonths)
	{
		this.m30MaxOffDepositMonths = m30MaxOffDepositMonths;
	}
	public Integer getM30MaxOnDepositMonths()
	{
		return this.m30MaxOnDepositMonths;
	}
	public void setM30MaxOnDepositMonths(Integer m30MaxOnDepositMonths)
	{
		this.m30MaxOnDepositMonths = m30MaxOnDepositMonths;
	}
	public Double getM30MeanAmt()
	{
		return this.m30MeanAmt;
	}
	public void setM30MeanAmt(Double m30MeanAmt)
	{
		this.m30MeanAmt = m30MeanAmt;
	}
	public Double getM30MeanBaseDeposit()
	{
		return this.m30MeanBaseDeposit;
	}
	public void setM30MeanBaseDeposit(Double m30MeanBaseDeposit)
	{
		this.m30MeanBaseDeposit = m30MeanBaseDeposit;
	}
	public Double getM30MinAmt()
	{
		return this.m30MinAmt;
	}
	public void setM30MinAmt(Double m30MinAmt)
	{
		this.m30MinAmt = m30MinAmt;
	}
	public Double getM30MinBaseDeposit()
	{
		return this.m30MinBaseDeposit;
	}
	public void setM30MinBaseDeposit(Double m30MinBaseDeposit)
	{
		this.m30MinBaseDeposit = m30MinBaseDeposit;
	}
	public Integer getM30OffDepositCt()
	{
		return this.m30OffDepositCt;
	}
	public void setM30OffDepositCt(Integer m30OffDepositCt)
	{
		this.m30OffDepositCt = m30OffDepositCt;
	}
	public Integer getM30SameArea()
	{
		return this.m30SameArea;
	}
	public void setM30SameArea(Integer m30SameArea)
	{
		this.m30SameArea = m30SameArea;
	}
	public Integer getM30SupplyMonths()
	{
		return this.m30SupplyMonths;
	}
	public void setM30SupplyMonths(Integer m30SupplyMonths)
	{
		this.m30SupplyMonths = m30SupplyMonths;
	}
	public Integer getM36AddDepositMonths()
	{
		return this.m36AddDepositMonths;
	}
	public void setM36AddDepositMonths(Integer m36AddDepositMonths)
	{
		this.m36AddDepositMonths = m36AddDepositMonths;
	}
	public Integer getM36AreaCt()
	{
		return this.m36AreaCt;
	}
	public void setM36AreaCt(Integer m36AreaCt)
	{
		this.m36AreaCt = m36AreaCt;
	}
	public Integer getM36CorpCt()
	{
		return this.m36CorpCt;
	}
	public void setM36CorpCt(Integer m36CorpCt)
	{
		this.m36CorpCt = m36CorpCt;
	}
	public Double getM36DiffAmt()
	{
		return this.m36DiffAmt;
	}
	public void setM36DiffAmt(Double m36DiffAmt)
	{
		this.m36DiffAmt = m36DiffAmt;
	}
	public Double getM36DiffBaseDeposit()
	{
		return this.m36DiffBaseDeposit;
	}
	public void setM36DiffBaseDeposit(Double m36DiffBaseDeposit)
	{
		this.m36DiffBaseDeposit = m36DiffBaseDeposit;
	}
	public Double getM36MaxAmt()
	{
		return this.m36MaxAmt;
	}
	public void setM36MaxAmt(Double m36MaxAmt)
	{
		this.m36MaxAmt = m36MaxAmt;
	}
	public Double getM36MaxBaseDeposit()
	{
		return this.m36MaxBaseDeposit;
	}
	public void setM36MaxBaseDeposit(Double m36MaxBaseDeposit)
	{
		this.m36MaxBaseDeposit = m36MaxBaseDeposit;
	}
	public Integer getM36MaxOffDepositMonths()
	{
		return this.m36MaxOffDepositMonths;
	}
	public void setM36MaxOffDepositMonths(Integer m36MaxOffDepositMonths)
	{
		this.m36MaxOffDepositMonths = m36MaxOffDepositMonths;
	}
	public Integer getM36MaxOnDepositMonths()
	{
		return this.m36MaxOnDepositMonths;
	}
	public void setM36MaxOnDepositMonths(Integer m36MaxOnDepositMonths)
	{
		this.m36MaxOnDepositMonths = m36MaxOnDepositMonths;
	}
	public Double getM36MeanAmt()
	{
		return this.m36MeanAmt;
	}
	public void setM36MeanAmt(Double m36MeanAmt)
	{
		this.m36MeanAmt = m36MeanAmt;
	}
	public Double getM36MeanBaseDeposit()
	{
		return this.m36MeanBaseDeposit;
	}
	public void setM36MeanBaseDeposit(Double m36MeanBaseDeposit)
	{
		this.m36MeanBaseDeposit = m36MeanBaseDeposit;
	}
	public Double getM36MinAmt()
	{
		return this.m36MinAmt;
	}
	public void setM36MinAmt(Double m36MinAmt)
	{
		this.m36MinAmt = m36MinAmt;
	}
	public Double getM36MinBaseDeposit()
	{
		return this.m36MinBaseDeposit;
	}
	public void setM36MinBaseDeposit(Double m36MinBaseDeposit)
	{
		this.m36MinBaseDeposit = m36MinBaseDeposit;
	}
	public Integer getM36OffDepositCt()
	{
		return this.m36OffDepositCt;
	}
	public void setM36OffDepositCt(Integer m36OffDepositCt)
	{
		this.m36OffDepositCt = m36OffDepositCt;
	}
	public Integer getM36SameArea()
	{
		return this.m36SameArea;
	}
	public void setM36SameArea(Integer m36SameArea)
	{
		this.m36SameArea = m36SameArea;
	}
	public Integer getM36SupplyMonths()
	{
		return this.m36SupplyMonths;
	}
	public void setM36SupplyMonths(Integer m36SupplyMonths)
	{
		this.m36SupplyMonths = m36SupplyMonths;
	}
	public Integer getM3AddDepositMonths()
	{
		return this.m3AddDepositMonths;
	}
	public void setM3AddDepositMonths(Integer m3AddDepositMonths)
	{
		this.m3AddDepositMonths = m3AddDepositMonths;
	}
	public Integer getM3AreaCt()
	{
		return this.m3AreaCt;
	}
	public void setM3AreaCt(Integer m3AreaCt)
	{
		this.m3AreaCt = m3AreaCt;
	}
	public Integer getM3CorpCt()
	{
		return this.m3CorpCt;
	}
	public void setM3CorpCt(Integer m3CorpCt)
	{
		this.m3CorpCt = m3CorpCt;
	}
	public Double getM3DiffAmt()
	{
		return this.m3DiffAmt;
	}
	public void setM3DiffAmt(Double m3DiffAmt)
	{
		this.m3DiffAmt = m3DiffAmt;
	}
	public Double getM3DiffBaseDeposit()
	{
		return this.m3DiffBaseDeposit;
	}
	public void setM3DiffBaseDeposit(Double m3DiffBaseDeposit)
	{
		this.m3DiffBaseDeposit = m3DiffBaseDeposit;
	}
	public Double getM3MaxAmt()
	{
		return this.m3MaxAmt;
	}
	public void setM3MaxAmt(Double m3MaxAmt)
	{
		this.m3MaxAmt = m3MaxAmt;
	}
	public Double getM3MaxBaseDeposit()
	{
		return this.m3MaxBaseDeposit;
	}
	public void setM3MaxBaseDeposit(Double m3MaxBaseDeposit)
	{
		this.m3MaxBaseDeposit = m3MaxBaseDeposit;
	}
	public Integer getM3MaxOffDepositMonths()
	{
		return this.m3MaxOffDepositMonths;
	}
	public void setM3MaxOffDepositMonths(Integer m3MaxOffDepositMonths)
	{
		this.m3MaxOffDepositMonths = m3MaxOffDepositMonths;
	}
	public Integer getM3MaxOnDepositMonths()
	{
		return this.m3MaxOnDepositMonths;
	}
	public void setM3MaxOnDepositMonths(Integer m3MaxOnDepositMonths)
	{
		this.m3MaxOnDepositMonths = m3MaxOnDepositMonths;
	}
	public Double getM3MeanAmt()
	{
		return this.m3MeanAmt;
	}
	public void setM3MeanAmt(Double m3MeanAmt)
	{
		this.m3MeanAmt = m3MeanAmt;
	}
	public Double getM3MeanBaseDeposit()
	{
		return this.m3MeanBaseDeposit;
	}
	public void setM3MeanBaseDeposit(Double m3MeanBaseDeposit)
	{
		this.m3MeanBaseDeposit = m3MeanBaseDeposit;
	}
	public Double getM3MinAmt()
	{
		return this.m3MinAmt;
	}
	public void setM3MinAmt(Double m3MinAmt)
	{
		this.m3MinAmt = m3MinAmt;
	}
	public Double getM3MinBaseDeposit()
	{
		return this.m3MinBaseDeposit;
	}
	public void setM3MinBaseDeposit(Double m3MinBaseDeposit)
	{
		this.m3MinBaseDeposit = m3MinBaseDeposit;
	}
	public Integer getM3OffDepositCt()
	{
		return this.m3OffDepositCt;
	}
	public void setM3OffDepositCt(Integer m3OffDepositCt)
	{
		this.m3OffDepositCt = m3OffDepositCt;
	}
	public Integer getM3SameArea()
	{
		return this.m3SameArea;
	}
	public void setM3SameArea(Integer m3SameArea)
	{
		this.m3SameArea = m3SameArea;
	}
	public Integer getM3SupplyMonths()
	{
		return this.m3SupplyMonths;
	}
	public void setM3SupplyMonths(Integer m3SupplyMonths)
	{
		this.m3SupplyMonths = m3SupplyMonths;
	}
	public Integer getM6AddDepositMonths()
	{
		return this.m6AddDepositMonths;
	}
	public void setM6AddDepositMonths(Integer m6AddDepositMonths)
	{
		this.m6AddDepositMonths = m6AddDepositMonths;
	}
	public Integer getM6AreaCt()
	{
		return this.m6AreaCt;
	}
	public void setM6AreaCt(Integer m6AreaCt)
	{
		this.m6AreaCt = m6AreaCt;
	}
	public Integer getM6CorpCt()
	{
		return this.m6CorpCt;
	}
	public void setM6CorpCt(Integer m6CorpCt)
	{
		this.m6CorpCt = m6CorpCt;
	}
	public Double getM6DiffAmt()
	{
		return this.m6DiffAmt;
	}
	public void setM6DiffAmt(Double m6DiffAmt)
	{
		this.m6DiffAmt = m6DiffAmt;
	}
	public Double getM6DiffBaseDeposit()
	{
		return this.m6DiffBaseDeposit;
	}
	public void setM6DiffBaseDeposit(Double m6DiffBaseDeposit)
	{
		this.m6DiffBaseDeposit = m6DiffBaseDeposit;
	}
	public Double getM6MaxAmt()
	{
		return this.m6MaxAmt;
	}
	public void setM6MaxAmt(Double m6MaxAmt)
	{
		this.m6MaxAmt = m6MaxAmt;
	}
	public Double getM6MaxBaseDeposit()
	{
		return this.m6MaxBaseDeposit;
	}
	public void setM6MaxBaseDeposit(Double m6MaxBaseDeposit)
	{
		this.m6MaxBaseDeposit = m6MaxBaseDeposit;
	}
	public Integer getM6MaxOffDepositMonths()
	{
		return this.m6MaxOffDepositMonths;
	}
	public void setM6MaxOffDepositMonths(Integer m6MaxOffDepositMonths)
	{
		this.m6MaxOffDepositMonths = m6MaxOffDepositMonths;
	}
	public Integer getM6MaxOnDepositMonths()
	{
		return this.m6MaxOnDepositMonths;
	}
	public void setM6MaxOnDepositMonths(Integer m6MaxOnDepositMonths)
	{
		this.m6MaxOnDepositMonths = m6MaxOnDepositMonths;
	}
	public Double getM6MeanAmt()
	{
		return this.m6MeanAmt;
	}
	public void setM6MeanAmt(Double m6MeanAmt)
	{
		this.m6MeanAmt = m6MeanAmt;
	}
	public Double getM6MeanBaseDeposit()
	{
		return this.m6MeanBaseDeposit;
	}
	public void setM6MeanBaseDeposit(Double m6MeanBaseDeposit)
	{
		this.m6MeanBaseDeposit = m6MeanBaseDeposit;
	}
	public Double getM6MinAmt()
	{
		return this.m6MinAmt;
	}
	public void setM6MinAmt(Double m6MinAmt)
	{
		this.m6MinAmt = m6MinAmt;
	}
	public Double getM6MinBaseDeposit()
	{
		return this.m6MinBaseDeposit;
	}
	public void setM6MinBaseDeposit(Double m6MinBaseDeposit)
	{
		this.m6MinBaseDeposit = m6MinBaseDeposit;
	}
	public Integer getM6OffDepositCt()
	{
		return this.m6OffDepositCt;
	}
	public void setM6OffDepositCt(Integer m6OffDepositCt)
	{
		this.m6OffDepositCt = m6OffDepositCt;
	}
	public Integer getM6SameArea()
	{
		return this.m6SameArea;
	}
	public void setM6SameArea(Integer m6SameArea)
	{
		this.m6SameArea = m6SameArea;
	}
	public Integer getM6SupplyMonths()
	{
		return this.m6SupplyMonths;
	}
	public void setM6SupplyMonths(Integer m6SupplyMonths)
	{
		this.m6SupplyMonths = m6SupplyMonths;
	}
	public Double getMaxBal()
	{
		return this.maxBal;
	}
	public void setMaxBal(Double maxBal)
	{
		this.maxBal = maxBal;
	}
	public Double getMeanBal()
	{
		return this.meanBal;
	}
	public void setMeanBal(Double meanBal)
	{
		this.meanBal = meanBal;
	}
	public Double getMinBal()
	{
		return this.minBal;
	}
	public void setMinBal(Double minBal)
	{
		this.minBal = minBal;
	}
	public String getMonthlyDeposit()
	{
		return this.monthlyDeposit;
	}
	public void setMonthlyDeposit(String monthlyDeposit)
	{
		this.monthlyDeposit = monthlyDeposit;
	}
	public Double getMonthlyMaxAmt()
	{
		return this.monthlyMaxAmt;
	}
	public void setMonthlyMaxAmt(Double monthlyMaxAmt)
	{
		this.monthlyMaxAmt = monthlyMaxAmt;
	}
	public Double getMonthlyMeanAmt()
	{
		return this.monthlyMeanAmt;
	}
	public void setMonthlyMeanAmt(Double monthlyMeanAmt)
	{
		this.monthlyMeanAmt = monthlyMeanAmt;
	}
	public Double getMonthlyMinAmt()
	{
		return this.monthlyMinAmt;
	}
	public void setMonthlyMinAmt(Double monthlyMinAmt)
	{
		this.monthlyMinAmt = monthlyMinAmt;
	}
	public Integer getNowCorpDepositDay()
	{
		return this.nowCorpDepositDay;
	}
	public void setNowCorpDepositDay(Integer nowCorpDepositDay)
	{
		this.nowCorpDepositDay = nowCorpDepositDay;
	}
	public Double getOffDepositCt()
	{
		return this.offDepositCt;
	}
	public void setOffDepositCt(Double offDepositCt)
	{
		this.offDepositCt = offDepositCt;
	}
	public String getOpenDate()
	{
		return this.openDate;
	}
	public void setOpenDate(String openDate)
	{
		this.openDate = openDate;
	}
	public Integer getOpenLenMonths()
	{
		return this.openLenMonths;
	}
	public void setOpenLenMonths(Integer openLenMonths)
	{
		this.openLenMonths = openLenMonths;
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
