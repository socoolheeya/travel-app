package com.socoolheeya.travel.domain.rds.main.rateplan.entity;

import com.socoolheeya.travel.domain.rds.common.entity.WeekEntity;
import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "rate_plan_booking_period")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RatePlanBookingPeriodEntity extends WeekEntity {
    @Id
    @Column(name = "rate_plan_id", columnDefinition = "bigint comment '요금제 예약 기간 ID'")
    Long id;

    @Column(name = "sales_started_at",  columnDefinition = "datetime comment '요금제 판매 시작일'")
    LocalDateTime salesStartedAt;

    @Column(name = "sales_ended_at",  columnDefinition = "datetime comment '요금제 판매 종료일'")
    LocalDateTime salesEndedAt;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rate_plan_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    RatePlanEntity ratePlan;

}
