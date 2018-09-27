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
 * <p>Title: creditcard_salary_fea_max - 信用卡账单工资流水特征_max : Value Object</p> 
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
public class CreditcardSalaryFeaMax extends BaseEntity
{
	//****************************************************************************
	//fields
	//****************************************************************************
	@Label("卡号标识")
	private Short cardFlag = null;
	@Label("卡号")
	private String cardNo = null;
	@Label("Default_feature_time_Comment")
	private Date featureTime = null;
	@Label("Default_id_Comment")
	private Integer id = null;
	@Label("过去第10个月消费金额")
	private Double l10Consum = null;
	@Label("过去第10个月消费天数")
	private Double l10ConsumMonday = null;
	@Label("过去第10个月消费笔数")
	private Integer l10MonthConsumTimes = null;
	@Label("过去第10个月交易笔数")
	private Double l10MonthTradesumTimes = null;
	@Label("过去第10个月工资额")
	private Double l10Salary = null;
	@Label("过去第10个月交易金额")
	private Double l10Tradesum = null;
	@Label("过去第10个月交易天数")
	private Double l10TradesumMonday = null;
	@Label("过去第11个月消费金额")
	private Double l11Consum = null;
	@Label("过去第11个月消费天数")
	private Double l11ConsumMonday = null;
	@Label("过去第11个月消费笔数")
	private Integer l11MonthConsumTimes = null;
	@Label("过去第11个月交易笔数")
	private Double l11MonthTradesumTimes = null;
	@Label("过去第11个月工资额")
	private Double l11Salary = null;
	@Label("过去第11个月交易金额")
	private Double l11Tradesum = null;
	@Label("过去第11个月交易天数")
	private Double l11TradesumMonday = null;
	@Label("近12个月消费天数")
	private Double l12ComsumDays = null;
	@Label("过去第12个月消费金额")
	private Double l12Consum = null;
	@Label("过去第12个月消费天数")
	private Double l12ConsumMonday = null;
	@Label("近12月发生消费的月份数")
	private Double l12ConsumMonths = null;
	@Label("近12月笔均消费金额")
	private Double l12ConsumTimeMoney = null;
	@Label("近12月消费笔数")
	private Integer l12ConsumTimes = null;
	@Label("近12个月最大单日累计消费金额")
	private Double l12MaxDailyAmount = null;
	@Label("近12个月最大单日累计消费笔数")
	private Double l12MaxDailyBillCt = null;
	@Label("近12个月平均消费金额")
	private Double l12MeanConsum = null;
	@Label("近12个月平均工资额")
	private Double l12MeanSalary = null;
	@Label("近12个月平均交易金额")
	private Double l12MeanTradesum = null;
	@Label("近12月月均消费笔数")
	private Integer l12MonavgConsumTimes = null;
	@Label("近12月月均交易笔数")
	private Double l12MonavgTradesumTimes = null;
	@Label("过去第22个月消费笔数")
	private Integer l12MonthConsumTimes = null;
	@Label("过去第22个月交易笔数")
	private Double l12MonthTradesumTimes = null;
	@Label("近12个月消费金额")
	private Double l12MsumComsum = null;
	@Label("近12个月交易金额")
	private Double l12MsumTradesum = null;
	@Label("近12个月无工资月份数")
	private Integer l12NoSalaryMonthCt = null;
	@Label("过去第12个月工资额")
	private Double l12Salary = null;
	@Label("过去第12个月交易金额")
	private Double l12Tradesum = null;
	@Label("近12个月交易天数")
	private Double l12TradesumDays = null;
	@Label("过去第12个月交易天数")
	private Double l12TradesumMonday = null;
	@Label("近12月发生交易的月份数")
	private Double l12TradesumMonths = null;
	@Label("近12月笔均交易金额")
	private Double l12TradesumTimeMoney = null;
	@Label("近12月交易笔数")
	private Double l12TradesumTimes = null;
	@Label("工资额变化l1_mean_salary-l12_mean_salary")
	private Double l112DiffSalary = null;
	@Label("近1个月单笔笔数50-100元总消费笔数")
	private Double l11Sinmo100less = null;
	@Label("近1个月单笔笔数5000-10000元总消费笔数")
	private Double l11Sinmo10kless = null;
	@Label("近1个月单笔笔数小于10元总消费笔数")
	private Double l11Sinmo10less = null;
	@Label("近1个月单笔笔数500-1000元总消费笔数")
	private Double l11Sinmo1kless = null;
	@Label("近1个月单笔笔数1000-2000元总消费笔数")
	private Double l11Sinmo2kless = null;
	@Label("近1个月单笔笔数2000-3000元总消费笔数")
	private Double l11Sinmo3kless = null;
	@Label("近1个月单笔笔数100-500元总消费笔数")
	private Double l11Sinmo500less = null;
	@Label("近1个月单笔笔数10000-50000元总消费笔数")
	private Double l11Sinmo50kless = null;
	@Label("近1个月单笔笔数50000元以上总消费笔数")
	private Double l11Sinmo50kmore = null;
	@Label("近1个月单笔笔数10-50元总消费笔数")
	private Double l11Sinmo50less = null;
	@Label("近1个月单笔笔数3000-5000元总消费笔数")
	private Double l11Sinmo5kless = null;
	@Label("近1个月单笔笔数50-100元总交易笔数")
	private Double l11SinmoTrade100less = null;
	@Label("近1个月单笔笔数5000-10000元总交易笔数")
	private Double l11SinmoTrade10kless = null;
	@Label("近1个月单笔笔数小于10元总交易笔数")
	private Double l11SinmoTrade10less = null;
	@Label("近1个月单笔笔数500-1000元总交易笔数")
	private Double l11SinmoTrade1kless = null;
	@Label("近1个月单笔笔数1000-2000元总交易笔数")
	private Double l11SinmoTrade2kless = null;
	@Label("近1个月单笔笔数2000-3000元总交易笔数")
	private Double l11SinmoTrade3kless = null;
	@Label("近1个月单笔笔数100-500元总交易笔数")
	private Double l11SinmoTrade500less = null;
	@Label("近1个月单笔笔数10000-50000元总交易笔数")
	private Double l11SinmoTrade50kless = null;
	@Label("近1个月单笔笔数50000元以上总交易笔数")
	private Double l11SinmoTrade50kmore = null;
	@Label("近1个月单笔笔数10-50元总交易笔数")
	private Double l11SinmoTrade50less = null;
	@Label("近1个月单笔笔数3000-5000元总交易笔数")
	private Double l11SinmoTrade5kless = null;
	@Label("近1个月单笔金额50-100元总消费金额")
	private Double l11sinmo100less = null;
	@Label("近1个月单笔金额5000-10000元总消费金额")
	private Double l11sinmo10kless = null;
	@Label("近1个月单笔金额小于10元总消费金额")
	private Double l11sinmo10less = null;
	@Label("近1个月单笔金额500-1000元总消费金额")
	private Double l11sinmo1kless = null;
	@Label("近1个月单笔金额1000-2000元总消费金额")
	private Double l11sinmo2kless = null;
	@Label("近1个月单笔金额2000-3000元总消费金额")
	private Double l11sinmo3kless = null;
	@Label("近1个月单笔金额100-500元总消费金额")
	private Double l11sinmo500less = null;
	@Label("近1个月单笔金额10000-50000元总消费金额")
	private Double l11sinmo50kless = null;
	@Label("近1个月单笔金额50000元以上总消费金额")
	private Double l11sinmo50kmore = null;
	@Label("近1个月单笔金额10-50元总消费金额")
	private Double l11sinmo50less = null;
	@Label("近1个月单笔金额3000-5000元总消费金额")
	private Double l11sinmo5kless = null;
	@Label("近1个月单笔金额50-100元总交易金额")
	private Double l11sinmoTrade100less = null;
	@Label("近1个月单笔金额5000-10000元总交易金额")
	private Double l11sinmoTrade10kless = null;
	@Label("近1个月单笔金额小于10元总交易金额")
	private Double l11sinmoTrade10less = null;
	@Label("近1个月单笔金额500-1000元总交易金额")
	private Double l11sinmoTrade1kless = null;
	@Label("近1个月单笔金额1000-2000元总交易金额")
	private Double l11sinmoTrade2kless = null;
	@Label("近1个月单笔金额2000-3000元总交易金额")
	private Double l11sinmoTrade3kless = null;
	@Label("近1个月单笔金额100-500元总交易金额")
	private Double l11sinmoTrade500less = null;
	@Label("近1个月单笔金额10000-50000元总交易金额")
	private Double l11sinmoTrade50kless = null;
	@Label("近1个月单笔金额50000元以上总交易金额")
	private Double l11sinmoTrade50kmore = null;
	@Label("近1个月单笔金额10-50元总交易金额")
	private Double l11sinmoTrade50less = null;
	@Label("近1个月单笔金额3000-5000元总交易金额")
	private Double l11sinmoTrade5kless = null;
	@Label("工资额变化l1_mean_salary-l3_mean_salary")
	private Double l13DiffSalary = null;
	@Label("工资额变化l1_mean_salary-l6_mean_salary")
	private Double l16DiffSalary = null;
	@Label("近1个月消费天数")
	private Double l1ConsumMonday = null;
	@Label("近1月笔均消费金额")
	private Double l1ConsumTimeMoney = null;
	@Label("近1月消费笔数")
	private Integer l1ConsumTimes = null;
	@Label("近1个月最大单日累计消费金额")
	private Double l1MaxDailyAmount = null;
	@Label("近1个月最大单日累计消费笔数")
	private Double l1MaxDailyBillCt = null;
	@Label("近一个月平均工资额")
	private Double l1MeanSalary = null;
	@Label("近1个月消费金额")
	private Double l1MsumComsum = null;
	@Label("近1个月交易金额")
	private Double l1MsumTradesum = null;
	@Label("近1个月无工资月份数")
	private Integer l1NoSalaryMonthCt = null;
	@Label("近1个月交易天数")
	private Double l1TradesumMonday = null;
	@Label("近1月笔均交易金额")
	private Double l1TradesumTimeMoney = null;
	@Label("近1月交易笔数")
	private Double l1TradesumTimes = null;
	@Label("过去第2个月消费金额")
	private Double l2Consum = null;
	@Label("过去第2个月消费天数")
	private Double l2ConsumMonday = null;
	@Label("过去第2个月消费笔数")
	private Integer l2MonthConsumTimes = null;
	@Label("过去第2个月交易笔数")
	private Double l2MonthTradesumTimes = null;
	@Label("过去第2个月工资额")
	private Double l2Salary = null;
	@Label("过去第2个月交易金额")
	private Double l2Tradesum = null;
	@Label("过去第2个月交易天数")
	private Double l2TradesumMonday = null;
	@Label("近3个月单笔笔数50-100元总消费笔数")
	private Double l33Sinmo100less = null;
	@Label("近3个月单笔笔数5000-10000元总消费笔数")
	private Double l33Sinmo10kless = null;
	@Label("近3个月单笔笔数小于10元总消费笔数")
	private Double l33Sinmo10less = null;
	@Label("近3个月单笔笔数500-1000元总消费笔数")
	private Double l33Sinmo1kless = null;
	@Label("近3个月单笔笔数1000-2000元总消费笔数")
	private Double l33Sinmo2kless = null;
	@Label("近3个月单笔笔数2000-3000元总消费笔数")
	private Double l33Sinmo3kless = null;
	@Label("近3个月单笔笔数100-500元总消费笔数")
	private Double l33Sinmo500less = null;
	@Label("近3个月单笔笔数10000-50000元总消费笔数")
	private Double l33Sinmo50kless = null;
	@Label("近3个月单笔笔数50000元以上总消费笔数")
	private Double l33Sinmo50kmore = null;
	@Label("近3个月单笔笔数10-50元总消费笔数")
	private Double l33Sinmo50less = null;
	@Label("近3个月单笔笔数3000-5000元总消费笔数")
	private Double l33Sinmo5kless = null;
	@Label("近3个月单笔笔数50-100元总交易笔数")
	private Double l33SinmoTrade100less = null;
	@Label("近3个月单笔笔数5000-10000元总交易笔数")
	private Double l33SinmoTrade10kless = null;
	@Label("近3个月单笔笔数小于10元总交易笔数")
	private Double l33SinmoTrade10less = null;
	@Label("近3个月单笔笔数500-1000元总交易笔数")
	private Double l33SinmoTrade1kless = null;
	@Label("近3个月单笔笔数1000-2000元总交易笔数")
	private Double l33SinmoTrade2kless = null;
	@Label("近3个月单笔笔数2000-3000元总交易笔数")
	private Double l33SinmoTrade3kless = null;
	@Label("近3个月单笔笔数100-500元总交易笔数")
	private Double l33SinmoTrade500less = null;
	@Label("近3个月单笔笔数10000-50000元总交易笔数")
	private Double l33SinmoTrade50kless = null;
	@Label("近3个月单笔笔数50000元以上总交易笔数")
	private Double l33SinmoTrade50kmore = null;
	@Label("近3个月单笔笔数10-50元总交易笔数")
	private Double l33SinmoTrade50less = null;
	@Label("近3个月单笔笔数3000-5000元总交易笔数")
	private Double l33SinmoTrade5kless = null;
	@Label("近3个月单笔金额50-100元总消费金额")
	private Double l33sinmo100less = null;
	@Label("近3个月单笔金额5000-10000元总消费金额")
	private Double l33sinmo10kless = null;
	@Label("近3个月单笔金额小于10元总消费金额")
	private Double l33sinmo10less = null;
	@Label("近3个月单笔金额500-1000元总消费金额")
	private Double l33sinmo1kless = null;
	@Label("近3个月单笔金额1000-2000元总消费金额")
	private Double l33sinmo2kless = null;
	@Label("近3个月单笔金额2000-3000元总消费金额")
	private Double l33sinmo3kless = null;
	@Label("近3个月单笔金额100-500元总消费金额")
	private Double l33sinmo500less = null;
	@Label("近3个月单笔金额10000-50000元总消费金额")
	private Double l33sinmo50kless = null;
	@Label("近3个月单笔金额50000元以上总消费金额")
	private Double l33sinmo50kmore = null;
	@Label("近3个月单笔金额10-50元总消费金额")
	private Double l33sinmo50less = null;
	@Label("近3个月单笔金额3000-5000元总消费金额")
	private Double l33sinmo5kless = null;
	@Label("近3个月单笔金额50-100元总交易金额")
	private Double l33sinmoTrade100less = null;
	@Label("近3个月单笔金额5000-10000元总交易金额")
	private Double l33sinmoTrade10kless = null;
	@Label("近3个月单笔金额小于10元总交易金额")
	private Double l33sinmoTrade10less = null;
	@Label("近3个月单笔金额500-1000元总交易金额")
	private Double l33sinmoTrade1kless = null;
	@Label("近3个月单笔金额1000-2000元总交易金额")
	private Double l33sinmoTrade2kless = null;
	@Label("近3个月单笔金额2000-3000元总交易金额")
	private Double l33sinmoTrade3kless = null;
	@Label("近3个月单笔金额100-500元总交易金额")
	private Double l33sinmoTrade500less = null;
	@Label("近3个月单笔金额10000-50000元总交易金额")
	private Double l33sinmoTrade50kless = null;
	@Label("近3个月单笔金额50000元以上总交易金额")
	private Double l33sinmoTrade50kmore = null;
	@Label("近3个月单笔金额10-50元总交易金额")
	private Double l33sinmoTrade50less = null;
	@Label("近3个月单笔金额3000-5000元总交易金额")
	private Double l33sinmoTrade5kless = null;
	@Label("工资额变化l3_mean_salary-l6_mean_salary")
	private Double l36DiffSalary = null;
	@Label("近3个月消费天数")
	private Double l3ComsumDays = null;
	@Label("过去第3个月消费金额")
	private Double l3Consum = null;
	@Label("过去第3个月消费天数")
	private Double l3ConsumMonday = null;
	@Label("近3月发生消费的月份数")
	private Double l3ConsumMonths = null;
	@Label("近3月笔均消费金额")
	private Double l3ConsumTimeMoney = null;
	@Label("近3月消费笔数")
	private Double l3ConsumTimes = null;
	@Label("近3个月平均消费金额")
	private Double l3MeanConsum = null;
	@Label("近3个月平均工资额")
	private Double l3MeanSalary = null;
	@Label("近3个月平均交易金额")
	private Double l3MeanTradesum = null;
	@Label("近3月月均消费笔数")
	private Integer l3MonavgConsumTimes = null;
	@Label("近3月月均交易笔数")
	private Double l3MonavgTradesumTimes = null;
	@Label("过去第3个月消费笔数")
	private Integer l3MonthConsumTimes = null;
	@Label("过去第3个月交易笔数")
	private Double l3MonthTradesumTimes = null;
	@Label("近3个月消费金额")
	private Double l3MsumComsum = null;
	@Label("近3个月交易金额")
	private Double l3MsumTradesum = null;
	@Label("近3个月无工资月份数")
	private Integer l3NoSalaryMonthCt = null;
	@Label("过去第3个月工资额")
	private Double l3Salary = null;
	@Label("过去第3个月交易金额")
	private Double l3Tradesum = null;
	@Label("近3个月交易天数")
	private Double l3TradesumDays = null;
	@Label("过去第3个月交易天数")
	private Double l3TradesumMonday = null;
	@Label("近3月发生交易的月份数")
	private Double l3TradesumMonths = null;
	@Label("近3月笔均交易金额")
	private Double l3TradesumTimeMoney = null;
	@Label("近3月交易笔数")
	private Double l3TradesumTimes = null;
	@Label("过去第4个月消费金额")
	private Double l4Consum = null;
	@Label("过去第4个月消费天数")
	private Double l4ConsumMonday = null;
	@Label("过去第4个月消费笔数")
	private Integer l4MonthConsumTimes = null;
	@Label("过去第4个月交易笔数")
	private Double l4MonthTradesumTimes = null;
	@Label("过去第4个月工资额")
	private Double l4Salary = null;
	@Label("过去第4个月交易金额")
	private Double l4Tradesum = null;
	@Label("过去第4个月交易天数")
	private Double l4TradesumMonday = null;
	@Label("过去第5个月消费金额")
	private Double l5Consum = null;
	@Label("过去第5个月消费天数")
	private Double l5ConsumMonday = null;
	@Label("过去第5个月消费笔数")
	private Integer l5MonthConsumTimes = null;
	@Label("过去第5个月交易笔数")
	private Double l5MonthTradesumTimes = null;
	@Label("过去第5个月工资额")
	private Double l5Salary = null;
	@Label("过去第5个月交易金额")
	private Double l5Tradesum = null;
	@Label("过去第5个月交易天数")
	private Double l5TradesumMonday = null;
	@Label("近6个月单笔笔数50-100元总消费笔数")
	private Double l66Sinmo100less = null;
	@Label("近6个月单笔笔数5000-10000元总消费笔数")
	private Double l66Sinmo10kless = null;
	@Label("近6个月单笔笔数小于10元总消费笔数")
	private Double l66Sinmo10less = null;
	@Label("近6个月单笔笔数500-1000元总消费笔数")
	private Double l66Sinmo1kless = null;
	@Label("近6个月单笔笔数1000-2000元总消费笔数")
	private Double l66Sinmo2kless = null;
	@Label("近6个月单笔笔数2000-3000元总消费笔数")
	private Double l66Sinmo3kless = null;
	@Label("近6个月单笔笔数100-500元总消费笔数")
	private Double l66Sinmo500less = null;
	@Label("近6个月单笔笔数10000-50000元总消费笔数")
	private Double l66Sinmo50kless = null;
	@Label("近6个月单笔笔数50000元以上总消费笔数")
	private Double l66Sinmo50kmore = null;
	@Label("近6个月单笔笔数10-50元总消费笔数")
	private Double l66Sinmo50less = null;
	@Label("近6个月单笔笔数3000-5000元总消费笔数")
	private Double l66Sinmo5kless = null;
	@Label("近6个月单笔笔数50-100元总交易笔数")
	private Double l66SinmoTrade100less = null;
	@Label("近6个月单笔笔数5000-10000元总交易笔数")
	private Double l66SinmoTrade10kless = null;
	@Label("近6个月单笔笔数小于10元总交易笔数")
	private Double l66SinmoTrade10less = null;
	@Label("近6个月单笔笔数500-1000元总交易笔数")
	private Double l66SinmoTrade1kless = null;
	@Label("近6个月单笔笔数1000-2000元总交易笔数")
	private Double l66SinmoTrade2kless = null;
	@Label("近6个月单笔笔数2000-3000元总交易笔数")
	private Double l66SinmoTrade3kless = null;
	@Label("近6个月单笔笔数100-500元总交易笔数")
	private Double l66SinmoTrade500less = null;
	@Label("近6个月单笔笔数10000-50000元总交易笔数")
	private Double l66SinmoTrade50kless = null;
	@Label("近6个月单笔笔数50000元以上总交易笔数")
	private Double l66SinmoTrade50kmore = null;
	@Label("近6个月单笔笔数10-50元总交易笔数")
	private Double l66SinmoTrade50less = null;
	@Label("近6个月单笔笔数3000-5000元总交易笔数")
	private Double l66SinmoTrade5kless = null;
	@Label("近6个月单笔金额50-100元总消费金额")
	private Double l66sinmo100less = null;
	@Label("近6个月单笔金额5000-10000元总消费金额")
	private Double l66sinmo10kless = null;
	@Label("近6个月单笔金额小于10元总消费金额")
	private Double l66sinmo10less = null;
	@Label("近6个月单笔金额500-1000元总消费金额")
	private Double l66sinmo1kless = null;
	@Label("近6个月单笔金额1000-2000元总消费金额")
	private Double l66sinmo2kless = null;
	@Label("近6个月单笔金额2000-3000元总消费金额")
	private Double l66sinmo3kless = null;
	@Label("近6个月单笔金额100-500元总消费金额")
	private Double l66sinmo500less = null;
	@Label("近6个月单笔金额10000-50000元总消费金额")
	private Double l66sinmo50kless = null;
	@Label("近6个月单笔金额50000元以上总消费金额")
	private Double l66sinmo50kmore = null;
	@Label("近6个月单笔金额10-50元总消费金额")
	private Double l66sinmo50less = null;
	@Label("近6个月单笔金额3000-5000元总消费金额")
	private Double l66sinmo5kless = null;
	@Label("近6个月单笔金额50-100元总交易金额")
	private Double l66sinmoTrade100less = null;
	@Label("近6个月单笔金额5000-10000元总交易金额")
	private Double l66sinmoTrade10kless = null;
	@Label("近6个月单笔金额小于10元总交易金额")
	private Double l66sinmoTrade10less = null;
	@Label("近6个月单笔金额500-1000元总交易金额")
	private Double l66sinmoTrade1kless = null;
	@Label("近6个月单笔金额1000-2000元总交易金额")
	private Double l66sinmoTrade2kless = null;
	@Label("近6个月单笔金额2000-3000元总交易金额")
	private Double l66sinmoTrade3kless = null;
	@Label("近6个月单笔金额100-500元总交易金额")
	private Double l66sinmoTrade500less = null;
	@Label("近6个月单笔金额10000-50000元总交易金额")
	private Double l66sinmoTrade50kless = null;
	@Label("近6个月单笔金额50000元以上总交易金额")
	private Double l66sinmoTrade50kmore = null;
	@Label("近6个月单笔金额10-50元总交易金额")
	private Double l66sinmoTrade50less = null;
	@Label("近6个月单笔金额3000-5000元总交易金额")
	private Double l66sinmoTrade5kless = null;
	@Label("近6个月消费天数")
	private Double l6ComsumDays = null;
	@Label("过去第6个月消费金额")
	private Double l6Consum = null;
	@Label("过去第6个月消费天数")
	private Double l6ConsumMonday = null;
	@Label("近6月发生消费的月份数")
	private Double l6ConsumMonths = null;
	@Label("近6月笔均消费金额")
	private Double l6ConsumTimeMoney = null;
	@Label("近6月消费笔数")
	private Integer l6ConsumTimes = null;
	@Label("近6个月最大单日累计消费金额")
	private Double l6MaxDailyAmount = null;
	@Label("近6个月最大单日累计消费笔数")
	private Double l6MaxDailyBillCt = null;
	@Label("近6个月平均消费金额")
	private Double l6MeanConsum = null;
	@Label("近6个月平均工资额")
	private Double l6MeanSalary = null;
	@Label("近6个月平均交易金额")
	private Double l6MeanTradesum = null;
	@Label("近6月月均消费笔数")
	private Integer l6MonavgConsumTimes = null;
	@Label("近6月月均交易笔数")
	private Double l6MonavgTradesumTimes = null;
	@Label("过去第6个月消费笔数")
	private Integer l6MonthConsumTimes = null;
	@Label("过去第6个月交易笔数")
	private Double l6MonthTradesumTimes = null;
	@Label("近6个月消费金额")
	private Double l6MsumComsum = null;
	@Label("近6个月交易金额")
	private Double l6MsumTradesum = null;
	@Label("近6个月无工资月份数")
	private Integer l6NoSalaryMonthCt = null;
	@Label("过去第6个月工资额")
	private Double l6Salary = null;
	@Label("过去第6个月交易金额")
	private Double l6Tradesum = null;
	@Label("近6个月交易天数")
	private Double l6TradesumDays = null;
	@Label("过去第6个月交易天数")
	private Double l6TradesumMonday = null;
	@Label("近6月发生交易的月份数")
	private Double l6TradesumMonths = null;
	@Label("近6月笔均交易金额")
	private Double l6TradesumTimeMoney = null;
	@Label("近6月交易笔数")
	private Double l6TradesumTimes = null;
	@Label("过去第7个月消费金额")
	private Double l7Consum = null;
	@Label("过去第7个月消费天数")
	private Double l7ConsumMonday = null;
	@Label("过去第7个月消费笔数")
	private Integer l7MonthConsumTimes = null;
	@Label("过去第7个月交易笔数")
	private Double l7MonthTradesumTimes = null;
	@Label("过去第7个月工资额")
	private Double l7Salary = null;
	@Label("过去第7个月交易金额")
	private Double l7Tradesum = null;
	@Label("过去第7个月交易天数")
	private Double l7TradesumMonday = null;
	@Label("过去第8个月消费金额")
	private Double l8Consum = null;
	@Label("过去第8个月消费天数")
	private Double l8ConsumMonday = null;
	@Label("过去第8个月消费笔数")
	private Integer l8MonthConsumTimes = null;
	@Label("过去第8个月交易笔数")
	private Double l8MonthTradesumTimes = null;
	@Label("过去第8个月工资额")
	private Double l8Salary = null;
	@Label("过去第8个月交易金额")
	private Double l8Tradesum = null;
	@Label("过去第8个月交易天数")
	private Double l8TradesumMonday = null;
	@Label("过去第9个月消费金额")
	private Double l9Consum = null;
	@Label("过去第9个月消费天数")
	private Double l9ConsumMonday = null;
	@Label("过去第9个月消费笔数")
	private Integer l9MonthConsumTimes = null;
	@Label("过去第9个月交易笔数")
	private Double l9MonthTradesumTimes = null;
	@Label("过去第9个月工资额")
	private Double l9Salary = null;
	@Label("过去第9个月交易金额")
	private Double l9Tradesum = null;
	@Label("过去第9个月交易天数")
	private Double l9TradesumMonday = null;
	@Label("过去第10个月消费金额环比增长")
	private Double m10LinkraConsumeAdd = null;
	@Label("过去第10个月消费笔数环比增长")
	private Double m10LinkraTimeconsuAdd = null;
	@Label("过去第10个月交易金额环比增长")
	private Double m10LinkraTradeAdd = null;
	@Label("过去第10个月交易笔数环比增长")
	private Double m10LinkraTradeTimeconsuAdd = null;
	@Label("过去第11个月消费金额环比增长")
	private Double m11LinkraConsumeAdd = null;
	@Label("过去第11个月消费笔数环比增长")
	private Double m11LinkraTimeconsuAdd = null;
	@Label("过去第11个月交易金额环比增长")
	private Double m11LinkraTradeAdd = null;
	@Label("过去第11个月交易笔数环比增长")
	private Double m11LinkraTradeTimeconsuAdd = null;
	@Label("近12个月月均消费金额占收入比")
	private Double m12ConsuSalaRet = null;
	@Label("近12个月消费金额在(200,5000]间的消费金额占比")
	private Double m12Payment2005klessRetMoney = null;
	@Label("近12个月消费金额在(200,5000]间的消费笔数占比")
	private Double m12Payment2005klessRetTime = null;
	@Label("近12个月消费金额在(200,5000]间的消费金额")
	private Double m12Payment2005klessmoney = null;
	@Label("近12个月消费金额在(200,5000]间的消费笔数")
	private Double m12Payment2005klesstime = null;
	@Label("近12个月消费金额在(0,200]间的消费金额占比")
	private Double m12Payment200lessRetMoney = null;
	@Label("近12个月消费金额在(0,200]间的消费笔数占比")
	private Double m12Payment200lessRetTime = null;
	@Label("近12个月消费金额在(0,200]间的消费金额")
	private Double m12Payment200lessmoney = null;
	@Label("近12个月消费金额在(0,200]间的消费笔数")
	private Double m12Payment200lesstime = null;
	@Label("近12个月单笔金额大于等于3000元的消费金额")
	private Double m12Payment3klessmoney = null;
	@Label("近12个月单笔金额大于等于3000元的消费笔数")
	private Double m12Payment3klesstime = null;
	@Label("近12个月消费金额在(5000,+)间的消费金额占比")
	private Double m12Payment5kmoreRetMoney = null;
	@Label("近12个月消费金额在(5000,+)间的消费笔数占比")
	private Double m12Payment5kmoreRetTime = null;
	@Label("近12个月消费金额在(5000,+)间的消费金额")
	private Double m12Payment5kmoremoney = null;
	@Label("近12个月消费金额在(5000,+)间的消费笔数")
	private Double m12Payment5kmoretime = null;
	@Label("近12个月交易金额在(200,5000]间的交易金额占比")
	private Double m12PaymentTrade2005klessRetMoney = null;
	@Label("近12个月交易金额在(200,5000]间的交易笔数占比")
	private Double m12PaymentTrade2005klessRetTime = null;
	@Label("近12个月交易金额在(200,5000]间的交易金额")
	private Double m12PaymentTrade2005klessmoney = null;
	@Label("近12个月交易金额在(200,5000]间的交易笔数")
	private Double m12PaymentTrade2005klesstime = null;
	@Label("近12个月交易金额在(0,200]间的交易金额占比")
	private Double m12PaymentTrade200lessRetMoney = null;
	@Label("近12个月交易金额在(0,200]间的交易笔数占比")
	private Double m12PaymentTrade200lessRetTime = null;
	@Label("近12个月交易金额在(0,200]间的交易金额")
	private Double m12PaymentTrade200lessmoney = null;
	@Label("近12个月交易金额在(0,200]间的交易笔数")
	private Double m12PaymentTrade200lesstime = null;
	@Label("近12个月单笔金额大于等于3000元的交易金额")
	private Double m12PaymentTrade3klessmoney = null;
	@Label("近12个月单笔金额大于等于3000元的交易笔数")
	private Double m12PaymentTrade3klesstime = null;
	@Label("近12个月交易金额在(5000,+)间的交易金额占比")
	private Double m12PaymentTrade5kmoreRetMoney = null;
	@Label("近12个月交易金额在(5000,+)间的交易笔数占比")
	private Double m12PaymentTrade5kmoreRetTime = null;
	@Label("近12个月交易金额在(5000,+)间的交易金额")
	private Double m12PaymentTrade5kmoremoney = null;
	@Label("近12个月交易金额在(5000,+)间的交易笔数")
	private Double m12PaymentTrade5kmoretime = null;
	@Label("近1个月月均消费金额占收入比")
	private Double m1ConsuSalaRet = null;
	@Label("近一月消费金额环比增长")
	private Double m1LinkraConsumeAdd = null;
	@Label("近一月消费笔数环比增长")
	private Double m1LinkraTimeconsuAdd = null;
	@Label("近一月交易金额环比增长                            ")
	private Double m1LinkraTradeAdd = null;
	@Label("近一月交易笔数环比增长")
	private Double m1LinkraTradeTimeconsuAdd = null;
	@Label("近1个月消费金额在(200,5000]间的消费金额")
	private Double m1Payment2005klessmoney = null;
	@Label("近1个月消费金额在(200,5000]间的消费笔数")
	private Double m1Payment2005klesstime = null;
	@Label("近1个月消费金额在(0,200]间的消费金额")
	private Double m1Payment200lessmoney = null;
	@Label("近1个月消费金额在(0,200]间的消费笔数")
	private Double m1Payment200lesstime = null;
	@Label("近1个月单笔金额大于等于3000元的消费金额")
	private Double m1Payment3klessmoney = null;
	@Label("近1个月单笔金额大于等于3000元的消费笔数")
	private Double m1Payment3klesstime = null;
	@Label("近1个月消费金额在(5000,+)间的消费金额")
	private Double m1Payment5kmoremoney = null;
	@Label("近1个月消费金额在(5000,+)间的消费笔数")
	private Double m1Payment5kmoretime = null;
	@Label("近1个月交易金额在(200,5000]间的交易金额")
	private Double m1PaymentTrade2005klessmoney = null;
	@Label("近1个月交易金额在(200,5000]间的交易笔数")
	private Double m1PaymentTrade2005klesstime = null;
	@Label("近1个月交易金额在(0,200]间的交易金额")
	private Double m1PaymentTrade200lessmoney = null;
	@Label("近1个月交易金额在(0,200]间的交易笔数")
	private Double m1PaymentTrade200lesstime = null;
	@Label("近1个月单笔金额大于等于3000元的交易金额")
	private Double m1PaymentTrade3klessmoney = null;
	@Label("近1个月单笔金额大于等于3000元的交易笔数")
	private Double m1PaymentTrade3klesstime = null;
	@Label("近1个月交易金额在(5000,+)间的交易金额")
	private Double m1PaymentTrade5kmoremoney = null;
	@Label("近1个月交易金额在(5000,+)间的交易笔数")
	private Double m1PaymentTrade5kmoretime = null;
	@Label("过去第2个月消费金额环比增长")
	private Double m2LinkraConsumeAdd = null;
	@Label("过去第2个月消费笔数环比增长")
	private Double m2LinkraTimeconsuAdd = null;
	@Label("过去第2个月交易金额环比增长")
	private Double m2LinkraTradeAdd = null;
	@Label("过去第2个月交易笔数环比增长")
	private Double m2LinkraTradeTimeconsuAdd = null;
	@Label("近3个月月均消费金额占收入比")
	private Double m3ConsuSalaRet = null;
	@Label("过去第3个月消费金额环比增长")
	private Double m3LinkraConsumeAdd = null;
	@Label("过去第3个月消费笔数环比增长")
	private Double m3LinkraTimeconsuAdd = null;
	@Label("过去第3个月交易金额环比增长")
	private Double m3LinkraTradeAdd = null;
	@Label("过去第3个月交易笔数环比增长")
	private Double m3LinkraTradeTimeconsuAdd = null;
	@Label("近3个月消费金额在(200,5000]间的消费金额占比")
	private Double m3Payment2005klessRetMoney = null;
	@Label("近3个月消费金额在(200,5000]间的消费笔数占比")
	private Double m3Payment2005klessRetTime = null;
	@Label("近3个月消费金额在(200,5000]间的消费金额")
	private Double m3Payment2005klessmoney = null;
	@Label("近3个月消费金额在(200,5000]间的消费笔数")
	private Double m3Payment2005klesstime = null;
	@Label("近3个月消费金额在(0,200]间的消费金额占比")
	private Double m3Payment200lessRetMoney = null;
	@Label("近3个月消费金额在(0,200]间的消费笔数占比")
	private Double m3Payment200lessRetTime = null;
	@Label("近3个月消费金额在(0,200]间的消费金额")
	private Double m3Payment200lessmoney = null;
	@Label("近3个月消费金额在(0,200]间的消费笔数")
	private Double m3Payment200lesstime = null;
	@Label("近3个月单笔金额大于等于3000元的消费金额")
	private Double m3Payment3klessmoney = null;
	@Label("近3个月单笔金额大于等于3000元的消费笔数")
	private Double m3Payment3klesstime = null;
	@Label("近3个月消费金额在(5000,+)间的消费金额占比")
	private Double m3Payment5kmoreRetMoney = null;
	@Label("近3个月消费金额在(5000,+)间的消费笔数占比")
	private Double m3Payment5kmoreRetTime = null;
	@Label("近3个月消费金额在(5000,+)间的消费金额")
	private Double m3Payment5kmoremoney = null;
	@Label("近3个月消费金额在(5000,+)间的消费笔数")
	private Double m3Payment5kmoretime = null;
	@Label("近3个月交易金额在(200,5000]间的交易金额占比")
	private Double m3PaymentTrade2005klessRetMoney = null;
	@Label("近3个月交易金额在(200,5000]间的交易笔数占比")
	private Double m3PaymentTrade2005klessRetTime = null;
	@Label("近3个月交易金额在(200,5000]间的交易金额")
	private Double m3PaymentTrade2005klessmoney = null;
	@Label("近3个月交易金额在(200,5000]间的交易笔数")
	private Double m3PaymentTrade2005klesstime = null;
	@Label("近3个月交易金额在(0,200]间的交易金额占比")
	private Double m3PaymentTrade200lessRetMoney = null;
	@Label("近3个月交易金额在(0,200]间的交易笔数占比")
	private Double m3PaymentTrade200lessRetTime = null;
	@Label("近3个月交易金额在(0,200]间的交易金额")
	private Double m3PaymentTrade200lessmoney = null;
	@Label("近3个月交易金额在(0,200]间的交易笔数")
	private Double m3PaymentTrade200lesstime = null;
	@Label("近3个月单笔金额大于等于3000元的交易金额")
	private Double m3PaymentTrade3klessmoney = null;
	@Label("近3个月单笔金额大于等于3000元的交易笔数")
	private Double m3PaymentTrade3klesstime = null;
	@Label("近3个月交易金额在(5000,+)间的交易金额占比")
	private Double m3PaymentTrade5kmoreRetMoney = null;
	@Label("近3个月交易金额在(5000,+)间的交易笔数占比")
	private Double m3PaymentTrade5kmoreRetTime = null;
	@Label("近3个月交易金额在(5000,+)间的交易金额")
	private Double m3PaymentTrade5kmoremoney = null;
	@Label("近3个月交易金额在(5000,+)间的交易笔数")
	private Double m3PaymentTrade5kmoretime = null;
	@Label("过去第4个月消费金额环比增长")
	private Double m4LinkraConsumeAdd = null;
	@Label("过去第4个月消费笔数环比增长")
	private Double m4LinkraTimeconsuAdd = null;
	@Label("过去第4个月交易金额环比增长")
	private Double m4LinkraTradeAdd = null;
	@Label("过去第4个月交易笔数环比增长")
	private Double m4LinkraTradeTimeconsuAdd = null;
	@Label("过去第5个月消费金额环比增长")
	private Double m5LinkraConsumeAdd = null;
	@Label("过去第5个月消费笔数环比增长")
	private Double m5LinkraTimeconsuAdd = null;
	@Label("过去第5个月交易金额环比增长")
	private Double m5LinkraTradeAdd = null;
	@Label("过去第5个月交易笔数环比增长")
	private Double m5LinkraTradeTimeconsuAdd = null;
	@Label("近6个月月均消费金额占收入比")
	private Double m6ConsuSalaRet = null;
	@Label("过去第6个月消费金额环比增长")
	private Double m6LinkraConsumeAdd = null;
	@Label("过去第6个月消费笔数环比增长")
	private Double m6LinkraTimeconsuAdd = null;
	@Label("过去第6个月交易金额环比增长")
	private Double m6LinkraTradeAdd = null;
	@Label("过去第6个月交易笔数环比增长")
	private Double m6LinkraTradeTimeconsuAdd = null;
	@Label("近6个月消费金额在(200,5000]间的消费金额占比")
	private Double m6Payment2005klessRetMoney = null;
	@Label("近6个月消费金额在(200,5000]间的消费笔数占比")
	private Double m6Payment2005klessRetTime = null;
	@Label("近6个月消费金额在(200,5000]间的消费金额")
	private Double m6Payment2005klessmoney = null;
	@Label("近6个月消费金额在(200,5000]间的消费笔数")
	private Double m6Payment2005klesstime = null;
	@Label("近6个月消费金额在(0,200]间的消费金额占比")
	private Double m6Payment200lessRetMoney = null;
	@Label("近6个月消费金额在(0,200]间的消费笔数占比")
	private Double m6Payment200lessRetTime = null;
	@Label("近6个月消费金额在(0,200]间的消费金额")
	private Double m6Payment200lessmoney = null;
	@Label("近6个月消费金额在(0,200]间的消费笔数")
	private Double m6Payment200lesstime = null;
	@Label("近6个月单笔金额大于等于3000元的消费金额")
	private Double m6Payment3klessmoney = null;
	@Label("近6个月单笔金额大于等于3000元的消费笔数")
	private Double m6Payment3klesstime = null;
	@Label("近6个月消费金额在(5000,+)间的消费金额占比")
	private Double m6Payment5kmoreRetMoney = null;
	@Label("近6个月消费金额在(5000,+)间的消费笔数占比")
	private Double m6Payment5kmoreRetTime = null;
	@Label("近6个月消费金额在(5000,+)间的消费金额")
	private Double m6Payment5kmoremoney = null;
	@Label("近6个月消费金额在(5000,+)间的消费笔数")
	private Double m6Payment5kmoretime = null;
	@Label("近6个月交易金额在(200,5000]间的交易金额占比")
	private Double m6PaymentTrade2005klessRetMoney = null;
	@Label("近6个月交易金额在(200,5000]间的交易笔数占比")
	private Double m6PaymentTrade2005klessRetTime = null;
	@Label("近6个月交易金额在(200,5000]间的交易金额")
	private Double m6PaymentTrade2005klessmoney = null;
	@Label("近6个月交易金额在(200,5000]间的交易笔数")
	private Double m6PaymentTrade2005klesstime = null;
	@Label("近6个月交易金额在(0,200]间的交易金额占比")
	private Double m6PaymentTrade200lessRetMoney = null;
	@Label("近6个月交易金额在(0,200]间的交易笔数占比")
	private Double m6PaymentTrade200lessRetTime = null;
	@Label("近6个月交易金额在(0,200]间的交易金额")
	private Double m6PaymentTrade200lessmoney = null;
	@Label("近6个月交易金额在(0,200]间的交易笔数")
	private Double m6PaymentTrade200lesstime = null;
	@Label("近6个月单笔金额大于等于3000元的交易金额")
	private Double m6PaymentTrade3klessmoney = null;
	@Label("近6个月单笔金额大于等于3000元的交易笔数")
	private Double m6PaymentTrade3klesstime = null;
	@Label("近6个月交易金额在(5000,+)间的交易金额占比")
	private Double m6PaymentTrade5kmoreRetMoney = null;
	@Label("近6个月交易金额在(5000,+)间的交易笔数占比")
	private Double m6PaymentTrade5kmoreRetTime = null;
	@Label("近6个月交易金额在(5000,+)间的交易金额")
	private Double m6PaymentTrade5kmoremoney = null;
	@Label("近6个月交易金额在(5000,+)间的交易笔数")
	private Double m6PaymentTrade5kmoretime = null;
	@Label("过去第7个月消费金额环比增长")
	private Double m7LinkraConsumeAdd = null;
	@Label("过去第7个月消费笔数环比增长")
	private Double m7LinkraTimeconsuAdd = null;
	@Label("过去第7个月交易金额环比增长")
	private Double m7LinkraTradeAdd = null;
	@Label("过去第7个月交易笔数环比增长")
	private Double m7LinkraTradeTimeconsuAdd = null;
	@Label("过去第8个月消费金额环比增长")
	private Double m8LinkraConsumeAdd = null;
	@Label("过去第8个月消费笔数环比增长")
	private Double m8LinkraTimeconsuAdd = null;
	@Label("过去第8个月交易金额环比增长")
	private Double m8LinkraTradeAdd = null;
	@Label("过去第8个月交易笔数环比增长")
	private Double m8LinkraTradeTimeconsuAdd = null;
	@Label("过去第9个月消费金额环比增长")
	private Double m9LinkraConsumeAdd = null;
	@Label("过去第9个月消费笔数环比增长")
	private Double m9LinkraTimeconsuAdd = null;
	@Label("过去第9个月交易金额环比增长")
	private Double m9LinkraTradeAdd = null;
	@Label("过去第9个月交易笔数环比增长")
	private Double m9LinkraTradeTimeconsuAdd = null;
	@Label("订单id")
	private Integer serialId = null;
	@Label("用户id")
	private Integer userId = null;

