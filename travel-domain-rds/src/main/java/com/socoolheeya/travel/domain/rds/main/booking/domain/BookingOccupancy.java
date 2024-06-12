package com.socoolheeya.travel.domain.rds.main.booking.domain;

import java.util.ArrayList;
import java.util.List;

public record BookingOccupancy(
        Long id,
        Integer totalAdults,
        Integer totalChildren,
        List<BookingGuest> bookingGuests,
        Long bookingId
) {
    public BookingOccupancy {
        bookingGuests = new ArrayList<>();
    }
}
