package com.ph.entity.strategy;

import com.bstek.urule.model.Label;
import com.ph.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;



/**
 * 
 * <p>Title: risk_analysis - 风控分析表 : Value Object</p> 
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
public class RiskAnalysis extends BaseEntity
{
	//****************************************************************************
	//fields
	//****************************************************************************
	@Label("对应进件表中的进件号(serial_id)")
	private Integer applyNo = null;
	@Label("开始跑此次风控流程的时间")
	private Integer createTime = null;
	@Label("自动生成")
	private Integer id = null;
	@Label("是否写表，空不写，填入任意值都写表")
	private String isInsert = null;
	@Label("每一次跑风控对应的唯一风控分析ID")
	private String riskAnalysisId = null;
	@Label("跑此风控流程后用户增加的额度")
	private String riskCreditAdd = null;
	@Label("跑此风控流程前用户的总额度")
	private String riskCreditAnte = null;
	@Label("跑此风控后向用户展示的额度")
	private String riskCreditDisplay = null;
	@Label("此风控流程基于的授信项(材料MPO,TBA,ECC,DCS,FND,设备DEV,CTC,SMS,APP,GPS,VOI,三方TTD...等等)")
	private String riskCreditItem = null;
	@Label("跑此风控流程前用户的授信项")
	private String riskCreditItemAnte = null;
	@Label("跑此风控流程后用户的总额度")
	private String riskCreditPost = null;
	@Label("跑此风控流程后用户减少的额度（如用户第二次提交运营商，则需减去上次运营商获得的额度）")
	private String riskCreditSubtract = null;
	@Label("所跑的风控主流程编号（区分5种不同的流程及版本：REG001,MAT001,ACT001,USE001，REV001）")
	private String riskProcessNo = null;
	@Label("此风控主流程中所包含的子流程编号,多个流程以逗号相隔（如ACTINT001,ACTTRD001,ACTAUD001)")
	private String riskProcessSubNo = null;
	@Label("是否批核")
	private String riskResultDecision = null;
	@Label("此风控流程中作出的费率等级判断标签")
	private String riskResultFee = null;
	@Label("此风控流程中触碰的标签规则串")
	private String riskResultLabel = null;
	@Label("此风控流程中触碰的直拒规则串")
	private String riskResultReject = null;
	@Label("此风控流程中未触碰的直拒规则串")
	private String riskResultRejectNull = null;
	@Label("是否调用下一流程的状态判断")
	private String riskState = null;
	@Label("对应User表的user ID")
	private Integer riskUserId = null;
	@Label("完成此次风控流程并更新结果的时间")
	private Integer updateTime = null;

	//****************************************************************************
	//accessors
	//****************************************************************************
	public Integer getApplyNo()
	{
		return this.applyNo;
	}
	public void setApplyNo(Integer applyNo)
	{
		this.applyNo = applyNo;
	}
	public Integer getCreateTime()
	{
		return this.createTime;
	}
	public void setCreateTime(Integer createTime)
	{
		this.createTime = createTime;
	}
	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public String getIsInsert()
	{
		return this.isInsert;
	}
	public void setIsInsert(String isInsert)
	{
		this.isInsert = isInsert;
	}
	public String getRiskAnalysisId()
	{
		return this.riskAnalysisId;
	}
	public void setRiskAnalysisId(String riskAnalysisId)
	{
		this.riskAnalysisId = riskAnalysisId;
	}
	public String getRiskCreditAdd()
	{
		return this.riskCreditAdd;
	}
	public void setRiskCreditAdd(String riskCreditAdd)
	{
		this.riskCreditAdd = riskCreditAdd;
	}
	public String getRiskCreditAnte()
	{
		return this.riskCreditAnte;
	}
	public void setRiskCreditAnte(String riskCreditAnte)
	{
		this.riskCreditAnte = riskCreditAnte;
	}
	public String getRiskCreditDisplay()
	{
		return this.riskCreditDisplay;
	}
	public void setRiskCreditDisplay(String riskCreditDisplay)
	{
		this.riskCreditDisplay = riskCreditDisplay;
	}
	public String getRiskCreditItem()
	{
		return this.riskCreditItem;
	}
	public void setRiskCreditItem(String riskCreditItem)
	{
		this.riskCreditItem = riskCreditItem;
	}
	public String getRiskCreditItemAnte()
	{
		return this.riskCreditItemAnte;
	}
	public void setRiskCreditItemAnte(String riskCreditItemAnte)
	{
		this.riskCreditItemAnte = riskCreditItemAnte;
	}
	public String getRiskCreditPost()
	{
		return this.riskCreditPost;
	}
	public void setRiskCreditPost(String riskCreditPost)
	{
		this.riskCreditPost = riskCreditPost;
	}
	public String getRiskCreditSubtract()
	{
		return this.riskCreditSubtract;
	}
	public void setRiskCreditSubtract(String riskCreditSubtract)
	{
		this.riskCreditSubtract = riskCreditSubtract;
	}
	public String getRiskProcessNo()
	{
		return this.riskProcessNo;
	}
	public void setRiskProcessNo(String riskProcessNo)
	{
		this.riskProcessNo = riskProcessNo;
	}
	public String getRiskProcessSubNo()
	{
		return this.riskProcessSubNo;
	}
	public void setRiskProcessSubNo(String riskProcessSubNo)
	{
		this.riskProcessSubNo = riskProcessSubNo;
	}
	public String getRiskResultDecision()
	{
		return this.riskResultDecision;
	}
	public void setRiskResultDecision(String riskResultDecision)
	{
		this.riskResultDecision = riskResultDecision;
	}
	public String getRiskResultFee()
	{
		return this.riskResultFee;
	}
	public void setRiskResultFee(String riskResultFee)
	{
		this.riskResultFee = riskResultFee;
	}
	public String getRiskResultLabel()
	{
		return this.riskResultLabel;
	}
	public void setRiskResultLabel(String riskResultLabel)
	{
		this.riskResultLabel = riskResultLabel;
	}
	public String getRiskResultReject()
	{
		return this.riskResultReject;
	}
	public void setRiskResultReject(String riskResultReject)
	{
		this.riskResultReject = riskResultReject;
	}
	public String getRiskResultRejectNull()
	{
		return this.riskResultRejectNull;
	}
	public void setRiskResultRejectNull(String riskResultRejectNull)
	{
		this.riskResultRejectNull = riskResultRejectNull;
	}
	public String getRiskState()
	{
		return this.riskState;
	}
	public void setRiskState(String riskState)
	{
		this.riskState = riskState;
	}
	public Integer getRiskUserId()
	{
		return this.riskUserId;
	}
	public void setRiskUserId(Integer riskUserId)
	{
		this.riskUserId = riskUserId;
	}
	public Integer getUpdateTime()
	{
		return this.updateTime;
	}
	public void setUpdateTime(Integer updateTime)
	{
		this.updateTime = updateTime;
	}
	
}
