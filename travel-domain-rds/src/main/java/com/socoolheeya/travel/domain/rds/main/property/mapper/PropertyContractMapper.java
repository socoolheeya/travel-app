package com.socoolheeya.travel.domain.rds.main.property.mapper;

import com.socoolheeya.travel.domain.rds.common.mapper.BaseEntityMapper;
import com.socoolheeya.travel.domain.rds.main.property.domain.PropertyContract;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyContractEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PropertyContractMapper extends BaseEntityMapper<PropertyContract, PropertyContractEntity> {
}
