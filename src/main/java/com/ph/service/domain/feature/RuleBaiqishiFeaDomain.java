package com.ph.service.domain.feature;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.feature.RuleBaiqishiFea;
import com.ph.mapper.feature.RuleBaiqishiFeaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RuleBaiqishiFeaDomain{

    @Autowired
    private RuleBaiqishiFeaMapper ruleBaiqishiFeaMapper;

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleBaiqishiFea findBySerialId(int serialId) {
        return ruleBaiqishiFeaMapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleBaiqishiFea findBySerialIdForUpdate(int serialId) {
        return ruleBaiqishiFeaMapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void update(RuleBaiqishiFea ruleBaiqishiFea) {
        ruleBaiqishiFeaMapper.update(ruleBaiqishiFea);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void insert(RuleBaiqishiFea ruleBaiqishiFea) {
        ruleBaiqishiFeaMapper.insert(ruleBaiqishiFea);
    }

}
