package com.socoolheeya.travel.domain.rds.main.room.mapper;

import com.socoolheeya.travel.domain.rds.main.room.domain.RoomOccupancy;
import com.socoolheeya.travel.domain.rds.main.room.entity.RoomOccupancyEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring"
        , unmappedTargetPolicy = ReportingPolicy.IGNORE
        , uses = {RoomMapper.class})
public interface RoomOccupancyMapper {
    RoomOccupancy toDomain(RoomOccupancyEntity entity);
    RoomOccupancyEntity toEntity(RoomOccupancy domain);
}
