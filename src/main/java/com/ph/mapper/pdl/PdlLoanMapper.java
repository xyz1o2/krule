package com.ph.mapper.pdl;

import com.ph.entity.pdl.PdlLoan;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PdlLoanMapper extends BaseMapper<PdlLoan> {

    @Select("select * from pdl_loan where serial_id=#{serial_id} order by id desc limit 1")
    PdlLoan findBySerialId(int serialId);

    @Select("select * from pdl_loan where serial_id=#{serial_id} order by id desc limit 1 for update")
    PdlLoan findBySerialIdForUpdate(int serialId);

    @Select("select * from pdl_loan where time >= #{start_time} and time < #{end_time}")
    List<PdlLoan> findListByTime(int startTime, int endTime);

}