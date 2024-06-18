package com.socoolheeya.travel.domain.rds.main.rateplan.entity;


import com.socoolheeya.travel.domain.rds.common.entity.BaseEntity;
import com.socoolheeya.travel.domain.rds.main.booking.entity.BookingEntity;
import com.socoolheeya.travel.domain.rds.main.rate.entity.RateEntity;
import com.socoolheeya.travel.domain.rds.main.rateplan.domain.RatePlan;
import com.socoolheeya.travel.system.core.enums.RatePlanEnums;
import com.socoolheeya.travel.domain.rds.main.room.entity.RoomRatePlanEntity;
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
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Table(name = "rate_plan")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RatePlanEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rate_plan_id",  columnDefinition = "bigint comment '요금제 ID'")
    Long id;

    @NotNull
    @Column(columnDefinition = "varchar(500) comment '요금제명'")
    String name;

    @NotNull
    @Column(name = "checkin_time",  columnDefinition = "time comment '체크인 시작 시각'")
    LocalTime checkinTime;

    @NotNull
    @Column(name = "checkout_time",  columnDefinition = "time comment '체크인 종료 시각'")
    LocalTime checkoutTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "rate_classification", columnDefinition = "varchar(20) comment '요금 구분'")
    RatePlanEnums.RateClassification rateClassification = RatePlanEnums.RateClassification.STAND_ALONE;

    @NotNull
    @Column(name = "is_early_checkin",  columnDefinition = "bool comment '얼리 체크인 가능 여부'")
    boolean isEarlyCheckin = false;

    @NotNull
    @Column(name = "is_smoking",  columnDefinition = "bool comment '흡연 가능 여부'")
    boolean isSmoking = false;

    @NotNull
    @Column(name = "is_static_rate",  columnDefinition = "bool comment '정적 요금제 여부'")
    boolean isStaticRate = false;

    @Column(name = "min_stay", columnDefinition = "smallint(2) comment '투숙박수-최소'")
    Integer minStay;

    @Column(name = "max_stay", columnDefinition = "smallint(2) comment '투숙박수-최대'")
    Integer maxStay;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", columnDefinition = "varchar(30) comment '요금제 상태'")
    RatePlanEnums.Status status;

    @OneToMany(mappedBy = "ratePlan", orphanRemoval = true, cascade = CascadeType.ALL)
    List<RoomRatePlanEntity> roomRatePlans = new ArrayList<>();

    @OneToMany(mappedBy = "ratePlan")
    List<RateEntity> rates = new ArrayList<>();

    @OneToMany(mappedBy = "ratePlan")
    List<RatePlanCouponEntity> ratePlanCoupons = new ArrayList<>();

    @OneToOne(mappedBy = "ratePlan")
    CancelPolicyEntity cancelPolicy;

    @OneToOne(mappedBy = "ratePlan")
    MealPlanEntity mealPlan;

    @OneToOne(mappedBy = "ratePlan")
    BookingEntity booking;

    @Builder
    public RatePlanEntity(Long id, String name, RatePlanEnums.RateClassification rateClassification, LocalTime checkinTime, LocalTime checkoutTime) {
        this.id = id;
        this.name = name;
        this.rateClassification = rateClassification;
        this.checkinTime = checkinTime;
        this.checkoutTime = checkoutTime;
    }

    @Builder
    public RatePlanEntity(Long id, String name, LocalTime checkinTime, LocalTime checkoutTime, RatePlanEnums.RateClassification rateClassification, boolean isEarlyCheckin, boolean isSmoking, boolean isStaticRate, Integer minStay, Integer maxStay, RatePlanEnums.Status status) {
        this.id = id;
        this.name = name;
        this.checkinTime = checkinTime;
        this.checkoutTime = checkoutTime;
        this.rateClassification = rateClassification;
        this.isEarlyCheckin = isEarlyCheckin;
        this.isSmoking = isSmoking;
        this.isStaticRate = isStaticRate;
        this.minStay = minStay;
        this.maxStay = maxStay;
        this.status = status;
        this.cancelPolicy = null;
        this.mealPlan = null;
        this.booking = null;
    }


}
