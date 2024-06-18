package com.socoolheeya.travel.domain.rds.main.rateplan.mapper;

import com.socoolheeya.travel.domain.rds.main.rateplan.domain.RatePlanCoupon;
import com.socoolheeya.travel.domain.rds.main.rateplan.entity.RatePlanCouponEntity;
import com.socoolheeya.travel.system.core.enums.RatePlanEnums;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class RatePlanCouponMapperImpl implements RatePlanCouponMapper {

    @Override
    public RatePlanCoupon toDomain(RatePlanCouponEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        String image = null;
        String description = null;
        RatePlanEnums.CouponUnit unit = null;
        Integer value = null;
        LocalDateTime startedAt = null;
        LocalDateTime endedAt = null;

        id = entity.getId();
        name = entity.getName();
        image = entity.getImage();
        description = entity.getDescription();
        unit = entity.getUnit();
        value = entity.getValue();
        startedAt = entity.getStartedAt();
        endedAt = entity.getEndedAt();

        Long ratePlanId = null;

        RatePlanCoupon ratePlanCoupon = new RatePlanCoupon( id, name, image, description, unit, value, startedAt, endedAt, ratePlanId );

        return ratePlanCoupon;
    }

    @Override
    public RatePlanCouponEntity toEntity(RatePlanCoupon domain) {
        if ( domain == null ) {
            return null;
        }

        RatePlanCouponEntity.RatePlanCouponEntityBuilder ratePlanCouponEntity = RatePlanCouponEntity.builder();

        ratePlanCouponEntity.id( domain.id() );
        ratePlanCouponEntity.name( domain.name() );
        ratePlanCouponEntity.unit( domain.unit() );
        ratePlanCouponEntity.description( domain.description() );
        ratePlanCouponEntity.value( domain.value() );
        ratePlanCouponEntity.startedAt( domain.startedAt() );
        ratePlanCouponEntity.endedAt( domain.endedAt() );

        return ratePlanCouponEntity.build();
    }
}
