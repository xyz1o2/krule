package com.ph.entity.httovo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Author:   lzy
 * Date:     2018-09-10 15:32
 * Description:  策略执行参数请求体
 **/
@Data
public class RuleRunRequest {

    @ApiModelProperty("订单号")
    @Min(value = 1)
    private Integer serial_id;

    @ApiModelProperty("决策流ID")
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

}