	//****************************************************************************
	//accessors
	//****************************************************************************
	public Short getCardFlag()
	{
		return this.cardFlag;
	}
	public void setCardFlag(Short cardFlag)
	{
		this.cardFlag = cardFlag;
	}
	public String getCardNo()
	{
		return this.cardNo;
	}
	public void setCardNo(String cardNo)
	{
		this.cardNo = cardNo;
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
	public Double getL10Consum()
	{
		return this.l10Consum;
	}
	public void setL10Consum(Double l10Consum)
	{
		this.l10Consum = l10Consum;
	}
	public Double getL10ConsumMonday()
	{
		return this.l10ConsumMonday;
	}
	public void setL10ConsumMonday(Double l10ConsumMonday)
	{
		this.l10ConsumMonday = l10ConsumMonday;
	}
	public Integer getL10MonthConsumTimes()
	{
		return this.l10MonthConsumTimes;
	}
	public void setL10MonthConsumTimes(Integer l10MonthConsumTimes)
	{
		this.l10MonthConsumTimes = l10MonthConsumTimes;
	}
	public Double getL10MonthTradesumTimes()
	{
		return this.l10MonthTradesumTimes;
	}
	public void setL10MonthTradesumTimes(Double l10MonthTradesumTimes)
	{
		this.l10MonthTradesumTimes = l10MonthTradesumTimes;
	}
	public Double getL10Salary()
	{
		return this.l10Salary;
	}
	public void setL10Salary(Double l10Salary)
	{
		this.l10Salary = l10Salary;
	}
	public Double getL10Tradesum()
	{
		return this.l10Tradesum;
	}
	public void setL10Tradesum(Double l10Tradesum)
	{
		this.l10Tradesum = l10Tradesum;
	}
	public Double getL10TradesumMonday()
	{
		return this.l10TradesumMonday;
	}
	public void setL10TradesumMonday(Double l10TradesumMonday)
	{
		this.l10TradesumMonday = l10TradesumMonday;
	}
	public Double getL11Consum()
	{
		return this.l11Consum;
	}
	public void setL11Consum(Double l11Consum)
	{
		this.l11Consum = l11Consum;
	}
	public Double getL11ConsumMonday()
	{
		return this.l11ConsumMonday;
	}
	public void setL11ConsumMonday(Double l11ConsumMonday)
	{
		this.l11ConsumMonday = l11ConsumMonday;
	}
	public Integer getL11MonthConsumTimes()
	{
		return this.l11MonthConsumTimes;
	}
	public void setL11MonthConsumTimes(Integer l11MonthConsumTimes)
	{
		this.l11MonthConsumTimes = l11MonthConsumTimes;
	}
	public Double getL11MonthTradesumTimes()
	{
		return this.l11MonthTradesumTimes;
	}
	public void setL11MonthTradesumTimes(Double l11MonthTradesumTimes)
	{
		this.l11MonthTradesumTimes = l11MonthTradesumTimes;
	}
	public Double getL11Salary()
	{
		return this.l11Salary;
	}
	public void setL11Salary(Double l11Salary)
	{
		this.l11Salary = l11Salary;
	}
	public Double getL11Tradesum()
	{
		return this.l11Tradesum;
	}
	public void setL11Tradesum(Double l11Tradesum)
	{
		this.l11Tradesum = l11Tradesum;
	}
	public Double getL11TradesumMonday()
	{
		return this.l11TradesumMonday;
	}
	public void setL11TradesumMonday(Double l11TradesumMonday)
	{
		this.l11TradesumMonday = l11TradesumMonday;
	}
	public Double getL12ComsumDays()
	{
		return this.l12ComsumDays;
	}
	public void setL12ComsumDays(Double l12ComsumDays)
	{
		this.l12ComsumDays = l12ComsumDays;
	}
	public Double getL12Consum()
	{
		return this.l12Consum;
	}
	public void setL12Consum(Double l12Consum)
	{
		this.l12Consum = l12Consum;
	}
	public Double getL12ConsumMonday()
	{
		return this.l12ConsumMonday;
	}
	public void setL12ConsumMonday(Double l12ConsumMonday)
	{
		this.l12ConsumMonday = l12ConsumMonday;
	}
	public Double getL12ConsumMonths()
	{
		return this.l12ConsumMonths;
	}
	public void setL12ConsumMonths(Double l12ConsumMonths)
	{
		this.l12ConsumMonths = l12ConsumMonths;
	}
	public Double getL12ConsumTimeMoney()
	{
		return this.l12ConsumTimeMoney;
	}
	public void setL12ConsumTimeMoney(Double l12ConsumTimeMoney)
	{
		this.l12ConsumTimeMoney = l12ConsumTimeMoney;
	}
	public Integer getL12ConsumTimes()
	{
		return this.l12ConsumTimes;
	}
	public void setL12ConsumTimes(Integer l12ConsumTimes)
	{
		this.l12ConsumTimes = l12ConsumTimes;
	}
	public Double getL12MaxDailyAmount()
	{
		return this.l12MaxDailyAmount;
	}
	public void setL12MaxDailyAmount(Double l12MaxDailyAmount)
	{
		this.l12MaxDailyAmount = l12MaxDailyAmount;
	}
	public Double getL12MaxDailyBillCt()
	{
		return this.l12MaxDailyBillCt;
	}
	public void setL12MaxDailyBillCt(Double l12MaxDailyBillCt)
	{
		this.l12MaxDailyBillCt = l12MaxDailyBillCt;
	}
	public Double getL12MeanConsum()
	{
		return this.l12MeanConsum;
	}
	public void setL12MeanConsum(Double l12MeanConsum)
	{
		this.l12MeanConsum = l12MeanConsum;
	}
	public Double getL12MeanSalary()
	{
		return this.l12MeanSalary;
	}
	public void setL12MeanSalary(Double l12MeanSalary)
	{
		this.l12MeanSalary = l12MeanSalary;
	}
	public Double getL12MeanTradesum()
	{
		return this.l12MeanTradesum;
	}
	public void setL12MeanTradesum(Double l12MeanTradesum)
	{
		this.l12MeanTradesum = l12MeanTradesum;
	}
	public Integer getL12MonavgConsumTimes()
	{
		return this.l12MonavgConsumTimes;
	}
	public void setL12MonavgConsumTimes(Integer l12MonavgConsumTimes)
	{
		this.l12MonavgConsumTimes = l12MonavgConsumTimes;
	}
	public Double getL12MonavgTradesumTimes()
	{
		return this.l12MonavgTradesumTimes;
	}
	public void setL12MonavgTradesumTimes(Double l12MonavgTradesumTimes)
	{
		this.l12MonavgTradesumTimes = l12MonavgTradesumTimes;
	}
	public Integer getL12MonthConsumTimes()
	{
		return this.l12MonthConsumTimes;
	}
	public void setL12MonthConsumTimes(Integer l12MonthConsumTimes)
	{
		this.l12MonthConsumTimes = l12MonthConsumTimes;
	}
	public Double getL12MonthTradesumTimes()
	{
		return this.l12MonthTradesumTimes;
	}
	public void setL12MonthTradesumTimes(Double l12MonthTradesumTimes)
	{
		this.l12MonthTradesumTimes = l12MonthTradesumTimes;
	}
	public Double getL12MsumComsum()
	{
		return this.l12MsumComsum;
	}
	public void setL12MsumComsum(Double l12MsumComsum)
	{
		this.l12MsumComsum = l12MsumComsum;
	}
	public Double getL12MsumTradesum()
	{
		return this.l12MsumTradesum;
	}
	public void setL12MsumTradesum(Double l12MsumTradesum)
	{
		this.l12MsumTradesum = l12MsumTradesum;
	}
	public Integer getL12NoSalaryMonthCt()
	{
		return this.l12NoSalaryMonthCt;
	}
	public void setL12NoSalaryMonthCt(Integer l12NoSalaryMonthCt)
	{
		this.l12NoSalaryMonthCt = l12NoSalaryMonthCt;
	}
	public Double getL12Salary()
	{
		return this.l12Salary;
	}
	public void setL12Salary(Double l12Salary)
	{
		this.l12Salary = l12Salary;
	}
	public Double getL12Tradesum()
	{
		return this.l12Tradesum;
	}
	public void setL12Tradesum(Double l12Tradesum)
	{
		this.l12Tradesum = l12Tradesum;
	}
	public Double getL12TradesumDays()
	{
		return this.l12TradesumDays;
	}
	public void setL12TradesumDays(Double l12TradesumDays)
	{
		this.l12TradesumDays = l12TradesumDays;
	}
	public Double getL12TradesumMonday()
	{
		return this.l12TradesumMonday;
	}
	public void setL12TradesumMonday(Double l12TradesumMonday)
	{
		this.l12TradesumMonday = l12TradesumMonday;
	}
	public Double getL12TradesumMonths()
	{
		return this.l12TradesumMonths;
	}
	public void setL12TradesumMonths(Double l12TradesumMonths)
	{
		this.l12TradesumMonths = l12TradesumMonths;
	}
	public Double getL12TradesumTimeMoney()
	{
		return this.l12TradesumTimeMoney;
	}
	public void setL12TradesumTimeMoney(Double l12TradesumTimeMoney)
	{
		this.l12TradesumTimeMoney = l12TradesumTimeMoney;
	}
	public Double getL12TradesumTimes()
	{
		return this.l12TradesumTimes;
	}
	public void setL12TradesumTimes(Double l12TradesumTimes)
	{
		this.l12TradesumTimes = l12TradesumTimes;
	}
	public Double getL112DiffSalary()
	{
		return this.l112DiffSalary;
	}
	public void setL112DiffSalary(Double l112DiffSalary)
	{
		this.l112DiffSalary = l112DiffSalary;
	}
	public Double getL11Sinmo100less()
	{
		return this.l11Sinmo100less;
	}
	public void setL11Sinmo100less(Double l11Sinmo100less)
	{
		this.l11Sinmo100less = l11Sinmo100less;
	}
	public Double getL11Sinmo10kless()
	{
		return this.l11Sinmo10kless;
	}
	public void setL11Sinmo10kless(Double l11Sinmo10kless)
	{
		this.l11Sinmo10kless = l11Sinmo10kless;
	}
	public Double getL11Sinmo10less()
	{
		return this.l11Sinmo10less;
	}
	public void setL11Sinmo10less(Double l11Sinmo10less)
	{
		this.l11Sinmo10less = l11Sinmo10less;
	}
	public Double getL11Sinmo1kless()
	{
		return this.l11Sinmo1kless;
	}
	public void setL11Sinmo1kless(Double l11Sinmo1kless)
	{
		this.l11Sinmo1kless = l11Sinmo1kless;
	}
	public Double getL11Sinmo2kless()
	{
		return this.l11Sinmo2kless;
	}
	public void setL11Sinmo2kless(Double l11Sinmo2kless)
	{
		this.l11Sinmo2kless = l11Sinmo2kless;
	}
	public Double getL11Sinmo3kless()
	{
		return this.l11Sinmo3kless;
	}
	public void setL11Sinmo3kless(Double l11Sinmo3kless)
	{
		this.l11Sinmo3kless = l11Sinmo3kless;
	}
	public Double getL11Sinmo500less()
	{
		return this.l11Sinmo500less;
	}
	public void setL11Sinmo500less(Double l11Sinmo500less)
	{
		this.l11Sinmo500less = l11Sinmo500less;
	}
	public Double getL11Sinmo50kless()
	{
		return this.l11Sinmo50kless;
	}
	public void setL11Sinmo50kless(Double l11Sinmo50kless)
	{
		this.l11Sinmo50kless = l11Sinmo50kless;
	}
	public Double getL11Sinmo50kmore()
	{
		return this.l11Sinmo50kmore;
	}
	public void setL11Sinmo50kmore(Double l11Sinmo50kmore)
	{
		this.l11Sinmo50kmore = l11Sinmo50kmore;
	}
	public Double getL11Sinmo50less()
	{
		return this.l11Sinmo50less;
	}
	public void setL11Sinmo50less(Double l11Sinmo50less)
	{
		this.l11Sinmo50less = l11Sinmo50less;
	}
	public Double getL11Sinmo5kless()
	{
		return this.l11Sinmo5kless;
	}
	public void setL11Sinmo5kless(Double l11Sinmo5kless)
	{
		this.l11Sinmo5kless = l11Sinmo5kless;
	}
	public Double getL11SinmoTrade100less()
	{
		return this.l11SinmoTrade100less;
	}
	public void setL11SinmoTrade100less(Double l11SinmoTrade100less)
	{
		this.l11SinmoTrade100less = l11SinmoTrade100less;
	}
	public Double getL11SinmoTrade10kless()
	{
		return this.l11SinmoTrade10kless;
	}
	public void setL11SinmoTrade10kless(Double l11SinmoTrade10kless)
	{
		this.l11SinmoTrade10kless = l11SinmoTrade10kless;
	}
	public Double getL11SinmoTrade10less()
	{
		return this.l11SinmoTrade10less;
	}
	public void setL11SinmoTrade10less(Double l11SinmoTrade10less)
	{
		this.l11SinmoTrade10less = l11SinmoTrade10less;
	}
	public Double getL11SinmoTrade1kless()
	{
		return this.l11SinmoTrade1kless;
	}
	public void setL11SinmoTrade1kless(Double l11SinmoTrade1kless)
	{
		this.l11SinmoTrade1kless = l11SinmoTrade1kless;
	}
	public Double getL11SinmoTrade2kless()
	{
		return this.l11SinmoTrade2kless;
	}
	public void setL11SinmoTrade2kless(Double l11SinmoTrade2kless)
	{
		this.l11SinmoTrade2kless = l11SinmoTrade2kless;
	}
	public Double getL11SinmoTrade3kless()
	{
		return this.l11SinmoTrade3kless;
	}
	public void setL11SinmoTrade3kless(Double l11SinmoTrade3kless)
	{
		this.l11SinmoTrade3kless = l11SinmoTrade3kless;
	}
	public Double getL11SinmoTrade500less()
	{
		return this.l11SinmoTrade500less;
	}
	public void setL11SinmoTrade500less(Double l11SinmoTrade500less)
	{
		this.l11SinmoTrade500less = l11SinmoTrade500less;
	}
	public Double getL11SinmoTrade50kless()
	{
		return this.l11SinmoTrade50kless;
	}
	public void setL11SinmoTrade50kless(Double l11SinmoTrade50kless)
	{
		this.l11SinmoTrade50kless = l11SinmoTrade50kless;
	}
	public Double getL11SinmoTrade50kmore()
	{
		return this.l11SinmoTrade50kmore;
	}
	public void setL11SinmoTrade50kmore(Double l11SinmoTrade50kmore)
	{
		this.l11SinmoTrade50kmore = l11SinmoTrade50kmore;
	}
	public Double getL11SinmoTrade50less()
	{
		return this.l11SinmoTrade50less;
	}
	public void setL11SinmoTrade50less(Double l11SinmoTrade50less)
	{
		this.l11SinmoTrade50less = l11SinmoTrade50less;
	}
	public Double getL11SinmoTrade5kless()
	{
		return this.l11SinmoTrade5kless;
	}
	public void setL11SinmoTrade5kless(Double l11SinmoTrade5kless)
	{
		this.l11SinmoTrade5kless = l11SinmoTrade5kless;
	}
	public Double getL11sinmo100less()
	{
		return this.l11sinmo100less;
	}
	public void setL11sinmo100less(Double l11sinmo100less)
	{
		this.l11sinmo100less = l11sinmo100less;
	}
	public Double getL11sinmo10kless()
	{
		return this.l11sinmo10kless;
	}
	public void setL11sinmo10kless(Double l11sinmo10kless)
	{
		this.l11sinmo10kless = l11sinmo10kless;
	}
	public Double getL11sinmo10less()
	{
		return this.l11sinmo10less;
	}
	public void setL11sinmo10less(Double l11sinmo10less)
	{
		this.l11sinmo10less = l11sinmo10less;
	}
	public Double getL11sinmo1kless()
	{
		return this.l11sinmo1kless;
	}
	public void setL11sinmo1kless(Double l11sinmo1kless)
	{
		this.l11sinmo1kless = l11sinmo1kless;
	}
	public Double getL11sinmo2kless()
	{
		return this.l11sinmo2kless;
	}
	public void setL11sinmo2kless(Double l11sinmo2kless)
	{
		this.l11sinmo2kless = l11sinmo2kless;
	}
	public Double getL11sinmo3kless()
	{
		return this.l11sinmo3kless;
	}
	public void setL11sinmo3kless(Double l11sinmo3kless)
	{
		this.l11sinmo3kless = l11sinmo3kless;
	}
	public Double getL11sinmo500less()
	{
		return this.l11sinmo500less;
	}
	public void setL11sinmo500less(Double l11sinmo500less)
	{
		this.l11sinmo500less = l11sinmo500less;
	}
	public Double getL11sinmo50kless()
	{
		return this.l11sinmo50kless;
	}
	public void setL11sinmo50kless(Double l11sinmo50kless)
	{
		this.l11sinmo50kless = l11sinmo50kless;
	}
	public Double getL11sinmo50kmore()
	{
		return this.l11sinmo50kmore;
	}
	public void setL11sinmo50kmore(Double l11sinmo50kmore)
	{
		this.l11sinmo50kmore = l11sinmo50kmore;
	}
	public Double getL11sinmo50less()
	{
		return this.l11sinmo50less;
	}
	public void setL11sinmo50less(Double l11sinmo50less)
	{
		this.l11sinmo50less = l11sinmo50less;
	}
	public Double getL11sinmo5kless()
	{
		return this.l11sinmo5kless;
	}
	public void setL11sinmo5kless(Double l11sinmo5kless)
	{
		this.l11sinmo5kless = l11sinmo5kless;
	}
	public Double getL11sinmoTrade100less()
	{
		return this.l11sinmoTrade100less;
	}
	public void setL11sinmoTrade100less(Double l11sinmoTrade100less)
	{
		this.l11sinmoTrade100less = l11sinmoTrade100less;
	}
	public Double getL11sinmoTrade10kless()
	{
		return this.l11sinmoTrade10kless;
	}
	public void setL11sinmoTrade10kless(Double l11sinmoTrade10kless)
	{
		this.l11sinmoTrade10kless = l11sinmoTrade10kless;
	}
	public Double getL11sinmoTrade10less()
	{
		return this.l11sinmoTrade10less;
	}
	public void setL11sinmoTrade10less(Double l11sinmoTrade10less)
	{
		this.l11sinmoTrade10less = l11sinmoTrade10less;
	}
	public Double getL11sinmoTrade1kless()
	{
		return this.l11sinmoTrade1kless;
	}
	public void setL11sinmoTrade1kless(Double l11sinmoTrade1kless)
	{
		this.l11sinmoTrade1kless = l11sinmoTrade1kless;
	}
	public Double getL11sinmoTrade2kless()
	{
		return this.l11sinmoTrade2kless;
	}
	public void setL11sinmoTrade2kless(Double l11sinmoTrade2kless)
	{
		this.l11sinmoTrade2kless = l11sinmoTrade2kless;
	}
	public Double getL11sinmoTrade3kless()
	{
		return this.l11sinmoTrade3kless;
	}
	public void setL11sinmoTrade3kless(Double l11sinmoTrade3kless)
	{
		this.l11sinmoTrade3kless = l11sinmoTrade3kless;
	}
	public Double getL11sinmoTrade500less()
	{
		return this.l11sinmoTrade500less;
	}
	public void setL11sinmoTrade500less(Double l11sinmoTrade500less)
	{
		this.l11sinmoTrade500less = l11sinmoTrade500less;
	}
	public Double getL11sinmoTrade50kless()
	{
		return this.l11sinmoTrade50kless;
	}
	public void setL11sinmoTrade50kless(Double l11sinmoTrade50kless)
	{
		this.l11sinmoTrade50kless = l11sinmoTrade50kless;
	}
	public Double getL11sinmoTrade50kmore()
	{
		return this.l11sinmoTrade50kmore;
	}
	public void setL11sinmoTrade50kmore(Double l11sinmoTrade50kmore)
	{
		this.l11sinmoTrade50kmore = l11sinmoTrade50kmore;
	}
	public Double getL11sinmoTrade50less()
	{
		return this.l11sinmoTrade50less;
	}
	public void setL11sinmoTrade50less(Double l11sinmoTrade50less)
	{
		this.l11sinmoTrade50less = l11sinmoTrade50less;
	}
	public Double getL11sinmoTrade5kless()
	{
		return this.l11sinmoTrade5kless;
	}
	public void setL11sinmoTrade5kless(Double l11sinmoTrade5kless)
	{
		this.l11sinmoTrade5kless = l11sinmoTrade5kless;
	}
	public Double getL13DiffSalary()
	{
		return this.l13DiffSalary;
	}
	public void setL13DiffSalary(Double l13DiffSalary)
	{
		this.l13DiffSalary = l13DiffSalary;
	}
	public Double getL16DiffSalary()
	{
		return this.l16DiffSalary;
	}
	public void setL16DiffSalary(Double l16DiffSalary)
	{
		this.l16DiffSalary = l16DiffSalary;
	}
	public Double getL1ConsumMonday()
	{
		return this.l1ConsumMonday;
	}
	public void setL1ConsumMonday(Double l1ConsumMonday)
	{
		this.l1ConsumMonday = l1ConsumMonday;
	}
	public Double getL1ConsumTimeMoney()
	{
		return this.l1ConsumTimeMoney;
	}
	public void setL1ConsumTimeMoney(Double l1ConsumTimeMoney)
	{
		this.l1ConsumTimeMoney = l1ConsumTimeMoney;
	}
	public Integer getL1ConsumTimes()
	{
		return this.l1ConsumTimes;
	}
	public void setL1ConsumTimes(Integer l1ConsumTimes)
	{
		this.l1ConsumTimes = l1ConsumTimes;
	}
	public Double getL1MaxDailyAmount()
	{
		return this.l1MaxDailyAmount;
	}
	public void setL1MaxDailyAmount(Double l1MaxDailyAmount)
	{
		this.l1MaxDailyAmount = l1MaxDailyAmount;
	}
	public Double getL1MaxDailyBillCt()
	{
		return this.l1MaxDailyBillCt;
	}
	public void setL1MaxDailyBillCt(Double l1MaxDailyBillCt)
	{
		this.l1MaxDailyBillCt = l1MaxDailyBillCt;
	}
	public Double getL1MeanSalary()
	{
		return this.l1MeanSalary;
	}
	public void setL1MeanSalary(Double l1MeanSalary)
	{
		this.l1MeanSalary = l1MeanSalary;
	}
	public Double getL1MsumComsum()
	{
		return this.l1MsumComsum;
	}
	public void setL1MsumComsum(Double l1MsumComsum)
	{
		this.l1MsumComsum = l1MsumComsum;
	}
	public Double getL1MsumTradesum()
	{
		return this.l1MsumTradesum;
	}
	public void setL1MsumTradesum(Double l1MsumTradesum)
	{
		this.l1MsumTradesum = l1MsumTradesum;
	}
	public Integer getL1NoSalaryMonthCt()
	{
		return this.l1NoSalaryMonthCt;
	}
	public void setL1NoSalaryMonthCt(Integer l1NoSalaryMonthCt)
	{
		this.l1NoSalaryMonthCt = l1NoSalaryMonthCt;
	}
	public Double getL1TradesumMonday()
	{
		return this.l1TradesumMonday;
	}
	public void setL1TradesumMonday(Double l1TradesumMonday)
	{
		this.l1TradesumMonday = l1TradesumMonday;
	}
	public Double getL1TradesumTimeMoney()
	{
		return this.l1TradesumTimeMoney;
	}
	public void setL1TradesumTimeMoney(Double l1TradesumTimeMoney)
	{
		this.l1TradesumTimeMoney = l1TradesumTimeMoney;
	}
	public Double getL1TradesumTimes()
	{
		return this.l1TradesumTimes;
	}
	public void setL1TradesumTimes(Double l1TradesumTimes)
	{
		this.l1TradesumTimes = l1TradesumTimes;
	}
	public Double getL2Consum()
	{
		return this.l2Consum;
	}
	public void setL2Consum(Double l2Consum)
	{
		this.l2Consum = l2Consum;
	}
	public Double getL2ConsumMonday()
	{
		return this.l2ConsumMonday;
	}
	public void setL2ConsumMonday(Double l2ConsumMonday)
	{
		this.l2ConsumMonday = l2ConsumMonday;
	}
	public Integer getL2MonthConsumTimes()
	{
		return this.l2MonthConsumTimes;
	}
	public void setL2MonthConsumTimes(Integer l2MonthConsumTimes)
	{
		this.l2MonthConsumTimes = l2MonthConsumTimes;
	}
	public Double getL2MonthTradesumTimes()
	{
		return this.l2MonthTradesumTimes;
	}
	public void setL2MonthTradesumTimes(Double l2MonthTradesumTimes)
	{
		this.l2MonthTradesumTimes = l2MonthTradesumTimes;
	}
	public Double getL2Salary()
	{
		return this.l2Salary;
	}
	public void setL2Salary(Double l2Salary)
	{
		this.l2Salary = l2Salary;
	}
	public Double getL2Tradesum()
	{
		return this.l2Tradesum;
	}
	public void setL2Tradesum(Double l2Tradesum)
	{
		this.l2Tradesum = l2Tradesum;
	}
	public Double getL2TradesumMonday()
	{
		return this.l2TradesumMonday;
	}
	public void setL2TradesumMonday(Double l2TradesumMonday)
	{
		this.l2TradesumMonday = l2TradesumMonday;
	}
	public Double getL33Sinmo100less()
	{
		return this.l33Sinmo100less;
	}
	public void setL33Sinmo100less(Double l33Sinmo100less)
	{
		this.l33Sinmo100less = l33Sinmo100less;
	}
	public Double getL33Sinmo10kless()
	{
		return this.l33Sinmo10kless;
	}
	public void setL33Sinmo10kless(Double l33Sinmo10kless)
	{
		this.l33Sinmo10kless = l33Sinmo10kless;
	}
	public Double getL33Sinmo10less()
	{
		return this.l33Sinmo10less;
	}
	public void setL33Sinmo10less(Double l33Sinmo10less)
	{
		this.l33Sinmo10less = l33Sinmo10less;
	}
	public Double getL33Sinmo1kless()
	{
		return this.l33Sinmo1kless;
	}
	public void setL33Sinmo1kless(Double l33Sinmo1kless)
	{
		this.l33Sinmo1kless = l33Sinmo1kless;
	}
	public Double getL33Sinmo2kless()
	{
		return this.l33Sinmo2kless;
	}
	public void setL33Sinmo2kless(Double l33Sinmo2kless)
	{
		this.l33Sinmo2kless = l33Sinmo2kless;
	}
	public Double getL33Sinmo3kless()
	{
		return this.l33Sinmo3kless;
	}
	public void setL33Sinmo3kless(Double l33Sinmo3kless)
	{
		this.l33Sinmo3kless = l33Sinmo3kless;
	}
	public Double getL33Sinmo500less()
	{
		return this.l33Sinmo500less;
	}
	public void setL33Sinmo500less(Double l33Sinmo500less)
	{
		this.l33Sinmo500less = l33Sinmo500less;
	}
	public Double getL33Sinmo50kless()
	{
		return this.l33Sinmo50kless;
	}
	public void setL33Sinmo50kless(Double l33Sinmo50kless)
	{
		this.l33Sinmo50kless = l33Sinmo50kless;
	}
	public Double getL33Sinmo50kmore()
	{
		return this.l33Sinmo50kmore;
	}
	public void setL33Sinmo50kmore(Double l33Sinmo50kmore)
	{
		this.l33Sinmo50kmore = l33Sinmo50kmore;
	}
	public Double getL33Sinmo50less()
	{
		return this.l33Sinmo50less;
	}
	public void setL33Sinmo50less(Double l33Sinmo50less)
	{
		this.l33Sinmo50less = l33Sinmo50less;
	}
	public Double getL33Sinmo5kless()
	{
		return this.l33Sinmo5kless;
	}
	public void setL33Sinmo5kless(Double l33Sinmo5kless)
	{
		this.l33Sinmo5kless = l33Sinmo5kless;
	}
	public Double getL33SinmoTrade100less()
	{
		return this.l33SinmoTrade100less;
	}
	public void setL33SinmoTrade100less(Double l33SinmoTrade100less)
	{
		this.l33SinmoTrade100less = l33SinmoTrade100less;
	}
	public Double getL33SinmoTrade10kless()
	{
		return this.l33SinmoTrade10kless;
	}
	public void setL33SinmoTrade10kless(Double l33SinmoTrade10kless)
	{
		this.l33SinmoTrade10kless = l33SinmoTrade10kless;
	}
	public Double getL33SinmoTrade10less()
	{
		return this.l33SinmoTrade10less;
	}
	public void setL33SinmoTrade10less(Double l33SinmoTrade10less)
	{
		this.l33SinmoTrade10less = l33SinmoTrade10less;
	}
	public Double getL33SinmoTrade1kless()
	{
		return this.l33SinmoTrade1kless;
	}
	public void setL33SinmoTrade1kless(Double l33SinmoTrade1kless)
	{
		this.l33SinmoTrade1kless = l33SinmoTrade1kless;
	}
	public Double getL33SinmoTrade2kless()
	{
		return this.l33SinmoTrade2kless;
	}
	public void setL33SinmoTrade2kless(Double l33SinmoTrade2kless)
	{
		this.l33SinmoTrade2kless = l33SinmoTrade2kless;
	}
	public Double getL33SinmoTrade3kless()
	{
		return this.l33SinmoTrade3kless;
	}
	public void setL33SinmoTrade3kless(Double l33SinmoTrade3kless)
	{
		this.l33SinmoTrade3kless = l33SinmoTrade3kless;
	}
	public Double getL33SinmoTrade500less()
	{
		return this.l33SinmoTrade500less;
	}
	public void setL33SinmoTrade500less(Double l33SinmoTrade500less)
	{
		this.l33SinmoTrade500less = l33SinmoTrade500less;
	}
	public Double getL33SinmoTrade50kless()
	{
		return this.l33SinmoTrade50kless;
	}
	public void setL33SinmoTrade50kless(Double l33SinmoTrade50kless)
	{
		this.l33SinmoTrade50kless = l33SinmoTrade50kless;
	}
	public Double getL33SinmoTrade50kmore()
	{
		return this.l33SinmoTrade50kmore;
	}
	public void setL33SinmoTrade50kmore(Double l33SinmoTrade50kmore)
	{
		this.l33SinmoTrade50kmore = l33SinmoTrade50kmore;
	}
	public Double getL33SinmoTrade50less()
	{
		return this.l33SinmoTrade50less;
	}
	public void setL33SinmoTrade50less(Double l33SinmoTrade50less)
	{
		this.l33SinmoTrade50less = l33SinmoTrade50less;
	}
	public Double getL33SinmoTrade5kless()
	{
		return this.l33SinmoTrade5kless;
	}
	public void setL33SinmoTrade5kless(Double l33SinmoTrade5kless)
	{
		this.l33SinmoTrade5kless = l33SinmoTrade5kless;
	}
	public Double getL33sinmo100less()
	{
		return this.l33sinmo100less;
	}
	public void setL33sinmo100less(Double l33sinmo100less)
	{
		this.l33sinmo100less = l33sinmo100less;
	}
	public Double getL33sinmo10kless()
	{
		return this.l33sinmo10kless;
	}
	public void setL33sinmo10kless(Double l33sinmo10kless)
	{
		this.l33sinmo10kless = l33sinmo10kless;
	}
	public Double getL33sinmo10less()
	{
		return this.l33sinmo10less;
	}
	public void setL33sinmo10less(Double l33sinmo10less)
	{
		this.l33sinmo10less = l33sinmo10less;
	}
	public Double getL33sinmo1kless()
	{
		return this.l33sinmo1kless;
	}
	public void setL33sinmo1kless(Double l33sinmo1kless)
	{
		this.l33sinmo1kless = l33sinmo1kless;
	}
	public Double getL33sinmo2kless()
	{
		return this.l33sinmo2kless;
	}
	public void setL33sinmo2kless(Double l33sinmo2kless)
	{
		this.l33sinmo2kless = l33sinmo2kless;
	}
	public Double getL33sinmo3kless()
	{
		return this.l33sinmo3kless;
	}
	public void setL33sinmo3kless(Double l33sinmo3kless)
	{
		this.l33sinmo3kless = l33sinmo3kless;
	}
	public Double getL33sinmo500less()
	{
		return this.l33sinmo500less;
	}
	public void setL33sinmo500less(Double l33sinmo500less)
	{
		this.l33sinmo500less = l33sinmo500less;
	}
	public Double getL33sinmo50kless()
	{
		return this.l33sinmo50kless;
	}
	public void setL33sinmo50kless(Double l33sinmo50kless)
	{
		this.l33sinmo50kless = l33sinmo50kless;
	}
	public Double getL33sinmo50kmore()
	{
		return this.l33sinmo50kmore;
	}
	public void setL33sinmo50kmore(Double l33sinmo50kmore)
	{
		this.l33sinmo50kmore = l33sinmo50kmore;
	}
	public Double getL33sinmo50less()
	{
		return this.l33sinmo50less;
	}
	public void setL33sinmo50less(Double l33sinmo50less)
	{
		this.l33sinmo50less = l33sinmo50less;
	}
	public Double getL33sinmo5kless()
	{
		return this.l33sinmo5kless;
	}
	public void setL33sinmo5kless(Double l33sinmo5kless)
	{
		this.l33sinmo5kless = l33sinmo5kless;
	}
	public Double getL33sinmoTrade100less()
	{
		return this.l33sinmoTrade100less;
	}
	public void setL33sinmoTrade100less(Double l33sinmoTrade100less)
	{
		this.l33sinmoTrade100less = l33sinmoTrade100less;
	}
	public Double getL33sinmoTrade10kless()
	{
		return this.l33sinmoTrade10kless;
	}
	public void setL33sinmoTrade10kless(Double l33sinmoTrade10kless)
	{
		this.l33sinmoTrade10kless = l33sinmoTrade10kless;
	}
	public Double getL33sinmoTrade10less()
	{
		return this.l33sinmoTrade10less;
	}
	public void setL33sinmoTrade10less(Double l33sinmoTrade10less)
	{
		this.l33sinmoTrade10less = l33sinmoTrade10less;
	}
	public Double getL33sinmoTrade1kless()
	{
		return this.l33sinmoTrade1kless;
	}
	public void setL33sinmoTrade1kless(Double l33sinmoTrade1kless)
	{
		this.l33sinmoTrade1kless = l33sinmoTrade1kless;
	}
	public Double getL33sinmoTrade2kless()
	{
		return this.l33sinmoTrade2kless;
	}
	public void setL33sinmoTrade2kless(Double l33sinmoTrade2kless)
	{
		this.l33sinmoTrade2kless = l33sinmoTrade2kless;
	}
	public Double getL33sinmoTrade3kless()
	{
		return this.l33sinmoTrade3kless;
	}
	public void setL33sinmoTrade3kless(Double l33sinmoTrade3kless)
	{
		this.l33sinmoTrade3kless = l33sinmoTrade3kless;
	}
	public Double getL33sinmoTrade500less()
	{
		return this.l33sinmoTrade500less;
	}
	public void setL33sinmoTrade500less(Double l33sinmoTrade500less)
	{
		this.l33sinmoTrade500less = l33sinmoTrade500less;
	}
	public Double getL33sinmoTrade50kless()
	{
		return this.l33sinmoTrade50kless;
	}
	public void setL33sinmoTrade50kless(Double l33sinmoTrade50kless)
	{
		this.l33sinmoTrade50kless = l33sinmoTrade50kless;
	}
	public Double getL33sinmoTrade50kmore()
	{
		return this.l33sinmoTrade50kmore;
	}
	public void setL33sinmoTrade50kmore(Double l33sinmoTrade50kmore)
	{
		this.l33sinmoTrade50kmore = l33sinmoTrade50kmore;
	}
	public Double getL33sinmoTrade50less()
	{
		return this.l33sinmoTrade50less;
	}
	public void setL33sinmoTrade50less(Double l33sinmoTrade50less)
	{
		this.l33sinmoTrade50less = l33sinmoTrade50less;
	}
	public Double getL33sinmoTrade5kless()
	{
		return this.l33sinmoTrade5kless;
	}
	public void setL33sinmoTrade5kless(Double l33sinmoTrade5kless)
	{
		this.l33sinmoTrade5kless = l33sinmoTrade5kless;
	}
	public Double getL36DiffSalary()
	{
		return this.l36DiffSalary;
	}
	public void setL36DiffSalary(Double l36DiffSalary)
	{
		this.l36DiffSalary = l36DiffSalary;
	}
	public Double getL3ComsumDays()
	{
		return this.l3ComsumDays;
	}
	public void setL3ComsumDays(Double l3ComsumDays)
	{
		this.l3ComsumDays = l3ComsumDays;
	}
	public Double getL3Consum()
	{
		return this.l3Consum;
	}
	public void setL3Consum(Double l3Consum)
	{
		this.l3Consum = l3Consum;
	}
	public Double getL3ConsumMonday()
	{
		return this.l3ConsumMonday;
	}
	public void setL3ConsumMonday(Double l3ConsumMonday)
	{
		this.l3ConsumMonday = l3ConsumMonday;
	}
	public Double getL3ConsumMonths()
	{
		return this.l3ConsumMonths;
	}
	public void setL3ConsumMonths(Double l3ConsumMonths)
	{
		this.l3ConsumMonths = l3ConsumMonths;
	}
	public Double getL3ConsumTimeMoney()
	{
		return this.l3ConsumTimeMoney;
	}
	public void setL3ConsumTimeMoney(Double l3ConsumTimeMoney)
	{
		this.l3ConsumTimeMoney = l3ConsumTimeMoney;
	}
	public Double getL3ConsumTimes()
	{
		return this.l3ConsumTimes;
	}
	public void setL3ConsumTimes(Double l3ConsumTimes)
	{
		this.l3ConsumTimes = l3ConsumTimes;
	}
	public Double getL3MeanConsum()
	{
		return this.l3MeanConsum;
	}
	public void setL3MeanConsum(Double l3MeanConsum)
	{
		this.l3MeanConsum = l3MeanConsum;
	}
	public Double getL3MeanSalary()
	{
		return this.l3MeanSalary;
	}
	public void setL3MeanSalary(Double l3MeanSalary)
	{
		this.l3MeanSalary = l3MeanSalary;
	}
	public Double getL3MeanTradesum()
	{
		return this.l3MeanTradesum;
	}
	public void setL3MeanTradesum(Double l3MeanTradesum)
	{
		this.l3MeanTradesum = l3MeanTradesum;
	}
	public Integer getL3MonavgConsumTimes()
	{
		return this.l3MonavgConsumTimes;
	}
	public void setL3MonavgConsumTimes(Integer l3MonavgConsumTimes)
	{
		this.l3MonavgConsumTimes = l3MonavgConsumTimes;
	}
	public Double getL3MonavgTradesumTimes()
	{
		return this.l3MonavgTradesumTimes;
	}
	public void setL3MonavgTradesumTimes(Double l3MonavgTradesumTimes)
	{
		this.l3MonavgTradesumTimes = l3MonavgTradesumTimes;
	}
	public Integer getL3MonthConsumTimes()
	{
		return this.l3MonthConsumTimes;
	}
	public void setL3MonthConsumTimes(Integer l3MonthConsumTimes)
	{
		this.l3MonthConsumTimes = l3MonthConsumTimes;
	}
	public Double getL3MonthTradesumTimes()
	{
		return this.l3MonthTradesumTimes;
	}
	public void setL3MonthTradesumTimes(Double l3MonthTradesumTimes)
	{
		this.l3MonthTradesumTimes = l3MonthTradesumTimes;
	}
	public Double getL3MsumComsum()
	{
		return this.l3MsumComsum;
	}
	public void setL3MsumComsum(Double l3MsumComsum)
	{
		this.l3MsumComsum = l3MsumComsum;
	}
	public Double getL3MsumTradesum()
	{
		return this.l3MsumTradesum;
	}
	public void setL3MsumTradesum(Double l3MsumTradesum)
	{
		this.l3MsumTradesum = l3MsumTradesum;
	}
	public Integer getL3NoSalaryMonthCt()
	{
		return this.l3NoSalaryMonthCt;
	}
	public void setL3NoSalaryMonthCt(Integer l3NoSalaryMonthCt)
	{
		this.l3NoSalaryMonthCt = l3NoSalaryMonthCt;
	}
	public Double getL3Salary()
	{
		return this.l3Salary;
	}
	public void setL3Salary(Double l3Salary)
	{
		this.l3Salary = l3Salary;
	}
	public Double getL3Tradesum()
	{
		return this.l3Tradesum;
	}
	public void setL3Tradesum(Double l3Tradesum)
	{
		this.l3Tradesum = l3Tradesum;
	}
	public Double getL3TradesumDays()
	{
		return this.l3TradesumDays;
	}
	public void setL3TradesumDays(Double l3TradesumDays)
	{
		this.l3TradesumDays = l3TradesumDays;
	}
	public Double getL3TradesumMonday()
	{
		return this.l3TradesumMonday;
	}
	public void setL3TradesumMonday(Double l3TradesumMonday)
	{
		this.l3TradesumMonday = l3TradesumMonday;
	}
	public Double getL3TradesumMonths()
	{
		return this.l3TradesumMonths;
	}
	public void setL3TradesumMonths(Double l3TradesumMonths)
	{
		this.l3TradesumMonths = l3TradesumMonths;
	}
	public Double getL3TradesumTimeMoney()
	{
		return this.l3TradesumTimeMoney;
	}
	public void setL3TradesumTimeMoney(Double l3TradesumTimeMoney)
	{
		this.l3TradesumTimeMoney = l3TradesumTimeMoney;
	}
	public Double getL3TradesumTimes()
	{
		return this.l3TradesumTimes;
	}
	public void setL3TradesumTimes(Double l3TradesumTimes)
	{
		this.l3TradesumTimes = l3TradesumTimes;
	}
	public Double getL4Consum()
	{
		return this.l4Consum;
	}
	public void setL4Consum(Double l4Consum)
	{
		this.l4Consum = l4Consum;
	}
	public Double getL4ConsumMonday()
	{
		return this.l4ConsumMonday;
	}
	public void setL4ConsumMonday(Double l4ConsumMonday)
	{
		this.l4ConsumMonday = l4ConsumMonday;
	}
	public Integer getL4MonthConsumTimes()
	{
		return this.l4MonthConsumTimes;
	}
	public void setL4MonthConsumTimes(Integer l4MonthConsumTimes)
	{
		this.l4MonthConsumTimes = l4MonthConsumTimes;
	}
	public Double getL4MonthTradesumTimes()
	{
		return this.l4MonthTradesumTimes;
	}
	public void setL4MonthTradesumTimes(Double l4MonthTradesumTimes)
	{
		this.l4MonthTradesumTimes = l4MonthTradesumTimes;
	}
	public Double getL4Salary()
	{
		return this.l4Salary;
	}
	public void setL4Salary(Double l4Salary)
	{
		this.l4Salary = l4Salary;
	}
	public Double getL4Tradesum()
	{
		return this.l4Tradesum;
	}
	public void setL4Tradesum(Double l4Tradesum)
	{
		this.l4Tradesum = l4Tradesum;
	}
	public Double getL4TradesumMonday()
	{
		return this.l4TradesumMonday;
	}
	public void setL4TradesumMonday(Double l4TradesumMonday)
	{
		this.l4TradesumMonday = l4TradesumMonday;
	}
	public Double getL5Consum()
	{
		return this.l5Consum;
	}
	public void setL5Consum(Double l5Consum)
	{
		this.l5Consum = l5Consum;
	}
	public Double getL5ConsumMonday()
	{
		return this.l5ConsumMonday;
	}
	public void setL5ConsumMonday(Double l5ConsumMonday)
	{
		this.l5ConsumMonday = l5ConsumMonday;
	}
	public Integer getL5MonthConsumTimes()
	{
		return this.l5MonthConsumTimes;
	}
	public void setL5MonthConsumTimes(Integer l5MonthConsumTimes)
	{
		this.l5MonthConsumTimes = l5MonthConsumTimes;
	}
	public Double getL5MonthTradesumTimes()
	{
		return this.l5MonthTradesumTimes;
	}
	public void setL5MonthTradesumTimes(Double l5MonthTradesumTimes)
	{
		this.l5MonthTradesumTimes = l5MonthTradesumTimes;
	}
	public Double getL5Salary()
	{
		return this.l5Salary;
	}
	public void setL5Salary(Double l5Salary)
	{
		this.l5Salary = l5Salary;
	}
	public Double getL5Tradesum()
	{
		return this.l5Tradesum;
	}
	public void setL5Tradesum(Double l5Tradesum)
	{
		this.l5Tradesum = l5Tradesum;
	}
	public Double getL5TradesumMonday()
	{
		return this.l5TradesumMonday;
	}
	public void setL5TradesumMonday(Double l5TradesumMonday)
	{
		this.l5TradesumMonday = l5TradesumMonday;
	}
	public Double getL66Sinmo100less()
	{
		return this.l66Sinmo100less;
	}
	public void setL66Sinmo100less(Double l66Sinmo100less)
	{
		this.l66Sinmo100less = l66Sinmo100less;
	}
	public Double getL66Sinmo10kless()
	{
		return this.l66Sinmo10kless;
	}
	public void setL66Sinmo10kless(Double l66Sinmo10kless)
	{
		this.l66Sinmo10kless = l66Sinmo10kless;
	}
	public Double getL66Sinmo10less()
	{
		return this.l66Sinmo10less;
	}
	public void setL66Sinmo10less(Double l66Sinmo10less)
	{
		this.l66Sinmo10less = l66Sinmo10less;
	}
	public Double getL66Sinmo1kless()
	{
		return this.l66Sinmo1kless;
	}
	public void setL66Sinmo1kless(Double l66Sinmo1kless)
	{
		this.l66Sinmo1kless = l66Sinmo1kless;
	}
	public Double getL66Sinmo2kless()
	{
		return this.l66Sinmo2kless;
	}
	public void setL66Sinmo2kless(Double l66Sinmo2kless)
	{
		this.l66Sinmo2kless = l66Sinmo2kless;
	}
	public Double getL66Sinmo3kless()
	{
		return this.l66Sinmo3kless;
	}
	public void setL66Sinmo3kless(Double l66Sinmo3kless)
	{
		this.l66Sinmo3kless = l66Sinmo3kless;
	}
	public Double getL66Sinmo500less()
	{
		return this.l66Sinmo500less;
	}
	public void setL66Sinmo500less(Double l66Sinmo500less)
	{
		this.l66Sinmo500less = l66Sinmo500less;
	}
	public Double getL66Sinmo50kless()
	{
		return this.l66Sinmo50kless;
	}
	public void setL66Sinmo50kless(Double l66Sinmo50kless)
	{
		this.l66Sinmo50kless = l66Sinmo50kless;
	}
	public Double getL66Sinmo50kmore()
	{
		return this.l66Sinmo50kmore;
	}
	public void setL66Sinmo50kmore(Double l66Sinmo50kmore)
	{
		this.l66Sinmo50kmore = l66Sinmo50kmore;
	}
	public Double getL66Sinmo50less()
	{
		return this.l66Sinmo50less;
	}
	public void setL66Sinmo50less(Double l66Sinmo50less)
	{
		this.l66Sinmo50less = l66Sinmo50less;
	}
	public Double getL66Sinmo5kless()
	{
		return this.l66Sinmo5kless;
	}
	public void setL66Sinmo5kless(Double l66Sinmo5kless)
	{
		this.l66Sinmo5kless = l66Sinmo5kless;
	}
	public Double getL66SinmoTrade100less()
	{
		return this.l66SinmoTrade100less;
	}
	public void setL66SinmoTrade100less(Double l66SinmoTrade100less)
	{
		this.l66SinmoTrade100less = l66SinmoTrade100less;
	}
	public Double getL66SinmoTrade10kless()
	{
		return this.l66SinmoTrade10kless;
	}
	public void setL66SinmoTrade10kless(Double l66SinmoTrade10kless)
	{
		this.l66SinmoTrade10kless = l66SinmoTrade10kless;
	}
	public Double getL66SinmoTrade10less()
	{
		return this.l66SinmoTrade10less;
	}
	public void setL66SinmoTrade10less(Double l66SinmoTrade10less)
	{
		this.l66SinmoTrade10less = l66SinmoTrade10less;
	}
	public Double getL66SinmoTrade1kless()
	{
		return this.l66SinmoTrade1kless;
	}
	public void setL66SinmoTrade1kless(Double l66SinmoTrade1kless)
	{
		this.l66SinmoTrade1kless = l66SinmoTrade1kless;
	}
	public Double getL66SinmoTrade2kless()
	{
		return this.l66SinmoTrade2kless;
	}
	public void setL66SinmoTrade2kless(Double l66SinmoTrade2kless)
	{
		this.l66SinmoTrade2kless = l66SinmoTrade2kless;
	}
	public Double getL66SinmoTrade3kless()
	{
		return this.l66SinmoTrade3kless;
	}
	public void setL66SinmoTrade3kless(Double l66SinmoTrade3kless)
	{
		this.l66SinmoTrade3kless = l66SinmoTrade3kless;
	}
	public Double getL66SinmoTrade500less()
	{
		return this.l66SinmoTrade500less;
	}
	public void setL66SinmoTrade500less(Double l66SinmoTrade500less)
	{
		this.l66SinmoTrade500less = l66SinmoTrade500less;
	}
	public Double getL66SinmoTrade50kless()
	{
		return this.l66SinmoTrade50kless;
	}
	public void setL66SinmoTrade50kless(Double l66SinmoTrade50kless)
	{
		this.l66SinmoTrade50kless = l66SinmoTrade50kless;
	}
	public Double getL66SinmoTrade50kmore()
	{
		return this.l66SinmoTrade50kmore;
	}
	public void setL66SinmoTrade50kmore(Double l66SinmoTrade50kmore)
	{
		this.l66SinmoTrade50kmore = l66SinmoTrade50kmore;
	}
	public Double getL66SinmoTrade50less()
	{
		return this.l66SinmoTrade50less;
	}
	public void setL66SinmoTrade50less(Double l66SinmoTrade50less)
	{
		this.l66SinmoTrade50less = l66SinmoTrade50less;
	}
	public Double getL66SinmoTrade5kless()
	{
		return this.l66SinmoTrade5kless;
	}
	public void setL66SinmoTrade5kless(Double l66SinmoTrade5kless)
	{
		this.l66SinmoTrade5kless = l66SinmoTrade5kless;
	}
	public Double getL66sinmo100less()
	{
		return this.l66sinmo100less;
	}
	public void setL66sinmo100less(Double l66sinmo100less)
	{
		this.l66sinmo100less = l66sinmo100less;
	}
	public Double getL66sinmo10kless()
	{
		return this.l66sinmo10kless;
	}
	public void setL66sinmo10kless(Double l66sinmo10kless)
	{
		this.l66sinmo10kless = l66sinmo10kless;
	}
	public Double getL66sinmo10less()
	{
		return this.l66sinmo10less;
	}
	public void setL66sinmo10less(Double l66sinmo10less)
	{
		this.l66sinmo10less = l66sinmo10less;
	}
	public Double getL66sinmo1kless()
	{
		return this.l66sinmo1kless;
	}
	public void setL66sinmo1kless(Double l66sinmo1kless)
	{
		this.l66sinmo1kless = l66sinmo1kless;
	}
	public Double getL66sinmo2kless()
	{
		return this.l66sinmo2kless;
	}
	public void setL66sinmo2kless(Double l66sinmo2kless)
	{
		this.l66sinmo2kless = l66sinmo2kless;
	}
	public Double getL66sinmo3kless()
	{
		return this.l66sinmo3kless;
	}
	public void setL66sinmo3kless(Double l66sinmo3kless)
	{
		this.l66sinmo3kless = l66sinmo3kless;
	}
	public Double getL66sinmo500less()
	{
		return this.l66sinmo500less;
	}
	public void setL66sinmo500less(Double l66sinmo500less)
	{
		this.l66sinmo500less = l66sinmo500less;
	}
	public Double getL66sinmo50kless()
	{
		return this.l66sinmo50kless;
	}
	public void setL66sinmo50kless(Double l66sinmo50kless)
	{
		this.l66sinmo50kless = l66sinmo50kless;
	}
	public Double getL66sinmo50kmore()
	{
		return this.l66sinmo50kmore;
	}
	public void setL66sinmo50kmore(Double l66sinmo50kmore)
	{
		this.l66sinmo50kmore = l66sinmo50kmore;
	}
	public Double getL66sinmo50less()
	{
		return this.l66sinmo50less;
	}
	public void setL66sinmo50less(Double l66sinmo50less)
	{
		this.l66sinmo50less = l66sinmo50less;
	}
	public Double getL66sinmo5kless()
	{
		return this.l66sinmo5kless;
	}
	public void setL66sinmo5kless(Double l66sinmo5kless)
	{
		this.l66sinmo5kless = l66sinmo5kless;
	}
	public Double getL66sinmoTrade100less()
	{
		return this.l66sinmoTrade100less;
	}
	public void setL66sinmoTrade100less(Double l66sinmoTrade100less)
	{
		this.l66sinmoTrade100less = l66sinmoTrade100less;
	}
	public Double getL66sinmoTrade10kless()
	{
		return this.l66sinmoTrade10kless;
	}
	public void setL66sinmoTrade10kless(Double l66sinmoTrade10kless)
	{
		this.l66sinmoTrade10kless = l66sinmoTrade10kless;
	}
	public Double getL66sinmoTrade10less()
	{
		return this.l66sinmoTrade10less;
	}
	public void setL66sinmoTrade10less(Double l66sinmoTrade10less)
	{
		this.l66sinmoTrade10less = l66sinmoTrade10less;
	}
	public Double getL66sinmoTrade1kless()
	{
		return this.l66sinmoTrade1kless;
	}
	public void setL66sinmoTrade1kless(Double l66sinmoTrade1kless)
	{
		this.l66sinmoTrade1kless = l66sinmoTrade1kless;
	}
	public Double getL66sinmoTrade2kless()
	{
		return this.l66sinmoTrade2kless;
	}
	public void setL66sinmoTrade2kless(Double l66sinmoTrade2kless)
	{
		this.l66sinmoTrade2kless = l66sinmoTrade2kless;
	}
	public Double getL66sinmoTrade3kless()
	{
		return this.l66sinmoTrade3kless;
	}
	public void setL66sinmoTrade3kless(Double l66sinmoTrade3kless)
	{
		this.l66sinmoTrade3kless = l66sinmoTrade3kless;
	}
	public Double getL66sinmoTrade500less()
	{
		return this.l66sinmoTrade500less;
	}
	public void setL66sinmoTrade500less(Double l66sinmoTrade500less)
	{
		this.l66sinmoTrade500less = l66sinmoTrade500less;
	}
	public Double getL66sinmoTrade50kless()
	{
		return this.l66sinmoTrade50kless;
	}
	public void setL66sinmoTrade50kless(Double l66sinmoTrade50kless)
	{
		this.l66sinmoTrade50kless = l66sinmoTrade50kless;
	}
	public Double getL66sinmoTrade50kmore()
	{
		return this.l66sinmoTrade50kmore;
	}
	public void setL66sinmoTrade50kmore(Double l66sinmoTrade50kmore)
	{
		this.l66sinmoTrade50kmore = l66sinmoTrade50kmore;
	}
	public Double getL66sinmoTrade50less()
	{
		return this.l66sinmoTrade50less;
	}
	public void setL66sinmoTrade50less(Double l66sinmoTrade50less)
	{
		this.l66sinmoTrade50less = l66sinmoTrade50less;
	}
	public Double getL66sinmoTrade5kless()
	{
		return this.l66sinmoTrade5kless;
	}
	public void setL66sinmoTrade5kless(Double l66sinmoTrade5kless)
	{
		this.l66sinmoTrade5kless = l66sinmoTrade5kless;
	}
	public Double getL6ComsumDays()
	{
		return this.l6ComsumDays;
	}
	public void setL6ComsumDays(Double l6ComsumDays)
	{
		this.l6ComsumDays = l6ComsumDays;
	}
	public Double getL6Consum()
	{
		return this.l6Consum;
	}
	public void setL6Consum(Double l6Consum)
	{
		this.l6Consum = l6Consum;
	}
	public Double getL6ConsumMonday()
	{
		return this.l6ConsumMonday;
	}
	public void setL6ConsumMonday(Double l6ConsumMonday)
	{
		this.l6ConsumMonday = l6ConsumMonday;
	}
	public Double getL6ConsumMonths()
	{
		return this.l6ConsumMonths;
	}
	public void setL6ConsumMonths(Double l6ConsumMonths)
	{
		this.l6ConsumMonths = l6ConsumMonths;
	}
	public Double getL6ConsumTimeMoney()
	{
		return this.l6ConsumTimeMoney;
	}
	public void setL6ConsumTimeMoney(Double l6ConsumTimeMoney)
	{
		this.l6ConsumTimeMoney = l6ConsumTimeMoney;
	}
	public Integer getL6ConsumTimes()
	{
		return this.l6ConsumTimes;
	}
	public void setL6ConsumTimes(Integer l6ConsumTimes)
	{
		this.l6ConsumTimes = l6ConsumTimes;
	}
	public Double getL6MaxDailyAmount()
	{
		return this.l6MaxDailyAmount;
	}
	public void setL6MaxDailyAmount(Double l6MaxDailyAmount)
	{
		this.l6MaxDailyAmount = l6MaxDailyAmount;
	}
	public Double getL6MaxDailyBillCt()
	{
		return this.l6MaxDailyBillCt;
	}
	public void setL6MaxDailyBillCt(Double l6MaxDailyBillCt)
	{
		this.l6MaxDailyBillCt = l6MaxDailyBillCt;
	}
	public Double getL6MeanConsum()
	{
		return this.l6MeanConsum;
	}
	public void setL6MeanConsum(Double l6MeanConsum)
	{
		this.l6MeanConsum = l6MeanConsum;
	}
	public Double getL6MeanSalary()
	{
		return this.l6MeanSalary;
	}
	public void setL6MeanSalary(Double l6MeanSalary)
	{
		this.l6MeanSalary = l6MeanSalary;
	}
	public Double getL6MeanTradesum()
	{
		return this.l6MeanTradesum;
	}
	public void setL6MeanTradesum(Double l6MeanTradesum)
	{
		this.l6MeanTradesum = l6MeanTradesum;
	}
	public Integer getL6MonavgConsumTimes()
	{
		return this.l6MonavgConsumTimes;
	}
	public void setL6MonavgConsumTimes(Integer l6MonavgConsumTimes)
	{
		this.l6MonavgConsumTimes = l6MonavgConsumTimes;
	}
	public Double getL6MonavgTradesumTimes()
	{
		return this.l6MonavgTradesumTimes;
	}
	public void setL6MonavgTradesumTimes(Double l6MonavgTradesumTimes)
	{
		this.l6MonavgTradesumTimes = l6MonavgTradesumTimes;
	}
	public Integer getL6MonthConsumTimes()
	{
		return this.l6MonthConsumTimes;
	}
	public void setL6MonthConsumTimes(Integer l6MonthConsumTimes)
	{
		this.l6MonthConsumTimes = l6MonthConsumTimes;
	}
	public Double getL6MonthTradesumTimes()
	{
		return this.l6MonthTradesumTimes;
	}
	public void setL6MonthTradesumTimes(Double l6MonthTradesumTimes)
	{
		this.l6MonthTradesumTimes = l6MonthTradesumTimes;
	}
	public Double getL6MsumComsum()
	{
		return this.l6MsumComsum;
	}
	public void setL6MsumComsum(Double l6MsumComsum)
	{
		this.l6MsumComsum = l6MsumComsum;
	}
	public Double getL6MsumTradesum()
	{
		return this.l6MsumTradesum;
	}
	public void setL6MsumTradesum(Double l6MsumTradesum)
	{
		this.l6MsumTradesum = l6MsumTradesum;
	}
	public Integer getL6NoSalaryMonthCt()
	{
		return this.l6NoSalaryMonthCt;
	}
	public void setL6NoSalaryMonthCt(Integer l6NoSalaryMonthCt)
	{
		this.l6NoSalaryMonthCt = l6NoSalaryMonthCt;
	}
	public Double getL6Salary()
	{
		return this.l6Salary;
	}
	public void setL6Salary(Double l6Salary)
	{
		this.l6Salary = l6Salary;
	}
	public Double getL6Tradesum()
	{
		return this.l6Tradesum;
	}
	public void setL6Tradesum(Double l6Tradesum)
	{
		this.l6Tradesum = l6Tradesum;
	}
	public Double getL6TradesumDays()
	{
		return this.l6TradesumDays;
	}
	public void setL6TradesumDays(Double l6TradesumDays)
	{
		this.l6TradesumDays = l6TradesumDays;
	}
	public Double getL6TradesumMonday()
	{
		return this.l6TradesumMonday;
	}
	public void setL6TradesumMonday(Double l6TradesumMonday)
	{
		this.l6TradesumMonday = l6TradesumMonday;
	}
	public Double getL6TradesumMonths()
	{
		return this.l6TradesumMonths;
	}
	public void setL6TradesumMonths(Double l6TradesumMonths)
	{
		this.l6TradesumMonths = l6TradesumMonths;
	}
	public Double getL6TradesumTimeMoney()
	{
		return this.l6TradesumTimeMoney;
	}
	public void setL6TradesumTimeMoney(Double l6TradesumTimeMoney)
	{
		this.l6TradesumTimeMoney = l6TradesumTimeMoney;
	}
	public Double getL6TradesumTimes()
	{
		return this.l6TradesumTimes;
	}
	public void setL6TradesumTimes(Double l6TradesumTimes)
	{
		this.l6TradesumTimes = l6TradesumTimes;
	}
	public Double getL7Consum()
	{
		return this.l7Consum;
	}
	public void setL7Consum(Double l7Consum)
	{
		this.l7Consum = l7Consum;
	}
	public Double getL7ConsumMonday()
	{
		return this.l7ConsumMonday;
	}
	public void setL7ConsumMonday(Double l7ConsumMonday)
	{
		this.l7ConsumMonday = l7ConsumMonday;
	}
	public Integer getL7MonthConsumTimes()
	{
		return this.l7MonthConsumTimes;
	}
	public void setL7MonthConsumTimes(Integer l7MonthConsumTimes)
	{
		this.l7MonthConsumTimes = l7MonthConsumTimes;
	}
	public Double getL7MonthTradesumTimes()
	{
		return this.l7MonthTradesumTimes;
	}
	public void setL7MonthTradesumTimes(Double l7MonthTradesumTimes)
	{
		this.l7MonthTradesumTimes = l7MonthTradesumTimes;
	}
	public Double getL7Salary()
	{
		return this.l7Salary;
	}
	public void setL7Salary(Double l7Salary)
	{
		this.l7Salary = l7Salary;
	}
	public Double getL7Tradesum()
	{
		return this.l7Tradesum;
	}
	public void setL7Tradesum(Double l7Tradesum)
	{
		this.l7Tradesum = l7Tradesum;
	}
	public Double getL7TradesumMonday()
	{
		return this.l7TradesumMonday;
	}
	public void setL7TradesumMonday(Double l7TradesumMonday)
	{
		this.l7TradesumMonday = l7TradesumMonday;
	}
	public Double getL8Consum()
	{
		return this.l8Consum;
	}
	public void setL8Consum(Double l8Consum)
	{
		this.l8Consum = l8Consum;
	}
	public Double getL8ConsumMonday()
	{
		return this.l8ConsumMonday;
	}
	public void setL8ConsumMonday(Double l8ConsumMonday)
	{
		this.l8ConsumMonday = l8ConsumMonday;
	}
	public Integer getL8MonthConsumTimes()
	{
		return this.l8MonthConsumTimes;
	}
	public void setL8MonthConsumTimes(Integer l8MonthConsumTimes)
	{
		this.l8MonthConsumTimes = l8MonthConsumTimes;
	}
	public Double getL8MonthTradesumTimes()
	{
		return this.l8MonthTradesumTimes;
	}
	public void setL8MonthTradesumTimes(Double l8MonthTradesumTimes)
	{
		this.l8MonthTradesumTimes = l8MonthTradesumTimes;
	}
	public Double getL8Salary()
	{
		return this.l8Salary;
	}
	public void setL8Salary(Double l8Salary)
	{
		this.l8Salary = l8Salary;
	}
	public Double getL8Tradesum()
	{
		return this.l8Tradesum;
	}
	public void setL8Tradesum(Double l8Tradesum)
	{
		this.l8Tradesum = l8Tradesum;
	}
	public Double getL8TradesumMonday()
	{
		return this.l8TradesumMonday;
	}
	public void setL8TradesumMonday(Double l8TradesumMonday)
	{
		this.l8TradesumMonday = l8TradesumMonday;
	}
	public Double getL9Consum()
	{
		return this.l9Consum;
	}
	public void setL9Consum(Double l9Consum)
	{
		this.l9Consum = l9Consum;
	}
	public Double getL9ConsumMonday()
	{
		return this.l9ConsumMonday;
	}
	public void setL9ConsumMonday(Double l9ConsumMonday)
	{
		this.l9ConsumMonday = l9ConsumMonday;
	}
	public Integer getL9MonthConsumTimes()
	{
		return this.l9MonthConsumTimes;
	}
	public void setL9MonthConsumTimes(Integer l9MonthConsumTimes)
	{
		this.l9MonthConsumTimes = l9MonthConsumTimes;
	}
	public Double getL9MonthTradesumTimes()
	{
		return this.l9MonthTradesumTimes;
	}
	public void setL9MonthTradesumTimes(Double l9MonthTradesumTimes)
	{
		this.l9MonthTradesumTimes = l9MonthTradesumTimes;
	}
	public Double getL9Salary()
	{
		return this.l9Salary;
	}
	public void setL9Salary(Double l9Salary)
	{
		this.l9Salary = l9Salary;
	}
	public Double getL9Tradesum()
	{
		return this.l9Tradesum;
	}
	public void setL9Tradesum(Double l9Tradesum)
	{
		this.l9Tradesum = l9Tradesum;
	}
	public Double getL9TradesumMonday()
	{
		return this.l9TradesumMonday;
	}
	public void setL9TradesumMonday(Double l9TradesumMonday)
	{
		this.l9TradesumMonday = l9TradesumMonday;
	}
	public Double getM10LinkraConsumeAdd()
	{
		return this.m10LinkraConsumeAdd;
	}
	public void setM10LinkraConsumeAdd(Double m10LinkraConsumeAdd)
	{
		this.m10LinkraConsumeAdd = m10LinkraConsumeAdd;
	}
	public Double getM10LinkraTimeconsuAdd()
	{
		return this.m10LinkraTimeconsuAdd;
	}
	public void setM10LinkraTimeconsuAdd(Double m10LinkraTimeconsuAdd)
	{
		this.m10LinkraTimeconsuAdd = m10LinkraTimeconsuAdd;
	}
	public Double getM10LinkraTradeAdd()
	{
		return this.m10LinkraTradeAdd;
	}
	public void setM10LinkraTradeAdd(Double m10LinkraTradeAdd)
	{
		this.m10LinkraTradeAdd = m10LinkraTradeAdd;
	}
	public Double getM10LinkraTradeTimeconsuAdd()
	{
		return this.m10LinkraTradeTimeconsuAdd;
	}
	public void setM10LinkraTradeTimeconsuAdd(Double m10LinkraTradeTimeconsuAdd)
	{
		this.m10LinkraTradeTimeconsuAdd = m10LinkraTradeTimeconsuAdd;
	}
	public Double getM11LinkraConsumeAdd()
	{
		return this.m11LinkraConsumeAdd;
	}
	public void setM11LinkraConsumeAdd(Double m11LinkraConsumeAdd)
	{
		this.m11LinkraConsumeAdd = m11LinkraConsumeAdd;
	}
	public Double getM11LinkraTimeconsuAdd()
	{
		return this.m11LinkraTimeconsuAdd;
	}
	public void setM11LinkraTimeconsuAdd(Double m11LinkraTimeconsuAdd)
	{
		this.m11LinkraTimeconsuAdd = m11LinkraTimeconsuAdd;
	}
	public Double getM11LinkraTradeAdd()
	{
		return this.m11LinkraTradeAdd;
	}
	public void setM11LinkraTradeAdd(Double m11LinkraTradeAdd)
	{
		this.m11LinkraTradeAdd = m11LinkraTradeAdd;
	}
	public Double getM11LinkraTradeTimeconsuAdd()
	{
		return this.m11LinkraTradeTimeconsuAdd;
	}
	public void setM11LinkraTradeTimeconsuAdd(Double m11LinkraTradeTimeconsuAdd)
	{
		this.m11LinkraTradeTimeconsuAdd = m11LinkraTradeTimeconsuAdd;
	}
	public Double getM12ConsuSalaRet()
	{
		return this.m12ConsuSalaRet;
	}
	public void setM12ConsuSalaRet(Double m12ConsuSalaRet)
	{
		this.m12ConsuSalaRet = m12ConsuSalaRet;
	}
	public Double getM12Payment2005klessRetMoney()
	{
		return this.m12Payment2005klessRetMoney;
	}
	public void setM12Payment2005klessRetMoney(Double m12Payment2005klessRetMoney)
	{
		this.m12Payment2005klessRetMoney = m12Payment2005klessRetMoney;
	}
	public Double getM12Payment2005klessRetTime()
	{
		return this.m12Payment2005klessRetTime;
	}
	public void setM12Payment2005klessRetTime(Double m12Payment2005klessRetTime)
	{
		this.m12Payment2005klessRetTime = m12Payment2005klessRetTime;
	}
	public Double getM12Payment2005klessmoney()
	{
		return this.m12Payment2005klessmoney;
	}
	public void setM12Payment2005klessmoney(Double m12Payment2005klessmoney)
	{
		this.m12Payment2005klessmoney = m12Payment2005klessmoney;
	}
	public Double getM12Payment2005klesstime()
	{
		return this.m12Payment2005klesstime;
	}
	public void setM12Payment2005klesstime(Double m12Payment2005klesstime)
	{
		this.m12Payment2005klesstime = m12Payment2005klesstime;
	}
	public Double getM12Payment200lessRetMoney()
	{
		return this.m12Payment200lessRetMoney;
	}
	public void setM12Payment200lessRetMoney(Double m12Payment200lessRetMoney)
	{
		this.m12Payment200lessRetMoney = m12Payment200lessRetMoney;
	}
	public Double getM12Payment200lessRetTime()
	{
		return this.m12Payment200lessRetTime;
	}
	public void setM12Payment200lessRetTime(Double m12Payment200lessRetTime)
	{
		this.m12Payment200lessRetTime = m12Payment200lessRetTime;
	}
	public Double getM12Payment200lessmoney()
	{
		return this.m12Payment200lessmoney;
	}
	public void setM12Payment200lessmoney(Double m12Payment200lessmoney)
	{
		this.m12Payment200lessmoney = m12Payment200lessmoney;
	}
	public Double getM12Payment200lesstime()
	{
		return this.m12Payment200lesstime;
	}
	public void setM12Payment200lesstime(Double m12Payment200lesstime)
	{
		this.m12Payment200lesstime = m12Payment200lesstime;
	}
	public Double getM12Payment3klessmoney()
	{
		return this.m12Payment3klessmoney;
	}
	public void setM12Payment3klessmoney(Double m12Payment3klessmoney)
	{
		this.m12Payment3klessmoney = m12Payment3klessmoney;
	}
	public Double getM12Payment3klesstime()
	{
		return this.m12Payment3klesstime;
	}
	public void setM12Payment3klesstime(Double m12Payment3klesstime)
	{
		this.m12Payment3klesstime = m12Payment3klesstime;
	}
	public Double getM12Payment5kmoreRetMoney()
	{
		return this.m12Payment5kmoreRetMoney;
	}
	public void setM12Payment5kmoreRetMoney(Double m12Payment5kmoreRetMoney)
	{
		this.m12Payment5kmoreRetMoney = m12Payment5kmoreRetMoney;
	}
	public Double getM12Payment5kmoreRetTime()
	{
		return this.m12Payment5kmoreRetTime;
	}
	public void setM12Payment5kmoreRetTime(Double m12Payment5kmoreRetTime)
	{
		this.m12Payment5kmoreRetTime = m12Payment5kmoreRetTime;
	}
	public Double getM12Payment5kmoremoney()
	{
		return this.m12Payment5kmoremoney;
	}
	public void setM12Payment5kmoremoney(Double m12Payment5kmoremoney)
	{
		this.m12Payment5kmoremoney = m12Payment5kmoremoney;
	}
	public Double getM12Payment5kmoretime()
	{
		return this.m12Payment5kmoretime;
	}
	public void setM12Payment5kmoretime(Double m12Payment5kmoretime)
	{
		this.m12Payment5kmoretime = m12Payment5kmoretime;
	}
	public Double getM12PaymentTrade2005klessRetMoney()
	{
		return this.m12PaymentTrade2005klessRetMoney;
	}
	public void setM12PaymentTrade2005klessRetMoney(Double m12PaymentTrade2005klessRetMoney)
	{
		this.m12PaymentTrade2005klessRetMoney = m12PaymentTrade2005klessRetMoney;
	}
	public Double getM12PaymentTrade2005klessRetTime()
	{
		return this.m12PaymentTrade2005klessRetTime;
	}
	public void setM12PaymentTrade2005klessRetTime(Double m12PaymentTrade2005klessRetTime)
	{
		this.m12PaymentTrade2005klessRetTime = m12PaymentTrade2005klessRetTime;
	}
	public Double getM12PaymentTrade2005klessmoney()
	{
		return this.m12PaymentTrade2005klessmoney;
	}
	public void setM12PaymentTrade2005klessmoney(Double m12PaymentTrade2005klessmoney)
	{
		this.m12PaymentTrade2005klessmoney = m12PaymentTrade2005klessmoney;
	}
	public Double getM12PaymentTrade2005klesstime()
	{
		return this.m12PaymentTrade2005klesstime;
	}
	public void setM12PaymentTrade2005klesstime(Double m12PaymentTrade2005klesstime)
	{
		this.m12PaymentTrade2005klesstime = m12PaymentTrade2005klesstime;
	}
	public Double getM12PaymentTrade200lessRetMoney()
	{
		return this.m12PaymentTrade200lessRetMoney;
	}
	public void setM12PaymentTrade200lessRetMoney(Double m12PaymentTrade200lessRetMoney)
	{
		this.m12PaymentTrade200lessRetMoney = m12PaymentTrade200lessRetMoney;
	}
	public Double getM12PaymentTrade200lessRetTime()
	{
		return this.m12PaymentTrade200lessRetTime;
	}
	public void setM12PaymentTrade200lessRetTime(Double m12PaymentTrade200lessRetTime)
	{
		this.m12PaymentTrade200lessRetTime = m12PaymentTrade200lessRetTime;
	}
	public Double getM12PaymentTrade200lessmoney()
	{
		return this.m12PaymentTrade200lessmoney;
	}
	public void setM12PaymentTrade200lessmoney(Double m12PaymentTrade200lessmoney)
	{
		this.m12PaymentTrade200lessmoney = m12PaymentTrade200lessmoney;
	}
	public Double getM12PaymentTrade200lesstime()
	{
		return this.m12PaymentTrade200lesstime;
	}
	public void setM12PaymentTrade200lesstime(Double m12PaymentTrade200lesstime)
	{
		this.m12PaymentTrade200lesstime = m12PaymentTrade200lesstime;
	}
	public Double getM12PaymentTrade3klessmoney()
	{
		return this.m12PaymentTrade3klessmoney;
	}
	public void setM12PaymentTrade3klessmoney(Double m12PaymentTrade3klessmoney)
	{
		this.m12PaymentTrade3klessmoney = m12PaymentTrade3klessmoney;
	}
	public Double getM12PaymentTrade3klesstime()
	{
		return this.m12PaymentTrade3klesstime;
	}
	public void setM12PaymentTrade3klesstime(Double m12PaymentTrade3klesstime)
	{
		this.m12PaymentTrade3klesstime = m12PaymentTrade3klesstime;
	}
	public Double getM12PaymentTrade5kmoreRetMoney()
	{
		return this.m12PaymentTrade5kmoreRetMoney;
	}
	public void setM12PaymentTrade5kmoreRetMoney(Double m12PaymentTrade5kmoreRetMoney)
	{
		this.m12PaymentTrade5kmoreRetMoney = m12PaymentTrade5kmoreRetMoney;
	}
	public Double getM12PaymentTrade5kmoreRetTime()
	{
		return this.m12PaymentTrade5kmoreRetTime;
	}
	public void setM12PaymentTrade5kmoreRetTime(Double m12PaymentTrade5kmoreRetTime)
	{
		this.m12PaymentTrade5kmoreRetTime = m12PaymentTrade5kmoreRetTime;
	}
	public Double getM12PaymentTrade5kmoremoney()
	{
		return this.m12PaymentTrade5kmoremoney;
	}
	public void setM12PaymentTrade5kmoremoney(Double m12PaymentTrade5kmoremoney)
	{
		this.m12PaymentTrade5kmoremoney = m12PaymentTrade5kmoremoney;
	}
	public Double getM12PaymentTrade5kmoretime()
	{
		return this.m12PaymentTrade5kmoretime;
	}
	public void setM12PaymentTrade5kmoretime(Double m12PaymentTrade5kmoretime)
	{
		this.m12PaymentTrade5kmoretime = m12PaymentTrade5kmoretime;
	}
	public Double getM1ConsuSalaRet()
	{
		return this.m1ConsuSalaRet;
	}
	public void setM1ConsuSalaRet(Double m1ConsuSalaRet)
	{
		this.m1ConsuSalaRet = m1ConsuSalaRet;
	}
	public Double getM1LinkraConsumeAdd()
	{
		return this.m1LinkraConsumeAdd;
	}
	public void setM1LinkraConsumeAdd(Double m1LinkraConsumeAdd)
	{
		this.m1LinkraConsumeAdd = m1LinkraConsumeAdd;
	}
	public Double getM1LinkraTimeconsuAdd()
	{
		return this.m1LinkraTimeconsuAdd;
	}
	public void setM1LinkraTimeconsuAdd(Double m1LinkraTimeconsuAdd)
	{
		this.m1LinkraTimeconsuAdd = m1LinkraTimeconsuAdd;
	}
	public Double getM1LinkraTradeAdd()
	{
		return this.m1LinkraTradeAdd;
	}
	public void setM1LinkraTradeAdd(Double m1LinkraTradeAdd)
	{
		this.m1LinkraTradeAdd = m1LinkraTradeAdd;
	}
	public Double getM1LinkraTradeTimeconsuAdd()
	{
		return this.m1LinkraTradeTimeconsuAdd;
	}
	public void setM1LinkraTradeTimeconsuAdd(Double m1LinkraTradeTimeconsuAdd)
	{
		this.m1LinkraTradeTimeconsuAdd = m1LinkraTradeTimeconsuAdd;
	}
	public Double getM1Payment2005klessmoney()
	{
		return this.m1Payment2005klessmoney;
	}
	public void setM1Payment2005klessmoney(Double m1Payment2005klessmoney)
	{
		this.m1Payment2005klessmoney = m1Payment2005klessmoney;
	}
	public Double getM1Payment2005klesstime()
	{
		return this.m1Payment2005klesstime;
	}
	public void setM1Payment2005klesstime(Double m1Payment2005klesstime)
	{
		this.m1Payment2005klesstime = m1Payment2005klesstime;
	}
	public Double getM1Payment200lessmoney()
	{
		return this.m1Payment200lessmoney;
	}
	public void setM1Payment200lessmoney(Double m1Payment200lessmoney)
	{
		this.m1Payment200lessmoney = m1Payment200lessmoney;
	}
	public Double getM1Payment200lesstime()
	{
		return this.m1Payment200lesstime;
	}
	public void setM1Payment200lesstime(Double m1Payment200lesstime)
	{
		this.m1Payment200lesstime = m1Payment200lesstime;
	}
	public Double getM1Payment3klessmoney()
	{
		return this.m1Payment3klessmoney;
	}
	public void setM1Payment3klessmoney(Double m1Payment3klessmoney)
	{
		this.m1Payment3klessmoney = m1Payment3klessmoney;
	}
	public Double getM1Payment3klesstime()
	{
		return this.m1Payment3klesstime;
	}
	public void setM1Payment3klesstime(Double m1Payment3klesstime)
	{
		this.m1Payment3klesstime = m1Payment3klesstime;
	}
	public Double getM1Payment5kmoremoney()
	{
		return this.m1Payment5kmoremoney;
	}
	public void setM1Payment5kmoremoney(Double m1Payment5kmoremoney)
	{
		this.m1Payment5kmoremoney = m1Payment5kmoremoney;
	}
	public Double getM1Payment5kmoretime()
	{
		return this.m1Payment5kmoretime;
	}
	public void setM1Payment5kmoretime(Double m1Payment5kmoretime)
	{
		this.m1Payment5kmoretime = m1Payment5kmoretime;
	}
	public Double getM1PaymentTrade2005klessmoney()
	{
		return this.m1PaymentTrade2005klessmoney;
	}
	public void setM1PaymentTrade2005klessmoney(Double m1PaymentTrade2005klessmoney)
	{
		this.m1PaymentTrade2005klessmoney = m1PaymentTrade2005klessmoney;
	}
	public Double getM1PaymentTrade2005klesstime()
	{
		return this.m1PaymentTrade2005klesstime;
	}
	public void setM1PaymentTrade2005klesstime(Double m1PaymentTrade2005klesstime)
	{
		this.m1PaymentTrade2005klesstime = m1PaymentTrade2005klesstime;
	}
	public Double getM1PaymentTrade200lessmoney()
	{
		return this.m1PaymentTrade200lessmoney;
	}
	public void setM1PaymentTrade200lessmoney(Double m1PaymentTrade200lessmoney)
	{
		this.m1PaymentTrade200lessmoney = m1PaymentTrade200lessmoney;
	}
	public Double getM1PaymentTrade200lesstime()
	{
		return this.m1PaymentTrade200lesstime;
	}
	public void setM1PaymentTrade200lesstime(Double m1PaymentTrade200lesstime)
	{
		this.m1PaymentTrade200lesstime = m1PaymentTrade200lesstime;
	}
	public Double getM1PaymentTrade3klessmoney()
	{
		return this.m1PaymentTrade3klessmoney;
	}
	public void setM1PaymentTrade3klessmoney(Double m1PaymentTrade3klessmoney)
	{
		this.m1PaymentTrade3klessmoney = m1PaymentTrade3klessmoney;
	}
	public Double getM1PaymentTrade3klesstime()
	{
		return this.m1PaymentTrade3klesstime;
	}
	public void setM1PaymentTrade3klesstime(Double m1PaymentTrade3klesstime)
	{
		this.m1PaymentTrade3klesstime = m1PaymentTrade3klesstime;
	}
	public Double getM1PaymentTrade5kmoremoney()
	{
		return this.m1PaymentTrade5kmoremoney;
	}
	public void setM1PaymentTrade5kmoremoney(Double m1PaymentTrade5kmoremoney)
	{
		this.m1PaymentTrade5kmoremoney = m1PaymentTrade5kmoremoney;
	}
	public Double getM1PaymentTrade5kmoretime()
	{
		return this.m1PaymentTrade5kmoretime;
	}
	public void setM1PaymentTrade5kmoretime(Double m1PaymentTrade5kmoretime)
	{
		this.m1PaymentTrade5kmoretime = m1PaymentTrade5kmoretime;
	}
	public Double getM2LinkraConsumeAdd()
	{
		return this.m2LinkraConsumeAdd;
	}
	public void setM2LinkraConsumeAdd(Double m2LinkraConsumeAdd)
	{
		this.m2LinkraConsumeAdd = m2LinkraConsumeAdd;
	}
	public Double getM2LinkraTimeconsuAdd()
	{
		return this.m2LinkraTimeconsuAdd;
	}
	public void setM2LinkraTimeconsuAdd(Double m2LinkraTimeconsuAdd)
	{
		this.m2LinkraTimeconsuAdd = m2LinkraTimeconsuAdd;
	}
	public Double getM2LinkraTradeAdd()
	{
		return this.m2LinkraTradeAdd;
	}
	public void setM2LinkraTradeAdd(Double m2LinkraTradeAdd)
	{
		this.m2LinkraTradeAdd = m2LinkraTradeAdd;
	}
	public Double getM2LinkraTradeTimeconsuAdd()
	{
		return this.m2LinkraTradeTimeconsuAdd;
	}
	public void setM2LinkraTradeTimeconsuAdd(Double m2LinkraTradeTimeconsuAdd)
	{
		this.m2LinkraTradeTimeconsuAdd = m2LinkraTradeTimeconsuAdd;
	}
	public Double getM3ConsuSalaRet()
	{
		return this.m3ConsuSalaRet;
	}
	public void setM3ConsuSalaRet(Double m3ConsuSalaRet)
	{
		this.m3ConsuSalaRet = m3ConsuSalaRet;
	}
	public Double getM3LinkraConsumeAdd()
	{
		return this.m3LinkraConsumeAdd;
	}
	public void setM3LinkraConsumeAdd(Double m3LinkraConsumeAdd)
	{
		this.m3LinkraConsumeAdd = m3LinkraConsumeAdd;
	}
	public Double getM3LinkraTimeconsuAdd()
	{
		return this.m3LinkraTimeconsuAdd;
	}
	public void setM3LinkraTimeconsuAdd(Double m3LinkraTimeconsuAdd)
	{
		this.m3LinkraTimeconsuAdd = m3LinkraTimeconsuAdd;
	}
	public Double getM3LinkraTradeAdd()
	{
		return this.m3LinkraTradeAdd;
	}
	public void setM3LinkraTradeAdd(Double m3LinkraTradeAdd)
	{
		this.m3LinkraTradeAdd = m3LinkraTradeAdd;
	}
	public Double getM3LinkraTradeTimeconsuAdd()
	{
		return this.m3LinkraTradeTimeconsuAdd;
	}
	public void setM3LinkraTradeTimeconsuAdd(Double m3LinkraTradeTimeconsuAdd)
	{
		this.m3LinkraTradeTimeconsuAdd = m3LinkraTradeTimeconsuAdd;
	}
	public Double getM3Payment2005klessRetMoney()
	{
		return this.m3Payment2005klessRetMoney;
	}
	public void setM3Payment2005klessRetMoney(Double m3Payment2005klessRetMoney)
	{
		this.m3Payment2005klessRetMoney = m3Payment2005klessRetMoney;
	}
	public Double getM3Payment2005klessRetTime()
	{
		return this.m3Payment2005klessRetTime;
	}
	public void setM3Payment2005klessRetTime(Double m3Payment2005klessRetTime)
	{
		this.m3Payment2005klessRetTime = m3Payment2005klessRetTime;
	}
	public Double getM3Payment2005klessmoney()
	{
		return this.m3Payment2005klessmoney;
	}
	public void setM3Payment2005klessmoney(Double m3Payment2005klessmoney)
	{
		this.m3Payment2005klessmoney = m3Payment2005klessmoney;
	}
	public Double getM3Payment2005klesstime()
	{
		return this.m3Payment2005klesstime;
	}
	public void setM3Payment2005klesstime(Double m3Payment2005klesstime)
	{
		this.m3Payment2005klesstime = m3Payment2005klesstime;
	}
	public Double getM3Payment200lessRetMoney()
	{
		return this.m3Payment200lessRetMoney;
	}
	public void setM3Payment200lessRetMoney(Double m3Payment200lessRetMoney)
	{
		this.m3Payment200lessRetMoney = m3Payment200lessRetMoney;
	}
	public Double getM3Payment200lessRetTime()
	{
		return this.m3Payment200lessRetTime;
	}
	public void setM3Payment200lessRetTime(Double m3Payment200lessRetTime)
	{
		this.m3Payment200lessRetTime = m3Payment200lessRetTime;
	}
	public Double getM3Payment200lessmoney()
	{
		return this.m3Payment200lessmoney;
	}
	public void setM3Payment200lessmoney(Double m3Payment200lessmoney)
	{
		this.m3Payment200lessmoney = m3Payment200lessmoney;
	}
	public Double getM3Payment200lesstime()
	{
		return this.m3Payment200lesstime;
	}
	public void setM3Payment200lesstime(Double m3Payment200lesstime)
	{
		this.m3Payment200lesstime = m3Payment200lesstime;
	}
	public Double getM3Payment3klessmoney()
	{
		return this.m3Payment3klessmoney;
	}
	public void setM3Payment3klessmoney(Double m3Payment3klessmoney)
	{
		this.m3Payment3klessmoney = m3Payment3klessmoney;
	}
	public Double getM3Payment3klesstime()
	{
		return this.m3Payment3klesstime;
	}
	public void setM3Payment3klesstime(Double m3Payment3klesstime)
	{
		this.m3Payment3klesstime = m3Payment3klesstime;
	}
	public Double getM3Payment5kmoreRetMoney()
	{
		return this.m3Payment5kmoreRetMoney;
	}
	public void setM3Payment5kmoreRetMoney(Double m3Payment5kmoreRetMoney)
	{
		this.m3Payment5kmoreRetMoney = m3Payment5kmoreRetMoney;
	}
	public Double getM3Payment5kmoreRetTime()
	{
		return this.m3Payment5kmoreRetTime;
	}
	public void setM3Payment5kmoreRetTime(Double m3Payment5kmoreRetTime)
	{
		this.m3Payment5kmoreRetTime = m3Payment5kmoreRetTime;
	}
	public Double getM3Payment5kmoremoney()
	{
		return this.m3Payment5kmoremoney;
	}
	public void setM3Payment5kmoremoney(Double m3Payment5kmoremoney)
	{
		this.m3Payment5kmoremoney = m3Payment5kmoremoney;
	}
	public Double getM3Payment5kmoretime()
	{
		return this.m3Payment5kmoretime;
	}
	public void setM3Payment5kmoretime(Double m3Payment5kmoretime)
	{
		this.m3Payment5kmoretime = m3Payment5kmoretime;
	}
	public Double getM3PaymentTrade2005klessRetMoney()
	{
		return this.m3PaymentTrade2005klessRetMoney;
	}
	public void setM3PaymentTrade2005klessRetMoney(Double m3PaymentTrade2005klessRetMoney)
	{
		this.m3PaymentTrade2005klessRetMoney = m3PaymentTrade2005klessRetMoney;
	}
	public Double getM3PaymentTrade2005klessRetTime()
	{
		return this.m3PaymentTrade2005klessRetTime;
	}
	public void setM3PaymentTrade2005klessRetTime(Double m3PaymentTrade2005klessRetTime)
	{
		this.m3PaymentTrade2005klessRetTime = m3PaymentTrade2005klessRetTime;
	}
	public Double getM3PaymentTrade2005klessmoney()
	{
		return this.m3PaymentTrade2005klessmoney;
	}
	public void setM3PaymentTrade2005klessmoney(Double m3PaymentTrade2005klessmoney)
	{
		this.m3PaymentTrade2005klessmoney = m3PaymentTrade2005klessmoney;
	}
	public Double getM3PaymentTrade2005klesstime()
	{
		return this.m3PaymentTrade2005klesstime;
	}
	public void setM3PaymentTrade2005klesstime(Double m3PaymentTrade2005klesstime)
	{
		this.m3PaymentTrade2005klesstime = m3PaymentTrade2005klesstime;
	}
	public Double getM3PaymentTrade200lessRetMoney()
	{
		return this.m3PaymentTrade200lessRetMoney;
	}
	public void setM3PaymentTrade200lessRetMoney(Double m3PaymentTrade200lessRetMoney)
	{
		this.m3PaymentTrade200lessRetMoney = m3PaymentTrade200lessRetMoney;
	}
	public Double getM3PaymentTrade200lessRetTime()
	{
		return this.m3PaymentTrade200lessRetTime;
	}
	public void setM3PaymentTrade200lessRetTime(Double m3PaymentTrade200lessRetTime)
	{
		this.m3PaymentTrade200lessRetTime = m3PaymentTrade200lessRetTime;
	}
	public Double getM3PaymentTrade200lessmoney()
	{
		return this.m3PaymentTrade200lessmoney;
	}
	public void setM3PaymentTrade200lessmoney(Double m3PaymentTrade200lessmoney)
	{
		this.m3PaymentTrade200lessmoney = m3PaymentTrade200lessmoney;
	}
	public Double getM3PaymentTrade200lesstime()
	{
		return this.m3PaymentTrade200lesstime;
	}
	public void setM3PaymentTrade200lesstime(Double m3PaymentTrade200lesstime)
	{
		this.m3PaymentTrade200lesstime = m3PaymentTrade200lesstime;
	}
	public Double getM3PaymentTrade3klessmoney()
	{
		return this.m3PaymentTrade3klessmoney;
	}
	public void setM3PaymentTrade3klessmoney(Double m3PaymentTrade3klessmoney)
	{
		this.m3PaymentTrade3klessmoney = m3PaymentTrade3klessmoney;
	}
	public Double getM3PaymentTrade3klesstime()
	{
		return this.m3PaymentTrade3klesstime;
	}
	public void setM3PaymentTrade3klesstime(Double m3PaymentTrade3klesstime)
	{
		this.m3PaymentTrade3klesstime = m3PaymentTrade3klesstime;
	}
	public Double getM3PaymentTrade5kmoreRetMoney()
	{
		return this.m3PaymentTrade5kmoreRetMoney;
	}
	public void setM3PaymentTrade5kmoreRetMoney(Double m3PaymentTrade5kmoreRetMoney)
	{
		this.m3PaymentTrade5kmoreRetMoney = m3PaymentTrade5kmoreRetMoney;
	}
	public Double getM3PaymentTrade5kmoreRetTime()
	{
		return this.m3PaymentTrade5kmoreRetTime;
	}
	public void setM3PaymentTrade5kmoreRetTime(Double m3PaymentTrade5kmoreRetTime)
	{
		this.m3PaymentTrade5kmoreRetTime = m3PaymentTrade5kmoreRetTime;
	}
	public Double getM3PaymentTrade5kmoremoney()
	{
		return this.m3PaymentTrade5kmoremoney;
	}
	public void setM3PaymentTrade5kmoremoney(Double m3PaymentTrade5kmoremoney)
	{
		this.m3PaymentTrade5kmoremoney = m3PaymentTrade5kmoremoney;
	}
	public Double getM3PaymentTrade5kmoretime()
	{
		return this.m3PaymentTrade5kmoretime;
	}
	public void setM3PaymentTrade5kmoretime(Double m3PaymentTrade5kmoretime)
	{
		this.m3PaymentTrade5kmoretime = m3PaymentTrade5kmoretime;
	}
	public Double getM4LinkraConsumeAdd()
	{
		return this.m4LinkraConsumeAdd;
	}
	public void setM4LinkraConsumeAdd(Double m4LinkraConsumeAdd)
	{
		this.m4LinkraConsumeAdd = m4LinkraConsumeAdd;
	}
	public Double getM4LinkraTimeconsuAdd()
	{
		return this.m4LinkraTimeconsuAdd;
	}
	public void setM4LinkraTimeconsuAdd(Double m4LinkraTimeconsuAdd)
	{
		this.m4LinkraTimeconsuAdd = m4LinkraTimeconsuAdd;
	}
	public Double getM4LinkraTradeAdd()
	{
		return this.m4LinkraTradeAdd;
	}
	public void setM4LinkraTradeAdd(Double m4LinkraTradeAdd)
	{
		this.m4LinkraTradeAdd = m4LinkraTradeAdd;
	}
	public Double getM4LinkraTradeTimeconsuAdd()
	{
		return this.m4LinkraTradeTimeconsuAdd;
	}
	public void setM4LinkraTradeTimeconsuAdd(Double m4LinkraTradeTimeconsuAdd)
	{
		this.m4LinkraTradeTimeconsuAdd = m4LinkraTradeTimeconsuAdd;
	}
	public Double getM5LinkraConsumeAdd()
	{
		return this.m5LinkraConsumeAdd;
	}
	public void setM5LinkraConsumeAdd(Double m5LinkraConsumeAdd)
	{
		this.m5LinkraConsumeAdd = m5LinkraConsumeAdd;
	}
	public Double getM5LinkraTimeconsuAdd()
	{
		return this.m5LinkraTimeconsuAdd;
	}
	public void setM5LinkraTimeconsuAdd(Double m5LinkraTimeconsuAdd)
	{
		this.m5LinkraTimeconsuAdd = m5LinkraTimeconsuAdd;
	}
	public Double getM5LinkraTradeAdd()
	{
		return this.m5LinkraTradeAdd;
	}
	public void setM5LinkraTradeAdd(Double m5LinkraTradeAdd)
	{
		this.m5LinkraTradeAdd = m5LinkraTradeAdd;
	}
	public Double getM5LinkraTradeTimeconsuAdd()
	{
		return this.m5LinkraTradeTimeconsuAdd;
	}
	public void setM5LinkraTradeTimeconsuAdd(Double m5LinkraTradeTimeconsuAdd)
	{
		this.m5LinkraTradeTimeconsuAdd = m5LinkraTradeTimeconsuAdd;
	}
	public Double getM6ConsuSalaRet()
	{
		return this.m6ConsuSalaRet;
	}
	public void setM6ConsuSalaRet(Double m6ConsuSalaRet)
	{
		this.m6ConsuSalaRet = m6ConsuSalaRet;
	}
	public Double getM6LinkraConsumeAdd()
	{
		return this.m6LinkraConsumeAdd;
	}
	public void setM6LinkraConsumeAdd(Double m6LinkraConsumeAdd)
	{
		this.m6LinkraConsumeAdd = m6LinkraConsumeAdd;
	}
	public Double getM6LinkraTimeconsuAdd()
	{
		return this.m6LinkraTimeconsuAdd;
	}
	public void setM6LinkraTimeconsuAdd(Double m6LinkraTimeconsuAdd)
	{
		this.m6LinkraTimeconsuAdd = m6LinkraTimeconsuAdd;
	}
	public Double getM6LinkraTradeAdd()
	{
		return this.m6LinkraTradeAdd;
	}
	public void setM6LinkraTradeAdd(Double m6LinkraTradeAdd)
	{
		this.m6LinkraTradeAdd = m6LinkraTradeAdd;
	}
	public Double getM6LinkraTradeTimeconsuAdd()
	{
		return this.m6LinkraTradeTimeconsuAdd;
	}
	public void setM6LinkraTradeTimeconsuAdd(Double m6LinkraTradeTimeconsuAdd)
	{
		this.m6LinkraTradeTimeconsuAdd = m6LinkraTradeTimeconsuAdd;
	}
	public Double getM6Payment2005klessRetMoney()
	{
		return this.m6Payment2005klessRetMoney;
	}
	public void setM6Payment2005klessRetMoney(Double m6Payment2005klessRetMoney)
	{
		this.m6Payment2005klessRetMoney = m6Payment2005klessRetMoney;
	}
	public Double getM6Payment2005klessRetTime()
	{
		return this.m6Payment2005klessRetTime;
	}
	public void setM6Payment2005klessRetTime(Double m6Payment2005klessRetTime)
	{
		this.m6Payment2005klessRetTime = m6Payment2005klessRetTime;
	}
	public Double getM6Payment2005klessmoney()
	{
		return this.m6Payment2005klessmoney;
	}
	public void setM6Payment2005klessmoney(Double m6Payment2005klessmoney)
	{
		this.m6Payment2005klessmoney = m6Payment2005klessmoney;
	}
	public Double getM6Payment2005klesstime()
	{
		return this.m6Payment2005klesstime;
	}
	public void setM6Payment2005klesstime(Double m6Payment2005klesstime)
	{
		this.m6Payment2005klesstime = m6Payment2005klesstime;
	}
	public Double getM6Payment200lessRetMoney()
	{
		return this.m6Payment200lessRetMoney;
	}
	public void setM6Payment200lessRetMoney(Double m6Payment200lessRetMoney)
	{
		this.m6Payment200lessRetMoney = m6Payment200lessRetMoney;
	}
	public Double getM6Payment200lessRetTime()
	{
		return this.m6Payment200lessRetTime;
	}
	public void setM6Payment200lessRetTime(Double m6Payment200lessRetTime)
	{
		this.m6Payment200lessRetTime = m6Payment200lessRetTime;
	}
	public Double getM6Payment200lessmoney()
	{
		return this.m6Payment200lessmoney;
	}
	public void setM6Payment200lessmoney(Double m6Payment200lessmoney)
	{
		this.m6Payment200lessmoney = m6Payment200lessmoney;
	}
	public Double getM6Payment200lesstime()
	{
		return this.m6Payment200lesstime;
	}
	public void setM6Payment200lesstime(Double m6Payment200lesstime)
	{
		this.m6Payment200lesstime = m6Payment200lesstime;
	}
	public Double getM6Payment3klessmoney()
	{
		return this.m6Payment3klessmoney;
	}
	public void setM6Payment3klessmoney(Double m6Payment3klessmoney)
	{
		this.m6Payment3klessmoney = m6Payment3klessmoney;
	}
	public Double getM6Payment3klesstime()
	{
		return this.m6Payment3klesstime;
	}
	public void setM6Payment3klesstime(Double m6Payment3klesstime)
	{
		this.m6Payment3klesstime = m6Payment3klesstime;
	}
	public Double getM6Payment5kmoreRetMoney()
	{
		return this.m6Payment5kmoreRetMoney;
	}
	public void setM6Payment5kmoreRetMoney(Double m6Payment5kmoreRetMoney)
	{
		this.m6Payment5kmoreRetMoney = m6Payment5kmoreRetMoney;
	}
	public Double getM6Payment5kmoreRetTime()
	{
		return this.m6Payment5kmoreRetTime;
	}
	public void setM6Payment5kmoreRetTime(Double m6Payment5kmoreRetTime)
	{
		this.m6Payment5kmoreRetTime = m6Payment5kmoreRetTime;
	}
	public Double getM6Payment5kmoremoney()
	{
		return this.m6Payment5kmoremoney;
	}
	public void setM6Payment5kmoremoney(Double m6Payment5kmoremoney)
	{
		this.m6Payment5kmoremoney = m6Payment5kmoremoney;
	}
	public Double getM6Payment5kmoretime()
	{
		return this.m6Payment5kmoretime;
	}
	public void setM6Payment5kmoretime(Double m6Payment5kmoretime)
	{
		this.m6Payment5kmoretime = m6Payment5kmoretime;
	}
	public Double getM6PaymentTrade2005klessRetMoney()
	{
		return this.m6PaymentTrade2005klessRetMoney;
	}
	public void setM6PaymentTrade2005klessRetMoney(Double m6PaymentTrade2005klessRetMoney)
	{
		this.m6PaymentTrade2005klessRetMoney = m6PaymentTrade2005klessRetMoney;
	}
	public Double getM6PaymentTrade2005klessRetTime()
	{
		return this.m6PaymentTrade2005klessRetTime;
	}
	public void setM6PaymentTrade2005klessRetTime(Double m6PaymentTrade2005klessRetTime)
	{
		this.m6PaymentTrade2005klessRetTime = m6PaymentTrade2005klessRetTime;
	}
	public Double getM6PaymentTrade2005klessmoney()
	{
		return this.m6PaymentTrade2005klessmoney;
	}
	public void setM6PaymentTrade2005klessmoney(Double m6PaymentTrade2005klessmoney)
	{
		this.m6PaymentTrade2005klessmoney = m6PaymentTrade2005klessmoney;
	}
	public Double getM6PaymentTrade2005klesstime()
	{
		return this.m6PaymentTrade2005klesstime;
	}
	public void setM6PaymentTrade2005klesstime(Double m6PaymentTrade2005klesstime)
	{
		this.m6PaymentTrade2005klesstime = m6PaymentTrade2005klesstime;
	}
	public Double getM6PaymentTrade200lessRetMoney()
	{
		return this.m6PaymentTrade200lessRetMoney;
	}
	public void setM6PaymentTrade200lessRetMoney(Double m6PaymentTrade200lessRetMoney)
	{
		this.m6PaymentTrade200lessRetMoney = m6PaymentTrade200lessRetMoney;
	}
	public Double getM6PaymentTrade200lessRetTime()
	{
		return this.m6PaymentTrade200lessRetTime;
	}
	public void setM6PaymentTrade200lessRetTime(Double m6PaymentTrade200lessRetTime)
	{
		this.m6PaymentTrade200lessRetTime = m6PaymentTrade200lessRetTime;
	}
	public Double getM6PaymentTrade200lessmoney()
	{
		return this.m6PaymentTrade200lessmoney;
	}
	public void setM6PaymentTrade200lessmoney(Double m6PaymentTrade200lessmoney)
	{
		this.m6PaymentTrade200lessmoney = m6PaymentTrade200lessmoney;
	}
	public Double getM6PaymentTrade200lesstime()
	{
		return this.m6PaymentTrade200lesstime;
	}
	public void setM6PaymentTrade200lesstime(Double m6PaymentTrade200lesstime)
	{
		this.m6PaymentTrade200lesstime = m6PaymentTrade200lesstime;
	}
	public Double getM6PaymentTrade3klessmoney()
	{
		return this.m6PaymentTrade3klessmoney;
	}
	public void setM6PaymentTrade3klessmoney(Double m6PaymentTrade3klessmoney)
	{
		this.m6PaymentTrade3klessmoney = m6PaymentTrade3klessmoney;
	}
	public Double getM6PaymentTrade3klesstime()
	{
		return this.m6PaymentTrade3klesstime;
	}
	public void setM6PaymentTrade3klesstime(Double m6PaymentTrade3klesstime)
	{
		this.m6PaymentTrade3klesstime = m6PaymentTrade3klesstime;
	}
	public Double getM6PaymentTrade5kmoreRetMoney()
	{
		return this.m6PaymentTrade5kmoreRetMoney;
	}
	public void setM6PaymentTrade5kmoreRetMoney(Double m6PaymentTrade5kmoreRetMoney)
	{
		this.m6PaymentTrade5kmoreRetMoney = m6PaymentTrade5kmoreRetMoney;
	}
	public Double getM6PaymentTrade5kmoreRetTime()
	{
		return this.m6PaymentTrade5kmoreRetTime;
	}
	public void setM6PaymentTrade5kmoreRetTime(Double m6PaymentTrade5kmoreRetTime)
	{
		this.m6PaymentTrade5kmoreRetTime = m6PaymentTrade5kmoreRetTime;
	}
	public Double getM6PaymentTrade5kmoremoney()
	{
		return this.m6PaymentTrade5kmoremoney;
	}
	public void setM6PaymentTrade5kmoremoney(Double m6PaymentTrade5kmoremoney)
	{
		this.m6PaymentTrade5kmoremoney = m6PaymentTrade5kmoremoney;
	}
	public Double getM6PaymentTrade5kmoretime()
	{
		return this.m6PaymentTrade5kmoretime;
	}
	public void setM6PaymentTrade5kmoretime(Double m6PaymentTrade5kmoretime)
	{
		this.m6PaymentTrade5kmoretime = m6PaymentTrade5kmoretime;
	}
	public Double getM7LinkraConsumeAdd()
	{
		return this.m7LinkraConsumeAdd;
	}
	public void setM7LinkraConsumeAdd(Double m7LinkraConsumeAdd)
	{
		this.m7LinkraConsumeAdd = m7LinkraConsumeAdd;
	}
	public Double getM7LinkraTimeconsuAdd()
	{
		return this.m7LinkraTimeconsuAdd;
	}
	public void setM7LinkraTimeconsuAdd(Double m7LinkraTimeconsuAdd)
	{
		this.m7LinkraTimeconsuAdd = m7LinkraTimeconsuAdd;
	}
	public Double getM7LinkraTradeAdd()
	{
		return this.m7LinkraTradeAdd;
	}
	public void setM7LinkraTradeAdd(Double m7LinkraTradeAdd)
	{
		this.m7LinkraTradeAdd = m7LinkraTradeAdd;
	}
	public Double getM7LinkraTradeTimeconsuAdd()
	{
		return this.m7LinkraTradeTimeconsuAdd;
	}
	public void setM7LinkraTradeTimeconsuAdd(Double m7LinkraTradeTimeconsuAdd)
	{
		this.m7LinkraTradeTimeconsuAdd = m7LinkraTradeTimeconsuAdd;
	}
	public Double getM8LinkraConsumeAdd()
	{
		return this.m8LinkraConsumeAdd;
	}
	public void setM8LinkraConsumeAdd(Double m8LinkraConsumeAdd)
	{
		this.m8LinkraConsumeAdd = m8LinkraConsumeAdd;
	}
	public Double getM8LinkraTimeconsuAdd()
	{
		return this.m8LinkraTimeconsuAdd;
	}
	public void setM8LinkraTimeconsuAdd(Double m8LinkraTimeconsuAdd)
	{
		this.m8LinkraTimeconsuAdd = m8LinkraTimeconsuAdd;
	}
	public Double getM8LinkraTradeAdd()
	{
		return this.m8LinkraTradeAdd;
	}
	public void setM8LinkraTradeAdd(Double m8LinkraTradeAdd)
	{
		this.m8LinkraTradeAdd = m8LinkraTradeAdd;
	}
	public Double getM8LinkraTradeTimeconsuAdd()
	{
		return this.m8LinkraTradeTimeconsuAdd;
	}
	public void setM8LinkraTradeTimeconsuAdd(Double m8LinkraTradeTimeconsuAdd)
	{
		this.m8LinkraTradeTimeconsuAdd = m8LinkraTradeTimeconsuAdd;
	}
	public Double getM9LinkraConsumeAdd()
	{
		return this.m9LinkraConsumeAdd;
	}
	public void setM9LinkraConsumeAdd(Double m9LinkraConsumeAdd)
	{
		this.m9LinkraConsumeAdd = m9LinkraConsumeAdd;
	}
	public Double getM9LinkraTimeconsuAdd()
	{
		return this.m9LinkraTimeconsuAdd;
	}
	public void setM9LinkraTimeconsuAdd(Double m9LinkraTimeconsuAdd)
	{
		this.m9LinkraTimeconsuAdd = m9LinkraTimeconsuAdd;
	}
	public Double getM9LinkraTradeAdd()
	{
		return this.m9LinkraTradeAdd;
	}
	public void setM9LinkraTradeAdd(Double m9LinkraTradeAdd)
	{
		this.m9LinkraTradeAdd = m9LinkraTradeAdd;
	}
	public Double getM9LinkraTradeTimeconsuAdd()
	{
		return this.m9LinkraTradeTimeconsuAdd;
	}
	public void setM9LinkraTradeTimeconsuAdd(Double m9LinkraTradeTimeconsuAdd)
	{
		this.m9LinkraTradeTimeconsuAdd = m9LinkraTradeTimeconsuAdd;
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
