package com.socoolheeya.travel.domain.rds.main.room.mapper;

import com.socoolheeya.travel.domain.rds.common.mapper.BaseEntityMapper;
import com.socoolheeya.travel.domain.rds.main.room.domain.Room;
import com.socoolheeya.travel.domain.rds.main.room.entity.RoomEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE
        , uses = {RoomOccupancyMapper.class
        , RoomBlockMapper.class
        , RoomAmenityMapper.class
        , RoomEquipmentMapper.class
        , RoomServiceMapper.class
        , RoomImageMapper.class
        , RoomRatePlanMapper.class})
public interface RoomMapper extends BaseEntityMapper<Room, RoomEntity> {
}
