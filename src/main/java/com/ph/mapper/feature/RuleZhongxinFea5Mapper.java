package com.ph.mapper.feature;

import com.ph.entity.feature.RuleBasicFea;
import com.ph.entity.feature.RuleZhongxinFea5;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RuleZhongxinFea5Mapper extends BaseMapper<RuleZhongxinFea5> {

    @Select("select * from rule_zhongxin_fea5 where serial_id=#{serial_id} order by id desc limit 1")
    RuleZhongxinFea5 findBySerialId(int serialId);

    @Select("select * from rule_zhongxin_fea5 where serial_id=#{serial_id} order by id desc limit 1 for update")
    RuleZhongxinFea5 findBySerialIdForUpdate(int serialId);

}
