package com.ph.service.domain.strategy;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.strategy.RiskDecisionResult;
import com.ph.mapper.strategy.RiskDecisionResultMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RiskDecisionResultDomain {

    @Autowired
    private RiskDecisionResultMapper decisionResultMapper;

    @DataSourceRouter(type = DataSourceType.STRATEGY)
    public RiskDecisionResult findBySerialId(int serialId) {
        return decisionResultMapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.STRATEGY)
    public RiskDecisionResult findBySerialIdForUpdate(int serialId) {
        return decisionResultMapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.STRATEGY)
    public void update(RiskDecisionResult decisionResult) {
        decisionResultMapper.update(decisionResult);
    }

    @DataSourceRouter(type = DataSourceType.STRATEGY)
    public void insert(RiskDecisionResult decisionResult) {
        decisionResultMapper.insert(decisionResult);
    }

    @DataSourceRouter(type = DataSourceType.STRATEGY_PREVIEW)
    public void insertPreview(RiskDecisionResult decisionResult) {
        decisionResultMapper.insert(decisionResult);
    }
}
