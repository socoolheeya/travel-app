package com.socoolheeya.travel.domain.rds.main.booking.domain;

import java.time.LocalDate;

public record BookingBasicInformation(
        Long id,
        LocalDate checkin,
        LocalDate checkout,
        Integer nights,
        Long bookingId
) {
}
