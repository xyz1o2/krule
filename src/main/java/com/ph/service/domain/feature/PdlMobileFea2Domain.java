package com.ph.service.domain.feature;

import com.ph.common.datasource.DataSourceRouter;
import com.ph.common.datasource.DataSourceType;
import com.ph.entity.feature.PdlMobileFea2;
import com.ph.mapper.feature.PdlMobileFea2Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PdlMobileFea2Domain{

    @Autowired
    private PdlMobileFea2Mapper pdlMobileFea2Mapper;

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public PdlMobileFea2 findBySerialId(int serialId) {
        return pdlMobileFea2Mapper.findBySerialId(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public PdlMobileFea2 findBySerialIdForUpdate(int serialId) {
        return pdlMobileFea2Mapper.findBySerialIdForUpdate(serialId);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void update(PdlMobileFea2 pdlMobileFea2) {
        pdlMobileFea2Mapper.update(pdlMobileFea2);
    }

    @DataSourceRouter(type = DataSourceType.FEATURE)
    public void insert(PdlMobileFea2 pdlMobileFea2) {
        pdlMobileFea2Mapper.insert(pdlMobileFea2);
    }

}
