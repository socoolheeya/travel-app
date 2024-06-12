package com.socoolheeya.travel.domain.rds.main.property.mapper;

import com.socoolheeya.travel.domain.rds.common.mapper.BaseEntityMapper;
import com.socoolheeya.travel.domain.rds.main.property.domain.PropertySupplier;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertySupplierEntity;
import com.socoolheeya.travel.domain.rds.main.supplier.mapper.SupplierMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE
        , uses = {PropertyMapper.class, SupplierMapper.class})
public interface PropertySupplierMapper extends BaseEntityMapper<PropertySupplier, PropertySupplierEntity> {
    @Mapping(source = "entity.property.id", target = "propertyId")
    @Mapping(source = "entity.supplier.id", target = "supplierId")
    PropertySupplier toDomain(PropertySupplierEntity entity);

    @Mapping(source = "domain.propertyId", target = "property.id")
    @Mapping(source = "domain.supplierId", target = "supplier.id")
    PropertySupplierEntity toEntity(PropertySupplier domain);
}
