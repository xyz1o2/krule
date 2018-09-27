package com.ph.service.domain.feature;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.feature.RuleHousefundFea;
import com.ph.mapper.feature.RuleHousefundFeaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RuleHousefundFeaDomain{

    @Autowired
    private RuleHousefundFeaMapper ruleHousefundFeaMapper;

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleHousefundFea findBySerialId(int serialId) {
        return ruleHousefundFeaMapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleHousefundFea findBySerialIdForUpdate(int serialId) {
        return ruleHousefundFeaMapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void update(RuleHousefundFea ruleHousefundFea) {
        ruleHousefundFeaMapper.update(ruleHousefundFea);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void insert(RuleHousefundFea ruleHousefundFea) {
        ruleHousefundFeaMapper.insert(ruleHousefundFea);
    }

}
