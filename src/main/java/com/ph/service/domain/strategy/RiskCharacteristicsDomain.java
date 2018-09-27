package com.ph.service.domain.strategy;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.strategy.RiskCharacteristics;
import com.ph.mapper.strategy.RiskCharacteristicsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RiskCharacteristicsDomain {

    @Autowired
    private RiskCharacteristicsMapper riskCharacteristicsMapper;

    @DataSourceRouter(type = DataSourceType.STRATEGY)
    public RiskCharacteristics findBySerialId(int serialId) {
        return riskCharacteristicsMapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.STRATEGY)
    public RiskCharacteristics findBySerialIdForUpdate(int serialId) {
        return riskCharacteristicsMapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.STRATEGY)
    public void update(RiskCharacteristics riskCharacteristics) {
        riskCharacteristicsMapper.update(riskCharacteristics);
    }

    @DataSourceRouter(type = DataSourceType.STRATEGY)
    public void insert(RiskCharacteristics riskCharacteristics) {
        riskCharacteristicsMapper.insert(riskCharacteristics);
    }

    @DataSourceRouter(type = DataSourceType.STRATEGY_PREVIEW)
    public void insertPreview(RiskCharacteristics riskCharacteristics) {
        riskCharacteristicsMapper.insert(riskCharacteristics);
    }
}
