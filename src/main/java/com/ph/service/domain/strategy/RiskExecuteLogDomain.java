package com.ph.service.domain.strategy;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.strategy.RiskExecuteLog;
import com.ph.mapper.strategy.RiskExecuteLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RiskExecuteLogDomain {

    @Autowired
    private RiskExecuteLogMapper riskExecuteLogMapper;

    @DataSourceRouter(type = DataSourceType.STRATEGY)
    public RiskExecuteLog findBySerialId(int serialId) {
        return riskExecuteLogMapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.STRATEGY)
    public RiskExecuteLog findBySerialIdForUpdate(int serialId) {
        return riskExecuteLogMapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.STRATEGY)
    public void update(RiskExecuteLog riskExecuteLog) {
        riskExecuteLogMapper.update(riskExecuteLog);
    }

    @DataSourceRouter(type = DataSourceType.STRATEGY)
    public void insert(RiskExecuteLog riskExecuteLog) {
        riskExecuteLogMapper.insert(riskExecuteLog);
    }

    @DataSourceRouter(type = DataSourceType.STRATEGY_PREVIEW)
    public void insertPreview(RiskExecuteLog riskExecuteLog) {
        riskExecuteLogMapper.insert(riskExecuteLog);
    }
}
