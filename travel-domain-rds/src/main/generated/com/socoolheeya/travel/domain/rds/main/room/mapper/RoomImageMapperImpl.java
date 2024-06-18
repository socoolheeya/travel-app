package com.socoolheeya.travel.domain.rds.main.room.mapper;

import com.socoolheeya.travel.domain.rds.main.room.domain.RoomImage;
import com.socoolheeya.travel.domain.rds.main.room.entity.RoomEntity;
import com.socoolheeya.travel.domain.rds.main.room.entity.RoomImageEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class RoomImageMapperImpl implements RoomImageMapper {

    @Override
    public RoomImage toDomain(RoomImageEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        String path = null;
        Integer sequence = null;
        RoomEntity room = null;

        id = entity.getId();
        name = entity.getName();
        path = entity.getPath();
        sequence = entity.getSequence();
        room = entity.getRoom();

        boolean isCover = false;
        boolean isUsable = false;

        RoomImage roomImage = new RoomImage( id, name, path, isCover, isUsable, sequence, room );

        return roomImage;
    }

    @Override
    public RoomImageEntity toEntity(RoomImage domain) {
        if ( domain == null ) {
            return null;
        }

        RoomImageEntity.RoomImageEntityBuilder roomImageEntity = RoomImageEntity.builder();

        roomImageEntity.id( domain.id() );
        roomImageEntity.name( domain.name() );
        roomImageEntity.path( domain.path() );
        roomImageEntity.isCover( domain.isCover() );
        roomImageEntity.isUsable( domain.isUsable() );
        roomImageEntity.sequence( domain.sequence() );

        return roomImageEntity.build();
    }
}
