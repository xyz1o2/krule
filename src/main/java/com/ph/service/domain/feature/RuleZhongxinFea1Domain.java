package com.ph.service.domain.feature;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.feature.RuleZhongxinFea1;
import com.ph.mapper.feature.RuleZhongxinFea1Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RuleZhongxinFea1Domain {

    @Autowired
    private RuleZhongxinFea1Mapper ruleZhongxinFea1Mapper;

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleZhongxinFea1 findBySerialId(int serialId) {
        return ruleZhongxinFea1Mapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleZhongxinFea1 findBySerialIdForUpdate(int serialId) {
        return ruleZhongxinFea1Mapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void update(RuleZhongxinFea1 ruleZhongxinFea1) {
        ruleZhongxinFea1Mapper.update(ruleZhongxinFea1);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void insert(RuleZhongxinFea1 ruleZhongxinFea1) {
        ruleZhongxinFea1Mapper.insert(ruleZhongxinFea1);
    }

}
