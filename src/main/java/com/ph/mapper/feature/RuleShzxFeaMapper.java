package com.ph.mapper.feature;

import com.ph.entity.feature.RuleBasicFea;
import com.ph.entity.feature.RuleShzxFea;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RuleShzxFeaMapper extends BaseMapper<RuleShzxFea> {

    @Select("select * from rule_shzx_fea where serial_id=#{serial_id} order by id desc limit 1")
    RuleShzxFea findBySerialId(int serialId);

    @Select("select * from rule_shzx_fea where serial_id=#{serial_id} order by id desc limit 1 for update")
    RuleShzxFea findBySerialIdForUpdate(int serialId);

}
