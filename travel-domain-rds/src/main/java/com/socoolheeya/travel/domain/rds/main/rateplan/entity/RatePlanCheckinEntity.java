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

import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "rate_plan_checkin")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RatePlanCheckinEntity extends WeekEntity {

    @Id
    @Column(name = "rate_plan_id", columnDefinition = "bigint comment '체크인 기간 ID'")
    Long id;

    @Column(name = "checkin_started_at", columnDefinition = "datetime comment '체크인 기간 시작일'")
    LocalDateTime checkinStartedAt;

    @Column(name = "checkin_ended_at", columnDefinition = "datetime comment '체크인 기간 종료일'")
    LocalDateTime checkinEndedAt;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rate_plan_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    RatePlanEntity ratePlan;

}
