package com.ph.entity.urule;

import com.ph.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class RunTestTask extends BaseEntity {

	/**
	 * 主键ID
	 */
	private Integer id;

	/**
	 * 用户名
	 */
	private String username;

	/**
	 * 产品线（项目名字）
	 */
	private String productLine;

	/**
	 * 决策类型
	 */
	private String strategyType;

	/**
	 * 知识包ID
	 */
	private String packageId;

	/**
	 * 决策流ID
	 */
	private String flowId;

	/**
	 * 类型 0单例 1批量
	 */
	private Integer type;

	/**
	 * 单例订单号
	 */
	private Integer serialId;

	/**
	 * 批量开始时间
	 */
	private Integer startTime;

	/**
	 * 批量结束时间
	 */
	private Integer endTime;

	/**
	 * 状态
	 */
	private Integer status;

	/**
	 * 创建时间
	 */
	private Integer createTime;

	/**
	 * 更新时间
	 */
	private Integer upTime;
	
}
