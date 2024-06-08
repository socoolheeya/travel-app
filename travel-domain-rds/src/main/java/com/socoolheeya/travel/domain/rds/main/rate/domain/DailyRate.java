package com.socoolheeya.travel.domain.rds.main.rate.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class DailyRate {

    Long id;

    Long rateId;

    LocalDate salesDay;

    BigDecimal originPrice;

    BigDecimal sellingPrice;

    BigDecimal depositPrice;

    BigDecimal commission;

    BigDecimal commissionFee;
}
