package com.ph.service.domain.feature;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.feature.RuleZhongxinFea5;
import com.ph.mapper.feature.RuleZhongxinFea5Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RuleZhongxinFea5Domain{

    @Autowired
    private RuleZhongxinFea5Mapper ruleZhongxinFea5Mapper;

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleZhongxinFea5 findBySerialId(int serialId) {
        return ruleZhongxinFea5Mapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleZhongxinFea5 findBySerialIdForUpdate(int serialId) {
        return ruleZhongxinFea5Mapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void update(RuleZhongxinFea5 ruleZhongxinFea5) {
        ruleZhongxinFea5Mapper.update(ruleZhongxinFea5);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void insert(RuleZhongxinFea5 ruleZhongxinFea5) {
        ruleZhongxinFea5Mapper.insert(ruleZhongxinFea5);
    }

}
