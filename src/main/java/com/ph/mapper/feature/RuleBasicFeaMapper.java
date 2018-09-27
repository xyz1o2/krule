package com.ph.mapper.feature;

import com.ph.entity.feature.RuleBangshengFea;
import com.ph.entity.feature.RuleBasicFea;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RuleBasicFeaMapper extends BaseMapper<RuleBasicFea> {

    @Select("select * from rule_basic_fea where serial_id=#{serial_id} order by id desc limit 1")
    RuleBasicFea findBySerialId(int serialId);

    @Select("select * from rule_basic_fea where serial_id=#{serial_id} order by id desc limit 1 for update")
    RuleBasicFea findBySerialIdForUpdate(int serialId);

}
