package com.ph.service.domain.feature;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.feature.LoanMlAuditResult;
import com.ph.mapper.feature.LoanMlAuditResultMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoanMlAuditResultDomain {

    @Autowired
    private LoanMlAuditResultMapper loadMlAuditResultMapper;

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public LoanMlAuditResult findBySerialId(int serialId) {
        return loadMlAuditResultMapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public LoanMlAuditResult findBySerialIdForUpdate(int serialId) {
        return loadMlAuditResultMapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void update(LoanMlAuditResult loanMlAuditResult) {
        loadMlAuditResultMapper.update(loanMlAuditResult);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void insert(LoanMlAuditResult loanMlAuditResult) {
        loadMlAuditResultMapper.insert(loanMlAuditResult);
    }

}
