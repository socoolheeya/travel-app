package com.socoolheeya.travel.domain.rds.main.property.domain;

public record PropertyLocation(
        Long id,
        String country,
        String region,
        String city,
        PropertyMapInformation mapInformation
) {
}
