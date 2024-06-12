package com.socoolheeya.travel.domain.rds.main.room.mapper;

import com.socoolheeya.travel.domain.rds.common.mapper.BaseEntityMapper;
import com.socoolheeya.travel.domain.rds.main.room.domain.RoomEquipment;
import com.socoolheeya.travel.domain.rds.main.room.entity.RoomEquipmentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE
        , uses = {RoomMapper.class})
public interface RoomEquipmentMapper extends BaseEntityMapper<RoomEquipment, RoomEquipmentEntity> {
}
