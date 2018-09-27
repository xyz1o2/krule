package com.ph.service.domain.feature;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.feature.CreditcardSalaryFeaSum;
import com.ph.mapper.feature.CreditcardSalaryFeaSumMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CreditcardSalaryFeaSumDomain{

    @Autowired
    private CreditcardSalaryFeaSumMapper creditcardSalaryFeaMapperSum;

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public CreditcardSalaryFeaSum findBySerialId(int serialId) {
        return creditcardSalaryFeaMapperSum.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public CreditcardSalaryFeaSum findBySerialIdForUpdate(int serialId) {
        return creditcardSalaryFeaMapperSum.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void update(CreditcardSalaryFeaSum creditcardSalaryFeaSum) {
        creditcardSalaryFeaMapperSum.update(creditcardSalaryFeaSum);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void insert(CreditcardSalaryFeaSum creditcardSalaryFeaSum) {
        creditcardSalaryFeaMapperSum.insert(creditcardSalaryFeaSum);
    }
    
}
