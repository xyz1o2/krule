package com.ph.mapper.feature;

import com.ph.entity.feature.RuleDeviceFea;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RuleDeviceFeaMapper extends BaseMapper<RuleDeviceFea> {

    @Select("select * from rule_device_fea where serial_id=#{serial_id} order by id desc limit 1")
    RuleDeviceFea findBySerialId(int serialId);

    @Select("select * from rule_device_fea where serial_id=#{serial_id} order by id desc limit 1 for update")
    RuleDeviceFea findBySerialIdForUpdate(int serialId);

}
