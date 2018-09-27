package com.ph.service.domain.feature;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.feature.RuleTaobaoFea;
import com.ph.mapper.feature.RuleTaobaoFeaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RuleTaobaoFeaDomain {

    @Autowired
    private RuleTaobaoFeaMapper ruleTaobaoFeaMapper;

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleTaobaoFea findBySerialId(int serialId) {
        return ruleTaobaoFeaMapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleTaobaoFea findBySerialIdForUpdate(int serialId) {
        return ruleTaobaoFeaMapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void update(RuleTaobaoFea ruleTaobaoFea) {
        ruleTaobaoFeaMapper.update(ruleTaobaoFea);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void insert(RuleTaobaoFea ruleTaobaoFea) {
        ruleTaobaoFeaMapper.insert(ruleTaobaoFea);
    }

}
