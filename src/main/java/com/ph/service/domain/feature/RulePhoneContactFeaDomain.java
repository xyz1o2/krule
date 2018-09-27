package com.ph.service.domain.feature;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.feature.RulePhoneContactFea;
import com.ph.mapper.feature.RulePhoneContactFeaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RulePhoneContactFeaDomain {

    @Autowired
    private RulePhoneContactFeaMapper rulePhoneContactFeaMapper;

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RulePhoneContactFea findBySerialId(int serialId) {
        return rulePhoneContactFeaMapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RulePhoneContactFea findBySerialIdForUpdate(int serialId) {
        return rulePhoneContactFeaMapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void update(RulePhoneContactFea rulePhoneContactFea) {
        rulePhoneContactFeaMapper.update(rulePhoneContactFea);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void insert(RulePhoneContactFea rulePhoneContactFea) {
        rulePhoneContactFeaMapper.insert(rulePhoneContactFea);
    }

}
