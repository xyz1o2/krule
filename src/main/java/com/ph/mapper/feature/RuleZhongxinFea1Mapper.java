package com.ph.mapper.feature;

import com.ph.entity.feature.RuleBasicFea;
import com.ph.entity.feature.RuleZhongxinFea1;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RuleZhongxinFea1Mapper extends BaseMapper<RuleZhongxinFea1> {

    @Select("select * from rule_zhongxin_fea1 where serial_id=#{serial_id} order by id desc limit 1")
    RuleZhongxinFea1 findBySerialId(int serialId);

    @Select("select * from rule_zhongxin_fea1 where serial_id=#{serial_id} order by id desc limit 1 for update")
    RuleZhongxinFea1 findBySerialIdForUpdate(int serialId);

}
