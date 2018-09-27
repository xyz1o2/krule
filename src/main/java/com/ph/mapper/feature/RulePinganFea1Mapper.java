package com.ph.mapper.feature;

import com.ph.entity.feature.RuleBasicFea;
import com.ph.entity.feature.RulePinganFea1;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RulePinganFea1Mapper extends BaseMapper<RulePinganFea1> {

    @Select("select * from rule_pingan_fea1 where serial_id=#{serial_id} order by id desc limit 1")
    RulePinganFea1 findBySerialId(int serialId);

    @Select("select * from rule_pingan_fea1 where serial_id=#{serial_id} order by id desc limit 1 for update")
    RulePinganFea1 findBySerialIdForUpdate(int serialId);

}
