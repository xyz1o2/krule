package com.ph.service.domain.feature;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.feature.RuleDeviceFea;
import com.ph.mapper.feature.RuleDeviceFeaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RuleDeviceFeaDomain{

    @Autowired
    private RuleDeviceFeaMapper ruleDeviceFeaMapper;

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleDeviceFea findBySerialId(int serialId) {
        return ruleDeviceFeaMapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleDeviceFea findBySerialIdForUpdate(int serialId) {
        return ruleDeviceFeaMapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void update(RuleDeviceFea ruleDeviceFea) {
        ruleDeviceFeaMapper.update(ruleDeviceFea);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void insert(RuleDeviceFea ruleDeviceFea) {
        ruleDeviceFeaMapper.insert(ruleDeviceFea);
    }

}
