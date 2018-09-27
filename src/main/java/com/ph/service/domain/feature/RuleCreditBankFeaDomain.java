package com.ph.service.domain.feature;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.feature.RuleCreditBankFea;
import com.ph.mapper.feature.RuleCreditBankFeaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RuleCreditBankFeaDomain {

    @Autowired
    private RuleCreditBankFeaMapper ruleCreditBankFeaMapper;

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleCreditBankFea findBySerialId(int serialId) {
        return ruleCreditBankFeaMapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleCreditBankFea findBySerialIdForUpdate(int serialId) {
        return ruleCreditBankFeaMapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void update(RuleCreditBankFea ruleCreditBankFea) {
        ruleCreditBankFeaMapper.update(ruleCreditBankFea);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void insert(RuleCreditBankFea ruleCreditBankFea) {
        ruleCreditBankFeaMapper.insert(ruleCreditBankFea);
    }

}
