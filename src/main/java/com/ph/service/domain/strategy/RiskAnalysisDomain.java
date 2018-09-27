package com.ph.service.domain.strategy;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.strategy.RiskAnalysis;
import com.ph.mapper.strategy.RiskAnalysisMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RiskAnalysisDomain {

    @Autowired
    private RiskAnalysisMapper riskAnalysisMapper;

    @DataSourceRouter(type = DataSourceType.STRATEGY)
    public RiskAnalysis findBySerialId(int serialId) {
        return riskAnalysisMapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.STRATEGY)
    public RiskAnalysis findBySerialIdForUpdate(int serialId) {
        return riskAnalysisMapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.STRATEGY)
    public void update(RiskAnalysis riskAnalysis) {
        riskAnalysisMapper.update(riskAnalysis);
    }

    @DataSourceRouter(type = DataSourceType.STRATEGY)
    public void insert(RiskAnalysis riskAnalysis) {
        riskAnalysisMapper.insert(riskAnalysis);
    }

    @DataSourceRouter(type = DataSourceType.STRATEGY_PREVIEW)
    public void insertPreview(RiskAnalysis riskAnalysis) {
        riskAnalysisMapper.insert(riskAnalysis);
    }

}
