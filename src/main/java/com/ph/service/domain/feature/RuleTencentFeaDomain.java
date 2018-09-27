package com.ph.service.domain.feature;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.feature.RuleTencentFea;
import com.ph.mapper.feature.RuleTencentFeaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RuleTencentFeaDomain{

    @Autowired
    private RuleTencentFeaMapper ruleTencentFeaMapper;

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleTencentFea findBySerialId(int serialId) {
        return ruleTencentFeaMapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleTencentFea findBySerialIdForUpdate(int serialId) {
        return ruleTencentFeaMapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void update(RuleTencentFea ruleTencentFea) {
        ruleTencentFeaMapper.update(ruleTencentFea);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void insert(RuleTencentFea ruleTencentFea) {
        ruleTencentFeaMapper.insert(ruleTencentFea);
    }

}
