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
 * <p>Title: pdl_mobile_fea2 - 运营商特征表2 : Value Object</p> 
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
public class PdlMobileFea2 extends BaseEntity
{
	//****************************************************************************
	//fields
	//****************************************************************************
	@Label("排名前10位的联系人，在1月中的通话次数")
	private Double c110M01CallCt = null;
	@Label("排名前10位的联系人，在1月中的通话占比")
	private Double c110M01CallPer = null;
	@Label("排名前10位的联系人，在2月中的通话次数")
	private Double c110M12CallCt = null;
	@Label("排名前10位的联系人，在2月中的通话占比")
	private Double c110M12CallPer = null;
	@Label("排名前10位的联系人，在3月中的通话次数")
	private Double c110M23CallCt = null;
	@Label("排名前10位的联系人，在3月中的通话占比")
	private Double c110M23CallPer = null;
	@Label("排名前10位的联系人，在4月中的通话次数")
	private Double c110M34CallCt = null;
	@Label("排名前10位的联系人，在4月中的通话占比")
	private Double c110M34CallPer = null;
	@Label("排名前10位的联系人，在5月中的通话次数")
	private Double c110M45CallCt = null;
	@Label("排名前10位的联系人，在5月中的通话占比")
	private Double c110M45CallPer = null;
	@Label("排名前10位的联系人，在6月中的通话次数")
	private Double c110M56CallCt = null;
	@Label("排名前10位的联系人，在6月中的通话占比")
	private Double c110M56CallPer = null;
	@Label("排名前5位的联系人，在1月中的通话次数")
	private Double c15M01CallCt = null;
	@Label("排名前5位的联系人，在1月中的通话占比")
	private Double c15M01CallPer = null;
	@Label("排名前5位的联系人，在2月中的通话次数")
	private Double c15M12CallCt = null;
	@Label("排名前5位的联系人，在2月中的通话占比")
	private Double c15M12CallPer = null;
	@Label("排名前5位的联系人，在3月中的通话次数")
	private Double c15M23CallCt = null;
	@Label("排名前5位的联系人，在3月中的通话占比")
	private Double c15M23CallPer = null;
	@Label("排名前5位的联系人，在4月中的通话次数")
	private Double c15M34CallCt = null;
	@Label("排名前5位的联系人，在4月中的通话占比")
	private Double c15M34CallPer = null;
	@Label("排名前5位的联系人，在5月中的通话次数")
	private Double c15M45CallCt = null;
	@Label("排名前5位的联系人，在5月中的通话占比")
	private Double c15M45CallPer = null;
	@Label("排名前5位的联系人，在6月中的通话次数")
	private Double c15M56CallCt = null;
	@Label("排名前5位的联系人，在6月中的通话占比")
	private Double c15M56CallPer = null;
	@Label("排名第1位的联系人，在1月中的通话次数")
	private Double c1M01CallCt = null;
	@Label("排名第1位的联系人，在1月中的通话占比")
	private Double c1M01CallPer = null;
	@Label("排名第1位的联系人，在2月中的通话次数")
	private Double c1M12CallCt = null;
	@Label("排名第1位的联系人，在2月中的通话占比")
	private Double c1M12CallPer = null;
	@Label("排名第1位的联系人，在3月中的通话次数")
	private Double c1M23CallCt = null;
	@Label("排名第1位的联系人，在3月中的通话占比")
	private Double c1M23CallPer = null;
	@Label("排名第1位的联系人，在4月中的通话次数")
	private Double c1M34CallCt = null;
	@Label("排名第1位的联系人，在4月中的通话占比")
	private Double c1M34CallPer = null;
	@Label("排名第1位的联系人，在5月中的通话次数")
	private Double c1M45CallCt = null;
	@Label("排名第1位的联系人，在5月中的通话占比")
	private Double c1M45CallPer = null;
	@Label("排名第1位的联系人，在6月中的通话次数")
	private Double c1M56CallCt = null;
	@Label("排名第1位的联系人，在6月中的通话占比")
	private Double c1M56CallPer = null;
	@Label("排名第2位的联系人，在1月中的通话次数")
	private Double c2M01CallCt = null;
	@Label("排名第2位的联系人，在1月中的通话占比")
	private Double c2M01CallPer = null;
	@Label("排名第2位的联系人，在2月中的通话次数")
	private Double c2M12CallCt = null;
	@Label("排名第2位的联系人，在2月中的通话占比")
	private Double c2M12CallPer = null;
	@Label("排名第2位的联系人，在3月中的通话次数")
	private Double c2M23CallCt = null;
	@Label("排名第2位的联系人，在3月中的通话占比")
	private Double c2M23CallPer = null;
	@Label("排名第2位的联系人，在4月中的通话次数")
	private Double c2M34CallCt = null;
	@Label("排名第2位的联系人，在4月中的通话占比")
	private Double c2M34CallPer = null;
	@Label("排名第2位的联系人，在5月中的通话次数")
	private Double c2M45CallCt = null;
	@Label("排名第2位的联系人，在5月中的通话占比")
	private Double c2M45CallPer = null;
	@Label("排名第2位的联系人，在6月中的通话次数")
	private Double c2M56CallCt = null;
	@Label("排名第2位的联系人，在6月中的通话占比")
	private Double c2M56CallPer = null;
	@Label("排名第3位的联系人，在1月中的通话次数")
	private Double c3M01CallCt = null;
	@Label("排名第3位的联系人，在1月中的通话占比")
	private Double c3M01CallPer = null;
	@Label("排名第3位的联系人，在2月中的通话次数")
	private Double c3M12CallCt = null;
	@Label("排名第3位的联系人，在2月中的通话占比")
	private Double c3M12CallPer = null;
	@Label("排名第3位的联系人，在3月中的通话次数")
	private Double c3M23CallCt = null;
	@Label("排名第3位的联系人，在3月中的通话占比")
	private Double c3M23CallPer = null;
	@Label("排名第3位的联系人，在4月中的通话次数")
	private Double c3M34CallCt = null;
	@Label("排名第3位的联系人，在4月中的通话占比")
	private Double c3M34CallPer = null;
	@Label("排名第3位的联系人，在5月中的通话次数")
	private Double c3M45CallCt = null;
	@Label("排名第3位的联系人，在5月中的通话占比")
	private Double c3M45CallPer = null;
	@Label("排名第3位的联系人，在6月中的通话次数")
	private Double c3M56CallCt = null;
	@Label("排名第3位的联系人，在6月中的通话占比")
	private Double c3M56CallPer = null;
	@Label("主叫时间(00:00:00-06:00:00]的手机号个数（去重后的手机号）")
	private Double dawnCallNum = null;
	@Label("被叫时间(00:00:00-06:00:00]的手机号个数（去重后的手机号）")
	private Double dawnCalledNum = null;
	@Label("Default_feature_time_Comment")
	private Date featureTime = null;
	@Label("Default_id_Comment")
	private Integer id = null;
	@Label("第1个月通话在07_12时总时长")
	private Double m010712CallTimeLen = null;
	@Label("第1个月通话在07_12时总时长占比")
	private Double m010712CallTimePer = null;
	@Label("第1月通话在0_45秒以上通话次数(都不去重;[0,45))")
	private Double m01045CallCt = null;
	@Label("第1月通话在0_45秒以上通话次数占比(都不去重;[0,45))")
	private Double m01045CallPer = null;
	@Label("第1个月通话通话10次以上的电话个数及占比(总数不去重,大于等于10)")
	private Double m0110CallNum = null;
	@Label("第1个月通话通话10次以上的电话个数及占比(总数不去重,大于等于10)")
	private Double m0110CallPer = null;
	@Label("第1个月通话通话10次以上的电话个数及占比(总数去重,大于等于10)")
	private Double m0110CallUniqPer = null;
	@Label("第1个月通话在12_18时总时长")
	private Double m011218CallTimeLen = null;
	@Label("第1个月通话在12_18时总时长占比")
	private Double m011218CallTimePer = null;
	@Label("第1月通话在150_300秒以上通话次数(都不去重)")
	private Double m01150300CallCt = null;
	@Label("第1月通话在150_300秒以上通话次数占比(都不去重)")
	private Double m01150300CallPer = null;
	@Label("第1个月通话在18_22时总时长")
	private Double m011822CallTimeLen = null;
	@Label("第1个月通话在18_22时总时长占比")
	private Double m011822CallTimePer = null;
	@Label("第1个月通话在22-07时总时长")
	private Double m012207CallTimeLen = null;
	@Label("第1个月通话在22-07时总时长占比")
	private Double m012207CallTimePer = null;
	@Label("第1个月通话通话2次以上的电话个数及占比(总数不去重,大于等于2)")
	private Double m012CallNum = null;
	@Label("第1个月通话通话2次以上的电话个数及占比(总数不去重,大于等于2)")
	private Double m012CallPer = null;
	@Label("第1个月通话通话2次以上的电话个数及占比(总数去重,大于等于2)")
	private Double m012CallUniqPer = null;
	@Label("第1月通话在300_600秒以上通话次数(都不去重)")
	private Double m01300600CallCt = null;
	@Label("第1月通话在300_600秒以上通话次数占比(都不去重)")
	private Double m01300600CallPer = null;
	@Label("第1月通话在45_150秒以上通话次数(都不去重)")
	private Double m0145150CallCt = null;
	@Label("第1月通话在45_150秒以上通话次数占比(都不去重)")
	private Double m0145150CallPer = null;
	@Label("第1个月通话通话5次以上的电话个数及占比(总数不去重,大于等于5)")
	private Double m015CallNum = null;
	@Label("第1个月通话通话5次以上的电话个数及占比(总数不去重,大于等于5)")
	private Double m015CallPer = null;
	@Label("第1个月通话通话5次以上的电话个数及占比(总数去重,大于等于5)")
	private Double m015CallUniqPer = null;
	@Label("第1月通话在600_秒以上通话次数(都不去重)")
	private Double m01600CallCt = null;
	@Label("第1月通话在600_秒以上通话次数占比(都不去重)")
	private Double m01600CallPer = null;
	@Label("第1个月通话总时长")
	private Double m01CallTimeLen = null;
	@Label("第2个月通话在07_12时总时长")
	private Double m120712CallTimeLen = null;
	@Label("第2个月通话在07_12时总时长占比")
	private Double m120712CallTimePer = null;
	@Label("第2月通话在0_45秒以上通话次数(都不去重;[0,45))")
	private Double m12045CallCt = null;
	@Label("第2月通话在0_45秒以上通话次数占比(都不去重;[0,45))")
	private Double m12045CallPer = null;
	@Label("第2个月通话通话10次以上的电话个数及占比(总数不去重,大于等于10)")
	private Double m1210CallNum = null;
	@Label("第2个月通话通话10次以上的电话个数及占比(总数不去重,大于等于10)")
	private Double m1210CallPer = null;
	@Label("第2个月通话通话10次以上的电话个数及占比(总数去重,大于等于10)")
	private Double m1210CallUniqPer = null;
	@Label("第2个月通话在12_18时总时长")
	private Double m121218CallTimeLen = null;
	@Label("第2个月通话在12_18时总时长占比")
	private Double m121218CallTimePer = null;
	@Label("第2月通话在150_300秒以上通话次数(都不去重)")
	private Double m12150300CallCt = null;
	@Label("第2月通话在150_300秒以上通话次数占比(都不去重)")
	private Double m12150300CallPer = null;
	@Label("第2个月通话在18_22时总时长")
	private Double m121822CallTimeLen = null;
	@Label("第2个月通话在18_22时总时长占比")
	private Double m121822CallTimePer = null;
	@Label("第2个月通话在22-07时总时长")
	private Double m122207CallTimeLen = null;
	@Label("第2个月通话在22-07时总时长占比")
	private Double m122207CallTimePer = null;
	@Label("第2个月通话通话2次以上的电话个数及占比(总数不去重,大于等于2)")
	private Double m122CallNum = null;
	@Label("第2个月通话通话2次以上的电话个数及占比(总数不去重,大于等于2)")
	private Double m122CallPer = null;
	@Label("第2个月通话通话2次以上的电话个数及占比(总数去重,大于等于2)")
	private Double m122CallUniqPer = null;
	@Label("第2月通话在300_600秒以上通话次数(都不去重)")
	private Double m12300600CallCt = null;
	@Label("第2月通话在300_600秒以上通话次数占比(都不去重)")
	private Double m12300600CallPer = null;
	@Label("第2月通话在45_150秒以上通话次数(都不去重)")
	private Double m1245150CallCt = null;
	@Label("第2月通话在45_150秒以上通话次数占比(都不去重)")
	private Double m1245150CallPer = null;
	@Label("第2个月通话通话5次以上的电话个数及占比(总数不去重,大于等于5)")
	private Double m125CallNum = null;
	@Label("第2个月通话通话5次以上的电话个数及占比(总数不去重,大于等于5)")
	private Double m125CallPer = null;
	@Label("第2个月通话通话5次以上的电话个数及占比(总数去重,大于等于5)")
	private Double m125CallUniqPer = null;
	@Label("第2月通话在600_秒以上通话次数(都不去重)")
	private Double m12600CallCt = null;
	@Label("第2月通话在600_秒以上通话次数占比(都不去重)")
	private Double m12600CallPer = null;
	@Label("第2个月通话总时长")
	private Double m12CallTimeLen = null;
	@Label("第3个月通话在07_12时总时长")
	private Double m230712CallTimeLen = null;
	@Label("第3个月通话在07_12时总时长占比")
	private Double m230712CallTimePer = null;
	@Label("第3月通话在0_45秒以上通话次数(都不去重;[0,45))")
	private Double m23045CallCt = null;
	@Label("第3月通话在0_45秒以上通话次数占比(都不去重;[0,45))")
	private Double m23045CallPer = null;
	@Label("第3个月通话通话10次以上的电话个数及占比(总数不去重,大于等于10)")
	private Double m2310CallNum = null;
	@Label("第3个月通话通话10次以上的电话个数及占比(总数不去重,大于等于10)")
	private Double m2310CallPer = null;
	@Label("第3个月通话通话10次以上的电话个数及占比(总数去重,大于等于10)")
	private Double m2310CallUniqPer = null;
	@Label("第3个月通话在12_18时总时长")
	private Double m231218CallTimeLen = null;
	@Label("第3个月通话在12_18时总时长占比")
	private Double m231218CallTimePer = null;
	@Label("第3月通话在150_300秒以上通话次数(都不去重)")
	private Double m23150300CallCt = null;
	@Label("第3月通话在150_300秒以上通话次数占比(都不去重)")
	private Double m23150300CallPer = null;
	@Label("第3个月通话在18_22时总时长")
	private Double m231822CallTimeLen = null;
	@Label("第3个月通话在18_22时总时长占比")
	private Double m231822CallTimePer = null;
	@Label("第3个月通话在22-07时总时长")
	private Double m232207CallTimeLen = null;
	@Label("第3个月通话在22-07时总时长占比")
	private Double m232207CallTimePer = null;
	@Label("第3个月通话通话2次以上的电话个数及占比(总数不去重,大于等于2)")
	private Double m232CallNum = null;
	@Label("第3个月通话通话2次以上的电话个数及占比(总数不去重,大于等于2)")
	private Double m232CallPer = null;
	@Label("第3个月通话通话2次以上的电话个数及占比(总数去重,大于等于2)")
	private Double m232CallUniqPer = null;
	@Label("第3月通话在300_600秒以上通话次数(都不去重)")
	private Double m23300600CallCt = null;
	@Label("第3月通话在300_600秒以上通话次数占比(都不去重)")
	private Double m23300600CallPer = null;
	@Label("第3月通话在45_150秒以上通话次数(都不去重)")
	private Double m2345150CallCt = null;
	@Label("第3月通话在45_150秒以上通话次数占比(都不去重)")
	private Double m2345150CallPer = null;
	@Label("第3个月通话通话5次以上的电话个数及占比(总数不去重,大于等于5)")
	private Double m235CallNum = null;
	@Label("第3个月通话通话5次以上的电话个数及占比(总数不去重,大于等于5)")
	private Double m235CallPer = null;
	@Label("第3个月通话通话5次以上的电话个数及占比(总数去重,大于等于5)")
	private Double m235CallUniqPer = null;
	@Label("第3月通话在600_秒以上通话次数(都不去重)")
	private Double m23600CallCt = null;
	@Label("第3月通话在600_秒以上通话次数占比(都不去重)")
	private Double m23600CallPer = null;
	@Label("第3个月通话总时长")
	private Double m23CallTimeLen = null;
	@Label("第4个月通话在07_12时总时长")
	private Double m340712CallTimeLen = null;
	@Label("第4个月通话在07_12时总时长占比")
	private Double m340712CallTimePer = null;
	@Label("第4月通话在0_45秒以上通话次数(都不去重;[0,45))")
	private Double m34045CallCt = null;
	@Label("第4月通话在0_45秒以上通话次数占比(都不去重;[0,45))")
	private Double m34045CallPer = null;
	@Label("第4个月通话通话10次以上的电话个数及占比(总数不去重,大于等于10)")
	private Double m3410CallNum = null;
	@Label("第4个月通话通话10次以上的电话个数及占比(总数不去重,大于等于10)")
	private Double m3410CallPer = null;
	@Label("第4个月通话通话10次以上的电话个数及占比(总数去重,大于等于10)")
	private Double m3410CallUniqPer = null;
	@Label("第4个月通话在12_18时总时长")
	private Double m341218CallTimeLen = null;
	@Label("第4个月通话在12_18时总时长占比")
	private Double m341218CallTimePer = null;
	@Label("第4月通话在150_300秒以上通话次数(都不去重)")
	private Double m34150300CallCt = null;
	@Label("第4月通话在150_300秒以上通话次数占比(都不去重)")
	private Double m34150300CallPer = null;
	@Label("第4个月通话在18_22时总时长")
	private Double m341822CallTimeLen = null;
	@Label("第4个月通话在18_22时总时长占比")
	private Double m341822CallTimePer = null;
	@Label("第4个月通话在22-07时总时长")
	private Double m342207CallTimeLen = null;
	@Label("第4个月通话在22-07时总时长占比")
	private Double m342207CallTimePer = null;
	@Label("第4个月通话通话2次以上的电话个数及占比(总数不去重,大于等于2)")
	private Double m342CallNum = null;
	@Label("第4个月通话通话2次以上的电话个数及占比(总数不去重,大于等于2)")
	private Double m342CallPer = null;
	@Label("第4个月通话通话2次以上的电话个数及占比(总数去重,大于等于2)")
	private Double m342CallUniqPer = null;
	@Label("第4月通话在300_600秒以上通话次数(都不去重)")
	private Double m34300600CallCt = null;
	@Label("第4月通话在300_600秒以上通话次数占比(都不去重)")
	private Double m34300600CallPer = null;
	@Label("第4月通话在45_150秒以上通话次数(都不去重)")
	private Double m3445150CallCt = null;
	@Label("第4月通话在45_150秒以上通话次数占比(都不去重)")
	private Double m3445150CallPer = null;
	@Label("第4个月通话通话5次以上的电话个数及占比(总数不去重,大于等于5)")
	private Double m345CallNum = null;
	@Label("第4个月通话通话5次以上的电话个数及占比(总数不去重,大于等于5)")
	private Double m345CallPer = null;
	@Label("第4个月通话通话5次以上的电话个数及占比(总数去重,大于等于5)")
	private Double m345CallUniqPer = null;
	@Label("第4月通话在600_秒以上通话次数(都不去重)")
	private Double m34600CallCt = null;
	@Label("第4月通话在600_秒以上通话次数占比(都不去重)")
	private Double m34600CallPer = null;
	@Label("第4个月通话总时长")
	private Double m34CallTimeLen = null;
	@Label("第5个月通话在07_12时总时长")
	private Double m450712CallTimeLen = null;
	@Label("第5个月通话在07_12时总时长占比")
	private Double m450712CallTimePer = null;
	@Label("第5月通话在0_45秒以上通话次数(都不去重;[0,45))")
	private Double m45045CallCt = null;
	@Label("第5月通话在0_45秒以上通话次数占比(都不去重;[0,45))")
	private Double m45045CallPer = null;
	@Label("第5个月通话通话10次以上的电话个数及占比(总数不去重,大于等于10)")
	private Double m4510CallNum = null;
	@Label("第5个月通话通话10次以上的电话个数及占比(总数不去重,大于等于10)")
	private Double m4510CallPer = null;
	@Label("第5个月通话通话10次以上的电话个数及占比(总数去重,大于等于10)")
	private Double m4510CallUniqPer = null;
	@Label("第5个月通话在12_18时总时长")
	private Double m451218CallTimeLen = null;
	@Label("第5个月通话在12_18时总时长占比")
	private Double m451218CallTimePer = null;
	@Label("第5月通话在150_300秒以上通话次数(都不去重)")
	private Double m45150300CallCt = null;
	@Label("第5月通话在150_300秒以上通话次数占比(都不去重)")
	private Double m45150300CallPer = null;
	@Label("第5个月通话在18_22时总时长")
	private Double m451822CallTimeLen = null;
	@Label("第5个月通话在18_22时总时长占比")
	private Double m451822CallTimePer = null;
	@Label("第5个月通话在22-07时总时长")
	private Double m452207CallTimeLen = null;
	@Label("第5个月通话在22-07时总时长占比")
	private Double m452207CallTimePer = null;
	@Label("第5个月通话通话2次以上的电话个数及占比(总数不去重,大于等于2)")
	private Double m452CallNum = null;
	@Label("第5个月通话通话2次以上的电话个数及占比(总数不去重,大于等于2)")
	private Double m452CallPer = null;
	@Label("第5个月通话通话2次以上的电话个数及占比(总数去重,大于等于2)")
	private Double m452CallUniqPer = null;
	@Label("第5月通话在300_600秒以上通话次数(都不去重)")
	private Double m45300600CallCt = null;
	@Label("第5月通话在300_600秒以上通话次数占比(都不去重)")
	private Double m45300600CallPer = null;
	@Label("第5月通话在45_150秒以上通话次数(都不去重)")
	private Double m4545150CallCt = null;
	@Label("第5月通话在45_150秒以上通话次数占比(都不去重)")
	private Double m4545150CallPer = null;
	@Label("第5个月通话通话5次以上的电话个数及占比(总数不去重,大于等于5)")
	private Double m455CallNum = null;
	@Label("第5个月通话通话5次以上的电话个数及占比(总数不去重,大于等于5)")
	private Double m455CallPer = null;
	@Label("第5个月通话通话5次以上的电话个数及占比(总数去重,大于等于5)")
	private Double m455CallUniqPer = null;
	@Label("第5月通话在600_秒以上通话次数(都不去重)")
	private Double m45600CallCt = null;
	@Label("第5月通话在600_秒以上通话次数占比(都不去重)")
	private Double m45600CallPer = null;
	@Label("第5个月通话总时长")
	private Double m45CallTimeLen = null;
	@Label("第6个月通话在07_12时总时长")
	private Double m560712CallTimeLen = null;
	@Label("第6个月通话在07_12时总时长占比")
	private Double m560712CallTimePer = null;
	@Label("第6月通话在0_45秒以上通话次数(都不去重;[0,45))")
	private Double m56045CallCt = null;
	@Label("第6月通话在0_45秒以上通话次数占比(都不去重;[0,45))")
	private Double m56045CallPer = null;
	@Label("第6个月通话通话10次以上的电话个数及占比(总数不去重,大于等于10)")
	private Double m5610CallNum = null;
	@Label("第6个月通话通话10次以上的电话个数及占比(总数不去重,大于等于10)")
	private Double m5610CallPer = null;
	@Label("第6个月通话通话10次以上的电话个数及占比(总数去重,大于等于10)")
	private Double m5610CallUniqPer = null;
	@Label("第6个月通话在12_18时总时长")
	private Double m561218CallTimeLen = null;
	@Label("第6个月通话在12_18时总时长占比")
	private Double m561218CallTimePer = null;
	@Label("第6月通话在150_300秒以上通话次数(都不去重)")
	private Double m56150300CallCt = null;
	@Label("第6月通话在150_300秒以上通话次数占比(都不去重)")
	private Double m56150300CallPer = null;
	@Label("第6个月通话在18_22时总时长")
	private Double m561822CallTimeLen = null;
	@Label("第6个月通话在18_22时总时长占比")
	private Double m561822CallTimePer = null;
	@Label("第6个月通话在22-07时总时长")
	private Double m562207CallTimeLen = null;
	@Label("第6个月通话在22-07时总时长占比")
	private Double m562207CallTimePer = null;
	@Label("第6个月通话通话2次以上的电话个数及占比(总数不去重,大于等于2)")
	private Double m562CallNum = null;
	@Label("第6个月通话通话2次以上的电话个数及占比(总数不去重,大于等于2)")
	private Double m562CallPer = null;
	@Label("第6个月通话通话2次以上的电话个数及占比(总数去重,大于等于2)")
	private Double m562CallUniqPer = null;
	@Label("第6月通话在300_600秒以上通话次数(都不去重)")
	private Double m56300600CallCt = null;
	@Label("第6月通话在300_600秒以上通话次数占比(都不去重)")
	private Double m56300600CallPer = null;
	@Label("第6月通话在45_150秒以上通话次数(都不去重)")
	private Double m5645150CallCt = null;
	@Label("第6月通话在45_150秒以上通话次数占比(都不去重)")
	private Double m5645150CallPer = null;
	@Label("第6个月通话通话5次以上的电话个数及占比(总数不去重,大于等于5)")
	private Double m565CallNum = null;
	@Label("第6个月通话通话5次以上的电话个数及占比(总数不去重,大于等于5)")
	private Double m565CallPer = null;
	@Label("第6个月通话通话5次以上的电话个数及占比(总数去重,大于等于5)")
	private Double m565CallUniqPer = null;
	@Label("第6月通话在600_秒以上通话次数(都不去重)")
	private Double m56600CallCt = null;
	@Label("第6月通话在600_秒以上通话次数占比(都不去重)")
	private Double m56600CallPer = null;
	@Label("第6个月通话总时长")
	private Double m56CallTimeLen = null;
	@Label("借款单号")
	private Integer serialId = null;
	@Label("Default_user_id_Comment")
	private Integer userId = null;

