package com.ph.service.domain.feature;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.feature.CreditcardSalaryFeaMax;
import com.ph.mapper.feature.CreditcardSalaryFeaMaxMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CreditcardSalaryFeaMaxDomain{

    @Autowired
    private CreditcardSalaryFeaMaxMapper creditcardSalaryFeaMaxMapper;

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public CreditcardSalaryFeaMax findBySerialId(int serialId) {
        return creditcardSalaryFeaMaxMapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public CreditcardSalaryFeaMax findBySerialIdForUpdate(int serialId) {
        return creditcardSalaryFeaMaxMapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void update(CreditcardSalaryFeaMax creditcardSalaryFeaMax) {
        creditcardSalaryFeaMaxMapper.update(creditcardSalaryFeaMax);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void insert(CreditcardSalaryFeaMax creditcardSalaryFeaMax) {
        creditcardSalaryFeaMaxMapper.insert(creditcardSalaryFeaMax);
    }
}
