package com.socoolheeya.travel.domain.rds.main.booking.domain.payment;

import com.socoolheeya.travel.domain.rds.main.booking.domain.Booking;
import com.socoolheeya.travel.domain.rds.main.booking.enums.BookingEnums;

public record Payment(
        Long id,
        BookingEnums.PaymentType paymentType,
        Booking booking
) {
}
