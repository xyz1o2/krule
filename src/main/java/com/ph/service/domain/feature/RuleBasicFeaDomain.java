package com.ph.service.domain.feature;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.feature.RuleBasicFea;
import com.ph.mapper.feature.RuleBasicFeaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RuleBasicFeaDomain {

    @Autowired
    private RuleBasicFeaMapper ruleBasicFeaMapper;

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleBasicFea findBySerialId(int serialId) {
        return ruleBasicFeaMapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleBasicFea findBySerialIdForUpdate(int serialId) {
        return ruleBasicFeaMapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void update(RuleBasicFea ruleBasicFea) {
        ruleBasicFeaMapper.update(ruleBasicFea);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void insert(RuleBasicFea ruleBasicFea) {
        ruleBasicFeaMapper.insert(ruleBasicFea);
    }

}
