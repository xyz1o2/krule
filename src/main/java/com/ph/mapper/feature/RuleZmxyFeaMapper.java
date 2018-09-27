package com.ph.mapper.feature;

import com.ph.entity.feature.RuleBasicFea;
import com.ph.entity.feature.RuleZmxyFea;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RuleZmxyFeaMapper extends BaseMapper<RuleZmxyFea> {

    @Select("select * from rule_zmxy_fea where serial_id=#{serial_id} order by id desc limit 1")
    RuleZmxyFea findBySerialId(int serialId);

    @Select("select * from rule_zmxy_fea where serial_id=#{serial_id} order by id desc limit 1 for update")
    RuleZmxyFea findBySerialIdForUpdate(int serialId);

}
