package com.ph.mapper.feature;

import com.ph.entity.feature.RuleBasicFea;
import com.ph.entity.feature.RuleTongdunFea;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RuleTongdunFeaMapper extends BaseMapper<RuleTongdunFea> {

    @Select("select * from rule_tongdun_fea where serial_id=#{serial_id} order by id desc limit 1")
    RuleTongdunFea findBySerialId(int serialId);

    @Select("select * from rule_tongdun_fea where serial_id=#{serial_id} order by id desc limit 1 for update")
    RuleTongdunFea findBySerialIdForUpdate(int serialId);

}
