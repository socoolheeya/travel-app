package com.socoolheeya.travel.domain.rds.main.property.mapper;

import com.socoolheeya.travel.domain.rds.main.property.domain.PropertyHistory;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyHistoryEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class PropertyHistoryMapperImpl implements PropertyHistoryMapper {

    @Override
    public PropertyHistory toDomain(PropertyHistoryEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Long id = null;
        Long propertyId = null;
        String koName = null;
        String enName = null;
        Boolean isEnabled = null;

        id = entity.getId();
        propertyId = entity.getPropertyId();
        koName = entity.getKoName();
        enName = entity.getEnName();
        isEnabled = entity.getIsEnabled();

        PropertyHistory propertyHistory = new PropertyHistory( id, propertyId, koName, enName, isEnabled );

        return propertyHistory;
    }

    @Override
    public PropertyHistoryEntity toEntity(PropertyHistory domain) {
        if ( domain == null ) {
            return null;
        }

        PropertyHistoryEntity.PropertyHistoryEntityBuilder propertyHistoryEntity = PropertyHistoryEntity.builder();

        propertyHistoryEntity.id( domain.id() );
        propertyHistoryEntity.propertyId( domain.propertyId() );
        propertyHistoryEntity.koName( domain.koName() );
        propertyHistoryEntity.enName( domain.enName() );
        propertyHistoryEntity.isEnabled( domain.isEnabled() );

        return propertyHistoryEntity.build();
    }
}
