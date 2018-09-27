create database strategy_preview;


create table if not exists risk_analysis
(
`id` int(10) auto_increment comment '自动生成',
`create_time` int(10)	not null default 0 comment '开始跑此次风控流程的时间',
`update_time` int(10) not null default 0 comment '完成此次风控流程并更新结果的时间',
`apply_no` int(10) not null comment '对应进件表中的进件号(serial_id)',
`risk_user_id` int(10) not null comment '对应User表的user ID',
`risk_analysis_id` varchar(128) not null default '' comment '每一次跑风控对应的唯一风控分析ID',
`risk_process_no` text comment '所跑的风控主流程编号（区分5种不同的流程及版本：REG001,MAT001,ACT001,USE001，REV001）',
`risk_process_sub_no` text comment '此风控主流程中所包含的子流程编号,多个流程以逗号相隔（如ACTINT001,ACTTRD001,ACTAUD001)',
`risk_credit_item` text comment '此风控流程基于的授信项(材料MPO,TBA,ECC,DCS,FND,设备DEV,CTC,SMS,APP,GPS,VOI,三方TTD...等等)',
`risk_credit_item_ante` text comment '跑此风控流程前用户的授信项',
`risk_credit_ante` varchar(32) default '' comment '跑此风控流程前用户的总额度',
`risk_credit_subtract` varchar(32) default '' comment '跑此风控流程后用户减少的额度（如用户第二次提交运营商，则需减去上次运营商获得的额度）',
`risk_credit_add` varchar(32) default '' comment '跑此风控流程后用户增加的额度',
`risk_credit_post` varchar(32) default '' comment '跑此风控流程后用户的总额度',
`risk_credit_display` varchar(32) default '' comment '跑此风控后向用户展示的额度',
`risk_result_label` text comment '此风控流程中触碰的标签规则串',
`risk_result_reject` text comment '此风控流程中触碰的直拒规则串',
`risk_result_reject_null` text comment '此风控流程中未触碰的直拒规则串',
`risk_result_decision` varchar(32) default '' comment '是否批核',
`risk_result_fee` varchar(32) default '' comment '此风控流程中作出的费率等级判断标签',
`risk_state` varchar(32) default '' comment '是否调用下一流程的状态判断',
`is_insert` varchar(32) comment '是否写表，空不写，填入任意值都写表',
 primary key(id),
 key idx_apply_no(apply_no)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='风控分析表';

create table if not exists risk_score
(
`id` int(10) auto_increment comment '自动生成',
`create_time` int(10)	not null default 0 comment '开始跑此次风控流程的时间',
`update_time` int(10) not null default 0 comment '完成此次风控流程并更新结果的时间',
`apply_no` int(10) not null comment '对应进件表中的进件号(serial_id)',
`risk_user_id` int(10) not null comment '对应User表的user ID',
`risk_analysis_id` varchar(128) not null default '' comment '每一次跑风控对应的唯一风控分析ID',
`risk_process_no` text comment '所跑的风控主流程编号（区分5种不同的流程及版本：REG001,MAT001,ACT001,USE001，REV001）',
`risk_process_sub_no` text comment '此风控主流程中所包含的子流程编号,多个流程以逗号相隔（如ACTINT001,ACTTRD001,ACTAUD001)',
`key` varchar(128) default '' comment '分数名',
`value` varchar(128) default '' comment '指标值',
`is_insert` varchar(32) comment '是否写表，空不写，填入任意值都写表',
 primary key(id),
 key idx_apply_no(apply_no)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='分数值记录表';

create table if not exists risk_characteristics
(
`id` int(10) auto_increment comment '自动生成',
`create_time` int(10)	not null default 0 comment '开始跑此次风控流程的时间',
`update_time` int(10) not null default 0 comment '完成此次风控流程并更新结果的时间',
`apply_no` int(10) not null comment '对应进件表中的进件号(serial_id)',
`risk_user_id` int(10) not null comment '对应User表的user ID',
`risk_analysis_id` varchar(128) not null default '' comment '每一次跑风控对应的唯一风控分析ID',
`risk_process_no` text comment '所跑的风控主流程编号（区分5种不同的流程及版本：REG001,MAT001,ACT001,USE001，REV001）',
`risk_process_sub_no` text comment '此风控主流程中所包含的子流程编号,多个流程以逗号相隔（如ACTINT001,ACTTRD001,ACTAUD001)',
`key` varchar(128) default '' comment '分数名',
`value` varchar(128) default '' comment '指标值',
`is_insert` varchar(32) comment '是否写表，空不写，填入任意值都写表',
 primary key(id),
 key idx_apply_no(apply_no)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='特征值记录表';

create table if not exists risk_decision_result
(
`id` int(10) auto_increment comment '自动生成',
`create_time` int(10)	not null default 0 comment '开始跑此次风控流程的时间',
`update_time` int(10) not null default 0 comment '完成此次风控流程并更新结果的时间',
`risk_user_id` int(10) not null comment '对应User表的user ID',
`apply_no` int(10) not null comment '对应进件表中的进件号(serial_id)',
`risk_analysis_id` varchar(128) not null default '' comment '每一次跑风控对应的唯一风控分析ID',
`risk_process_no`	text comment '风控主流程ID',
`risk_process_sub_no` text comment '风控子流程ID',
`risk_state` varchar(128) default '' comment '主流程状态',
`risk_sub_state` varchar(128) default '' comment '子流程状态',
`index_return` text comment'指标计算返回值',
`decision_return` text comment '决策引擎返回值',
`is_insert` varchar(32) comment '是否写表，空不写，填入任意值都写表',
 primary key(id),
 key idx_apply_no(apply_no)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='特征值记录表';

create table if not exists risk_execute_log
(
`id` int(10) auto_increment comment '自动生成',
`create_time` int(10)	not null default 0 comment '开始跑此次风控流程的时间',
`apply_no` int(10) not null comment '对应进件表中的进件号(serial_id)',
`risk_analysis_id` varchar(128) not null default '' comment '每一次跑风控对应的唯一风控分析ID',
`input` text comment '决策引入数据快照',
`rules` text comment '决策匹配规则',
`params` text comment '运行时参数表',
 primary key(id),
 key idx_apply_no(apply_no),
 key idx_risk_analysis_id(risk_analysis_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='日志记录表';
