package com.socoolheeya.travel.domain.rds.main.room.domain;

public record RoomOccupancy(
        Long id,
        Long roomId,
        Integer min,
        Integer max,
        Integer adults,
        Integer children
) {
}
