package com.socoolheeya.travel.domain.rds.main.supplier.mapper;

import com.socoolheeya.travel.domain.rds.common.mapper.BaseEntityMapper;
import com.socoolheeya.travel.domain.rds.main.property.mapper.PropertySupplierMapper;
import com.socoolheeya.travel.domain.rds.main.supplier.domain.Supplier;
import com.socoolheeya.travel.domain.rds.main.supplier.entity.SupplierEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE
        , uses = {SupplierOperationOptionMapper.class, PropertySupplierMapper.class})
public interface SupplierMapper extends BaseEntityMapper<Supplier, SupplierEntity> {
    SupplierMapper INSTANCE = Mappers.getMapper(SupplierMapper.class);

}
