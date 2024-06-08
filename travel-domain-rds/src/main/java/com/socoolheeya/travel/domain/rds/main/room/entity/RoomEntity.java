package com.socoolheeya.travel.domain.rds.main.room.entity;



import com.socoolheeya.travel.domain.rds.common.entity.BaseEntity;
import com.socoolheeya.travel.system.core.enums.RoomEnums;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.ColumnDefault;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "room")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoomEntity extends BaseEntity {
    @Id
    @Column(name = "room_id", columnDefinition = "bigint comment '객실 ID'")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotNull
    @Column(name = "name", columnDefinition = "varchar(500) comment '객실명'")
    String name;

    @NotNull
    @Column(name = "description", columnDefinition = "text comment '설명'")
    String description;

    @Column(name = "room_size", columnDefinition = "double comment '객실 사이즈'")
    Double roomSize;

    @Column(name = "room_size_unit", columnDefinition = "varchar(100) comment '객실 사이즈 단위'")
    RoomEnums.RoomSizeUnit roomSizeUnit;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "varchar(50) comment '전망'")
    RoomEnums.View view;

    @ColumnDefault("false")
    @Column(name = "is_same_day_booking", columnDefinition = "bool comment '당일 예약 가능 여부'")
    boolean isSameDayBooking = false;

    @ColumnDefault("false")
    @Column(name = "is_enabled", columnDefinition = "bool comment '사용 여부'")
    boolean isEnabled = false;

    @OneToOne(mappedBy = "room")
    RoomOccupancyEntity roomOccupancy;

    @OneToMany(mappedBy = "room")
    List<RoomAmenityEntity> amenities = new ArrayList<>();

    @OneToMany(mappedBy = "room")
    List<RoomEquipmentEntity> equipments = new ArrayList<>();

    @OneToMany(mappedBy = "room")
    List<RoomServiceEntity> roomServices = new ArrayList<>();

    @OneToMany(mappedBy = "room")
    List<RoomImageEntity> images = new ArrayList<>();

    @OneToMany(mappedBy = "room", orphanRemoval = true, cascade = CascadeType.ALL)
    List<RoomRatePlanEntity> roomRatePlans = new ArrayList<>();

    @OneToMany(mappedBy = "room")
    List<RoomBlockEntity> blocks = new ArrayList<>();
}
