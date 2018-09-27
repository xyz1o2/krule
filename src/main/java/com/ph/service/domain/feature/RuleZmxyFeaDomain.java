package com.ph.service.domain.feature;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.feature.RuleZmxyFea;
import com.ph.mapper.feature.RuleZmxyFeaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RuleZmxyFeaDomain{

    @Autowired
    private RuleZmxyFeaMapper ruleZmxyFeaMapper;

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleZmxyFea findBySerialId(int serialId) {
        return ruleZmxyFeaMapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleZmxyFea findBySerialIdForUpdate(int serialId) {
        return ruleZmxyFeaMapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void update(RuleZmxyFea ruleZmxyFea) {
        ruleZmxyFeaMapper.update(ruleZmxyFea);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void insert(RuleZmxyFea ruleZmxyFea) {
        ruleZmxyFeaMapper.insert(ruleZmxyFea);
    }

}
