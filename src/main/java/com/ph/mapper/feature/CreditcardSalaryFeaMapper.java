package com.ph.mapper.feature;

import com.ph.entity.feature.CreditcardSalaryFea;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CreditcardSalaryFeaMapper extends BaseMapper<CreditcardSalaryFea> {

    @Select("select * from creditcard_salary_fea where serial_id=#{serial_id} order by id desc limit 1")
    CreditcardSalaryFea findBySerialId(int serialId);

    @Select("select * from creditcard_salary_fea where serial_id=#{serial_id} order by id desc limit 1 for update")
    CreditcardSalaryFea findBySerialIdForUpdate(int serialId);

}
