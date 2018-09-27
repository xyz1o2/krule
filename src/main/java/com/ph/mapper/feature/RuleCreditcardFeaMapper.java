package com.ph.mapper.feature;

import com.ph.entity.feature.RuleBasicFea;
import com.ph.entity.feature.RuleCreditcardFea;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RuleCreditcardFeaMapper extends BaseMapper<RuleCreditcardFea> {

    @Select("select * from rule_creditcard_fea where serial_id=#{serial_id} order by id desc limit 1")
    RuleCreditcardFea findBySerialId(int serialId);

    @Select("select * from rule_creditcard_fea where serial_id=#{serial_id} order by id desc limit 1 for update")
    RuleCreditcardFea findBySerialIdForUpdate(int serialId);

}
