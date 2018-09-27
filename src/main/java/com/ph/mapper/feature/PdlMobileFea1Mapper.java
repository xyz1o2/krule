package com.ph.mapper.feature;

import com.ph.entity.feature.CreditcardSalaryFea;
import com.ph.entity.feature.PdlMobileFea1;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PdlMobileFea1Mapper extends BaseMapper<PdlMobileFea1> {

    @Select("select * from pdl_mobile_fea1 where serial_id=#{serial_id} order by id desc limit 1")
    PdlMobileFea1 findBySerialId(int serialId);

    @Select("select * from pdl_mobile_fea1 where serial_id=#{serial_id} order by id desc limit 1 for update")
    PdlMobileFea1 findBySerialIdForUpdate(int serialId);

}
