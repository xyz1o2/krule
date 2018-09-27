package com.ph.mapper.strategy;

import com.ph.entity.strategy.RiskAnalysis;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RiskAnalysisMapper extends BaseMapper<RiskAnalysis> {

    @Select("select * from risk_analysis where apply_no=#{serial_id}")
    RiskAnalysis findBySerialId(int serialId);

    @Select("select * from risk_analysis where apply_no=#{serial_id} for update")
    RiskAnalysis findBySerialIdForUpdate(int serialId);

}