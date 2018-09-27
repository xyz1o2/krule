package com.ph.entity.httovo;

import lombok.Data;

/**
 * Author: Hardy
 * Date:   2018/7/30 21:25
 * Description:
 **/
@Data
public class RestPage {
    // 当前页码
    private int pageNo;

    private int pageSize;

    private long totalPage;

    private long totalCount;

    public RestPage(int pageNo, int pageSize, long totalCount) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.totalPage = (totalCount / pageSize) + (totalCount % pageSize > 0 ? 1 : 0);
    }
}
