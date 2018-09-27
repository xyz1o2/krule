create database urule;


CREATE TABLE `user_auth` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(128) NOT NULL DEFAULT '' COMMENT '用户名',
  `is_admin` int(11) DEFAULT '0' COMMENT '是否管理员  0否1是',
  `project_name` varchar(128) DEFAULT ',' COMMENT '有权限的项目',
  `status` int(11) DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `uq_index_username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `run_test_task` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(128) NOT NULL DEFAULT '' COMMENT '用户名',
  `product_line` varchar(128) NOT NULL DEFAULT '' COMMENT '产品线',
  `strategy_type` varchar(128) NOT NULL DEFAULT '' COMMENT '决策类型',
  `package_id` varchar(128) NOT NULL DEFAULT '' COMMENT '知识包ID',
  `flow_id` varchar(128) NOT NULL DEFAULT '' COMMENT '决策流ID',
  `type` int(11) DEFAULT NULL COMMENT '类型，0-单利，1-批量',
  `serial_id` int(11) DEFAULT NULL COMMENT '单例订单号',
  `start_time` int(11) DEFAULT NULL COMMENT '批量开始时间',
  `end_time` int(11) DEFAULT NULL COMMENT '批量结束时间',
  `status` int(11) NOT NULL COMMENT '状态 0初始 1成功 2失败',
  `create_time` int(11) NOT NULL COMMENT '创建时间',
  `up_time` int(11) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`),
  KEY `idx_username` (username)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `run_test_task_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `task_id` int(11) NOT NULL COMMENT '任务主键ID',
  `serial_id` int(11) NOT NULL COMMENT '订单号',
  `uuid` varchar(128) NOT NULL DEFAULT '' COMMENT 'uuid',
  `status` int(11) NOT NULL COMMENT '0初始 1成功 2失败',
  `create_time` int(11) NOT NULL COMMENT '创建时间',
  `up_time` int(11) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`),
  KEY idx_task_id(`task_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;