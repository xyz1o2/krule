package com.ph.entity.httovo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * Author:   lzy
 * Date:     2018-09-10 15:32
 * Description:  策略试跑任务参数请求体
 **/
@Data
public class RuleRunTaskRequest {

    @ApiModelProperty("决策流ID")
    @NotNull
    private String flow_id = "";

    @ApiModelProperty("产品线（项目名字）")
    @NotNull
    private String product_line;

    @ApiModelProperty("决策类型")
    @NotNull
    private String strategy_type;

    @ApiModelProperty("知识包ID")
    @NotNull
    private String package_id;

    @ApiModelProperty("类型 0单例 1批量")
    private Integer type;

    @ApiModelProperty("订单号")
    private Integer serial_id;

    @ApiModelProperty("开始时间")
    private Integer start_time;

    @ApiModelProperty("结束时间")
    private Integer end_time;

}
