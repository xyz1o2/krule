package com.ph.service.domain.feature;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.feature.RulePinganFea3;
import com.ph.mapper.feature.RulePinganFea3Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RulePinganFea3Domain{

    @Autowired
    private RulePinganFea3Mapper rulePinganFea3Mapper;

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RulePinganFea3 findBySerialId(int serialId) {
        return rulePinganFea3Mapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RulePinganFea3 findBySerialIdForUpdate(int serialId) {
        return rulePinganFea3Mapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void update(RulePinganFea3 rulePinganFea3) {
        rulePinganFea3Mapper.update(rulePinganFea3);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void insert(RulePinganFea3 rulePinganFea3) {
        rulePinganFea3Mapper.insert(rulePinganFea3);
    }

}
