package com.ph.mapper.feature;

import com.ph.entity.feature.LoanMlAuditResult;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface LoanMlAuditResultMapper extends BaseMapper<LoanMlAuditResult> {

    @Select("select * from loan_ml_audit_result where serial_id=#{serial_id} order by id desc limit 1")
    LoanMlAuditResult findBySerialId(int serialId);

    @Select("select * from loan_ml_audit_result where serial_id=#{serial_id} order by id desc limit 1 for update")
    LoanMlAuditResult findBySerialIdForUpdate(int serialId);

}
