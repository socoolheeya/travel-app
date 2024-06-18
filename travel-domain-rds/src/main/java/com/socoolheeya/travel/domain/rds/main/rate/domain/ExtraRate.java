package com.socoolheeya.travel.domain.rds.main.rate.domain;

import java.math.BigDecimal;

public record ExtraRate(
        Long id,
        String name,
        BigDecimal adultPrice,
        BigDecimal childPrice,
        BigDecimal excessAmount,
        Long rateId
) {

}
