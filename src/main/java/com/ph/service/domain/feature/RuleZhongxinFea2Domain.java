package com.ph.service.domain.feature;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.feature.RuleZhongxinFea2;
import com.ph.mapper.feature.RuleZhongxinFea2Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RuleZhongxinFea2Domain {

    @Autowired
    private RuleZhongxinFea2Mapper ruleZhongxinFea2Mapper;

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleZhongxinFea2 findBySerialId(int serialId) {
        return ruleZhongxinFea2Mapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleZhongxinFea2 findBySerialIdForUpdate(int serialId) {
        return ruleZhongxinFea2Mapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void update(RuleZhongxinFea2 ruleZhongxinFea2) {
        ruleZhongxinFea2Mapper.update(ruleZhongxinFea2);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void insert(RuleZhongxinFea2 ruleZhongxinFea2) {
        ruleZhongxinFea2Mapper.insert(ruleZhongxinFea2);
    }

}
