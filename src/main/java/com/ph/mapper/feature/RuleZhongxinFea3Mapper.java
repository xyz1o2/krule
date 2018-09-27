package com.ph.mapper.feature;

import com.ph.entity.feature.RuleBasicFea;
import com.ph.entity.feature.RuleZhongxinFea3;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RuleZhongxinFea3Mapper extends BaseMapper<RuleZhongxinFea3> {

    @Select("select * from rule_zhongxin_fea3 where serial_id=#{serial_id} order by id desc limit 1")
    RuleZhongxinFea3 findBySerialId(int serialId);

    @Select("select * from rule_zhongxin_fea3 where serial_id=#{serial_id} order by id desc limit 1 for update")
    RuleZhongxinFea3 findBySerialIdForUpdate(int serialId);

}
