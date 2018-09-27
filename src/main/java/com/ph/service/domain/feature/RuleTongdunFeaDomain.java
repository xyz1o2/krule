package com.ph.service.domain.feature;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.feature.RuleTongdunFea;
import com.ph.mapper.feature.RuleTongdunFeaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RuleTongdunFeaDomain{

    @Autowired
    private RuleTongdunFeaMapper ruleTongdunFeaMapper;

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleTongdunFea findBySerialId(int serialId) {
        return ruleTongdunFeaMapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleTongdunFea findBySerialIdForUpdate(int serialId) {
        return ruleTongdunFeaMapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void update(RuleTongdunFea ruleTongdunFea) {
        ruleTongdunFeaMapper.update(ruleTongdunFea);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void insert(RuleTongdunFea ruleTongdunFea) {
        ruleTongdunFeaMapper.insert(ruleTongdunFea);
    }

}
