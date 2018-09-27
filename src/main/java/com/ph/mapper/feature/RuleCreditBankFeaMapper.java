package com.ph.mapper.feature;

import com.ph.entity.feature.RuleCreditBankFea;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RuleCreditBankFeaMapper extends BaseMapper<RuleCreditBankFea> {

    @Select("select * from rule_credit_bank_fea where serial_id=#{serial_id} order by id desc limit 1")
    RuleCreditBankFea findBySerialId(int serialId);

    @Select("select * from rule_credit_bank_fea where serial_id=#{serial_id} order by id desc limit 1 for update")
    RuleCreditBankFea findBySerialIdForUpdate(int serialId);

}
