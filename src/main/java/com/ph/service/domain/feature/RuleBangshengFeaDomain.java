package com.ph.service.domain.feature;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.feature.RuleBangshengFea;
import com.ph.mapper.feature.RuleBangshengFeaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RuleBangshengFeaDomain{

    @Autowired
    private RuleBangshengFeaMapper ruleBangshengFeaMapper;

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleBangshengFea findBySerialId(int serialId) {
        return ruleBangshengFeaMapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleBangshengFea findBySerialIdForUpdate(int serialId) {
        return ruleBangshengFeaMapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void update(RuleBangshengFea ruleBangshengFea) {
        ruleBangshengFeaMapper.update(ruleBangshengFea);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void insert(RuleBangshengFea ruleBangshengFea) {
        ruleBangshengFeaMapper.insert(ruleBangshengFea);
    }

}
