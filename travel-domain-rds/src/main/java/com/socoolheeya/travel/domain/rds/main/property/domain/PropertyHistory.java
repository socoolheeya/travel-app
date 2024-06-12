package com.socoolheeya.travel.domain.rds.main.property.domain;

public record PropertyHistory(
        Long id,
        Long propertyId,
        String koName,
        String enName,
        Boolean isEnabled
) {
    public PropertyHistory {
        isEnabled = true;
    }
}
