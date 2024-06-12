package com.socoolheeya.travel.domain.rds.main.room.entity;

import com.socoolheeya.travel.system.core.enums.RoomEnums;
import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@Entity
@Table(name = "room_service")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoomServiceEntity {
    @Id
    @Column(name = "room_service_id", columnDefinition = "int(6) comment '객실 서비스 ID'")
    Integer id;

    @Enumerated(EnumType.STRING)
    RoomEnums.Service service;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    RoomEntity room;

    @Builder
    public RoomServiceEntity(Integer id, RoomEnums.Service service) {
        this.id = id;
        this.service = service;
        this.room = null;
    }

    @Builder
    public RoomServiceEntity(RoomEnums.Service service) {
        this.id = null;
        this.service = service;
        this.room = null;
    }

}
