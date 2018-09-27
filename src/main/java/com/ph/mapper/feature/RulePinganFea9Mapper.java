package com.ph.mapper.feature;

import com.ph.entity.feature.RuleBasicFea;
import com.ph.entity.feature.RulePinganFea9;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RulePinganFea9Mapper extends BaseMapper<RulePinganFea9> {

    @Select("select * from rule_pingan_fea9 where serial_id=#{serial_id} order by id desc limit 1")
    RulePinganFea9 findBySerialId(int serialId);

    @Select("select * from rule_pingan_fea9 where serial_id=#{serial_id} order by id desc limit 1 for update")
    RulePinganFea9 findBySerialIdForUpdate(int serialId);

}
