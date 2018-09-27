package com.ph.mapper.feature;

import com.ph.entity.feature.RuleBasicFea;
import com.ph.entity.feature.RuleHousefundFea;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RuleHousefundFeaMapper extends BaseMapper<RuleHousefundFea> {

    @Select("select * from rule_housefund_fea where serial_id=#{serial_id} order by id desc limit 1")
    RuleHousefundFea findBySerialId(int serialId);

    @Select("select * from rule_housefund_fea where serial_id=#{serial_id} order by id desc limit 1 for update")
    RuleHousefundFea findBySerialIdForUpdate(int serialId);

}
