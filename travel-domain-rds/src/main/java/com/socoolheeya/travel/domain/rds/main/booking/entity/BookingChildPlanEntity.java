package com.socoolheeya.travel.domain.rds.main.booking.entity;

import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@Entity
@Table(name = "booking_child_plan")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookingChildPlanEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "child_plan_id", columnDefinition = "bigint comment '어린이 플랜 ID'")
    Long id;

    @Column(name = "name", columnDefinition = "varchar(255) comment '어린이 플랜명'")
    String name;

    @NotNull
    @Column(name = "age", columnDefinition = "smallint comment '나이'")
    Integer age;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "occupancy_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    BookingOccupancyEntity occupancy;
}
