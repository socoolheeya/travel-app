package com.socoolheeya.travel.domain.rds.main.property.mapper;

import com.socoolheeya.travel.domain.rds.main.property.domain.Property;
import com.socoolheeya.travel.domain.rds.main.property.domain.PropertyAddress;
import com.socoolheeya.travel.domain.rds.main.property.domain.PropertyContact;
import com.socoolheeya.travel.domain.rds.main.property.domain.PropertyImage;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyAddressEntity;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyContactEntity;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyContractEntity;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyEntity;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyImageEntity;
import com.socoolheeya.travel.system.core.enums.PropertyEnums;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class PropertyAddressMapperImpl implements PropertyAddressMapper {

    @Override
    public PropertyAddress toDomain(PropertyAddressEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Long id = null;
        String address = null;
        String addressDetail = null;
        String zipCode = null;
        Property property = null;

        id = entity.getId();
        address = entity.getAddress();
        addressDetail = entity.getAddressDetail();
        zipCode = entity.getZipCode();
        property = propertyEntityToProperty( entity.getProperty() );

        PropertyAddress propertyAddress = new PropertyAddress( id, address, addressDetail, zipCode, property );

        return propertyAddress;
    }

    @Override
    public PropertyAddressEntity toEntity(PropertyAddress domain) {
        if ( domain == null ) {
            return null;
        }

        Long id = null;
        String address = null;
        String addressDetail = null;
        String zipCode = null;
        PropertyEntity property = null;

        id = domain.id();
        address = domain.address();
        addressDetail = domain.addressDetail();
        zipCode = domain.zipCode();
        property = propertyToPropertyEntity( domain.property() );

        PropertyAddressEntity propertyAddressEntity = new PropertyAddressEntity( id, address, addressDetail, zipCode, property );

        return propertyAddressEntity;
    }

    protected PropertyImage propertyImageEntityToPropertyImage(PropertyImageEntity propertyImageEntity) {
        if ( propertyImageEntity == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        PropertyEnums.ImageType type = null;
        String path = null;
        Integer sequence = null;

        id = propertyImageEntity.getId();
        name = propertyImageEntity.getName();
        type = propertyImageEntity.getType();
        path = propertyImageEntity.getPath();
        sequence = propertyImageEntity.getSequence();

        PropertyImage propertyImage = new PropertyImage( id, name, type, path, sequence );

        return propertyImage;
    }

    protected List<PropertyImage> propertyImageEntityListToPropertyImageList(List<PropertyImageEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<PropertyImage> list1 = new ArrayList<PropertyImage>( list.size() );
        for ( PropertyImageEntity propertyImageEntity : list ) {
            list1.add( propertyImageEntityToPropertyImage( propertyImageEntity ) );
        }

        return list1;
    }

    protected PropertyContact propertyContactEntityToPropertyContact(PropertyContactEntity propertyContactEntity) {
        if ( propertyContactEntity == null ) {
            return null;
        }

        Long id = null;
        String email = null;
        String telephone = null;
        String secondTelephone = null;
        String website = null;

        id = propertyContactEntity.getId();
        email = propertyContactEntity.getEmail();
        telephone = propertyContactEntity.getTelephone();
        secondTelephone = propertyContactEntity.getSecondTelephone();
        website = propertyContactEntity.getWebsite();

        PropertyContact propertyContact = new PropertyContact( id, email, telephone, secondTelephone, website );

        return propertyContact;
    }

    protected Property propertyEntityToProperty(PropertyEntity propertyEntity) {
        if ( propertyEntity == null ) {
            return null;
        }

        Property.PropertyBuilder property = Property.builder();

        property.id( propertyEntity.getId() );
        property.koName( propertyEntity.getKoName() );
        property.enName( propertyEntity.getEnName() );
        property.isEnabled( propertyEntity.getIsEnabled() );
        property.images( propertyImageEntityListToPropertyImageList( propertyEntity.getImages() ) );
        property.address( toDomain( propertyEntity.getAddress() ) );
        property.contact( propertyContactEntityToPropertyContact( propertyEntity.getContact() ) );
        property.location( propertyEntity.getLocation() );
        List<PropertyContractEntity> list1 = propertyEntity.getPropertyContracts();
        if ( list1 != null ) {
            property.propertyContracts( new ArrayList<PropertyContractEntity>( list1 ) );
        }
        property.propertySupplier( propertyEntity.getPropertySupplier() );

        return property.build();
    }

    protected PropertyImageEntity propertyImageToPropertyImageEntity(PropertyImage propertyImage) {
        if ( propertyImage == null ) {
            return null;
        }

        PropertyImageEntity.PropertyImageEntityBuilder propertyImageEntity = PropertyImageEntity.builder();

        propertyImageEntity.id( propertyImage.id() );
        propertyImageEntity.name( propertyImage.name() );
        propertyImageEntity.path( propertyImage.path() );
        propertyImageEntity.sequence( propertyImage.sequence() );
        propertyImageEntity.type( propertyImage.type() );

        return propertyImageEntity.build();
    }

    protected List<PropertyImageEntity> propertyImageListToPropertyImageEntityList(List<PropertyImage> list) {
        if ( list == null ) {
            return null;
        }

        List<PropertyImageEntity> list1 = new ArrayList<PropertyImageEntity>( list.size() );
        for ( PropertyImage propertyImage : list ) {
            list1.add( propertyImageToPropertyImageEntity( propertyImage ) );
        }

        return list1;
    }

    protected PropertyContactEntity propertyContactToPropertyContactEntity(PropertyContact propertyContact) {
        if ( propertyContact == null ) {
            return null;
        }

        PropertyContactEntity.PropertyContactEntityBuilder propertyContactEntity = PropertyContactEntity.builder();

        propertyContactEntity.id( propertyContact.id() );
        propertyContactEntity.email( propertyContact.email() );
        propertyContactEntity.telephone( propertyContact.telephone() );
        propertyContactEntity.secondTelephone( propertyContact.secondTelephone() );
        propertyContactEntity.website( propertyContact.website() );

        return propertyContactEntity.build();
    }

    protected PropertyEntity propertyToPropertyEntity(Property property) {
        if ( property == null ) {
            return null;
        }

        PropertyEntity.PropertyEntityBuilder propertyEntity = PropertyEntity.builder();

        propertyEntity.id( property.id() );
        propertyEntity.koName( property.koName() );
        propertyEntity.enName( property.enName() );
        propertyEntity.isEnabled( property.isEnabled() );
        propertyEntity.images( propertyImageListToPropertyImageEntityList( property.images() ) );
        propertyEntity.address( toEntity( property.address() ) );
        propertyEntity.contact( propertyContactToPropertyContactEntity( property.contact() ) );
        propertyEntity.location( property.location() );

        return propertyEntity.build();
    }
}
