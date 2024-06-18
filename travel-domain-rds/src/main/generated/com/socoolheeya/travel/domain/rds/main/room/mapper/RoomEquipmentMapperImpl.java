package com.socoolheeya.travel.domain.rds.main.room.mapper;

import com.socoolheeya.travel.domain.rds.main.room.domain.RoomEquipment;
import com.socoolheeya.travel.domain.rds.main.room.entity.RoomEquipmentEntity;
import com.socoolheeya.travel.system.core.enums.RoomEnums;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class RoomEquipmentMapperImpl implements RoomEquipmentMapper {

    @Override
    public RoomEquipment toDomain(RoomEquipmentEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Long id = null;
        RoomEnums.Equipment equipment = null;

        if ( entity.getId() != null ) {
            id = entity.getId().longValue();
        }
        equipment = entity.getEquipment();

        Long roomId = null;

        RoomEquipment roomEquipment = new RoomEquipment( id, roomId, equipment );

        return roomEquipment;
    }

    @Override
    public RoomEquipmentEntity toEntity(RoomEquipment domain) {
        if ( domain == null ) {
            return null;
        }

        RoomEquipmentEntity.RoomEquipmentEntityBuilder roomEquipmentEntity = RoomEquipmentEntity.builder();

        if ( domain.id() != null ) {
            roomEquipmentEntity.id( domain.id().intValue() );
        }
        roomEquipmentEntity.equipment( domain.equipment() );

        return roomEquipmentEntity.build();
    }
}
