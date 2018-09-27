package com.ph.mapper.feature;

import com.ph.entity.feature.RuleBasicFea;
import com.ph.entity.feature.RuleInsideFea;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RuleInsideFeaMapper extends BaseMapper<RuleInsideFea> {

    @Select("select * from rule_inside_fea where serial_id=#{serial_id} order by id desc limit 1")
    RuleInsideFea findBySerialId(int serialId);

    @Select("select * from rule_inside_fea where serial_id=#{serial_id} order by id desc limit 1 for update")
    RuleInsideFea findBySerialIdForUpdate(int serialId);

}
