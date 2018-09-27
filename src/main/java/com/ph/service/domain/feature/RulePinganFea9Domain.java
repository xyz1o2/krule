package com.ph.service.domain.feature;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.feature.RulePinganFea9;
import com.ph.mapper.feature.RulePinganFea9Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RulePinganFea9Domain{

    @Autowired
    private RulePinganFea9Mapper rulePinganFea9Mapper;

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RulePinganFea9 findBySerialId(int serialId) {
        return rulePinganFea9Mapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RulePinganFea9 findBySerialIdForUpdate(int serialId) {
        return rulePinganFea9Mapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void update(RulePinganFea9 rulePinganFea9) {
        rulePinganFea9Mapper.update(rulePinganFea9);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void insert(RulePinganFea9 rulePinganFea9) {
        rulePinganFea9Mapper.insert(rulePinganFea9);
    }

}
