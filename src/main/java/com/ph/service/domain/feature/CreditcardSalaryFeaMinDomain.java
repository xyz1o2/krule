package com.ph.service.domain.feature;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.feature.CreditcardSalaryFeaMin;
import com.ph.mapper.feature.CreditcardSalaryFeaMinMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CreditcardSalaryFeaMinDomain{

    @Autowired
    private CreditcardSalaryFeaMinMapper creditcardSalaryFeaMapperMin;

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public CreditcardSalaryFeaMin findBySerialId(int serialId) {
        return creditcardSalaryFeaMapperMin.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public CreditcardSalaryFeaMin findBySerialIdForUpdate(int serialId) {
        return creditcardSalaryFeaMapperMin.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void update(CreditcardSalaryFeaMin creditcardSalaryFeaMin) {
        creditcardSalaryFeaMapperMin.update(creditcardSalaryFeaMin);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void insert(CreditcardSalaryFeaMin creditcardSalaryFeaMin) {
        creditcardSalaryFeaMapperMin.insert(creditcardSalaryFeaMin);
    }

}
