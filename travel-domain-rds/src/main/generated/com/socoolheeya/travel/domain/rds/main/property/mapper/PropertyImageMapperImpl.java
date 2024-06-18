package com.socoolheeya.travel.domain.rds.main.property.mapper;

import com.socoolheeya.travel.domain.rds.main.property.domain.PropertyImage;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyImageEntity;
import com.socoolheeya.travel.system.core.enums.PropertyEnums;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class PropertyImageMapperImpl implements PropertyImageMapper {

    @Override
    public PropertyImage toDomain(PropertyImageEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        PropertyEnums.ImageType type = null;
        String path = null;
        Integer sequence = null;

        id = entity.getId();
        name = entity.getName();
        type = entity.getType();
        path = entity.getPath();
        sequence = entity.getSequence();

        PropertyImage propertyImage = new PropertyImage( id, name, type, path, sequence );

        return propertyImage;
    }

    @Override
    public PropertyImageEntity toEntity(PropertyImage domain) {
        if ( domain == null ) {
            return null;
        }

        PropertyImageEntity.PropertyImageEntityBuilder propertyImageEntity = PropertyImageEntity.builder();

        propertyImageEntity.id( domain.id() );
        propertyImageEntity.name( domain.name() );
        propertyImageEntity.path( domain.path() );
        propertyImageEntity.sequence( domain.sequence() );
        propertyImageEntity.type( domain.type() );

        return propertyImageEntity.build();
    }
}
