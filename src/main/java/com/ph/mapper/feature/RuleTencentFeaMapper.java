package com.ph.mapper.feature;

import com.ph.entity.feature.RuleBasicFea;
import com.ph.entity.feature.RuleTencentFea;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RuleTencentFeaMapper extends BaseMapper<RuleTencentFea> {

    @Select("select * from rule_tencent_fea where serial_id=#{serial_id} order by id desc limit 1")
    RuleTencentFea findBySerialId(int serialId);

    @Select("select * from rule_tencent_fea where serial_id=#{serial_id} order by id desc limit 1 for update")
    RuleTencentFea findBySerialIdForUpdate(int serialId);

}
