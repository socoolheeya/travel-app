package com.socoolheeya.travel.domain.rds.main.rateplan.domain;

import com.socoolheeya.travel.domain.rds.main.booking.domain.Booking;
import com.socoolheeya.travel.domain.rds.main.rate.domain.Rate;
import com.socoolheeya.travel.domain.rds.main.room.domain.RoomRatePlan;
import com.socoolheeya.travel.system.core.enums.RatePlanEnums;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public record RatePlan(
        Long id,
        String name,
        LocalTime checkinTime,
        LocalTime checkoutTime,
        RatePlanEnums.RateClassification rateClassification,
        boolean isEarlyCheckin,
        boolean isSmoking,
        Integer minStay,
        Integer maxStay,
        RatePlanEnums.Status status,
        List<RoomRatePlan> roomRatePlans,
        List<Rate> rates,
        List<RatePlanCoupon> ratePlanCoupons,
        CancelPolicy cancelPolicy,
        MealPlan mealPlans,
        Booking booking

) {
    public RatePlan {
        rateClassification = RatePlanEnums.RateClassification.STAND_ALONE;
        isEarlyCheckin = false;
        isSmoking = false;
        status = RatePlanEnums.Status.READY;
        roomRatePlans = new ArrayList<>();
        rates = new ArrayList<>();
        ratePlanCoupons = new ArrayList<>();
    }
}
