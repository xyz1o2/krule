package com.ph.mapper.feature;

import com.ph.entity.feature.CreditcardSalaryFea;
import com.ph.entity.feature.RuleBaiqishiFea;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RuleBaiqishiFeaMapper extends BaseMapper<RuleBaiqishiFea> {

    @Select("select * from rule_baiqishi_fea where serial_id=#{serial_id} order by id desc limit 1")
    RuleBaiqishiFea findBySerialId(int serialId);

    @Select("select * from rule_baiqishi_fea where serial_id=#{serial_id} order by id desc limit 1 for update")
    RuleBaiqishiFea findBySerialIdForUpdate(int serialId);

}
