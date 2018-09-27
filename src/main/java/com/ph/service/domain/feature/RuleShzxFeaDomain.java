package com.ph.service.domain.feature;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.feature.RuleShzxFea;
import com.ph.mapper.feature.RuleShzxFeaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RuleShzxFeaDomain{

    @Autowired
    private RuleShzxFeaMapper ruleShzxFeaMapper;

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleShzxFea findBySerialId(int serialId) {
        return ruleShzxFeaMapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleShzxFea findBySerialIdForUpdate(int serialId) {
        return ruleShzxFeaMapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void update(RuleShzxFea ruleShzxFea) {
        ruleShzxFeaMapper.update(ruleShzxFea);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void insert(RuleShzxFea ruleShzxFea) {
        ruleShzxFeaMapper.insert(ruleShzxFea);
    }

}
