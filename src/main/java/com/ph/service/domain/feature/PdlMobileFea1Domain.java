package com.ph.service.domain.feature;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.feature.PdlMobileFea1;
import com.ph.mapper.feature.PdlMobileFea1Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PdlMobileFea1Domain{

    @Autowired
    private PdlMobileFea1Mapper pdlMobileFea1Mapper;

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public PdlMobileFea1 findBySerialId(int serialId) {
        return pdlMobileFea1Mapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public PdlMobileFea1 findBySerialIdForUpdate(int serialId) {
        return pdlMobileFea1Mapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void update(PdlMobileFea1 pdlMobileFea1) {
        pdlMobileFea1Mapper.update(pdlMobileFea1);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void insert(PdlMobileFea1 pdlMobileFea1) {
        pdlMobileFea1Mapper.insert(pdlMobileFea1);
    }

}
