package com.ph.service.domain.feature;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.feature.CreditcardSalaryFeaMean;
import com.ph.mapper.feature.CreditcardSalaryFeaMeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CreditcardSalaryFeaMeanDomain{

    @Autowired
    private CreditcardSalaryFeaMeanMapper creditcardSalaryFeaMeanMapper;

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public CreditcardSalaryFeaMean findBySerialId(int serialId) {
        return creditcardSalaryFeaMeanMapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public CreditcardSalaryFeaMean findBySerialIdForUpdate(int serialId) {
        return creditcardSalaryFeaMeanMapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void update(CreditcardSalaryFeaMean creditcardSalaryFeaMean) {
        creditcardSalaryFeaMeanMapper.update(creditcardSalaryFeaMean);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void insert(CreditcardSalaryFeaMean creditcardSalaryFeaMean) {
        creditcardSalaryFeaMeanMapper.insert(creditcardSalaryFeaMean);
    }
}
