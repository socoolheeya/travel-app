package com.socoolheeya.travel.domain.rds.main.property.mapper;

import com.socoolheeya.travel.domain.rds.common.mapper.BaseEntityMapper;
import com.socoolheeya.travel.domain.rds.main.property.domain.Property;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE
        , uses = {})
public interface PropertyMapper extends BaseEntityMapper<Property, PropertyEntity> {
}
