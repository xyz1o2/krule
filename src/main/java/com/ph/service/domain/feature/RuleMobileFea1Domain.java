package com.ph.service.domain.feature;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.feature.RuleMobileFea1;
import com.ph.mapper.feature.RuleMobileFea1Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RuleMobileFea1Domain {

    @Autowired
    private RuleMobileFea1Mapper ruleMobileFea1Mapper;

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleMobileFea1 findBySerialId(int serialId) {
        return ruleMobileFea1Mapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleMobileFea1 findBySerialIdForUpdate(int serialId) {
        return ruleMobileFea1Mapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void update(RuleMobileFea1 ruleMobileFea1) {
        ruleMobileFea1Mapper.update(ruleMobileFea1);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void insert(RuleMobileFea1 ruleMobileFea1) {
        ruleMobileFea1Mapper.insert(ruleMobileFea1);
    }

}