	//****************************************************************************
	//accessors
	//****************************************************************************
	public Double getC110M01CallCt()
	{
		return this.c110M01CallCt;
	}
	public void setC110M01CallCt(Double c110M01CallCt)
	{
		this.c110M01CallCt = c110M01CallCt;
	}
	public Double getC110M01CallPer()
	{
		return this.c110M01CallPer;
	}
	public void setC110M01CallPer(Double c110M01CallPer)
	{
		this.c110M01CallPer = c110M01CallPer;
	}
	public Double getC110M12CallCt()
	{
		return this.c110M12CallCt;
	}
	public void setC110M12CallCt(Double c110M12CallCt)
	{
		this.c110M12CallCt = c110M12CallCt;
	}
	public Double getC110M12CallPer()
	{
		return this.c110M12CallPer;
	}
	public void setC110M12CallPer(Double c110M12CallPer)
	{
		this.c110M12CallPer = c110M12CallPer;
	}
	public Double getC110M23CallCt()
	{
		return this.c110M23CallCt;
	}
	public void setC110M23CallCt(Double c110M23CallCt)
	{
		this.c110M23CallCt = c110M23CallCt;
	}
	public Double getC110M23CallPer()
	{
		return this.c110M23CallPer;
	}
	public void setC110M23CallPer(Double c110M23CallPer)
	{
		this.c110M23CallPer = c110M23CallPer;
	}
	public Double getC110M34CallCt()
	{
		return this.c110M34CallCt;
	}
	public void setC110M34CallCt(Double c110M34CallCt)
	{
		this.c110M34CallCt = c110M34CallCt;
	}
	public Double getC110M34CallPer()
	{
		return this.c110M34CallPer;
	}
	public void setC110M34CallPer(Double c110M34CallPer)
	{
		this.c110M34CallPer = c110M34CallPer;
	}
	public Double getC110M45CallCt()
	{
		return this.c110M45CallCt;
	}
	public void setC110M45CallCt(Double c110M45CallCt)
	{
		this.c110M45CallCt = c110M45CallCt;
	}
	public Double getC110M45CallPer()
	{
		return this.c110M45CallPer;
	}
	public void setC110M45CallPer(Double c110M45CallPer)
	{
		this.c110M45CallPer = c110M45CallPer;
	}
	public Double getC110M56CallCt()
	{
		return this.c110M56CallCt;
	}
	public void setC110M56CallCt(Double c110M56CallCt)
	{
		this.c110M56CallCt = c110M56CallCt;
	}
	public Double getC110M56CallPer()
	{
		return this.c110M56CallPer;
	}
	public void setC110M56CallPer(Double c110M56CallPer)
	{
		this.c110M56CallPer = c110M56CallPer;
	}
	public Double getC15M01CallCt()
	{
		return this.c15M01CallCt;
	}
	public void setC15M01CallCt(Double c15M01CallCt)
	{
		this.c15M01CallCt = c15M01CallCt;
	}
	public Double getC15M01CallPer()
	{
		return this.c15M01CallPer;
	}
	public void setC15M01CallPer(Double c15M01CallPer)
	{
		this.c15M01CallPer = c15M01CallPer;
	}
	public Double getC15M12CallCt()
	{
		return this.c15M12CallCt;
	}
	public void setC15M12CallCt(Double c15M12CallCt)
	{
		this.c15M12CallCt = c15M12CallCt;
	}
	public Double getC15M12CallPer()
	{
		return this.c15M12CallPer;
	}
	public void setC15M12CallPer(Double c15M12CallPer)
	{
		this.c15M12CallPer = c15M12CallPer;
	}
	public Double getC15M23CallCt()
	{
		return this.c15M23CallCt;
	}
	public void setC15M23CallCt(Double c15M23CallCt)
	{
		this.c15M23CallCt = c15M23CallCt;
	}
	public Double getC15M23CallPer()
	{
		return this.c15M23CallPer;
	}
	public void setC15M23CallPer(Double c15M23CallPer)
	{
		this.c15M23CallPer = c15M23CallPer;
	}
	public Double getC15M34CallCt()
	{
		return this.c15M34CallCt;
	}
	public void setC15M34CallCt(Double c15M34CallCt)
	{
		this.c15M34CallCt = c15M34CallCt;
	}
	public Double getC15M34CallPer()
	{
		return this.c15M34CallPer;
	}
	public void setC15M34CallPer(Double c15M34CallPer)
	{
		this.c15M34CallPer = c15M34CallPer;
	}
	public Double getC15M45CallCt()
	{
		return this.c15M45CallCt;
	}
	public void setC15M45CallCt(Double c15M45CallCt)
	{
		this.c15M45CallCt = c15M45CallCt;
	}
	public Double getC15M45CallPer()
	{
		return this.c15M45CallPer;
	}
	public void setC15M45CallPer(Double c15M45CallPer)
	{
		this.c15M45CallPer = c15M45CallPer;
	}
	public Double getC15M56CallCt()
	{
		return this.c15M56CallCt;
	}
	public void setC15M56CallCt(Double c15M56CallCt)
	{
		this.c15M56CallCt = c15M56CallCt;
	}
	public Double getC15M56CallPer()
	{
		return this.c15M56CallPer;
	}
	public void setC15M56CallPer(Double c15M56CallPer)
	{
		this.c15M56CallPer = c15M56CallPer;
	}
	public Double getC1M01CallCt()
	{
		return this.c1M01CallCt;
	}
	public void setC1M01CallCt(Double c1M01CallCt)
	{
		this.c1M01CallCt = c1M01CallCt;
	}
	public Double getC1M01CallPer()
	{
		return this.c1M01CallPer;
	}
	public void setC1M01CallPer(Double c1M01CallPer)
	{
		this.c1M01CallPer = c1M01CallPer;
	}
	public Double getC1M12CallCt()
	{
		return this.c1M12CallCt;
	}
	public void setC1M12CallCt(Double c1M12CallCt)
	{
		this.c1M12CallCt = c1M12CallCt;
	}
	public Double getC1M12CallPer()
	{
		return this.c1M12CallPer;
	}
	public void setC1M12CallPer(Double c1M12CallPer)
	{
		this.c1M12CallPer = c1M12CallPer;
	}
	public Double getC1M23CallCt()
	{
		return this.c1M23CallCt;
	}
	public void setC1M23CallCt(Double c1M23CallCt)
	{
		this.c1M23CallCt = c1M23CallCt;
	}
	public Double getC1M23CallPer()
	{
		return this.c1M23CallPer;
	}
	public void setC1M23CallPer(Double c1M23CallPer)
	{
		this.c1M23CallPer = c1M23CallPer;
	}
	public Double getC1M34CallCt()
	{
		return this.c1M34CallCt;
	}
	public void setC1M34CallCt(Double c1M34CallCt)
	{
		this.c1M34CallCt = c1M34CallCt;
	}
	public Double getC1M34CallPer()
	{
		return this.c1M34CallPer;
	}
	public void setC1M34CallPer(Double c1M34CallPer)
	{
		this.c1M34CallPer = c1M34CallPer;
	}
	public Double getC1M45CallCt()
	{
		return this.c1M45CallCt;
	}
	public void setC1M45CallCt(Double c1M45CallCt)
	{
		this.c1M45CallCt = c1M45CallCt;
	}
	public Double getC1M45CallPer()
	{
		return this.c1M45CallPer;
	}
	public void setC1M45CallPer(Double c1M45CallPer)
	{
		this.c1M45CallPer = c1M45CallPer;
	}
	public Double getC1M56CallCt()
	{
		return this.c1M56CallCt;
	}
	public void setC1M56CallCt(Double c1M56CallCt)
	{
		this.c1M56CallCt = c1M56CallCt;
	}
	public Double getC1M56CallPer()
	{
		return this.c1M56CallPer;
	}
	public void setC1M56CallPer(Double c1M56CallPer)
	{
		this.c1M56CallPer = c1M56CallPer;
	}
	public Double getC2M01CallCt()
	{
		return this.c2M01CallCt;
	}
	public void setC2M01CallCt(Double c2M01CallCt)
	{
		this.c2M01CallCt = c2M01CallCt;
	}
	public Double getC2M01CallPer()
	{
		return this.c2M01CallPer;
	}
	public void setC2M01CallPer(Double c2M01CallPer)
	{
		this.c2M01CallPer = c2M01CallPer;
	}
	public Double getC2M12CallCt()
	{
		return this.c2M12CallCt;
	}
	public void setC2M12CallCt(Double c2M12CallCt)
	{
		this.c2M12CallCt = c2M12CallCt;
	}
	public Double getC2M12CallPer()
	{
		return this.c2M12CallPer;
	}
	public void setC2M12CallPer(Double c2M12CallPer)
	{
		this.c2M12CallPer = c2M12CallPer;
	}
	public Double getC2M23CallCt()
	{
		return this.c2M23CallCt;
	}
	public void setC2M23CallCt(Double c2M23CallCt)
	{
		this.c2M23CallCt = c2M23CallCt;
	}
	public Double getC2M23CallPer()
	{
		return this.c2M23CallPer;
	}
	public void setC2M23CallPer(Double c2M23CallPer)
	{
		this.c2M23CallPer = c2M23CallPer;
	}
	public Double getC2M34CallCt()
	{
		return this.c2M34CallCt;
	}
	public void setC2M34CallCt(Double c2M34CallCt)
	{
		this.c2M34CallCt = c2M34CallCt;
	}
	public Double getC2M34CallPer()
	{
		return this.c2M34CallPer;
	}
	public void setC2M34CallPer(Double c2M34CallPer)
	{
		this.c2M34CallPer = c2M34CallPer;
	}
	public Double getC2M45CallCt()
	{
		return this.c2M45CallCt;
	}
	public void setC2M45CallCt(Double c2M45CallCt)
	{
		this.c2M45CallCt = c2M45CallCt;
	}
	public Double getC2M45CallPer()
	{
		return this.c2M45CallPer;
	}
	public void setC2M45CallPer(Double c2M45CallPer)
	{
		this.c2M45CallPer = c2M45CallPer;
	}
	public Double getC2M56CallCt()
	{
		return this.c2M56CallCt;
	}
	public void setC2M56CallCt(Double c2M56CallCt)
	{
		this.c2M56CallCt = c2M56CallCt;
	}
	public Double getC2M56CallPer()
	{
		return this.c2M56CallPer;
	}
	public void setC2M56CallPer(Double c2M56CallPer)
	{
		this.c2M56CallPer = c2M56CallPer;
	}
	public Double getC3M01CallCt()
	{
		return this.c3M01CallCt;
	}
	public void setC3M01CallCt(Double c3M01CallCt)
	{
		this.c3M01CallCt = c3M01CallCt;
	}
	public Double getC3M01CallPer()
	{
		return this.c3M01CallPer;
	}
	public void setC3M01CallPer(Double c3M01CallPer)
	{
		this.c3M01CallPer = c3M01CallPer;
	}
	public Double getC3M12CallCt()
	{
		return this.c3M12CallCt;
	}
	public void setC3M12CallCt(Double c3M12CallCt)
	{
		this.c3M12CallCt = c3M12CallCt;
	}
	public Double getC3M12CallPer()
	{
		return this.c3M12CallPer;
	}
	public void setC3M12CallPer(Double c3M12CallPer)
	{
		this.c3M12CallPer = c3M12CallPer;
	}
	public Double getC3M23CallCt()
	{
		return this.c3M23CallCt;
	}
	public void setC3M23CallCt(Double c3M23CallCt)
	{
		this.c3M23CallCt = c3M23CallCt;
	}
	public Double getC3M23CallPer()
	{
		return this.c3M23CallPer;
	}
	public void setC3M23CallPer(Double c3M23CallPer)
	{
		this.c3M23CallPer = c3M23CallPer;
	}
	public Double getC3M34CallCt()
	{
		return this.c3M34CallCt;
	}
	public void setC3M34CallCt(Double c3M34CallCt)
	{
		this.c3M34CallCt = c3M34CallCt;
	}
	public Double getC3M34CallPer()
	{
		return this.c3M34CallPer;
	}
	public void setC3M34CallPer(Double c3M34CallPer)
	{
		this.c3M34CallPer = c3M34CallPer;
	}
	public Double getC3M45CallCt()
	{
		return this.c3M45CallCt;
	}
	public void setC3M45CallCt(Double c3M45CallCt)
	{
		this.c3M45CallCt = c3M45CallCt;
	}
	public Double getC3M45CallPer()
	{
		return this.c3M45CallPer;
	}
	public void setC3M45CallPer(Double c3M45CallPer)
	{
		this.c3M45CallPer = c3M45CallPer;
	}
	public Double getC3M56CallCt()
	{
		return this.c3M56CallCt;
	}
	public void setC3M56CallCt(Double c3M56CallCt)
	{
		this.c3M56CallCt = c3M56CallCt;
	}
	public Double getC3M56CallPer()
	{
		return this.c3M56CallPer;
	}
	public void setC3M56CallPer(Double c3M56CallPer)
	{
		this.c3M56CallPer = c3M56CallPer;
	}
	public Double getDawnCallNum()
	{
		return this.dawnCallNum;
	}
	public void setDawnCallNum(Double dawnCallNum)
	{
		this.dawnCallNum = dawnCallNum;
	}
	public Double getDawnCalledNum()
	{
		return this.dawnCalledNum;
	}
	public void setDawnCalledNum(Double dawnCalledNum)
	{
		this.dawnCalledNum = dawnCalledNum;
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
	public Double getM010712CallTimeLen()
	{
		return this.m010712CallTimeLen;
	}
	public void setM010712CallTimeLen(Double m010712CallTimeLen)
	{
		this.m010712CallTimeLen = m010712CallTimeLen;
	}
	public Double getM010712CallTimePer()
	{
		return this.m010712CallTimePer;
	}
	public void setM010712CallTimePer(Double m010712CallTimePer)
	{
		this.m010712CallTimePer = m010712CallTimePer;
	}
	public Double getM01045CallCt()
	{
		return this.m01045CallCt;
	}
	public void setM01045CallCt(Double m01045CallCt)
	{
		this.m01045CallCt = m01045CallCt;
	}
	public Double getM01045CallPer()
	{
		return this.m01045CallPer;
	}
	public void setM01045CallPer(Double m01045CallPer)
	{
		this.m01045CallPer = m01045CallPer;
	}
	public Double getM0110CallNum()
	{
		return this.m0110CallNum;
	}
	public void setM0110CallNum(Double m0110CallNum)
	{
		this.m0110CallNum = m0110CallNum;
	}
	public Double getM0110CallPer()
	{
		return this.m0110CallPer;
	}
	public void setM0110CallPer(Double m0110CallPer)
	{
		this.m0110CallPer = m0110CallPer;
	}
	public Double getM0110CallUniqPer()
	{
		return this.m0110CallUniqPer;
	}
	public void setM0110CallUniqPer(Double m0110CallUniqPer)
	{
		this.m0110CallUniqPer = m0110CallUniqPer;
	}
	public Double getM011218CallTimeLen()
	{
		return this.m011218CallTimeLen;
	}
	public void setM011218CallTimeLen(Double m011218CallTimeLen)
	{
		this.m011218CallTimeLen = m011218CallTimeLen;
	}
	public Double getM011218CallTimePer()
	{
		return this.m011218CallTimePer;
	}
	public void setM011218CallTimePer(Double m011218CallTimePer)
	{
		this.m011218CallTimePer = m011218CallTimePer;
	}
	public Double getM01150300CallCt()
	{
		return this.m01150300CallCt;
	}
	public void setM01150300CallCt(Double m01150300CallCt)
	{
		this.m01150300CallCt = m01150300CallCt;
	}
	public Double getM01150300CallPer()
	{
		return this.m01150300CallPer;
	}
	public void setM01150300CallPer(Double m01150300CallPer)
	{
		this.m01150300CallPer = m01150300CallPer;
	}
	public Double getM011822CallTimeLen()
	{
		return this.m011822CallTimeLen;
	}
	public void setM011822CallTimeLen(Double m011822CallTimeLen)
	{
		this.m011822CallTimeLen = m011822CallTimeLen;
	}
	public Double getM011822CallTimePer()
	{
		return this.m011822CallTimePer;
	}
	public void setM011822CallTimePer(Double m011822CallTimePer)
	{
		this.m011822CallTimePer = m011822CallTimePer;
	}
	public Double getM012207CallTimeLen()
	{
		return this.m012207CallTimeLen;
	}
	public void setM012207CallTimeLen(Double m012207CallTimeLen)
	{
		this.m012207CallTimeLen = m012207CallTimeLen;
	}
	public Double getM012207CallTimePer()
	{
		return this.m012207CallTimePer;
	}
	public void setM012207CallTimePer(Double m012207CallTimePer)
	{
		this.m012207CallTimePer = m012207CallTimePer;
	}
	public Double getM012CallNum()
	{
		return this.m012CallNum;
	}
	public void setM012CallNum(Double m012CallNum)
	{
		this.m012CallNum = m012CallNum;
	}
	public Double getM012CallPer()
	{
		return this.m012CallPer;
	}
	public void setM012CallPer(Double m012CallPer)
	{
		this.m012CallPer = m012CallPer;
	}
	public Double getM012CallUniqPer()
	{
		return this.m012CallUniqPer;
	}
	public void setM012CallUniqPer(Double m012CallUniqPer)
	{
		this.m012CallUniqPer = m012CallUniqPer;
	}
	public Double getM01300600CallCt()
	{
		return this.m01300600CallCt;
	}
	public void setM01300600CallCt(Double m01300600CallCt)
	{
		this.m01300600CallCt = m01300600CallCt;
	}
	public Double getM01300600CallPer()
	{
		return this.m01300600CallPer;
	}
	public void setM01300600CallPer(Double m01300600CallPer)
	{
		this.m01300600CallPer = m01300600CallPer;
	}
	public Double getM0145150CallCt()
	{
		return this.m0145150CallCt;
	}
	public void setM0145150CallCt(Double m0145150CallCt)
	{
		this.m0145150CallCt = m0145150CallCt;
	}
	public Double getM0145150CallPer()
	{
		return this.m0145150CallPer;
	}
	public void setM0145150CallPer(Double m0145150CallPer)
	{
		this.m0145150CallPer = m0145150CallPer;
	}
	public Double getM015CallNum()
	{
		return this.m015CallNum;
	}
	public void setM015CallNum(Double m015CallNum)
	{
		this.m015CallNum = m015CallNum;
	}
	public Double getM015CallPer()
	{
		return this.m015CallPer;
	}
	public void setM015CallPer(Double m015CallPer)
	{
		this.m015CallPer = m015CallPer;
	}
	public Double getM015CallUniqPer()
	{
		return this.m015CallUniqPer;
	}
	public void setM015CallUniqPer(Double m015CallUniqPer)
	{
		this.m015CallUniqPer = m015CallUniqPer;
	}
	public Double getM01600CallCt()
	{
		return this.m01600CallCt;
	}
	public void setM01600CallCt(Double m01600CallCt)
	{
		this.m01600CallCt = m01600CallCt;
	}
	public Double getM01600CallPer()
	{
		return this.m01600CallPer;
	}
	public void setM01600CallPer(Double m01600CallPer)
	{
		this.m01600CallPer = m01600CallPer;
	}
	public Double getM01CallTimeLen()
	{
		return this.m01CallTimeLen;
	}
	public void setM01CallTimeLen(Double m01CallTimeLen)
	{
		this.m01CallTimeLen = m01CallTimeLen;
	}
	public Double getM120712CallTimeLen()
	{
		return this.m120712CallTimeLen;
	}
	public void setM120712CallTimeLen(Double m120712CallTimeLen)
	{
		this.m120712CallTimeLen = m120712CallTimeLen;
	}
	public Double getM120712CallTimePer()
	{
		return this.m120712CallTimePer;
	}
	public void setM120712CallTimePer(Double m120712CallTimePer)
	{
		this.m120712CallTimePer = m120712CallTimePer;
	}
	public Double getM12045CallCt()
	{
		return this.m12045CallCt;
	}
	public void setM12045CallCt(Double m12045CallCt)
	{
		this.m12045CallCt = m12045CallCt;
	}
	public Double getM12045CallPer()
	{
		return this.m12045CallPer;
	}
	public void setM12045CallPer(Double m12045CallPer)
	{
		this.m12045CallPer = m12045CallPer;
	}
	public Double getM1210CallNum()
	{
		return this.m1210CallNum;
	}
	public void setM1210CallNum(Double m1210CallNum)
	{
		this.m1210CallNum = m1210CallNum;
	}
	public Double getM1210CallPer()
	{
		return this.m1210CallPer;
	}
	public void setM1210CallPer(Double m1210CallPer)
	{
		this.m1210CallPer = m1210CallPer;
	}
	public Double getM1210CallUniqPer()
	{
		return this.m1210CallUniqPer;
	}
	public void setM1210CallUniqPer(Double m1210CallUniqPer)
	{
		this.m1210CallUniqPer = m1210CallUniqPer;
	}
	public Double getM121218CallTimeLen()
	{
		return this.m121218CallTimeLen;
	}
	public void setM121218CallTimeLen(Double m121218CallTimeLen)
	{
		this.m121218CallTimeLen = m121218CallTimeLen;
	}
	public Double getM121218CallTimePer()
	{
		return this.m121218CallTimePer;
	}
	public void setM121218CallTimePer(Double m121218CallTimePer)
	{
		this.m121218CallTimePer = m121218CallTimePer;
	}
	public Double getM12150300CallCt()
	{
		return this.m12150300CallCt;
	}
	public void setM12150300CallCt(Double m12150300CallCt)
	{
		this.m12150300CallCt = m12150300CallCt;
	}
	public Double getM12150300CallPer()
	{
		return this.m12150300CallPer;
	}
	public void setM12150300CallPer(Double m12150300CallPer)
	{
		this.m12150300CallPer = m12150300CallPer;
	}
	public Double getM121822CallTimeLen()
	{
		return this.m121822CallTimeLen;
	}
	public void setM121822CallTimeLen(Double m121822CallTimeLen)
	{
		this.m121822CallTimeLen = m121822CallTimeLen;
	}
	public Double getM121822CallTimePer()
	{
		return this.m121822CallTimePer;
	}
	public void setM121822CallTimePer(Double m121822CallTimePer)
	{
		this.m121822CallTimePer = m121822CallTimePer;
	}
	public Double getM122207CallTimeLen()
	{
		return this.m122207CallTimeLen;
	}
	public void setM122207CallTimeLen(Double m122207CallTimeLen)
	{
		this.m122207CallTimeLen = m122207CallTimeLen;
	}
	public Double getM122207CallTimePer()
	{
		return this.m122207CallTimePer;
	}
	public void setM122207CallTimePer(Double m122207CallTimePer)
	{
		this.m122207CallTimePer = m122207CallTimePer;
	}
	public Double getM122CallNum()
	{
		return this.m122CallNum;
	}
	public void setM122CallNum(Double m122CallNum)
	{
		this.m122CallNum = m122CallNum;
	}
	public Double getM122CallPer()
	{
		return this.m122CallPer;
	}
	public void setM122CallPer(Double m122CallPer)
	{
		this.m122CallPer = m122CallPer;
	}
	public Double getM122CallUniqPer()
	{
		return this.m122CallUniqPer;
	}
	public void setM122CallUniqPer(Double m122CallUniqPer)
	{
		this.m122CallUniqPer = m122CallUniqPer;
	}
	public Double getM12300600CallCt()
	{
		return this.m12300600CallCt;
	}
	public void setM12300600CallCt(Double m12300600CallCt)
	{
		this.m12300600CallCt = m12300600CallCt;
	}
	public Double getM12300600CallPer()
	{
		return this.m12300600CallPer;
	}
	public void setM12300600CallPer(Double m12300600CallPer)
	{
		this.m12300600CallPer = m12300600CallPer;
	}
	public Double getM1245150CallCt()
	{
		return this.m1245150CallCt;
	}
	public void setM1245150CallCt(Double m1245150CallCt)
	{
		this.m1245150CallCt = m1245150CallCt;
	}
	public Double getM1245150CallPer()
	{
		return this.m1245150CallPer;
	}
	public void setM1245150CallPer(Double m1245150CallPer)
	{
		this.m1245150CallPer = m1245150CallPer;
	}
	public Double getM125CallNum()
	{
		return this.m125CallNum;
	}
	public void setM125CallNum(Double m125CallNum)
	{
		this.m125CallNum = m125CallNum;
	}
	public Double getM125CallPer()
	{
		return this.m125CallPer;
	}
	public void setM125CallPer(Double m125CallPer)
	{
		this.m125CallPer = m125CallPer;
	}
	public Double getM125CallUniqPer()
	{
		return this.m125CallUniqPer;
	}
	public void setM125CallUniqPer(Double m125CallUniqPer)
	{
		this.m125CallUniqPer = m125CallUniqPer;
	}
	public Double getM12600CallCt()
	{
		return this.m12600CallCt;
	}
	public void setM12600CallCt(Double m12600CallCt)
	{
		this.m12600CallCt = m12600CallCt;
	}
	public Double getM12600CallPer()
	{
		return this.m12600CallPer;
	}
	public void setM12600CallPer(Double m12600CallPer)
	{
		this.m12600CallPer = m12600CallPer;
	}
	public Double getM12CallTimeLen()
	{
		return this.m12CallTimeLen;
	}
	public void setM12CallTimeLen(Double m12CallTimeLen)
	{
		this.m12CallTimeLen = m12CallTimeLen;
	}
	public Double getM230712CallTimeLen()
	{
		return this.m230712CallTimeLen;
	}
	public void setM230712CallTimeLen(Double m230712CallTimeLen)
	{
		this.m230712CallTimeLen = m230712CallTimeLen;
	}
	public Double getM230712CallTimePer()
	{
		return this.m230712CallTimePer;
	}
	public void setM230712CallTimePer(Double m230712CallTimePer)
	{
		this.m230712CallTimePer = m230712CallTimePer;
	}
	public Double getM23045CallCt()
	{
		return this.m23045CallCt;
	}
	public void setM23045CallCt(Double m23045CallCt)
	{
		this.m23045CallCt = m23045CallCt;
	}
	public Double getM23045CallPer()
	{
		return this.m23045CallPer;
	}
	public void setM23045CallPer(Double m23045CallPer)
	{
		this.m23045CallPer = m23045CallPer;
	}
	public Double getM2310CallNum()
	{
		return this.m2310CallNum;
	}
	public void setM2310CallNum(Double m2310CallNum)
	{
		this.m2310CallNum = m2310CallNum;
	}
	public Double getM2310CallPer()
	{
		return this.m2310CallPer;
	}
	public void setM2310CallPer(Double m2310CallPer)
	{
		this.m2310CallPer = m2310CallPer;
	}
	public Double getM2310CallUniqPer()
	{
		return this.m2310CallUniqPer;
	}
	public void setM2310CallUniqPer(Double m2310CallUniqPer)
	{
		this.m2310CallUniqPer = m2310CallUniqPer;
	}
	public Double getM231218CallTimeLen()
	{
		return this.m231218CallTimeLen;
	}
	public void setM231218CallTimeLen(Double m231218CallTimeLen)
	{
		this.m231218CallTimeLen = m231218CallTimeLen;
	}
	public Double getM231218CallTimePer()
	{
		return this.m231218CallTimePer;
	}
	public void setM231218CallTimePer(Double m231218CallTimePer)
	{
		this.m231218CallTimePer = m231218CallTimePer;
	}
	public Double getM23150300CallCt()
	{
		return this.m23150300CallCt;
	}
	public void setM23150300CallCt(Double m23150300CallCt)
	{
		this.m23150300CallCt = m23150300CallCt;
	}
	public Double getM23150300CallPer()
	{
		return this.m23150300CallPer;
	}
	public void setM23150300CallPer(Double m23150300CallPer)
	{
		this.m23150300CallPer = m23150300CallPer;
	}
	public Double getM231822CallTimeLen()
	{
		return this.m231822CallTimeLen;
	}
	public void setM231822CallTimeLen(Double m231822CallTimeLen)
	{
		this.m231822CallTimeLen = m231822CallTimeLen;
	}
	public Double getM231822CallTimePer()
	{
		return this.m231822CallTimePer;
	}
	public void setM231822CallTimePer(Double m231822CallTimePer)
	{
		this.m231822CallTimePer = m231822CallTimePer;
	}
	public Double getM232207CallTimeLen()
	{
		return this.m232207CallTimeLen;
	}
	public void setM232207CallTimeLen(Double m232207CallTimeLen)
	{
		this.m232207CallTimeLen = m232207CallTimeLen;
	}
	public Double getM232207CallTimePer()
	{
		return this.m232207CallTimePer;
	}
	public void setM232207CallTimePer(Double m232207CallTimePer)
	{
		this.m232207CallTimePer = m232207CallTimePer;
	}
	public Double getM232CallNum()
	{
		return this.m232CallNum;
	}
	public void setM232CallNum(Double m232CallNum)
	{
		this.m232CallNum = m232CallNum;
	}
	public Double getM232CallPer()
	{
		return this.m232CallPer;
	}
	public void setM232CallPer(Double m232CallPer)
	{
		this.m232CallPer = m232CallPer;
	}
	public Double getM232CallUniqPer()
	{
		return this.m232CallUniqPer;
	}
	public void setM232CallUniqPer(Double m232CallUniqPer)
	{
		this.m232CallUniqPer = m232CallUniqPer;
	}
	public Double getM23300600CallCt()
	{
		return this.m23300600CallCt;
	}
	public void setM23300600CallCt(Double m23300600CallCt)
	{
		this.m23300600CallCt = m23300600CallCt;
	}
	public Double getM23300600CallPer()
	{
		return this.m23300600CallPer;
	}
	public void setM23300600CallPer(Double m23300600CallPer)
	{
		this.m23300600CallPer = m23300600CallPer;
	}
	public Double getM2345150CallCt()
	{
		return this.m2345150CallCt;
	}
	public void setM2345150CallCt(Double m2345150CallCt)
	{
		this.m2345150CallCt = m2345150CallCt;
	}
	public Double getM2345150CallPer()
	{
		return this.m2345150CallPer;
	}
	public void setM2345150CallPer(Double m2345150CallPer)
	{
		this.m2345150CallPer = m2345150CallPer;
	}
	public Double getM235CallNum()
	{
		return this.m235CallNum;
	}
	public void setM235CallNum(Double m235CallNum)
	{
		this.m235CallNum = m235CallNum;
	}
	public Double getM235CallPer()
	{
		return this.m235CallPer;
	}
	public void setM235CallPer(Double m235CallPer)
	{
		this.m235CallPer = m235CallPer;
	}
	public Double getM235CallUniqPer()
	{
		return this.m235CallUniqPer;
	}
	public void setM235CallUniqPer(Double m235CallUniqPer)
	{
		this.m235CallUniqPer = m235CallUniqPer;
	}
	public Double getM23600CallCt()
	{
		return this.m23600CallCt;
	}
	public void setM23600CallCt(Double m23600CallCt)
	{
		this.m23600CallCt = m23600CallCt;
	}
	public Double getM23600CallPer()
	{
		return this.m23600CallPer;
	}
	public void setM23600CallPer(Double m23600CallPer)
	{
		this.m23600CallPer = m23600CallPer;
	}
	public Double getM23CallTimeLen()
	{
		return this.m23CallTimeLen;
	}
	public void setM23CallTimeLen(Double m23CallTimeLen)
	{
		this.m23CallTimeLen = m23CallTimeLen;
	}
	public Double getM340712CallTimeLen()
	{
		return this.m340712CallTimeLen;
	}
	public void setM340712CallTimeLen(Double m340712CallTimeLen)
	{
		this.m340712CallTimeLen = m340712CallTimeLen;
	}
	public Double getM340712CallTimePer()
	{
		return this.m340712CallTimePer;
	}
	public void setM340712CallTimePer(Double m340712CallTimePer)
	{
		this.m340712CallTimePer = m340712CallTimePer;
	}
	public Double getM34045CallCt()
	{
		return this.m34045CallCt;
	}
	public void setM34045CallCt(Double m34045CallCt)
	{
		this.m34045CallCt = m34045CallCt;
	}
	public Double getM34045CallPer()
	{
		return this.m34045CallPer;
	}
	public void setM34045CallPer(Double m34045CallPer)
	{
		this.m34045CallPer = m34045CallPer;
	}
	public Double getM3410CallNum()
	{
		return this.m3410CallNum;
	}
	public void setM3410CallNum(Double m3410CallNum)
	{
		this.m3410CallNum = m3410CallNum;
	}
	public Double getM3410CallPer()
	{
		return this.m3410CallPer;
	}
	public void setM3410CallPer(Double m3410CallPer)
	{
		this.m3410CallPer = m3410CallPer;
	}
	public Double getM3410CallUniqPer()
	{
		return this.m3410CallUniqPer;
	}
	public void setM3410CallUniqPer(Double m3410CallUniqPer)
	{
		this.m3410CallUniqPer = m3410CallUniqPer;
	}
	public Double getM341218CallTimeLen()
	{
		return this.m341218CallTimeLen;
	}
	public void setM341218CallTimeLen(Double m341218CallTimeLen)
	{
		this.m341218CallTimeLen = m341218CallTimeLen;
	}
	public Double getM341218CallTimePer()
	{
		return this.m341218CallTimePer;
	}
	public void setM341218CallTimePer(Double m341218CallTimePer)
	{
		this.m341218CallTimePer = m341218CallTimePer;
	}
	public Double getM34150300CallCt()
	{
		return this.m34150300CallCt;
	}
	public void setM34150300CallCt(Double m34150300CallCt)
	{
		this.m34150300CallCt = m34150300CallCt;
	}
	public Double getM34150300CallPer()
	{
		return this.m34150300CallPer;
	}
	public void setM34150300CallPer(Double m34150300CallPer)
	{
		this.m34150300CallPer = m34150300CallPer;
	}
	public Double getM341822CallTimeLen()
	{
		return this.m341822CallTimeLen;
	}
	public void setM341822CallTimeLen(Double m341822CallTimeLen)
	{
		this.m341822CallTimeLen = m341822CallTimeLen;
	}
	public Double getM341822CallTimePer()
	{
		return this.m341822CallTimePer;
	}
	public void setM341822CallTimePer(Double m341822CallTimePer)
	{
		this.m341822CallTimePer = m341822CallTimePer;
	}
	public Double getM342207CallTimeLen()
	{
		return this.m342207CallTimeLen;
	}
	public void setM342207CallTimeLen(Double m342207CallTimeLen)
	{
		this.m342207CallTimeLen = m342207CallTimeLen;
	}
	public Double getM342207CallTimePer()
	{
		return this.m342207CallTimePer;
	}
	public void setM342207CallTimePer(Double m342207CallTimePer)
	{
		this.m342207CallTimePer = m342207CallTimePer;
	}
	public Double getM342CallNum()
	{
		return this.m342CallNum;
	}
	public void setM342CallNum(Double m342CallNum)
	{
		this.m342CallNum = m342CallNum;
	}
	public Double getM342CallPer()
	{
		return this.m342CallPer;
	}
	public void setM342CallPer(Double m342CallPer)
	{
		this.m342CallPer = m342CallPer;
	}
	public Double getM342CallUniqPer()
	{
		return this.m342CallUniqPer;
	}
	public void setM342CallUniqPer(Double m342CallUniqPer)
	{
		this.m342CallUniqPer = m342CallUniqPer;
	}
	public Double getM34300600CallCt()
	{
		return this.m34300600CallCt;
	}
	public void setM34300600CallCt(Double m34300600CallCt)
	{
		this.m34300600CallCt = m34300600CallCt;
	}
	public Double getM34300600CallPer()
	{
		return this.m34300600CallPer;
	}
	public void setM34300600CallPer(Double m34300600CallPer)
	{
		this.m34300600CallPer = m34300600CallPer;
	}
	public Double getM3445150CallCt()
	{
		return this.m3445150CallCt;
	}
	public void setM3445150CallCt(Double m3445150CallCt)
	{
		this.m3445150CallCt = m3445150CallCt;
	}
	public Double getM3445150CallPer()
	{
		return this.m3445150CallPer;
	}
	public void setM3445150CallPer(Double m3445150CallPer)
	{
		this.m3445150CallPer = m3445150CallPer;
	}
	public Double getM345CallNum()
	{
		return this.m345CallNum;
	}
	public void setM345CallNum(Double m345CallNum)
	{
		this.m345CallNum = m345CallNum;
	}
	public Double getM345CallPer()
	{
		return this.m345CallPer;
	}
	public void setM345CallPer(Double m345CallPer)
	{
		this.m345CallPer = m345CallPer;
	}
	public Double getM345CallUniqPer()
	{
		return this.m345CallUniqPer;
	}
	public void setM345CallUniqPer(Double m345CallUniqPer)
	{
		this.m345CallUniqPer = m345CallUniqPer;
	}
	public Double getM34600CallCt()
	{
		return this.m34600CallCt;
	}
	public void setM34600CallCt(Double m34600CallCt)
	{
		this.m34600CallCt = m34600CallCt;
	}
	public Double getM34600CallPer()
	{
		return this.m34600CallPer;
	}
	public void setM34600CallPer(Double m34600CallPer)
	{
		this.m34600CallPer = m34600CallPer;
	}
	public Double getM34CallTimeLen()
	{
		return this.m34CallTimeLen;
	}
	public void setM34CallTimeLen(Double m34CallTimeLen)
	{
		this.m34CallTimeLen = m34CallTimeLen;
	}
	public Double getM450712CallTimeLen()
	{
		return this.m450712CallTimeLen;
	}
	public void setM450712CallTimeLen(Double m450712CallTimeLen)
	{
		this.m450712CallTimeLen = m450712CallTimeLen;
	}
	public Double getM450712CallTimePer()
	{
		return this.m450712CallTimePer;
	}
	public void setM450712CallTimePer(Double m450712CallTimePer)
	{
		this.m450712CallTimePer = m450712CallTimePer;
	}
	public Double getM45045CallCt()
	{
		return this.m45045CallCt;
	}
	public void setM45045CallCt(Double m45045CallCt)
	{
		this.m45045CallCt = m45045CallCt;
	}
	public Double getM45045CallPer()
	{
		return this.m45045CallPer;
	}
	public void setM45045CallPer(Double m45045CallPer)
	{
		this.m45045CallPer = m45045CallPer;
	}
	public Double getM4510CallNum()
	{
		return this.m4510CallNum;
	}
	public void setM4510CallNum(Double m4510CallNum)
	{
		this.m4510CallNum = m4510CallNum;
	}
	public Double getM4510CallPer()
	{
		return this.m4510CallPer;
	}
	public void setM4510CallPer(Double m4510CallPer)
	{
		this.m4510CallPer = m4510CallPer;
	}
	public Double getM4510CallUniqPer()
	{
		return this.m4510CallUniqPer;
	}
	public void setM4510CallUniqPer(Double m4510CallUniqPer)
	{
		this.m4510CallUniqPer = m4510CallUniqPer;
	}
	public Double getM451218CallTimeLen()
	{
		return this.m451218CallTimeLen;
	}
	public void setM451218CallTimeLen(Double m451218CallTimeLen)
	{
		this.m451218CallTimeLen = m451218CallTimeLen;
	}
	public Double getM451218CallTimePer()
	{
		return this.m451218CallTimePer;
	}
	public void setM451218CallTimePer(Double m451218CallTimePer)
	{
		this.m451218CallTimePer = m451218CallTimePer;
	}
	public Double getM45150300CallCt()
	{
		return this.m45150300CallCt;
	}
	public void setM45150300CallCt(Double m45150300CallCt)
	{
		this.m45150300CallCt = m45150300CallCt;
	}
	public Double getM45150300CallPer()
	{
		return this.m45150300CallPer;
	}
	public void setM45150300CallPer(Double m45150300CallPer)
	{
		this.m45150300CallPer = m45150300CallPer;
	}
	public Double getM451822CallTimeLen()
	{
		return this.m451822CallTimeLen;
	}
	public void setM451822CallTimeLen(Double m451822CallTimeLen)
	{
		this.m451822CallTimeLen = m451822CallTimeLen;
	}
	public Double getM451822CallTimePer()
	{
		return this.m451822CallTimePer;
	}
	public void setM451822CallTimePer(Double m451822CallTimePer)
	{
		this.m451822CallTimePer = m451822CallTimePer;
	}
	public Double getM452207CallTimeLen()
	{
		return this.m452207CallTimeLen;
	}
	public void setM452207CallTimeLen(Double m452207CallTimeLen)
	{
		this.m452207CallTimeLen = m452207CallTimeLen;
	}
	public Double getM452207CallTimePer()
	{
		return this.m452207CallTimePer;
	}
	public void setM452207CallTimePer(Double m452207CallTimePer)
	{
		this.m452207CallTimePer = m452207CallTimePer;
	}
	public Double getM452CallNum()
	{
		return this.m452CallNum;
	}
	public void setM452CallNum(Double m452CallNum)
	{
		this.m452CallNum = m452CallNum;
	}
	public Double getM452CallPer()
	{
		return this.m452CallPer;
	}
	public void setM452CallPer(Double m452CallPer)
	{
		this.m452CallPer = m452CallPer;
	}
	public Double getM452CallUniqPer()
	{
		return this.m452CallUniqPer;
	}
	public void setM452CallUniqPer(Double m452CallUniqPer)
	{
		this.m452CallUniqPer = m452CallUniqPer;
	}
	public Double getM45300600CallCt()
	{
		return this.m45300600CallCt;
	}
	public void setM45300600CallCt(Double m45300600CallCt)
	{
		this.m45300600CallCt = m45300600CallCt;
	}
	public Double getM45300600CallPer()
	{
		return this.m45300600CallPer;
	}
	public void setM45300600CallPer(Double m45300600CallPer)
	{
		this.m45300600CallPer = m45300600CallPer;
	}
	public Double getM4545150CallCt()
	{
		return this.m4545150CallCt;
	}
	public void setM4545150CallCt(Double m4545150CallCt)
	{
		this.m4545150CallCt = m4545150CallCt;
	}
	public Double getM4545150CallPer()
	{
		return this.m4545150CallPer;
	}
	public void setM4545150CallPer(Double m4545150CallPer)
	{
		this.m4545150CallPer = m4545150CallPer;
	}
	public Double getM455CallNum()
	{
		return this.m455CallNum;
	}
	public void setM455CallNum(Double m455CallNum)
	{
		this.m455CallNum = m455CallNum;
	}
	public Double getM455CallPer()
	{
		return this.m455CallPer;
	}
	public void setM455CallPer(Double m455CallPer)
	{
		this.m455CallPer = m455CallPer;
	}
	public Double getM455CallUniqPer()
	{
		return this.m455CallUniqPer;
	}
	public void setM455CallUniqPer(Double m455CallUniqPer)
	{
		this.m455CallUniqPer = m455CallUniqPer;
	}
	public Double getM45600CallCt()
	{
		return this.m45600CallCt;
	}
	public void setM45600CallCt(Double m45600CallCt)
	{
		this.m45600CallCt = m45600CallCt;
	}
	public Double getM45600CallPer()
	{
		return this.m45600CallPer;
	}
	public void setM45600CallPer(Double m45600CallPer)
	{
		this.m45600CallPer = m45600CallPer;
	}
	public Double getM45CallTimeLen()
	{
		return this.m45CallTimeLen;
	}
	public void setM45CallTimeLen(Double m45CallTimeLen)
	{
		this.m45CallTimeLen = m45CallTimeLen;
	}
	public Double getM560712CallTimeLen()
	{
		return this.m560712CallTimeLen;
	}
	public void setM560712CallTimeLen(Double m560712CallTimeLen)
	{
		this.m560712CallTimeLen = m560712CallTimeLen;
	}
	public Double getM560712CallTimePer()
	{
		return this.m560712CallTimePer;
	}
	public void setM560712CallTimePer(Double m560712CallTimePer)
	{
		this.m560712CallTimePer = m560712CallTimePer;
	}
	public Double getM56045CallCt()
	{
		return this.m56045CallCt;
	}
	public void setM56045CallCt(Double m56045CallCt)
	{
		this.m56045CallCt = m56045CallCt;
	}
	public Double getM56045CallPer()
	{
		return this.m56045CallPer;
	}
	public void setM56045CallPer(Double m56045CallPer)
	{
		this.m56045CallPer = m56045CallPer;
	}
	public Double getM5610CallNum()
	{
		return this.m5610CallNum;
	}
	public void setM5610CallNum(Double m5610CallNum)
	{
		this.m5610CallNum = m5610CallNum;
	}
	public Double getM5610CallPer()
	{
		return this.m5610CallPer;
	}
	public void setM5610CallPer(Double m5610CallPer)
	{
		this.m5610CallPer = m5610CallPer;
	}
	public Double getM5610CallUniqPer()
	{
		return this.m5610CallUniqPer;
	}
	public void setM5610CallUniqPer(Double m5610CallUniqPer)
	{
		this.m5610CallUniqPer = m5610CallUniqPer;
	}
	public Double getM561218CallTimeLen()
	{
		return this.m561218CallTimeLen;
	}
	public void setM561218CallTimeLen(Double m561218CallTimeLen)
	{
		this.m561218CallTimeLen = m561218CallTimeLen;
	}
	public Double getM561218CallTimePer()
	{
		return this.m561218CallTimePer;
	}
	public void setM561218CallTimePer(Double m561218CallTimePer)
	{
		this.m561218CallTimePer = m561218CallTimePer;
	}
	public Double getM56150300CallCt()
	{
		return this.m56150300CallCt;
	}
	public void setM56150300CallCt(Double m56150300CallCt)
	{
		this.m56150300CallCt = m56150300CallCt;
	}
	public Double getM56150300CallPer()
	{
		return this.m56150300CallPer;
	}
	public void setM56150300CallPer(Double m56150300CallPer)
	{
		this.m56150300CallPer = m56150300CallPer;
	}
	public Double getM561822CallTimeLen()
	{
		return this.m561822CallTimeLen;
	}
	public void setM561822CallTimeLen(Double m561822CallTimeLen)
	{
		this.m561822CallTimeLen = m561822CallTimeLen;
	}
	public Double getM561822CallTimePer()
	{
		return this.m561822CallTimePer;
	}
	public void setM561822CallTimePer(Double m561822CallTimePer)
	{
		this.m561822CallTimePer = m561822CallTimePer;
	}
	public Double getM562207CallTimeLen()
	{
		return this.m562207CallTimeLen;
	}
	public void setM562207CallTimeLen(Double m562207CallTimeLen)
	{
		this.m562207CallTimeLen = m562207CallTimeLen;
	}
	public Double getM562207CallTimePer()
	{
		return this.m562207CallTimePer;
	}
	public void setM562207CallTimePer(Double m562207CallTimePer)
	{
		this.m562207CallTimePer = m562207CallTimePer;
	}
	public Double getM562CallNum()
	{
		return this.m562CallNum;
	}
	public void setM562CallNum(Double m562CallNum)
	{
		this.m562CallNum = m562CallNum;
	}
	public Double getM562CallPer()
	{
		return this.m562CallPer;
	}
	public void setM562CallPer(Double m562CallPer)
	{
		this.m562CallPer = m562CallPer;
	}
	public Double getM562CallUniqPer()
	{
		return this.m562CallUniqPer;
	}
	public void setM562CallUniqPer(Double m562CallUniqPer)
	{
		this.m562CallUniqPer = m562CallUniqPer;
	}
	public Double getM56300600CallCt()
	{
		return this.m56300600CallCt;
	}
	public void setM56300600CallCt(Double m56300600CallCt)
	{
		this.m56300600CallCt = m56300600CallCt;
	}
	public Double getM56300600CallPer()
	{
		return this.m56300600CallPer;
	}
	public void setM56300600CallPer(Double m56300600CallPer)
	{
		this.m56300600CallPer = m56300600CallPer;
	}
	public Double getM5645150CallCt()
	{
		return this.m5645150CallCt;
	}
	public void setM5645150CallCt(Double m5645150CallCt)
	{
		this.m5645150CallCt = m5645150CallCt;
	}
	public Double getM5645150CallPer()
	{
		return this.m5645150CallPer;
	}
	public void setM5645150CallPer(Double m5645150CallPer)
	{
		this.m5645150CallPer = m5645150CallPer;
	}
	public Double getM565CallNum()
	{
		return this.m565CallNum;
	}
	public void setM565CallNum(Double m565CallNum)
	{
		this.m565CallNum = m565CallNum;
	}
	public Double getM565CallPer()
	{
		return this.m565CallPer;
	}
	public void setM565CallPer(Double m565CallPer)
	{
		this.m565CallPer = m565CallPer;
	}
	public Double getM565CallUniqPer()
	{
		return this.m565CallUniqPer;
	}
	public void setM565CallUniqPer(Double m565CallUniqPer)
	{
		this.m565CallUniqPer = m565CallUniqPer;
	}
	public Double getM56600CallCt()
	{
		return this.m56600CallCt;
	}
	public void setM56600CallCt(Double m56600CallCt)
	{
		this.m56600CallCt = m56600CallCt;
	}
	public Double getM56600CallPer()
	{
		return this.m56600CallPer;
	}
	public void setM56600CallPer(Double m56600CallPer)
	{
		this.m56600CallPer = m56600CallPer;
	}
	public Double getM56CallTimeLen()
	{
		return this.m56CallTimeLen;
	}
	public void setM56CallTimeLen(Double m56CallTimeLen)
	{
		this.m56CallTimeLen = m56CallTimeLen;
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
