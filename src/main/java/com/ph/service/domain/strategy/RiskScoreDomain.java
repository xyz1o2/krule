package com.ph.service.domain.strategy;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.strategy.RiskScore;
import com.ph.mapper.strategy.RiskScoreMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RiskScoreDomain {

    @Autowired
    private RiskScoreMapper riskScoreMapper;

    @DataSourceRouter(type = DataSourceType.STRATEGY)
    public RiskScore findBySerialId(int serialId) {
        return riskScoreMapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.STRATEGY)
    public RiskScore findBySerialIdForUpdate(int serialId) {
        return riskScoreMapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.STRATEGY)
    public void update(RiskScore riskScore) {
        riskScoreMapper.update(riskScore);
    }

    @DataSourceRouter(type = DataSourceType.STRATEGY)
    public void insert(RiskScore riskScore) {
        riskScoreMapper.insert(riskScore);
    }

    @DataSourceRouter(type = DataSourceType.STRATEGY_PREVIEW)
    public void insertPreview(RiskScore riskScore) {
        riskScoreMapper.insert(riskScore);
    }
}
