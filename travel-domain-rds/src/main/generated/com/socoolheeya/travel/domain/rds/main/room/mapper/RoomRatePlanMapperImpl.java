package com.socoolheeya.travel.domain.rds.main.room.mapper;

import com.socoolheeya.travel.domain.rds.main.room.domain.RoomRatePlan;
import com.socoolheeya.travel.domain.rds.main.room.entity.RoomRatePlanEntity;
import com.socoolheeya.travel.domain.rds.main.room.entity.pk.RoomRatePlanId;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class RoomRatePlanMapperImpl implements RoomRatePlanMapper {

    @Override
    public RoomRatePlan toDomain(RoomRatePlanEntity entity) {
        if ( entity == null ) {
            return null;
        }

        RoomRatePlanId id = null;
        Boolean isEnabled = null;
        LocalDateTime createdAt = null;

        id = entity.getId();
        isEnabled = entity.getIsEnabled();
        createdAt = entity.getCreatedAt();

        RoomRatePlan roomRatePlan = new RoomRatePlan( id, isEnabled, createdAt );

        return roomRatePlan;
    }

    @Override
    public RoomRatePlanEntity toEntity(RoomRatePlan domain) {
        if ( domain == null ) {
            return null;
        }

        RoomRatePlanEntity.RoomRatePlanEntityBuilder roomRatePlanEntity = RoomRatePlanEntity.builder();

        roomRatePlanEntity.isEnabled( domain.isEnabled() );
        roomRatePlanEntity.id( domain.id() );

        return roomRatePlanEntity.build();
    }
}
