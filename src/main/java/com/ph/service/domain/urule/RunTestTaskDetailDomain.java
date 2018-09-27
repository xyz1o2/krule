package com.ph.service.domain.urule;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.urule.RunTestTaskDetail;
import com.ph.mapper.urule.RunTestTaskDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RunTestTaskDetailDomain {

    @Autowired
    private RunTestTaskDetailMapper runTestTaskDetailMapper;


    @DataSourceRouter(type = DataSourceType.URULE)
    public void update(RunTestTaskDetail runTestTaskDetail) {
        runTestTaskDetailMapper.update(runTestTaskDetail);
    }

    @DataSourceRouter(type = DataSourceType.URULE)
    public void insert(RunTestTaskDetail runTestTaskDetail) {
        runTestTaskDetailMapper.insert(runTestTaskDetail);
    }

}
