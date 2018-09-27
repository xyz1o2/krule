package com.ph.service.domain.feature;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.feature.CreditcardSalaryFea;
import com.ph.mapper.feature.CreditcardSalaryFeaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CreditcardSalaryFeaDomain {

    @Autowired
    private CreditcardSalaryFeaMapper creditcardSalaryFeaMapper;

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public CreditcardSalaryFea findBySerialId(int serialId) {
        return creditcardSalaryFeaMapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public CreditcardSalaryFea findBySerialIdForUpdate(int serialId) {
        return creditcardSalaryFeaMapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void update(CreditcardSalaryFea creditcardSalaryFea) {
        creditcardSalaryFeaMapper.update(creditcardSalaryFea);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void insert(CreditcardSalaryFea creditcardSalaryFea) {
        creditcardSalaryFeaMapper.insert(creditcardSalaryFea);
    }

}
