package com.ph.service.domain.feature;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.feature.RuleXinyanReportFea;
import com.ph.mapper.feature.RuleXinyanReportFeaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RuleXinyanReportFeaDomain {

    @Autowired
    private RuleXinyanReportFeaMapper ruleXinyanReportFeaMapper;

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleXinyanReportFea findBySerialId(int serialId) {
        return ruleXinyanReportFeaMapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleXinyanReportFea findBySerialIdForUpdate(int serialId) {
        return ruleXinyanReportFeaMapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void update(RuleXinyanReportFea ruleXinyanReportFea) {
        ruleXinyanReportFeaMapper.update(ruleXinyanReportFea);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void insert(RuleXinyanReportFea ruleXinyanReportFea) {
        ruleXinyanReportFeaMapper.insert(ruleXinyanReportFea);
    }

}
