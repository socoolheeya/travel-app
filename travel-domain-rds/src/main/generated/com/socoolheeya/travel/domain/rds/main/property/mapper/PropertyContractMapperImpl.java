package com.socoolheeya.travel.domain.rds.main.property.mapper;

import com.socoolheeya.travel.domain.rds.main.property.domain.PropertyContract;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyContractEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class PropertyContractMapperImpl implements PropertyContractMapper {

    @Override
    public PropertyContract toDomain(PropertyContractEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Long id = null;
        String filePath = null;
        String fileName = null;
        Boolean isEnabled = null;

        id = entity.getId();
        filePath = entity.getFilePath();
        fileName = entity.getFileName();
        isEnabled = entity.getIsEnabled();

        Long propertyId = null;

        PropertyContract propertyContract = new PropertyContract( id, filePath, fileName, isEnabled, propertyId );

        return propertyContract;
    }

    @Override
    public PropertyContractEntity toEntity(PropertyContract domain) {
        if ( domain == null ) {
            return null;
        }

        PropertyContractEntity.PropertyContractEntityBuilder propertyContractEntity = PropertyContractEntity.builder();

        propertyContractEntity.id( domain.id() );
        propertyContractEntity.filePath( domain.filePath() );
        propertyContractEntity.fileName( domain.fileName() );
        propertyContractEntity.isEnabled( domain.isEnabled() );

        return propertyContractEntity.build();
    }
}
