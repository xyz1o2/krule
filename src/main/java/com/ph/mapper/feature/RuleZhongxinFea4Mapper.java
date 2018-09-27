package com.ph.mapper.feature;

import com.ph.entity.feature.RuleBasicFea;
import com.ph.entity.feature.RuleZhongxinFea4;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RuleZhongxinFea4Mapper extends BaseMapper<RuleZhongxinFea4> {

    @Select("select * from rule_zhongxin_fea4 where serial_id=#{serial_id} order by id desc limit 1")
    RuleZhongxinFea4 findBySerialId(int serialId);

    @Select("select * from rule_zhongxin_fea4 where serial_id=#{serial_id} order by id desc limit 1 for update")
    RuleZhongxinFea4 findBySerialIdForUpdate(int serialId);

}
