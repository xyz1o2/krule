package com.ph.service.domain.feature;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.feature.RuleZhongxinFea4;
import com.ph.mapper.feature.RuleZhongxinFea4Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RuleZhongxinFea4Domain {

    @Autowired
    private RuleZhongxinFea4Mapper ruleZhongxinFea4Mapper;

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleZhongxinFea4 findBySerialId(int serialId) {
        return ruleZhongxinFea4Mapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleZhongxinFea4 findBySerialIdForUpdate(int serialId) {
        return ruleZhongxinFea4Mapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void update(RuleZhongxinFea4 ruleZhongxinFea4) {
        ruleZhongxinFea4Mapper.update(ruleZhongxinFea4);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void insert(RuleZhongxinFea4 ruleZhongxinFea4) {
        ruleZhongxinFea4Mapper.insert(ruleZhongxinFea4);
    }
}
