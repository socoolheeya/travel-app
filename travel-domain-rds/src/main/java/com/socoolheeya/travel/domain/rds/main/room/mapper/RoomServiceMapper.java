package com.socoolheeya.travel.domain.rds.main.room.mapper;

import com.socoolheeya.travel.domain.rds.main.room.domain.RoomService;
import com.socoolheeya.travel.domain.rds.main.room.entity.RoomServiceEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring"
        , unmappedTargetPolicy = ReportingPolicy.IGNORE
        , uses = {RoomMapper.class})
public interface RoomServiceMapper {
    RoomService toDomain(RoomServiceEntity entity);
    RoomServiceEntity toEntity(RoomService domain);
}
