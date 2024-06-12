package com.socoolheeya.travel.domain.rds.main.rateplan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Table(name = "cancel_policy")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CancelPolicyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cancel_policy_id", columnDefinition = "bigint comment '취소규정 ID'")
    Long id;

    @Column(name = "is_cancel", columnDefinition = "bool comment '취소 가능 여부'")
    Boolean isCancel;

    @Column(name = "description", columnDefinition = "text comment '취소 규정 설명'")
    String description;

    @OneToMany(mappedBy = "cancelPolicy")
    List<CancelRateEntity> cancelRates = new ArrayList<>();

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rate_plan_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    RatePlanEntity ratePlan;

    @Builder
    public CancelPolicyEntity(Long id, Boolean isCancel, String description, List<CancelRateEntity> cancelRates, RatePlanEntity ratePlan) {
        this.id = id;
        this.isCancel = isCancel;
        this.description = description;
        this.cancelRates = cancelRates;
        this.ratePlan = ratePlan;
    }

    @Builder
    public CancelPolicyEntity(Long id, Boolean isCancel, String description) {
        this.id = id;
        this.isCancel = isCancel;
        this.description = description;
        this.cancelRates = new ArrayList<>();
        this.ratePlan = null;
    }
}
