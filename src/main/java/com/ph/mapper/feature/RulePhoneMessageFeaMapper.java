package com.ph.mapper.feature;

import com.ph.entity.feature.RuleBasicFea;
import com.ph.entity.feature.RulePhoneMessageFea;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RulePhoneMessageFeaMapper extends BaseMapper<RulePhoneMessageFea> {

    @Select("select * from rule_phone_message_fea where serial_id=#{serial_id} order by id desc limit 1")
    RulePhoneMessageFea findBySerialId(int serialId);

    @Select("select * from rule_phone_message_fea where serial_id=#{serial_id} order by id desc limit 1 for update")
    RulePhoneMessageFea findBySerialIdForUpdate(int serialId);

}
