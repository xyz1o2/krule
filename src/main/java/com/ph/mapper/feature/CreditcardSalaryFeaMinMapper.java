package com.ph.mapper.feature;

import com.ph.entity.feature.CreditcardSalaryFeaMax;
import com.ph.entity.feature.CreditcardSalaryFeaMin;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CreditcardSalaryFeaMinMapper extends BaseMapper<CreditcardSalaryFeaMin> {

    @Select("select * from creditcard_salary_fea_min where serial_id=#{serial_id} order by id desc limit 1")
    CreditcardSalaryFeaMin findBySerialId(int serialId);

    @Select("select * from creditcard_salary_fea_min where serial_id=#{serial_id} order by id desc limit 1 for update")
    CreditcardSalaryFeaMin findBySerialIdForUpdate(int serialId);

}
