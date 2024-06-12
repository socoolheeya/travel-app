package com.socoolheeya.travel.domain.rds.main.room.domain;

import com.socoolheeya.travel.domain.rds.main.rateplan.domain.RatePlan;
import com.socoolheeya.travel.domain.rds.main.room.entity.pk.RoomRatePlanId;
import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

public record RoomRatePlan(
        RoomRatePlanId id,
        Room room,
        RatePlan ratePlan,
        Boolean isEnabled,
        LocalDateTime createdAt
) {
    public RoomRatePlan {
        isEnabled = true;
    }
}
