package com.socoolheeya.travel.domain.rds.main.rate.domain;

import com.socoolheeya.travel.domain.rds.main.rateplan.domain.RatePlan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public record Rate(
        Long id,
        BigDecimal totalPrice,
        BigDecimal netPrice,
        RatePlan ratePlan,
        List<ExtraRate> extraRates,
        List<DailyRate> dailyRates
) {
    public Rate {
        extraRates = new ArrayList<>();
        dailyRates = new ArrayList<>();
    }







}
