package com.socoolheeya.travel.domain.rds.main.property.mapper;

import com.socoolheeya.travel.domain.rds.common.mapper.BaseEntityMapper;
import com.socoolheeya.travel.domain.rds.main.property.domain.PropertyAddress;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyAddressEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PropertyAddressMapper extends BaseEntityMapper<PropertyAddress, PropertyAddressEntity> {
}
