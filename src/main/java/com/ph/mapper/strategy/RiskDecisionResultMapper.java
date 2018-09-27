package com.ph.mapper.strategy;

import com.ph.entity.strategy.RiskDecisionResult;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RiskDecisionResultMapper extends BaseMapper<RiskDecisionResult> {

    @Select("select * from risk_decision_result where apply_no=#{serial_id} order by id desc limit 1")
    RiskDecisionResult findBySerialId(int serialId);

    @Select("select * from risk_decision_result where apply_no=#{serial_id} order by id desc limit 1 for update")
    RiskDecisionResult findBySerialIdForUpdate(int serialId);

}