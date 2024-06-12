package com.socoolheeya.travel.domain.rds.main.room.domain;

import com.socoolheeya.travel.system.core.enums.RoomEnums;

public record RoomService(
        Long id,
        Long roomId,
        RoomEnums.Service service
) {
}
