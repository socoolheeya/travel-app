package com.socoolheeya.travel.domain.rds.main.rate.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public record Rate(
        Long id,
        BigDecimal totalPrice,
        BigDecimal netPrice,
        Long ratePlanId,
        List<ExtraRate> extraRates,
        List<DailyRate> dailyRates
) {
    public Rate {
        extraRates = new ArrayList<>();
        dailyRates = new ArrayList<>();
    }
}
