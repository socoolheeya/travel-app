package com.socoolheeya.travel.domain.rds.main.rateplan.domain;

import com.socoolheeya.travel.system.core.enums.RatePlanEnums;

public record RatePlanCommissionOption(
        Long id,
        RatePlanEnums.CommissionType type,
        RatePlanEnums.CommissionPeriod period,
        RatePlanEnums.CommissionStandard standard,
        Integer defaultCommission,
        RatePlan ratePlan
) {

    public RatePlanCommissionOption {
        defaultCommission = 0;
    }
}
