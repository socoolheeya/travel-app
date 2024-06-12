package com.socoolheeya.travel.domain.rds.main.room.domain;

import com.socoolheeya.travel.system.core.enums.RoomEnums;

public record RoomEquipment(
        Long id,
        Long roomId,
        RoomEnums.Equipment equipment
) {
}
