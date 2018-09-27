package com.ph.service.domain.feature;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.feature.RuleTianjiFea;
import com.ph.mapper.feature.RuleTianjiFeaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RuleTianjiFeaDomain{

    @Autowired
    private RuleTianjiFeaMapper ruleTianjiFeaMapper;

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleTianjiFea findBySerialId(int serialId) {
        return ruleTianjiFeaMapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleTianjiFea findBySerialIdForUpdate(int serialId) {
        return ruleTianjiFeaMapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void update(RuleTianjiFea ruleTianjiFea) {
        ruleTianjiFeaMapper.update(ruleTianjiFea);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void insert(RuleTianjiFea ruleTianjiFea) {
        ruleTianjiFeaMapper.insert(ruleTianjiFea);
    }

}
