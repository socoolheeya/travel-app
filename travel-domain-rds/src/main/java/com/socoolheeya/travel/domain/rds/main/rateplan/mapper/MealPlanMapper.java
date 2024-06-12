package com.socoolheeya.travel.domain.rds.main.rateplan.mapper;

import com.socoolheeya.travel.domain.rds.common.mapper.BaseEntityMapper;
import com.socoolheeya.travel.domain.rds.main.rateplan.domain.MealPlan;
import com.socoolheeya.travel.domain.rds.main.rateplan.entity.MealPlanEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE
        , uses = {RatePlanMapper.class})
public interface MealPlanMapper extends BaseEntityMapper<MealPlan, MealPlanEntity> {

}
