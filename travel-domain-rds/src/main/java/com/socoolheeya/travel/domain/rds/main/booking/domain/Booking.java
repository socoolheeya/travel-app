package com.socoolheeya.travel.domain.rds.main.booking.domain;

import com.socoolheeya.travel.domain.rds.main.booking.enums.BookingEnums;

import java.util.ArrayList;
import java.util.List;

public record Booking(
        Long id,
        BookingEnums.Status status,
        String refBookingNo,
        Long ratePlanId,
        Long voucherId,
        Long paymentId,
        List<BookingOccupancy> bookingOccupancies
) {

    public Booking {
        status = BookingEnums.Status.REQUESTED;
        bookingOccupancies = new ArrayList<>();
    }
}
