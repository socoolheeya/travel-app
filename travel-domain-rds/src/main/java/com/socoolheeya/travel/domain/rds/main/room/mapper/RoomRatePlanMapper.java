package com.socoolheeya.travel.domain.rds.main.room.mapper;

import com.socoolheeya.travel.domain.rds.main.rateplan.mapper.RatePlanMapper;
import com.socoolheeya.travel.domain.rds.main.room.domain.RoomRatePlan;
import com.socoolheeya.travel.domain.rds.main.room.entity.RoomRatePlanEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring"
        , unmappedTargetPolicy = ReportingPolicy.IGNORE
        , uses = {RoomMapper.class, RatePlanMapper.class})
public interface RoomRatePlanMapper {
    RoomRatePlan toDomain(RoomRatePlanEntity entity);
    RoomRatePlanEntity toEntity(RoomRatePlan domain);
}
