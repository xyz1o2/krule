package com.ph.mapper.strategy;

import com.ph.entity.strategy.RiskCharacteristics;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RiskCharacteristicsMapper extends BaseMapper<RiskCharacteristics> {

    @Select("select * from risk_characteristics where apply_no=#{serial_id}")
    RiskCharacteristics findBySerialId(int serialId);

    @Select("select * from risk_characteristics where apply_no=#{serial_id} for update")
    RiskCharacteristics findBySerialIdForUpdate(int serialId);

}