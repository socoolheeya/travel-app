package com.socoolheeya.travel.domain.rds.main.rateplan.domain;

public record MealPlan(
        Long id,
        Long ratePlanId,
        Boolean isBreakfast,
        Boolean isLunch,
        Boolean isDinner
) {
    public MealPlan {
        isBreakfast = false;
        isLunch = false;
        isDinner = false;
    }
}
