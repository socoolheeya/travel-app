package com.socoolheeya.travel.domain.rds.main.rate.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public record DailyRate(
        Long id,
        LocalDate salesDay,
        BigDecimal originPrice,
        BigDecimal sellingPrice,
        BigDecimal depositPrice,
        BigDecimal commission,
        BigDecimal commissionFee,
        Long rateId
) {

}
