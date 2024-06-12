package com.socoolheeya.travel.domain.rds.main.rateplan.entity;

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
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@Entity
@Table(name = "meal_plan")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MealPlanEntity {

    @Id
    @Column(name = "rate_plan_id", columnDefinition = "bigint comment '요금제 ID'")
    Long id;

    @Column(name = "is_breakfast", columnDefinition = "bool comment '조식 여부'")
    Boolean isBreakfast = false;

    @Column(name = "is_lunch", columnDefinition = "bool comment '점심 여부'")
    Boolean isLunch = false;

    @Column(name = "is_dinner", columnDefinition = "bool comment '저녁 여부'")
    Boolean isDinner = false;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rate_plan_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    RatePlanEntity ratePlan;

    @Builder
    public MealPlanEntity(Long id, Boolean isBreakfast, Boolean isLunch, Boolean isDinner) {
        this.id = id;
        this.isBreakfast = isBreakfast;
        this.isLunch = isLunch;
        this.isDinner = isDinner;
        this.ratePlan = null;
    }

    @Builder
    public MealPlanEntity(Long id) {
        this.id = id;
        this.isBreakfast = false;
        this.isLunch = false;
        this.isDinner = false;
        this.ratePlan = null;
    }
}
