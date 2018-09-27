package com.ph.service.domain.feature;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.feature.RuleMobileFea;
import com.ph.mapper.feature.RuleMobileFeaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RuleMobileFeaDomain{

    @Autowired
    private RuleMobileFeaMapper ruleMobileFeaMapper;

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleMobileFea findBySerialId(int serialId) {
        return ruleMobileFeaMapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleMobileFea findBySerialIdForUpdate(int serialId) {
        return ruleMobileFeaMapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void update(RuleMobileFea ruleMobileFea) {
        ruleMobileFeaMapper.update(ruleMobileFea);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void insert(RuleMobileFea ruleMobileFea) {
        ruleMobileFeaMapper.insert(ruleMobileFea);
    }

}
