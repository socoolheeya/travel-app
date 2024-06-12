package com.socoolheeya.travel.domain.rds.main.room.domain;

import com.socoolheeya.travel.system.core.enums.RoomEnums;

import java.util.List;

public record Room(
        Long id,
        String name,
        String description,
        Double roomSize,
        RoomEnums.RoomSizeUnit roomSizeUnit,
        RoomEnums.View view,
        boolean isSameDayBooking,
        boolean isEnabled,
        RoomOccupancy roomOccupancy,
        List<RoomAmenity> roomAmenities,
        List<RoomEquipment> roomEquipments,
        List<RoomService> roomServices,
        List<RoomImage> roomImages,
        List<RoomRatePlan> roomRatePlans,
        List<RoomBlock> roomBlocks
) {
    public Room {
        isSameDayBooking = false;
    }
}
