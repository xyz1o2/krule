package com.ph.entity.urule;

import com.ph.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RunTestTaskDetail extends BaseEntity {

	/**
	 * 主键ID
	 */
	private Integer id;

	/**
	 * 试跑任务主键ID
	 */
	private Integer taskId;

	/**
	 * 订单号
	 */
	private Integer serialId;

	/**
	 * UUID
	 */
	private String uuid;

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
