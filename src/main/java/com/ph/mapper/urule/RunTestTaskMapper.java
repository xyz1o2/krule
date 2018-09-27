package com.ph.mapper.urule;

import com.ph.entity.urule.RunTestTask;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RunTestTaskMapper extends BaseMapper<RunTestTask> {

    @Select("select * from run_test_task where username=#{username}")
    List<RunTestTask> findTaskByUsername(String username);


    @Select("select * from run_test_task where status = 0")
    List<RunTestTask> findAllInitTask();
}