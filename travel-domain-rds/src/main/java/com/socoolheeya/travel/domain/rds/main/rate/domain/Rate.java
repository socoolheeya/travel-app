package com.socoolheeya.travel.domain.rds.main.rate.domain;

import com.socoolheeya.travel.domain.rds.main.rate.entity.ExtraRateEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Rate {

    Long id;

    Long ratePlanId;

    BigDecimal totalPrice;

    BigDecimal netPrice;

    List<ExtraRate> extraRates;

    List<DailyRate> dailyRates;




}
