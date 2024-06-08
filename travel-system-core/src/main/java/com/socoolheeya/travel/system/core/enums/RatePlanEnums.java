package com.socoolheeya.travel.system.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class RatePlanEnums {

    @Getter
    @AllArgsConstructor
    public enum Status {
        READY, ON_SALE, ON_HOLD
    }

    @Getter
    @AllArgsConstructor
    public enum CouponUnit {
        PERCENT, AMOUNT
    }

    public enum CouponUseStatus {

    }

    @Getter
    @AllArgsConstructor
    public enum RateClassification {
        STAND_ALONE, PACKAGE
    }

    @Getter
    @AllArgsConstructor
    public enum CommissionType {
        DEPOSIT, SELLING
    }

    @Getter
    @AllArgsConstructor
    public enum CommissionPeriod {
        ALL, WEEKDAY_WEEKEND
    }

    @Getter
    @AllArgsConstructor
    public enum CommissionStandard {
        PERCENT, VALUE
    }
}
