package com.ph.mapper.strategy;

import com.ph.entity.strategy.RiskScore;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RiskScoreMapper extends BaseMapper<RiskScore> {

    @Select("select * from risk_score where apply_no=#{serial_id}")
    RiskScore findBySerialId(int serialId);

    @Select("select * from risk_score where apply_no=#{serial_id} for update")
    RiskScore findBySerialIdForUpdate(int serialId);

}