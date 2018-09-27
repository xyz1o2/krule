package com.ph.service.domain.feature;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.feature.RuleInsideFea;
import com.ph.mapper.feature.RuleInsideFeaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RuleInsideFeaDomain {

    @Autowired
    private RuleInsideFeaMapper ruleInsideFeaMapper;

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleInsideFea findBySerialId(int serialId) {
        return ruleInsideFeaMapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleInsideFea findBySerialIdForUpdate(int serialId) {
        return ruleInsideFeaMapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void update(RuleInsideFea ruleInsideFea) {
        ruleInsideFeaMapper.update(ruleInsideFea);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void insert(RuleInsideFea ruleInsideFea) {
        ruleInsideFeaMapper.insert(ruleInsideFea);
    }

}
