package com.ph.mapper.feature;

import com.ph.entity.feature.RuleXinyanWashblackFea;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RuleXinyanWashblackFeaMapper extends BaseMapper<RuleXinyanWashblackFea> {

    @Select("select * from rule_xinyan_washblack_fea where serial_id=#{serial_id} order by id desc limit 1")
    RuleXinyanWashblackFea findBySerialId(int serialId);

    @Select("select * from rule_xinyan_washblack_fea where serial_id=#{serial_id} order by id desc limit 1 for update")
    RuleXinyanWashblackFea findBySerialIdForUpdate(int serialId);

}
