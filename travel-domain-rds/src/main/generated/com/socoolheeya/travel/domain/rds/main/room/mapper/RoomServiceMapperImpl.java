package com.socoolheeya.travel.domain.rds.main.room.mapper;

import com.socoolheeya.travel.domain.rds.main.room.domain.RoomService;
import com.socoolheeya.travel.domain.rds.main.room.entity.RoomServiceEntity;
import com.socoolheeya.travel.system.core.enums.RoomEnums;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class RoomServiceMapperImpl implements RoomServiceMapper {

    @Override
    public RoomService toDomain(RoomServiceEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Long id = null;
        RoomEnums.Service service = null;

        if ( entity.getId() != null ) {
            id = entity.getId().longValue();
        }
        service = entity.getService();

        Long roomId = null;

        RoomService roomService = new RoomService( id, roomId, service );

        return roomService;
    }

    @Override
    public RoomServiceEntity toEntity(RoomService domain) {
        if ( domain == null ) {
            return null;
        }

        RoomServiceEntity.RoomServiceEntityBuilder roomServiceEntity = RoomServiceEntity.builder();

        if ( domain.id() != null ) {
            roomServiceEntity.id( domain.id().intValue() );
        }
        roomServiceEntity.service( domain.service() );

        return roomServiceEntity.build();
    }
}
