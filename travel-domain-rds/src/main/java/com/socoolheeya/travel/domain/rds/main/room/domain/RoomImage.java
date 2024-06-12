package com.socoolheeya.travel.domain.rds.main.room.domain;

import com.socoolheeya.travel.domain.rds.common.converter.BooleanToStringConverter;
import com.socoolheeya.travel.domain.rds.main.room.entity.RoomEntity;
import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Convert;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public record RoomImage(
        Long id,
        String name,
        String path,
        boolean isCover,
        boolean isUsable,
        Integer sequence,
        RoomEntity room
) {
    public RoomImage {
        isCover = false;
        isUsable = true;
        sequence = 1;
    }
}
