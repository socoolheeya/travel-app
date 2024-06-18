package com.socoolheeya.travel.domain.rds.main.room.mapper;

import com.socoolheeya.travel.domain.rds.main.room.domain.RoomAmenity;
import com.socoolheeya.travel.domain.rds.main.room.entity.RoomAmenityEntity;
import com.socoolheeya.travel.system.core.enums.RoomEnums;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class RoomAmenityMapperImpl implements RoomAmenityMapper {

    @Override
    public RoomAmenity toDomain(RoomAmenityEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Integer id = null;
        RoomEnums.Amenity amenity = null;

        id = entity.getId();
        amenity = entity.getAmenity();

        Long roomId = null;

        RoomAmenity roomAmenity = new RoomAmenity( id, roomId, amenity );

        return roomAmenity;
    }

    @Override
    public RoomAmenityEntity toEntity(RoomAmenity domain) {
        if ( domain == null ) {
            return null;
        }

        RoomAmenityEntity.RoomAmenityEntityBuilder roomAmenityEntity = RoomAmenityEntity.builder();

        roomAmenityEntity.id( domain.id() );
        roomAmenityEntity.amenity( domain.amenity() );

        return roomAmenityEntity.build();
    }
}
