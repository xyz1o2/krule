package com.ph.service.domain.urule;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.urule.RunTestTask;
import com.ph.mapper.urule.RunTestTaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RunTestTaskDomain {

    @Autowired
    private RunTestTaskMapper runTestTaskMapper;

    @DataSourceRouter(type = DataSourceType.URULE)
    public List<RunTestTask> findAllTask() {
        return runTestTaskMapper.findAllInitTask();
    }

    @DataSourceRouter(type = DataSourceType.URULE)
    public List<RunTestTask> findTaskByUsername(String username) {
        return runTestTaskMapper.findTaskByUsername(username);
    }

    @DataSourceRouter(type = DataSourceType.URULE)
    public void update(RunTestTask runTestTask) {
        runTestTaskMapper.update(runTestTask);
    }

    @DataSourceRouter(type = DataSourceType.URULE)
    public void insert(RunTestTask runTestTask) {
        runTestTaskMapper.insert(runTestTask);
    }

}
