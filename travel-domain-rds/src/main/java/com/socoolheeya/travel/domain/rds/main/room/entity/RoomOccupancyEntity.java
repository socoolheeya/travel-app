package com.socoolheeya.travel.domain.rds.main.room.entity;

import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@Entity
@Builder
@AllArgsConstructor
@Table(name = "room_occupancy")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoomOccupancyEntity {

    @Id
    @Column(name = "room_occupancy_id", columnDefinition = "bigint comment '객실 수용정보 ID'")
    Long id;

    @Column(columnDefinition = "smallint comment '최소 인원 수'")
    Integer min;

    @Column(columnDefinition = "smallint comment '최대 인원 수'")
    Integer max;

    @Column(columnDefinition = "smallint comment '성인 수'")
    Integer adults;

    @Column(columnDefinition = "smallint comment '어린이 수'")
    Integer children;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    RoomEntity room;
}
