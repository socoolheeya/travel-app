package com.socoolheeya.travel.domain.rds.main.rate.mapper;

import com.socoolheeya.travel.domain.rds.main.rate.domain.ExtraRate;
import com.socoolheeya.travel.domain.rds.main.rate.entity.ExtraRateEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring"
        , unmappedTargetPolicy = ReportingPolicy.IGNORE
        , uses = {RateMapper.class})
public interface ExtraRateMapper {
    ExtraRate toDomain(ExtraRateEntity entity);
    ExtraRateEntity toEntity(ExtraRate domain);
}
