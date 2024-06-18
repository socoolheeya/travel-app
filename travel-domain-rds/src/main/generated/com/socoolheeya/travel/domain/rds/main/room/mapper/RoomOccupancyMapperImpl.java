package com.socoolheeya.travel.domain.rds.main.room.mapper;

import com.socoolheeya.travel.domain.rds.main.room.domain.RoomOccupancy;
import com.socoolheeya.travel.domain.rds.main.room.entity.RoomOccupancyEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class RoomOccupancyMapperImpl implements RoomOccupancyMapper {

    @Override
    public RoomOccupancy toDomain(RoomOccupancyEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Long id = null;
        Integer min = null;
        Integer max = null;
        Integer adults = null;
        Integer children = null;

        id = entity.getId();
        min = entity.getMin();
        max = entity.getMax();
        adults = entity.getAdults();
        children = entity.getChildren();

        Long roomId = null;

        RoomOccupancy roomOccupancy = new RoomOccupancy( id, roomId, min, max, adults, children );

        return roomOccupancy;
    }

    @Override
    public RoomOccupancyEntity toEntity(RoomOccupancy domain) {
        if ( domain == null ) {
            return null;
        }

        RoomOccupancyEntity.RoomOccupancyEntityBuilder roomOccupancyEntity = RoomOccupancyEntity.builder();

        roomOccupancyEntity.id( domain.id() );
        roomOccupancyEntity.min( domain.min() );
        roomOccupancyEntity.max( domain.max() );
        roomOccupancyEntity.adults( domain.adults() );
        roomOccupancyEntity.children( domain.children() );

        return roomOccupancyEntity.build();
    }
}
