package com.ph.mapper.feature;

import com.ph.entity.feature.RuleTaobaoFea;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RuleTaobaoFeaMapper extends BaseMapper<RuleTaobaoFea> {

    @Select("select * from rule_taobao_fea where serial_id=#{serial_id} order by id desc limit 1")
    RuleTaobaoFea findBySerialId(int serialId);

    @Select("select * from rule_taobao_fea where serial_id=#{serial_id} order by id desc limit 1 for update")
    RuleTaobaoFea findBySerialIdForUpdate(int serialId);

}
