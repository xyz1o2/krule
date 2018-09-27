package com.ph.mapper.feature;

import com.ph.entity.feature.RulePhoneContactFea;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RulePhoneContactFeaMapper extends BaseMapper<RulePhoneContactFea> {

    @Select("select * from rule_phone_contact_fea where serial_id=#{serial_id} order by id desc limit 1")
    RulePhoneContactFea findBySerialId(int serialId);

    @Select("select * from rule_phone_contact_fea where serial_id=#{serial_id} order by id desc limit 1 for update")
    RulePhoneContactFea findBySerialIdForUpdate(int serialId);

}
