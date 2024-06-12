package com.socoolheeya.travel.domain.rds.main.property.mapper;


import com.socoolheeya.travel.domain.rds.common.mapper.BaseEntityMapper;
import com.socoolheeya.travel.domain.rds.main.property.domain.PropertyImage;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyImageEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE
        , uses = {})
public interface PropertyImageMapper extends BaseEntityMapper<PropertyImage, PropertyImageEntity> {
}
