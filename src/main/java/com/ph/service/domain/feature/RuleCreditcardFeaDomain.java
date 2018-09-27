package com.ph.service.domain.feature;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.feature.RuleCreditcardFea;
import com.ph.mapper.feature.RuleCreditcardFeaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RuleCreditcardFeaDomain{

    @Autowired
    private RuleCreditcardFeaMapper ruleCreditcardFeaMapper;

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleCreditcardFea findBySerialId(int serialId) {
        return ruleCreditcardFeaMapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleCreditcardFea findBySerialIdForUpdate(int serialId) {
        return ruleCreditcardFeaMapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void update(RuleCreditcardFea ruleCreditcardFea) {
        ruleCreditcardFeaMapper.update(ruleCreditcardFea);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void insert(RuleCreditcardFea ruleCreditcardFea) {
        ruleCreditcardFeaMapper.insert(ruleCreditcardFea);
    }

}
