package com.socoolheeya.travel.domain.rds.main.room.domain;

import com.socoolheeya.travel.domain.rds.main.room.entity.pk.RoomRatePlanId;

import java.time.LocalDateTime;

public record RoomRatePlan(
        RoomRatePlanId id,
        Boolean isEnabled,
        LocalDateTime createdAt
) {
    public RoomRatePlan {
        isEnabled = true;
    }
}
