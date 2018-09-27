package com.ph.mapper.strategy;

import com.ph.entity.strategy.RiskExecuteLog;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RiskExecuteLogMapper extends BaseMapper<RiskExecuteLog> {

    @Select("select * from risk_execute_log where apply_no=#{serial_id}")
    RiskExecuteLog findBySerialId(int serialId);

    @Select("select * from risk_execute_log where apply_no=#{serial_id} for update")
    RiskExecuteLog findBySerialIdForUpdate(int serialId);

}