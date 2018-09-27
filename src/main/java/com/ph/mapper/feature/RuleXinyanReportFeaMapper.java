package com.ph.mapper.feature;

import com.ph.entity.feature.RuleXinyanReportFea;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RuleXinyanReportFeaMapper extends BaseMapper<RuleXinyanReportFea> {

    @Select("select * from rule_xinyan_report_fea where serial_id=#{serial_id} order by id desc limit 1")
    RuleXinyanReportFea findBySerialId(int serialId);

    @Select("select * from rule_xinyan_report_fea where serial_id=#{serial_id} order by id desc limit 1 for update")
    RuleXinyanReportFea findBySerialIdForUpdate(int serialId);

}
