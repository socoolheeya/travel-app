package com.socoolheeya.travel.domain.rds.main.rateplan.mapper;

import com.socoolheeya.travel.domain.rds.main.rateplan.domain.MealPlan;
import com.socoolheeya.travel.domain.rds.main.rateplan.entity.MealPlanEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class MealPlanMapperImpl implements MealPlanMapper {

    @Override
    public MealPlan toDomain(MealPlanEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Long id = null;
        Boolean isBreakfast = null;
        Boolean isLunch = null;
        Boolean isDinner = null;

        id = entity.getId();
        isBreakfast = entity.getIsBreakfast();
        isLunch = entity.getIsLunch();
        isDinner = entity.getIsDinner();

        Long ratePlanId = null;

        MealPlan mealPlan = new MealPlan( id, ratePlanId, isBreakfast, isLunch, isDinner );

        return mealPlan;
    }

    @Override
    public MealPlanEntity toEntity(MealPlan domain) {
        if ( domain == null ) {
            return null;
        }

        MealPlanEntity.MealPlanEntityBuilder mealPlanEntity = MealPlanEntity.builder();

        mealPlanEntity.id( domain.id() );
        mealPlanEntity.isBreakfast( domain.isBreakfast() );
        mealPlanEntity.isLunch( domain.isLunch() );
        mealPlanEntity.isDinner( domain.isDinner() );

        return mealPlanEntity.build();
    }
}
