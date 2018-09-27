package com.ph.service.domain.feature;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.feature.RuleXinyanWashblackFea;
import com.ph.mapper.feature.RuleXinyanWashblackFeaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RuleXinyanWashblackFeaDomain {

    @Autowired
    private RuleXinyanWashblackFeaMapper ruleXinyanWashblackFeaMapper;

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleXinyanWashblackFea findBySerialId(int serialId) {
        return ruleXinyanWashblackFeaMapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleXinyanWashblackFea findBySerialIdForUpdate(int serialId) {
        return ruleXinyanWashblackFeaMapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void update(RuleXinyanWashblackFea ruleXinyanWashblackFea) {
        ruleXinyanWashblackFeaMapper.update(ruleXinyanWashblackFea);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void insert(RuleXinyanWashblackFea ruleXinyanWashblackFea) {
        ruleXinyanWashblackFeaMapper.insert(ruleXinyanWashblackFea);
    }

}
