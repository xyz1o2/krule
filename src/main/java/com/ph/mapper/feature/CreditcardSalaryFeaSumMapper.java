package com.ph.mapper.feature;

import com.ph.entity.feature.CreditcardSalaryFeaMin;
import com.ph.entity.feature.CreditcardSalaryFeaSum;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CreditcardSalaryFeaSumMapper extends BaseMapper<CreditcardSalaryFeaSum> {

    @Select("select * from creditcard_salary_fea_sum where serial_id=#{serial_id} order by id desc limit 1")
    CreditcardSalaryFeaSum findBySerialId(int serialId);

    @Select("select * from creditcard_salary_fea_sum where serial_id=#{serial_id} order by id desc limit 1 for update")
    CreditcardSalaryFeaSum findBySerialIdForUpdate(int serialId);
    
}
