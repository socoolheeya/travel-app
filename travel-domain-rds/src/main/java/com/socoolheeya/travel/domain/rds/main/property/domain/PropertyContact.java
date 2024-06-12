package com.socoolheeya.travel.domain.rds.main.property.domain;

import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;

public record PropertyContact(
        Long id,
        String email,
        String telephone,
        String secondTelephone,
        String website
) {
}
