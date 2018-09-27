package com.ph.mapper.feature;

import com.ph.entity.feature.RuleYoumengFea;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RuleYoumengFeaMapper extends BaseMapper<RuleYoumengFea> {

    @Select("select * from rule_youmeng_fea where serial_id=#{serial_id} order by id desc limit 1")
    RuleYoumengFea findBySerialId(int serialId);

    @Select("select * from rule_youmeng_fea where serial_id=#{serial_id} order by id desc limit 1 for update")
    RuleYoumengFea findBySerialIdForUpdate(int serialId);

}
