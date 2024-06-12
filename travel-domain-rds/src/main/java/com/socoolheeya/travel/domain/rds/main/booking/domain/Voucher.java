package com.socoolheeya.travel.domain.rds.main.booking.domain;

import com.socoolheeya.travel.system.core.enums.RoomEnums;

public record Voucher(
        Long id,
        Integer numberOfRoom,
        Integer adult,
        Integer children,
        RoomEnums.RoomType roomType,
        Booking booking
) {
    public Voucher {
        numberOfRoom = 1;
    }
}
