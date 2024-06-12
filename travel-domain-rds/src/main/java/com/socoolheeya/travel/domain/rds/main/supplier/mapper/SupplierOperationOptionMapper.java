package com.socoolheeya.travel.domain.rds.main.supplier.mapper;

import com.socoolheeya.travel.domain.rds.common.mapper.BaseEntityMapper;
import com.socoolheeya.travel.domain.rds.main.supplier.domain.SupplierOperationOption;
import com.socoolheeya.travel.domain.rds.main.supplier.entity.SupplierOperationOptionEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE
        , uses = {})
public interface SupplierOperationOptionMapper extends BaseEntityMapper<SupplierOperationOption, SupplierOperationOptionEntity> {
}
