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
import lombok.Builder;
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

    @Column(name = "name", columnDefinition = "varchar(500) comment '쿠폰명'")
    String name;

    @Column(name = "image", columnDefinition = "varchar(1000) comment '쿠폰 이미지 경로'")
    String image;

    @Column(name = "description", columnDefinition = "text comment '쿠폰 설명'")
    String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "unit", columnDefinition = "varchar(255) comment '쿠폰 할인 단위'")
    RatePlanEnums.CouponUnit unit;

    @Column(name = "couponValue", columnDefinition = "varchar(255) comment '쿠폰 할인값'")
    Integer value;

    @Column(name = "started_at", columnDefinition = "datetime comment '시작 시간'")
    LocalDateTime startedAt;

    @Column(name = "ended_at", columnDefinition = "datetime comment '종료 시간'")
    LocalDateTime endedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rate_plan_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    RatePlanEntity ratePlan;

    @Builder
    public RatePlanCouponEntity(Long id, String name, RatePlanEnums.CouponUnit unit, String description, Integer value, LocalDateTime startedAt, LocalDateTime endedAt, RatePlanEntity ratePlan) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.description = description;
        this.value = value;
        this.startedAt = startedAt;
        this.endedAt = endedAt;
        this.ratePlan = ratePlan;
    }

    @Builder
    public RatePlanCouponEntity(Long id, String name, RatePlanEnums.CouponUnit unit, String description, Integer value, LocalDateTime startedAt, LocalDateTime endedAt) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.description = description;
        this.value = value;
        this.startedAt = startedAt;
        this.endedAt = endedAt;
        this.ratePlan = null;
    }
}
