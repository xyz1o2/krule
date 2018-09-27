package com.ph.mapper.feature;

import com.ph.entity.feature.RuleBaiqishiFea;
import com.ph.entity.feature.RuleBangshengFea;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RuleBangshengFeaMapper extends BaseMapper<RuleBangshengFea> {

    @Select("select * from rule_bangsheng_fea where serial_id=#{serial_id} order by id desc limit 1")
    RuleBangshengFea findBySerialId(int serialId);

    @Select("select * from rule_bangsheng_fea where serial_id=#{serial_id} order by id desc limit 1 for update")
    RuleBangshengFea findBySerialIdForUpdate(int serialId);

}
