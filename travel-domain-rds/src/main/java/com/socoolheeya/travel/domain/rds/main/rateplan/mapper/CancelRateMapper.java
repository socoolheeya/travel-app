package com.socoolheeya.travel.domain.rds.main.rateplan.mapper;

import com.socoolheeya.travel.domain.rds.common.mapper.BaseEntityMapper;
import com.socoolheeya.travel.domain.rds.main.rateplan.domain.CancelRate;
import com.socoolheeya.travel.domain.rds.main.rateplan.entity.CancelRateEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE
        , uses = {CancelPolicyMapper.class})
public interface CancelRateMapper extends BaseEntityMapper<CancelRate, CancelRateEntity> {
    @Mapping(source = "entity.cancelPolicy.id", target = "cancelPolicyId")
    CancelRate toDomain(CancelRateEntity entity);

    @Mapping(source = "domain.cancelPolicyId", target = "cancelPolicy.id")
    CancelRateEntity toEntity(CancelRate domain);
}
