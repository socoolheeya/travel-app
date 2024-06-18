package com.socoolheeya.travel.domain.rds.main.rateplan.domain;

import com.socoolheeya.travel.system.core.enums.RatePlanEnums;

import java.time.LocalDateTime;

public record RatePlanCoupon(
        Long id,
        String name,
        String image,
        String description,
        RatePlanEnums.CouponUnit unit,
        Integer value,
        LocalDateTime startedAt,
        LocalDateTime endedAt,
        Long ratePlanId
) {

}
