package com.socoolheeya.travel.domain.rds.main.property.mapper;

import com.socoolheeya.travel.domain.rds.main.property.domain.PropertyMapInformation;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyLocationEntity;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyMapInformationEntity;
import javax.annotation.processing.Generated;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class PropertyMapInformationMapperImpl implements PropertyMapInformationMapper {

    @Override
    public PropertyMapInformation toDomain(PropertyMapInformationEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Long id = null;
        Double longitude = null;
        Double latitude = null;
        Point point = null;

        id = entity.getId();
        longitude = entity.getLongitude();
        latitude = entity.getLatitude();
        point = entity.getPoint();

        PropertyMapInformation propertyMapInformation = new PropertyMapInformation( id, longitude, latitude, point );

        return propertyMapInformation;
    }

    @Override
    public PropertyMapInformationEntity toEntity(PropertyMapInformation domain) {
        if ( domain == null ) {
            return null;
        }

        Long id = null;
        Double longitude = null;
        Double latitude = null;
        Point point = null;

        id = domain.id();
        longitude = domain.longitude();
        latitude = domain.latitude();
        point = domain.point();

        PropertyLocationEntity location = null;

        PropertyMapInformationEntity propertyMapInformationEntity = new PropertyMapInformationEntity( id, longitude, latitude, point, location );

        return propertyMapInformationEntity;
    }
}
