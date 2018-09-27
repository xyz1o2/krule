package com.ph.mapper.feature;

import com.ph.entity.feature.RuleBasicFea;
import com.ph.entity.feature.RulePaipaixinFea;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RulePaipaixinFeaMapper extends BaseMapper<RulePaipaixinFea> {

    @Select("select * from rule_paipaixin_fea where serial_id=#{serial_id} order by id desc limit 1")
    RulePaipaixinFea findBySerialId(int serialId);

    @Select("select * from rule_paipaixin_fea where serial_id=#{serial_id} order by id desc limit 1 for update")
    RulePaipaixinFea findBySerialIdForUpdate(int serialId);

}
