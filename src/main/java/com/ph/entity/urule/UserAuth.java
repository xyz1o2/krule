package com.ph.entity.urule;

import com.ph.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class UserAuth extends BaseEntity {

	/**
	 * 主键ID
	 */
	private Integer id;

	/**
	 * 用户名
	 */
	private String username;

	/**
	 * 是否管理员 0否 1是
	 */
	private Integer isAdmin;

	/**
	 * 有权限的项目名
	 */
	private String projectName;

	/**
	 * 状态(暂无意义)
	 */
	private Integer status;
	
}
