package com.ph.mapper.feature;

import com.ph.entity.feature.RuleBasicFea;
import com.ph.entity.feature.RulePinganFea1;
import com.ph.entity.feature.RulePinganFea3;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RulePinganFea3Mapper extends BaseMapper<RulePinganFea3> {

    @Select("select * from rule_pingan_fea3 where serial_id=#{serial_id} order by id desc limit 1")
    RulePinganFea3 findBySerialId(int serialId);

    @Select("select * from rule_pingan_fea3 where serial_id=#{serial_id} order by id desc limit 1 for update")
    RulePinganFea3 findBySerialIdForUpdate(int serialId);

}
