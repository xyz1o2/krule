package com.ph.mapper.feature;

import com.ph.entity.feature.RuleBasicFea;
import com.ph.entity.feature.RuleSuanhuaFea;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RuleSuanhuaFeaMapper extends BaseMapper<RuleSuanhuaFea> {

    @Select("select * from rule_suanhua_fea where serial_id=#{serial_id} order by id desc limit 1")
    RuleSuanhuaFea findBySerialId(int serialId);

    @Select("select * from rule_suanhua_fea where serial_id=#{serial_id} order by id desc limit 1 for update")
    RuleSuanhuaFea findBySerialIdForUpdate(int serialId);

}
