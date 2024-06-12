package com.socoolheeya.travel.domain.rds.main.property.domain;

public record PropertyAddress(
        Long id,
        String address,
        String addressDetail,
        String zipCode,
        Property property
) {
}
