package com.socoolheeya.travel.domain.rds.main.booking.domain;

import com.socoolheeya.travel.domain.rds.main.booking.enums.BookingEnums;

public record BookingFax(
        Long id,
        BookingEnums.FaxStatus status,
        Long bookingId
) {
}
