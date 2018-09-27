package com.ph.mapper.feature;

import com.ph.entity.feature.RuleBasicFea;
import com.ph.entity.feature.RuleTianjiFea;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RuleTianjiFeaMapper extends BaseMapper<RuleTianjiFea> {

    @Select("select * from rule_tianji_fea where serial_id=#{serial_id} order by id desc limit 1")
    RuleTianjiFea findBySerialId(int serialId);

    @Select("select * from rule_tianji_fea where serial_id=#{serial_id} order by id desc limit 1 for update")
    RuleTianjiFea findBySerialIdForUpdate(int serialId);

}
