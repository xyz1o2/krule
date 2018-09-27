package com.ph.service.domain.pdl;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.pdl.PdlLoan;
import com.ph.mapper.pdl.PdlLoanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PdlLoanDomain {

    @Autowired
    private PdlLoanMapper pdlLoanMapper;

    @DataSourceRouter(type = DataSourceType.PDL)
    public PdlLoan findBySerialId(int serialId) {
        return pdlLoanMapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.PDL)
    public PdlLoan findBySerialIdForUpdate(int serialId) {
        return pdlLoanMapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.PDL)
    public List<PdlLoan> findListByTime(int startTime, int endTime) {
        return pdlLoanMapper.findListByTime(startTime,endTime);
    }

    @DataSourceRouter(type = DataSourceType.PDL)
    public void update(PdlLoan pdlLoan) {
        pdlLoanMapper.update(pdlLoan);
    }

    @DataSourceRouter(type = DataSourceType.PDL)
    public void insert(PdlLoan pdlLoan) {
        pdlLoanMapper.insert(pdlLoan);
    }
}
