package com.socoolheeya.travel.domain.rds.main.booking.domain;

import com.socoolheeya.travel.domain.rds.main.booking.enums.BookingEnums;

public record BookingGuest(
        Long id,
        String name,
        Integer age,
        String phone,
        BookingEnums.Gender gender,
        Boolean isMainHolder,
        Long bookingOccupancyId
) {
    public BookingGuest {
        isMainHolder = false;
    }
}
