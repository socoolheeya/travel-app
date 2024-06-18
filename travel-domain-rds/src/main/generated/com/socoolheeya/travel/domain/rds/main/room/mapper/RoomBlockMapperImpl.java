package com.socoolheeya.travel.domain.rds.main.room.mapper;

import com.socoolheeya.travel.domain.rds.main.room.domain.RoomBlock;
import com.socoolheeya.travel.domain.rds.main.room.entity.RoomBlockEntity;
import java.time.LocalDate;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class RoomBlockMapperImpl implements RoomBlockMapper {

    @Override
    public RoomBlock toDomain(RoomBlockEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Long id = null;
        LocalDate salesDay = null;
        Integer stock = null;

        id = entity.getId();
        salesDay = entity.getSalesDay();
        stock = entity.getStock();

        Long roomId = null;
        boolean isEnabled = false;

        RoomBlock roomBlock = new RoomBlock( id, roomId, salesDay, stock, isEnabled );

        return roomBlock;
    }

    @Override
    public RoomBlockEntity toEntity(RoomBlock domain) {
        if ( domain == null ) {
            return null;
        }

        RoomBlockEntity.RoomBlockEntityBuilder roomBlockEntity = RoomBlockEntity.builder();

        roomBlockEntity.salesDay( domain.salesDay() );
        roomBlockEntity.stock( domain.stock() );
        roomBlockEntity.isEnabled( domain.isEnabled() );

        return roomBlockEntity.build();
    }
}
