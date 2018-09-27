package com.ph.mapper.feature;

import com.ph.entity.feature.RuleBasicFea;
import com.ph.entity.feature.RuleMobileFea;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RuleMobileFeaMapper extends BaseMapper<RuleMobileFea> {

    @Select("select * from rule_mobile_fea where serial_id=#{serial_id} order by id desc limit 1")
    RuleMobileFea findBySerialId(int serialId);

    @Select("select * from rule_mobile_fea where serial_id=#{serial_id} order by id desc limit 1 for update")
    RuleMobileFea findBySerialIdForUpdate(int serialId);

}
