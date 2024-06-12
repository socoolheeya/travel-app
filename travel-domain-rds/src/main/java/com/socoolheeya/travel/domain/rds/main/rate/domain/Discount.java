package com.socoolheeya.travel.domain.rds.main.rate.domain;

import com.socoolheeya.travel.system.core.enums.DiscountEnums;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record Discount(
        Long id,
        String discountLabel,
        String description,
        DiscountEnums.DiscountUnit discountUnit,
        BigDecimal discountValue,
        LocalDateTime statedAt,
        LocalDateTime expiredAt
) {
}
