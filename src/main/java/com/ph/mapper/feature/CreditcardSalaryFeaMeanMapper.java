package com.ph.mapper.feature;

import com.ph.entity.feature.CreditcardSalaryFeaMean;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CreditcardSalaryFeaMeanMapper extends BaseMapper<CreditcardSalaryFeaMean> {

    @Select("select * from creditcard_salary_fea_mean where serial_id=#{serial_id} order by id desc limit 1")
    CreditcardSalaryFeaMean findBySerialId(int serialId);

    @Select("select * from creditcard_salary_fea_mean where serial_id=#{serial_id} order by id desc limit 1 for update")
    CreditcardSalaryFeaMean findBySerialIdForUpdate(int serialId);
}
