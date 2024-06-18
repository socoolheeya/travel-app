package com.socoolheeya.travel.domain.rds.main.supplier.mapper;

import com.socoolheeya.travel.domain.rds.main.property.domain.PropertySupplier;
import com.socoolheeya.travel.domain.rds.main.property.mapper.PropertySupplierMapper;
import com.socoolheeya.travel.domain.rds.main.supplier.domain.Supplier;
import com.socoolheeya.travel.domain.rds.main.supplier.domain.SupplierOperationOption;
import com.socoolheeya.travel.domain.rds.main.supplier.entity.SupplierEntity;
import com.socoolheeya.travel.system.core.enums.SupplierEnums;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class SupplierMapperImpl implements SupplierMapper {

    @Autowired
    private SupplierOperationOptionMapper supplierOperationOptionMapper;
    @Autowired
    private PropertySupplierMapper propertySupplierMapper;

    @Override
    public Supplier toDomain(SupplierEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Long id = null;
        String shortName = null;
        String name = null;
        SupplierEnums.Type type = null;
        Boolean isEnabled = null;
        SupplierOperationOption supplierOperationOption = null;
        PropertySupplier propertySupplier = null;

        id = entity.getId();
        shortName = entity.getShortName();
        name = entity.getName();
        type = entity.getType();
        isEnabled = entity.getIsEnabled();
        supplierOperationOption = supplierOperationOptionMapper.toDomain( entity.getSupplierOperationOption() );
        propertySupplier = propertySupplierMapper.toDomain( entity.getPropertySupplier() );

        Supplier supplier = new Supplier( id, shortName, name, type, isEnabled, supplierOperationOption, propertySupplier );

        return supplier;
    }

    @Override
    public SupplierEntity toEntity(Supplier domain) {
        if ( domain == null ) {
            return null;
        }

        SupplierEntity.SupplierEntityBuilder supplierEntity = SupplierEntity.builder();

        supplierEntity.id( domain.id() );
        supplierEntity.shortName( domain.shortName() );
        supplierEntity.name( domain.name() );
        supplierEntity.type( domain.type() );
        supplierEntity.isEnabled( domain.isEnabled() );
        supplierEntity.supplierOperationOption( supplierOperationOptionMapper.toEntity( domain.supplierOperationOption() ) );
        supplierEntity.propertySupplier( propertySupplierMapper.toEntity( domain.propertySupplier() ) );

        return supplierEntity.build();
    }
}
