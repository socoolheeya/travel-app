package com.socoolheeya.travel.domain.rds.main.property.mapper;

import com.socoolheeya.travel.domain.rds.main.property.domain.PropertyLocation;
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
public class PropertyLocationMapperImpl implements PropertyLocationMapper {

    @Override
    public PropertyLocation toDomain(PropertyLocationEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Long id = null;
        String country = null;
        String region = null;
        String city = null;
        PropertyMapInformation mapInformation = null;

        id = entity.getId();
        country = entity.getCountry();
        region = entity.getRegion();
        city = entity.getCity();
        mapInformation = propertyMapInformationEntityToPropertyMapInformation( entity.getMapInformation() );

        PropertyLocation propertyLocation = new PropertyLocation( id, country, region, city, mapInformation );

        return propertyLocation;
    }

    @Override
    public PropertyLocationEntity toEntity(PropertyLocation domain) {
        if ( domain == null ) {
            return null;
        }

        PropertyLocationEntity.PropertyLocationEntityBuilder propertyLocationEntity = PropertyLocationEntity.builder();

        propertyLocationEntity.id( domain.id() );
        propertyLocationEntity.country( domain.country() );
        propertyLocationEntity.region( domain.region() );
        propertyLocationEntity.city( domain.city() );
        propertyLocationEntity.mapInformation( propertyMapInformationToPropertyMapInformationEntity( domain.mapInformation() ) );

        return propertyLocationEntity.build();
    }

    protected PropertyMapInformation propertyMapInformationEntityToPropertyMapInformation(PropertyMapInformationEntity propertyMapInformationEntity) {
        if ( propertyMapInformationEntity == null ) {
            return null;
        }

        Long id = null;
        Double longitude = null;
        Double latitude = null;
        Point point = null;

        id = propertyMapInformationEntity.getId();
        longitude = propertyMapInformationEntity.getLongitude();
        latitude = propertyMapInformationEntity.getLatitude();
        point = propertyMapInformationEntity.getPoint();

        PropertyMapInformation propertyMapInformation = new PropertyMapInformation( id, longitude, latitude, point );

        return propertyMapInformation;
    }

    protected PropertyMapInformationEntity propertyMapInformationToPropertyMapInformationEntity(PropertyMapInformation propertyMapInformation) {
        if ( propertyMapInformation == null ) {
            return null;
        }

        Long id = null;
        Double longitude = null;
        Double latitude = null;
        Point point = null;

        id = propertyMapInformation.id();
        longitude = propertyMapInformation.longitude();
        latitude = propertyMapInformation.latitude();
        point = propertyMapInformation.point();

        PropertyLocationEntity location = null;

        PropertyMapInformationEntity propertyMapInformationEntity = new PropertyMapInformationEntity( id, longitude, latitude, point, location );

        return propertyMapInformationEntity;
    }
}
