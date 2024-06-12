package com.socoolheeya.travel.domain.rds.main.property.mapper;

import com.socoolheeya.travel.domain.rds.common.mapper.BaseEntityMapper;
import com.socoolheeya.travel.domain.rds.main.property.domain.PropertyHistory;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyHistoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE
        , uses = {})
public interface PropertyHistoryMapper extends BaseEntityMapper<PropertyHistory, PropertyHistoryEntity> {
}
