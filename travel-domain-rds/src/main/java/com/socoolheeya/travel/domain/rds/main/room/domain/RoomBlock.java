package com.socoolheeya.travel.domain.rds.main.room.domain;

import java.time.LocalDate;

public record RoomBlock(
        Long id,
        Long roomId,
        LocalDate salesDay,
        Integer stock,
        boolean isEnabled
) {
    public RoomBlock {
        stock = 0;
        isEnabled = false;
    }
}
