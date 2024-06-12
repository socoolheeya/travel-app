package com.socoolheeya.travel.domain.rds.main.rate.mapper;

import com.socoolheeya.travel.domain.rds.common.mapper.BaseEntityMapper;
import com.socoolheeya.travel.domain.rds.main.rate.domain.Rate;
import com.socoolheeya.travel.domain.rds.main.rate.entity.RateEntity;
import com.socoolheeya.travel.domain.rds.main.rateplan.mapper.RatePlanMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE
        , uses = {RatePlanMapper.class, DailyRateMapper.class, ExtraRateMapper.class})
public interface RateMapper extends BaseEntityMapper<Rate, RateEntity> {
}
