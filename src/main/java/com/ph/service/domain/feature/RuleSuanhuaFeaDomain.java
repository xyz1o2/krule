package com.ph.service.domain.feature;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.feature.RuleSuanhuaFea;
import com.ph.mapper.feature.RuleSuanhuaFeaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RuleSuanhuaFeaDomain {

    @Autowired
    private RuleSuanhuaFeaMapper ruleSuanhuaFeaMapper;

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleSuanhuaFea findBySerialId(int serialId) {
        return ruleSuanhuaFeaMapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleSuanhuaFea findBySerialIdForUpdate(int serialId) {
        return ruleSuanhuaFeaMapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void update(RuleSuanhuaFea ruleSuanhuaFea) {
        ruleSuanhuaFeaMapper.update(ruleSuanhuaFea);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void insert(RuleSuanhuaFea ruleSuanhuaFea) {
        ruleSuanhuaFeaMapper.insert(ruleSuanhuaFea);
    }

}
