package com.socoolheeya.travel.domain.rds.main.property.mapper;

import com.socoolheeya.travel.domain.rds.common.mapper.BaseEntityMapper;
import com.socoolheeya.travel.domain.rds.main.property.domain.PropertyMapInformation;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyMapInformationEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PropertyMapInformationMapper extends BaseEntityMapper<PropertyMapInformation, PropertyMapInformationEntity> {
}
