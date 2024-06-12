package com.socoolheeya.travel.domain.rds.main.rateplan.mapper;

import com.socoolheeya.travel.domain.rds.common.mapper.BaseEntityMapper;
import com.socoolheeya.travel.domain.rds.main.booking.mapper.BookingMapper;
import com.socoolheeya.travel.domain.rds.main.rate.mapper.DailyRateMapper;
import com.socoolheeya.travel.domain.rds.main.rate.mapper.ExtraRateMapper;
import com.socoolheeya.travel.domain.rds.main.rate.mapper.RateMapper;
import com.socoolheeya.travel.domain.rds.main.rateplan.domain.RatePlan;
import com.socoolheeya.travel.domain.rds.main.rateplan.entity.RatePlanEntity;
import com.socoolheeya.travel.domain.rds.main.room.mapper.RoomRatePlanMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE
        , uses = {RoomRatePlanMapper.class
        , RateMapper.class
        , RatePlanCouponMapper.class
        , CancelPolicyMapper.class
        , MealPlanMapper.class
        , BookingMapper.class
        , DailyRateMapper.class
        , ExtraRateMapper.class})
public interface RatePlanMapper extends BaseEntityMapper<RatePlan, RatePlanEntity> {

}
