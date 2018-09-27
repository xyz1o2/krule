package com.ph.entity.httovo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * Author:   lzy
 * Date:     2018-09-10 15:32
 * Description:  新增权限参数请求体
 **/
@Data
public class UserAuthSetRequest {

    @ApiModelProperty("用户名")
    @NotNull
    private String username;

    @ApiModelProperty("产品线")
    @NotNull
    private String projectName;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
