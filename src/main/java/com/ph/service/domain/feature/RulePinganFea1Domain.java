package com.ph.service.domain.feature;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.feature.RulePinganFea1;
import com.ph.mapper.feature.RulePinganFea1Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RulePinganFea1Domain {

    @Autowired
    private RulePinganFea1Mapper rulePinganFea1Mapper;

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RulePinganFea1 findBySerialId(int serialId) {
        return rulePinganFea1Mapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RulePinganFea1 findBySerialIdForUpdate(int serialId) {
        return rulePinganFea1Mapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void update(RulePinganFea1 rulePinganFea1) {
        rulePinganFea1Mapper.update(rulePinganFea1);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void insert(RulePinganFea1 rulePinganFea1) {
        rulePinganFea1Mapper.insert(rulePinganFea1);
    }

}
