package com.socoolheeya.travel.domain.rds.main.rateplan.entity;

import com.socoolheeya.travel.system.core.enums.RatePlanEnums;
import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "rate_plan_coupon")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RatePlanCouponEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rate_plan_coupon_id", columnDefinition = "bigint comment '쿠폰 ID'")
    Long id;

    String name;

    String image;

    @Column(name = "description", columnDefinition = "text comment '쿠폰 설명'")
    String description;

    @Enumerated(EnumType.STRING)
    RatePlanEnums.CouponUnit unit;

    Integer value;

    @Column(name = "started_at", columnDefinition = "datetime comment '시작 시간'")
    LocalDateTime startedAt;

    @Column(name = "ended_at", columnDefinition = "datetime comment '종료 시간'")
    LocalDateTime endedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rate_plan_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    RatePlanEntity ratePlan;
}
