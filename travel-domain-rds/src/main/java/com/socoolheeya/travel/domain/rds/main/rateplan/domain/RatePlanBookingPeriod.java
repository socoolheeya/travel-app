package com.socoolheeya.travel.domain.rds.main.rateplan.domain;

import java.time.LocalDateTime;

public record RatePlanBookingPeriod(
        Long id,
        LocalDateTime salesStartedAt,
        LocalDateTime salesEndedAt,
        RatePlan ratePlan
) {
}
