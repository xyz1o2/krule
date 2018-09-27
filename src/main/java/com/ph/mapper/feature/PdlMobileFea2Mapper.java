package com.ph.mapper.feature;

import com.ph.entity.feature.PdlMobileFea1;
import com.ph.entity.feature.PdlMobileFea2;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PdlMobileFea2Mapper extends BaseMapper<PdlMobileFea2> {

    @Select("select * from pdl_mobile_fea2 where serial_id=#{serial_id} order by id desc limit 1")
    PdlMobileFea2 findBySerialId(int serialId);

    @Select("select * from pdl_mobile_fea2 where serial_id=#{serial_id} order by id desc limit 1 for update")
    PdlMobileFea2 findBySerialIdForUpdate(int serialId);

}
