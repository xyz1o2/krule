package com.ph.service.domain.feature;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.feature.RuleYoumengFea;
import com.ph.mapper.feature.RuleYoumengFeaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RuleYoumengFeaDomain {

    @Autowired
    private RuleYoumengFeaMapper ruleYoumengFeaMapper;

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleYoumengFea findBySerialId(int serialId) {
        return ruleYoumengFeaMapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleYoumengFea findBySerialIdForUpdate(int serialId) {
        return ruleYoumengFeaMapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void update(RuleYoumengFea ruleYoumengFea) {
        ruleYoumengFeaMapper.update(ruleYoumengFea);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void insert(RuleYoumengFea ruleYoumengFea) {
        ruleYoumengFeaMapper.insert(ruleYoumengFea);
    }

}
