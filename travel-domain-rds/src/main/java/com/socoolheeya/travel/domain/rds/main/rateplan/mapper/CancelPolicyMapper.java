package com.socoolheeya.travel.domain.rds.main.rateplan.mapper;

import com.socoolheeya.travel.domain.rds.common.mapper.BaseEntityMapper;
import com.socoolheeya.travel.domain.rds.main.rateplan.domain.CancelPolicy;
import com.socoolheeya.travel.domain.rds.main.rateplan.entity.CancelPolicyEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE
        , uses = {CancelRateMapper.class, RatePlanMapper.class})
public interface CancelPolicyMapper extends BaseEntityMapper<CancelPolicy, CancelPolicyEntity> {
    @Mapping(source = "entity.ratePlan.id", target = "ratePlanId")
    CancelPolicy toDomain(CancelPolicyEntity entity);

    @Mapping(source = "domain.ratePlanId", target = "ratePlan.id")
    CancelPolicyEntity toEntity(CancelPolicy domain);
}
