package com.socoolheeya.travel.domain.rds.main.room.domain;

import com.socoolheeya.travel.system.core.enums.RoomEnums;

public record RoomAmenity(
        Integer id,
        Long roomId,
        RoomEnums.Amenity amenity
) {
}
