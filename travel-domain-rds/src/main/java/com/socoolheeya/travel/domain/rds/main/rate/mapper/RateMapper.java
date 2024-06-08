package com.socoolheeya.travel.domain.rds.main.rate.mapper;

import com.socoolheeya.travel.domain.rds.main.rate.domain.Rate;
import com.socoolheeya.travel.domain.rds.main.rate.entity.RateEntity;
import org.mapstruct.Mapper;

@Mapper
public interface RateMapper {

    Rate toDomain(RateEntity rateEntity);
}
