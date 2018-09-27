package com.ph.service.domain.feature;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.feature.RuleZhongxinFea3;
import com.ph.mapper.feature.RuleZhongxinFea3Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RuleZhongxinFea3Domain{

    @Autowired
    private RuleZhongxinFea3Mapper ruleZhongxinFea3Mapper;

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleZhongxinFea3 findBySerialId(int serialId) {
        return ruleZhongxinFea3Mapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public RuleZhongxinFea3 findBySerialIdForUpdate(int serialId) {
        return ruleZhongxinFea3Mapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void update(RuleZhongxinFea3 ruleZhongxinFea3) {
        ruleZhongxinFea3Mapper.update(ruleZhongxinFea3);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void insert(RuleZhongxinFea3 ruleZhongxinFea3) {
        ruleZhongxinFea3Mapper.insert(ruleZhongxinFea3);
    }

}
