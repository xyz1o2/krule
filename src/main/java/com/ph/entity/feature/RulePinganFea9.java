package com.ph.entity.feature;

import com.bstek.urule.model.Label;
import com.ph.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;


/**
 * 
 * <p>Title: rule_pingan_fea9 - 凭安催收、逾期、黑名单特征表 : Value Object</p> 
 * 
 * <p>Copyright: Copyright (c) 2018</p> 
 * 
 * <p>Company: zhenrongbao.com</p>
 * 
 * @author 	wangkai
 * @date 	2018-09-26
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class RulePinganFea9 extends BaseEntity
{
	//****************************************************************************
	//fields
	//****************************************************************************
	@Label("详单周期内被叫次数最大的催收手机号的机构类型")
	private Integer allwdcmMaxorgtypein = null;
	@Label("详单周期内被委外催收号码呼叫的总时长(秒)")
	private Integer allwdcnTdurinF = null;
	@Label("详单周期内与几个催收号码有过联系")
	private Integer allwdcnTnumscon = null;
	@Label("详单周期内与几家银行机构催收号码有过联系")
	private Integer allwdcnTnumsconBank = null;
	@Label("详单周期内与几家消费金融机构催收号码有过联系")
	private Integer allwdcnTnumsconCf = null;
	@Label("详单周期内与几家委外催收机构催收号码有过联系")
	private Integer allwdcnTnumsconF = null;
	@Label("详单周期内与几家互联网金融机构催收号码有过联系")
	private Integer allwdcnTnumsconIf = null;
	@Label("详单周期内涉及催收号码的总机构数")
	private Integer allwdcnTnumsconOrg = null;
	@Label("详单周期内被催收号码呼叫次数")
	private Integer allwdcnTtimesin = null;
	@Label("详单周期内主叫催收号码次数")
	private Integer allwdcnTtimesout = null;
	@Label("凭安催收次数")
	private Integer chaseCt = null;
	@Label("Default_feature_time_Comment")
	private Date featureTime = null;
	@Label("自增主键")
	private Integer id = null;
	@Label("近一月与几个催收号码有过联系")
	private Integer l1mwdcnTnumscon = null;
	@Label("近一月与几家银行机构催收号码有过联系")
	private Integer l1mwdcnTnumsconBank = null;
	@Label("近一月与几家消费金融机构催收号码有过联系")
	private Integer l1mwdcnTnumsconCf = null;
	@Label("近一月与几家委外催收机构催收号码有过联系")
	private Integer l1mwdcnTnumsconF = null;
	@Label("近一月与几家互联网金融机构催收号码有过联系")
	private Integer l1mwdcnTnumsconIf = null;
	@Label("近一月涉及催收号码的总机构数")
	private Integer l1mwdcnTnumsconOrg = null;
	@Label("近一月被催收号码呼叫次数")
	private Integer l1mwdcnTtimesin = null;
	@Label("近一月主叫催收号码次数")
	private Integer l1mwdcnTtimesout = null;
	@Label("近一周与几个催收号码有过联系")
	private Integer l1wwdcnTnumscon = null;
	@Label("近一周与几家银行机构催收号码有过联系")
	private Integer l1wwdcnTnumsconBank = null;
	@Label("近一周与几家消费金融机构催收号码有过联系")
	private Integer l1wwdcnTnumsconCf = null;
	@Label("近一周与几家委外催收机构催收号码有过联系")
	private Integer l1wwdcnTnumsconF = null;
	@Label("近一周与几家互联网金融机构催收号码有过联系")
	private Integer l1wwdcnTnumsconIf = null;
	@Label("近一周涉及催收号码的总机构数")
	private Integer l1wwdcnTnumsconOrg = null;
	@Label("近一周被催收号码呼叫次数")
	private Integer l1wwdcnTtimesin = null;
	@Label("近一周主叫催收号码次数")
	private Integer l1wwdcnTtimesout = null;
	@Label("近两月晚上联系催收号的总天数")
	private Integer l2mencnTdayscon = null;
	@Label("近两月申请人联系次数最大的催收号的总时长(秒)")
	private Integer l2mwdcnMaxtimescon = null;
	@Label("近两月被单个催收号码呼叫的最大次数")
	private Integer l2mwdcnMaxtimesin = null;
	@Label("近两月申请人收到催收号的总个数")
	private Integer l2mwdcnTnumsin = null;
	@Label("近两月被催收号码呼叫次数")
	private Integer l2mwdcnTtimesin = null;
	@Label("近两周联系机构类型总数")
	private Integer l2wwdcnTnumsconOrgtype = null;
	@Label("近三月晚上涉及催收号码的总机构数")
	private Integer l3mencnTnumsconOrg = null;
	@Label("近三月新增机构数")
	private Integer l3mwdcnAddtnumsinOrg = null;
	@Label("近三月被每个催收号呼叫的天数的最大值")
	private Integer l3mwdcnMaxdaysin = null;
	@Label("近三月与几个催收号码有过联系")
	private Integer l3mwdcnTnumscon = null;
	@Label("近三月与几家银行机构催收号码有过联系")
	private Integer l3mwdcnTnumsconBank = null;
	@Label("近三月与几家消费金融机构催收号码有过联系")
	private Integer l3mwdcnTnumsconCf = null;
	@Label("近三月与几家委外催收机构催收号码有过联系")
	private Integer l3mwdcnTnumsconF = null;
	@Label("近三月与几家互联网金融机构催收号码有过联系")
	private Integer l3mwdcnTnumsconIf = null;
	@Label("近三月涉及催收号码的总机构数")
	private Integer l3mwdcnTnumsconOrg = null;
	@Label("近三月被催收号码呼叫次数")
	private Integer l3mwdcnTtimesin = null;
	@Label("近三月主叫催收号码次数")
	private Integer l3mwdcnTtimesout = null;
	@Label("近三周联系互联网金融机构的总个数")
	private Integer l3wwdcnTnumsconIf = null;
	@Label("近四月联系催收号的总时长(秒)")
	private Integer l4mwdcnTdurcon = null;
	@Label("近四月被催收号呼叫的总时长(秒)")
	private Integer l4mwdcnTdurin = null;
	@Label("近四月被叫次数最大的催收号的总时长(秒)")
	private Integer l4mwdcnTdurinMaxtimes = null;
	@Label("近四月与几家委外催收机构催收号码有过联系")
	private Integer l4mwdcnTnumsconF = null;
	@Label("近四月申请人联系机构类型的总个数")
	private Integer l4mwdcnTnumsconOrgtype = null;
	@Label("近四月被几家委外催收机构呼叫过")
	private Integer l4mwdcnTnumsinF = null;
	@Label("近四月联系催收号的总次数")
	private Integer l4mwdcnTtimescon = null;
	@Label("近四月非银机构呼入的总次数")
	private Integer l4mwdcnTtimesinNonbank = null;
	@Label("近五月联系催收手机总时长(秒)")
	private Integer l5mwdcmTdurcon = null;
	@Label("近五月联系催收号的总天数")
	private Integer l5mwdcnTdayscon = null;
	@Label("近五月被委外催收号码呼叫的总时长(秒)")
	private Integer l5mwdcnTdurinF = null;
	@Label("近五月与几家互联网金融机构催收号码有过联系")
	private Integer l5mwdcnTnumsconIf = null;
	@Label("订单号")
	private Integer serialId = null;
	@Label("用户ID")
	private Integer userId = null;

	//****************************************************************************
	//accessors
	//****************************************************************************
	public Integer getAllwdcmMaxorgtypein()
	{
		return this.allwdcmMaxorgtypein;
	}
	public void setAllwdcmMaxorgtypein(Integer allwdcmMaxorgtypein)
	{
		this.allwdcmMaxorgtypein = allwdcmMaxorgtypein;
	}
	public Integer getAllwdcnTdurinF()
	{
		return this.allwdcnTdurinF;
	}
	public void setAllwdcnTdurinF(Integer allwdcnTdurinF)
	{
		this.allwdcnTdurinF = allwdcnTdurinF;
	}
	public Integer getAllwdcnTnumscon()
	{
		return this.allwdcnTnumscon;
	}
	public void setAllwdcnTnumscon(Integer allwdcnTnumscon)
	{
		this.allwdcnTnumscon = allwdcnTnumscon;
	}
	public Integer getAllwdcnTnumsconBank()
	{
		return this.allwdcnTnumsconBank;
	}
	public void setAllwdcnTnumsconBank(Integer allwdcnTnumsconBank)
	{
		this.allwdcnTnumsconBank = allwdcnTnumsconBank;
	}
	public Integer getAllwdcnTnumsconCf()
	{
		return this.allwdcnTnumsconCf;
	}
	public void setAllwdcnTnumsconCf(Integer allwdcnTnumsconCf)
	{
		this.allwdcnTnumsconCf = allwdcnTnumsconCf;
	}
	public Integer getAllwdcnTnumsconF()
	{
		return this.allwdcnTnumsconF;
	}
	public void setAllwdcnTnumsconF(Integer allwdcnTnumsconF)
	{
		this.allwdcnTnumsconF = allwdcnTnumsconF;
	}
	public Integer getAllwdcnTnumsconIf()
	{
		return this.allwdcnTnumsconIf;
	}
	public void setAllwdcnTnumsconIf(Integer allwdcnTnumsconIf)
	{
		this.allwdcnTnumsconIf = allwdcnTnumsconIf;
	}
	public Integer getAllwdcnTnumsconOrg()
	{
		return this.allwdcnTnumsconOrg;
	}
	public void setAllwdcnTnumsconOrg(Integer allwdcnTnumsconOrg)
	{
		this.allwdcnTnumsconOrg = allwdcnTnumsconOrg;
	}
	public Integer getAllwdcnTtimesin()
	{
		return this.allwdcnTtimesin;
	}
	public void setAllwdcnTtimesin(Integer allwdcnTtimesin)
	{
		this.allwdcnTtimesin = allwdcnTtimesin;
	}
	public Integer getAllwdcnTtimesout()
	{
		return this.allwdcnTtimesout;
	}
	public void setAllwdcnTtimesout(Integer allwdcnTtimesout)
	{
		this.allwdcnTtimesout = allwdcnTtimesout;
	}
	public Integer getChaseCt()
	{
		return this.chaseCt;
	}
	public void setChaseCt(Integer chaseCt)
	{
		this.chaseCt = chaseCt;
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
	public Integer getL1mwdcnTnumscon()
	{
		return this.l1mwdcnTnumscon;
	}
	public void setL1mwdcnTnumscon(Integer l1mwdcnTnumscon)
	{
		this.l1mwdcnTnumscon = l1mwdcnTnumscon;
	}
	public Integer getL1mwdcnTnumsconBank()
	{
		return this.l1mwdcnTnumsconBank;
	}
	public void setL1mwdcnTnumsconBank(Integer l1mwdcnTnumsconBank)
	{
		this.l1mwdcnTnumsconBank = l1mwdcnTnumsconBank;
	}
	public Integer getL1mwdcnTnumsconCf()
	{
		return this.l1mwdcnTnumsconCf;
	}
	public void setL1mwdcnTnumsconCf(Integer l1mwdcnTnumsconCf)
	{
		this.l1mwdcnTnumsconCf = l1mwdcnTnumsconCf;
	}
	public Integer getL1mwdcnTnumsconF()
	{
		return this.l1mwdcnTnumsconF;
	}
	public void setL1mwdcnTnumsconF(Integer l1mwdcnTnumsconF)
	{
		this.l1mwdcnTnumsconF = l1mwdcnTnumsconF;
	}
	public Integer getL1mwdcnTnumsconIf()
	{
		return this.l1mwdcnTnumsconIf;
	}
	public void setL1mwdcnTnumsconIf(Integer l1mwdcnTnumsconIf)
	{
		this.l1mwdcnTnumsconIf = l1mwdcnTnumsconIf;
	}
	public Integer getL1mwdcnTnumsconOrg()
	{
		return this.l1mwdcnTnumsconOrg;
	}
	public void setL1mwdcnTnumsconOrg(Integer l1mwdcnTnumsconOrg)
	{
		this.l1mwdcnTnumsconOrg = l1mwdcnTnumsconOrg;
	}
	public Integer getL1mwdcnTtimesin()
	{
		return this.l1mwdcnTtimesin;
	}
	public void setL1mwdcnTtimesin(Integer l1mwdcnTtimesin)
	{
		this.l1mwdcnTtimesin = l1mwdcnTtimesin;
	}
	public Integer getL1mwdcnTtimesout()
	{
		return this.l1mwdcnTtimesout;
	}
	public void setL1mwdcnTtimesout(Integer l1mwdcnTtimesout)
	{
		this.l1mwdcnTtimesout = l1mwdcnTtimesout;
	}
	public Integer getL1wwdcnTnumscon()
	{
		return this.l1wwdcnTnumscon;
	}
	public void setL1wwdcnTnumscon(Integer l1wwdcnTnumscon)
	{
		this.l1wwdcnTnumscon = l1wwdcnTnumscon;
	}
	public Integer getL1wwdcnTnumsconBank()
	{
		return this.l1wwdcnTnumsconBank;
	}
	public void setL1wwdcnTnumsconBank(Integer l1wwdcnTnumsconBank)
	{
		this.l1wwdcnTnumsconBank = l1wwdcnTnumsconBank;
	}
	public Integer getL1wwdcnTnumsconCf()
	{
		return this.l1wwdcnTnumsconCf;
	}
	public void setL1wwdcnTnumsconCf(Integer l1wwdcnTnumsconCf)
	{
		this.l1wwdcnTnumsconCf = l1wwdcnTnumsconCf;
	}
	public Integer getL1wwdcnTnumsconF()
	{
		return this.l1wwdcnTnumsconF;
	}
	public void setL1wwdcnTnumsconF(Integer l1wwdcnTnumsconF)
	{
		this.l1wwdcnTnumsconF = l1wwdcnTnumsconF;
	}
	public Integer getL1wwdcnTnumsconIf()
	{
		return this.l1wwdcnTnumsconIf;
	}
	public void setL1wwdcnTnumsconIf(Integer l1wwdcnTnumsconIf)
	{
		this.l1wwdcnTnumsconIf = l1wwdcnTnumsconIf;
	}
	public Integer getL1wwdcnTnumsconOrg()
	{
		return this.l1wwdcnTnumsconOrg;
	}
	public void setL1wwdcnTnumsconOrg(Integer l1wwdcnTnumsconOrg)
	{
		this.l1wwdcnTnumsconOrg = l1wwdcnTnumsconOrg;
	}
	public Integer getL1wwdcnTtimesin()
	{
		return this.l1wwdcnTtimesin;
	}
	public void setL1wwdcnTtimesin(Integer l1wwdcnTtimesin)
	{
		this.l1wwdcnTtimesin = l1wwdcnTtimesin;
	}
	public Integer getL1wwdcnTtimesout()
	{
		return this.l1wwdcnTtimesout;
	}
	public void setL1wwdcnTtimesout(Integer l1wwdcnTtimesout)
	{
		this.l1wwdcnTtimesout = l1wwdcnTtimesout;
	}
	public Integer getL2mencnTdayscon()
	{
		return this.l2mencnTdayscon;
	}
	public void setL2mencnTdayscon(Integer l2mencnTdayscon)
	{
		this.l2mencnTdayscon = l2mencnTdayscon;
	}
	public Integer getL2mwdcnMaxtimescon()
	{
		return this.l2mwdcnMaxtimescon;
	}
	public void setL2mwdcnMaxtimescon(Integer l2mwdcnMaxtimescon)
	{
		this.l2mwdcnMaxtimescon = l2mwdcnMaxtimescon;
	}
	public Integer getL2mwdcnMaxtimesin()
	{
		return this.l2mwdcnMaxtimesin;
	}
	public void setL2mwdcnMaxtimesin(Integer l2mwdcnMaxtimesin)
	{
		this.l2mwdcnMaxtimesin = l2mwdcnMaxtimesin;
	}
	public Integer getL2mwdcnTnumsin()
	{
		return this.l2mwdcnTnumsin;
	}
	public void setL2mwdcnTnumsin(Integer l2mwdcnTnumsin)
	{
		this.l2mwdcnTnumsin = l2mwdcnTnumsin;
	}
	public Integer getL2mwdcnTtimesin()
	{
		return this.l2mwdcnTtimesin;
	}
	public void setL2mwdcnTtimesin(Integer l2mwdcnTtimesin)
	{
		this.l2mwdcnTtimesin = l2mwdcnTtimesin;
	}
	public Integer getL2wwdcnTnumsconOrgtype()
	{
		return this.l2wwdcnTnumsconOrgtype;
	}
	public void setL2wwdcnTnumsconOrgtype(Integer l2wwdcnTnumsconOrgtype)
	{
		this.l2wwdcnTnumsconOrgtype = l2wwdcnTnumsconOrgtype;
	}
	public Integer getL3mencnTnumsconOrg()
	{
		return this.l3mencnTnumsconOrg;
	}
	public void setL3mencnTnumsconOrg(Integer l3mencnTnumsconOrg)
	{
		this.l3mencnTnumsconOrg = l3mencnTnumsconOrg;
	}
	public Integer getL3mwdcnAddtnumsinOrg()
	{
		return this.l3mwdcnAddtnumsinOrg;
	}
	public void setL3mwdcnAddtnumsinOrg(Integer l3mwdcnAddtnumsinOrg)
	{
		this.l3mwdcnAddtnumsinOrg = l3mwdcnAddtnumsinOrg;
	}
	public Integer getL3mwdcnMaxdaysin()
	{
		return this.l3mwdcnMaxdaysin;
	}
	public void setL3mwdcnMaxdaysin(Integer l3mwdcnMaxdaysin)
	{
		this.l3mwdcnMaxdaysin = l3mwdcnMaxdaysin;
	}
	public Integer getL3mwdcnTnumscon()
	{
		return this.l3mwdcnTnumscon;
	}
	public void setL3mwdcnTnumscon(Integer l3mwdcnTnumscon)
	{
		this.l3mwdcnTnumscon = l3mwdcnTnumscon;
	}
	public Integer getL3mwdcnTnumsconBank()
	{
		return this.l3mwdcnTnumsconBank;
	}
	public void setL3mwdcnTnumsconBank(Integer l3mwdcnTnumsconBank)
	{
		this.l3mwdcnTnumsconBank = l3mwdcnTnumsconBank;
	}
	public Integer getL3mwdcnTnumsconCf()
	{
		return this.l3mwdcnTnumsconCf;
	}
	public void setL3mwdcnTnumsconCf(Integer l3mwdcnTnumsconCf)
	{
		this.l3mwdcnTnumsconCf = l3mwdcnTnumsconCf;
	}
	public Integer getL3mwdcnTnumsconF()
	{
		return this.l3mwdcnTnumsconF;
	}
	public void setL3mwdcnTnumsconF(Integer l3mwdcnTnumsconF)
	{
		this.l3mwdcnTnumsconF = l3mwdcnTnumsconF;
	}
	public Integer getL3mwdcnTnumsconIf()
	{
		return this.l3mwdcnTnumsconIf;
	}
	public void setL3mwdcnTnumsconIf(Integer l3mwdcnTnumsconIf)
	{
		this.l3mwdcnTnumsconIf = l3mwdcnTnumsconIf;
	}
	public Integer getL3mwdcnTnumsconOrg()
	{
		return this.l3mwdcnTnumsconOrg;
	}
	public void setL3mwdcnTnumsconOrg(Integer l3mwdcnTnumsconOrg)
	{
		this.l3mwdcnTnumsconOrg = l3mwdcnTnumsconOrg;
	}
	public Integer getL3mwdcnTtimesin()
	{
		return this.l3mwdcnTtimesin;
	}
	public void setL3mwdcnTtimesin(Integer l3mwdcnTtimesin)
	{
		this.l3mwdcnTtimesin = l3mwdcnTtimesin;
	}
	public Integer getL3mwdcnTtimesout()
	{
		return this.l3mwdcnTtimesout;
	}
	public void setL3mwdcnTtimesout(Integer l3mwdcnTtimesout)
	{
		this.l3mwdcnTtimesout = l3mwdcnTtimesout;
	}
	public Integer getL3wwdcnTnumsconIf()
	{
		return this.l3wwdcnTnumsconIf;
	}
	public void setL3wwdcnTnumsconIf(Integer l3wwdcnTnumsconIf)
	{
		this.l3wwdcnTnumsconIf = l3wwdcnTnumsconIf;
	}
	public Integer getL4mwdcnTdurcon()
	{
		return this.l4mwdcnTdurcon;
	}
	public void setL4mwdcnTdurcon(Integer l4mwdcnTdurcon)
	{
		this.l4mwdcnTdurcon = l4mwdcnTdurcon;
	}
	public Integer getL4mwdcnTdurin()
	{
		return this.l4mwdcnTdurin;
	}
	public void setL4mwdcnTdurin(Integer l4mwdcnTdurin)
	{
		this.l4mwdcnTdurin = l4mwdcnTdurin;
	}
	public Integer getL4mwdcnTdurinMaxtimes()
	{
		return this.l4mwdcnTdurinMaxtimes;
	}
	public void setL4mwdcnTdurinMaxtimes(Integer l4mwdcnTdurinMaxtimes)
	{
		this.l4mwdcnTdurinMaxtimes = l4mwdcnTdurinMaxtimes;
	}
	public Integer getL4mwdcnTnumsconF()
	{
		return this.l4mwdcnTnumsconF;
	}
	public void setL4mwdcnTnumsconF(Integer l4mwdcnTnumsconF)
	{
		this.l4mwdcnTnumsconF = l4mwdcnTnumsconF;
	}
	public Integer getL4mwdcnTnumsconOrgtype()
	{
		return this.l4mwdcnTnumsconOrgtype;
	}
	public void setL4mwdcnTnumsconOrgtype(Integer l4mwdcnTnumsconOrgtype)
	{
		this.l4mwdcnTnumsconOrgtype = l4mwdcnTnumsconOrgtype;
	}
	public Integer getL4mwdcnTnumsinF()
	{
		return this.l4mwdcnTnumsinF;
	}
	public void setL4mwdcnTnumsinF(Integer l4mwdcnTnumsinF)
	{
		this.l4mwdcnTnumsinF = l4mwdcnTnumsinF;
	}
	public Integer getL4mwdcnTtimescon()
	{
		return this.l4mwdcnTtimescon;
	}
	public void setL4mwdcnTtimescon(Integer l4mwdcnTtimescon)
	{
		this.l4mwdcnTtimescon = l4mwdcnTtimescon;
	}
	public Integer getL4mwdcnTtimesinNonbank()
	{
		return this.l4mwdcnTtimesinNonbank;
	}
	public void setL4mwdcnTtimesinNonbank(Integer l4mwdcnTtimesinNonbank)
	{
		this.l4mwdcnTtimesinNonbank = l4mwdcnTtimesinNonbank;
	}
	public Integer getL5mwdcmTdurcon()
	{
		return this.l5mwdcmTdurcon;
	}
	public void setL5mwdcmTdurcon(Integer l5mwdcmTdurcon)
	{
		this.l5mwdcmTdurcon = l5mwdcmTdurcon;
	}
	public Integer getL5mwdcnTdayscon()
	{
		return this.l5mwdcnTdayscon;
	}
	public void setL5mwdcnTdayscon(Integer l5mwdcnTdayscon)
	{
		this.l5mwdcnTdayscon = l5mwdcnTdayscon;
	}
	public Integer getL5mwdcnTdurinF()
	{
		return this.l5mwdcnTdurinF;
	}
	public void setL5mwdcnTdurinF(Integer l5mwdcnTdurinF)
	{
		this.l5mwdcnTdurinF = l5mwdcnTdurinF;
	}
	public Integer getL5mwdcnTnumsconIf()
	{
		return this.l5mwdcnTnumsconIf;
	}
	public void setL5mwdcnTnumsconIf(Integer l5mwdcnTnumsconIf)
	{
		this.l5mwdcnTnumsconIf = l5mwdcnTnumsconIf;
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
