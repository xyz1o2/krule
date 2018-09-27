package com.ph.mapper.feature;

import com.ph.entity.feature.RuleMobileFea1;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RuleMobileFea1Mapper extends BaseMapper<RuleMobileFea1> {

    @Select("select * from rule_mobile_fea1 where serial_id=#{serial_id} order by id desc limit 1")
    RuleMobileFea1 findBySerialId(int serialId);

    @Select("select * from rule_mobile_fea1 where serial_id=#{serial_id} order by id desc limit 1 for update")
    RuleMobileFea1 findBySerialIdForUpdate(int serialId);

}
