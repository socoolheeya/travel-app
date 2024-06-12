package com.socoolheeya.travel.domain.rds.main.rate.mapper;

import com.socoolheeya.travel.domain.rds.main.rate.domain.DailyRate;
import com.socoolheeya.travel.domain.rds.main.rate.entity.DailyRateEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring"
        , unmappedTargetPolicy = ReportingPolicy.IGNORE
        , uses = {RateMapper.class})
public interface DailyRateMapper {
    DailyRate toDomain(DailyRateEntity entity);
    DailyRateEntity toEntity(DailyRate domain);
}
