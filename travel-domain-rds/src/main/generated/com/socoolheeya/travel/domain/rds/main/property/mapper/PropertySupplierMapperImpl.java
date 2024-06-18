package com.socoolheeya.travel.domain.rds.main.property.mapper;

import com.socoolheeya.travel.domain.rds.main.property.domain.PropertySupplier;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyEntity;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertySupplierEntity;
import com.socoolheeya.travel.domain.rds.main.supplier.entity.SupplierEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class PropertySupplierMapperImpl implements PropertySupplierMapper {

    @Override
    public PropertySupplier toDomain(PropertySupplierEntity entity) {
        if ( entity == null ) {
            return null;
        }

        PropertySupplier.PropertySupplierBuilder propertySupplier = PropertySupplier.builder();

        propertySupplier.propertyId( entityPropertyId( entity ) );
        propertySupplier.supplierId( entitySupplierId( entity ) );
        propertySupplier.id( entity.getId() );

        return propertySupplier.build();
    }

    @Override
    public PropertySupplierEntity toEntity(PropertySupplier domain) {
        if ( domain == null ) {
            return null;
        }

        PropertySupplierEntity.PropertySupplierEntityBuilder propertySupplierEntity = PropertySupplierEntity.builder();

        propertySupplierEntity.property( propertySupplierToPropertyEntity( domain ) );
        propertySupplierEntity.supplier( propertySupplierToSupplierEntity( domain ) );
        propertySupplierEntity.id( domain.id() );

        return propertySupplierEntity.build();
    }

    private Long entityPropertyId(PropertySupplierEntity propertySupplierEntity) {
        if ( propertySupplierEntity == null ) {
            return null;
        }
        PropertyEntity property = propertySupplierEntity.getProperty();
        if ( property == null ) {
            return null;
        }
        Long id = property.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entitySupplierId(PropertySupplierEntity propertySupplierEntity) {
        if ( propertySupplierEntity == null ) {
            return null;
        }
        SupplierEntity supplier = propertySupplierEntity.getSupplier();
        if ( supplier == null ) {
            return null;
        }
        Long id = supplier.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected PropertyEntity propertySupplierToPropertyEntity(PropertySupplier propertySupplier) {
        if ( propertySupplier == null ) {
            return null;
        }

        PropertyEntity.PropertyEntityBuilder propertyEntity = PropertyEntity.builder();

        propertyEntity.id( propertySupplier.propertyId() );

        return propertyEntity.build();
    }

    protected SupplierEntity propertySupplierToSupplierEntity(PropertySupplier propertySupplier) {
        if ( propertySupplier == null ) {
            return null;
        }

        SupplierEntity.SupplierEntityBuilder supplierEntity = SupplierEntity.builder();

        supplierEntity.id( propertySupplier.supplierId() );

        return supplierEntity.build();
    }
}
