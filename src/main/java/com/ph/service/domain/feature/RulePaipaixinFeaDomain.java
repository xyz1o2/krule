package com.ph.service.domain.feature;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.feature.RulePaipaixinFea;
import com.ph.mapper.feature.RulePaipaixinFeaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RulePaipaixinFeaDomain {

    @Autowired
    private RulePaipaixinFeaMapper rulePaipaixinFeaMapper;

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RulePaipaixinFea findBySerialId(int serialId) {
        return rulePaipaixinFeaMapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RulePaipaixinFea findBySerialIdForUpdate(int serialId) {
        return rulePaipaixinFeaMapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void update(RulePaipaixinFea rulePaipaixinFea) {
        rulePaipaixinFeaMapper.update(rulePaipaixinFea);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void insert(RulePaipaixinFea rulePaipaixinFea) {
        rulePaipaixinFeaMapper.insert(rulePaipaixinFea);
    }
}
