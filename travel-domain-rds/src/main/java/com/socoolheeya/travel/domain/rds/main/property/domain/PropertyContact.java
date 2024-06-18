package com.socoolheeya.travel.domain.rds.main.property.domain;

public record PropertyContact(
        Long id,
        String email,
        String telephone,
        String secondTelephone,
        String website
) {
}
