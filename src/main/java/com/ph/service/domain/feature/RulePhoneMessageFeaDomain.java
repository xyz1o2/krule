package com.ph.service.domain.feature;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.feature.RulePhoneMessageFea;
import com.ph.mapper.feature.RulePhoneMessageFeaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RulePhoneMessageFeaDomain{

    @Autowired
    private RulePhoneMessageFeaMapper rulePhoneMessageFeaMapper;

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RulePhoneMessageFea findBySerialId(int serialId) {
        return rulePhoneMessageFeaMapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RulePhoneMessageFea findBySerialIdForUpdate(int serialId) {
        return rulePhoneMessageFeaMapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void update(RulePhoneMessageFea rulePhoneMessageFea) {
        rulePhoneMessageFeaMapper.update(rulePhoneMessageFea);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void insert(RulePhoneMessageFea rulePhoneMessageFea) {
        rulePhoneMessageFeaMapper.insert(rulePhoneMessageFea);
    }

}
