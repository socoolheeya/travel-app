package com.socoolheeya.travel.domain.rds.main.room.mapper;

import com.socoolheeya.travel.domain.rds.main.room.domain.Room;
import com.socoolheeya.travel.domain.rds.main.room.domain.RoomAmenity;
import com.socoolheeya.travel.domain.rds.main.room.domain.RoomBlock;
import com.socoolheeya.travel.domain.rds.main.room.domain.RoomEquipment;
import com.socoolheeya.travel.domain.rds.main.room.domain.RoomImage;
import com.socoolheeya.travel.domain.rds.main.room.domain.RoomOccupancy;
import com.socoolheeya.travel.domain.rds.main.room.domain.RoomRatePlan;
import com.socoolheeya.travel.domain.rds.main.room.domain.RoomService;
import com.socoolheeya.travel.domain.rds.main.room.entity.RoomAmenityEntity;
import com.socoolheeya.travel.domain.rds.main.room.entity.RoomBlockEntity;
import com.socoolheeya.travel.domain.rds.main.room.entity.RoomEntity;
import com.socoolheeya.travel.domain.rds.main.room.entity.RoomEquipmentEntity;
import com.socoolheeya.travel.domain.rds.main.room.entity.RoomImageEntity;
import com.socoolheeya.travel.domain.rds.main.room.entity.RoomOccupancyEntity;
import com.socoolheeya.travel.domain.rds.main.room.entity.RoomRatePlanEntity;
import com.socoolheeya.travel.domain.rds.main.room.entity.RoomServiceEntity;
import com.socoolheeya.travel.system.core.enums.RoomEnums;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class RoomMapperImpl implements RoomMapper {

    @Autowired
    private RoomOccupancyMapper roomOccupancyMapper;
    @Autowired
    private RoomServiceMapper roomServiceMapper;
    @Autowired
    private RoomRatePlanMapper roomRatePlanMapper;

    @Override
    public Room toDomain(RoomEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        String description = null;
        Double roomSize = null;
        RoomEnums.RoomSizeUnit roomSizeUnit = null;
        RoomEnums.View view = null;
        RoomOccupancy roomOccupancy = null;
        List<RoomService> roomServices = null;
        List<RoomRatePlan> roomRatePlans = null;

        id = entity.getId();
        name = entity.getName();
        description = entity.getDescription();
        roomSize = entity.getRoomSize();
        roomSizeUnit = entity.getRoomSizeUnit();
        view = entity.getView();
        roomOccupancy = roomOccupancyMapper.toDomain( entity.getRoomOccupancy() );
        roomServices = roomServiceEntityListToRoomServiceList( entity.getRoomServices() );
        roomRatePlans = roomRatePlanEntityListToRoomRatePlanList( entity.getRoomRatePlans() );

        boolean isSameDayBooking = false;
        boolean isEnabled = false;
        List<RoomAmenity> roomAmenities = null;
        List<RoomEquipment> roomEquipments = null;
        List<RoomImage> roomImages = null;
        List<RoomBlock> roomBlocks = null;

        Room room = new Room( id, name, description, roomSize, roomSizeUnit, view, isSameDayBooking, isEnabled, roomOccupancy, roomAmenities, roomEquipments, roomServices, roomImages, roomRatePlans, roomBlocks );

        return room;
    }

    @Override
    public RoomEntity toEntity(Room domain) {
        if ( domain == null ) {
            return null;
        }

        List<RoomServiceEntity> roomServices = null;
        List<RoomRatePlanEntity> roomRatePlans = null;
        Long id = null;
        String name = null;
        String description = null;
        Double roomSize = null;
        RoomEnums.RoomSizeUnit roomSizeUnit = null;
        RoomEnums.View view = null;
        boolean isSameDayBooking = false;
        boolean isEnabled = false;
        RoomOccupancyEntity roomOccupancy = null;

        roomServices = roomServiceListToRoomServiceEntityList( domain.roomServices() );
        roomRatePlans = roomRatePlanListToRoomRatePlanEntityList( domain.roomRatePlans() );
        id = domain.id();
        name = domain.name();
        description = domain.description();
        roomSize = domain.roomSize();
        roomSizeUnit = domain.roomSizeUnit();
        view = domain.view();
        isSameDayBooking = domain.isSameDayBooking();
        isEnabled = domain.isEnabled();
        roomOccupancy = roomOccupancyMapper.toEntity( domain.roomOccupancy() );

        List<RoomAmenityEntity> amenities = null;
        List<RoomEquipmentEntity> equipments = null;
        List<RoomImageEntity> images = null;
        List<RoomBlockEntity> blocks = null;

        RoomEntity roomEntity = new RoomEntity( id, name, description, roomSize, roomSizeUnit, view, isSameDayBooking, isEnabled, roomOccupancy, amenities, equipments, roomServices, images, roomRatePlans, blocks );

        return roomEntity;
    }

    protected List<RoomService> roomServiceEntityListToRoomServiceList(List<RoomServiceEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<RoomService> list1 = new ArrayList<RoomService>( list.size() );
        for ( RoomServiceEntity roomServiceEntity : list ) {
            list1.add( roomServiceMapper.toDomain( roomServiceEntity ) );
        }

        return list1;
    }

    protected List<RoomRatePlan> roomRatePlanEntityListToRoomRatePlanList(List<RoomRatePlanEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<RoomRatePlan> list1 = new ArrayList<RoomRatePlan>( list.size() );
        for ( RoomRatePlanEntity roomRatePlanEntity : list ) {
            list1.add( roomRatePlanMapper.toDomain( roomRatePlanEntity ) );
        }

        return list1;
    }

    protected List<RoomServiceEntity> roomServiceListToRoomServiceEntityList(List<RoomService> list) {
        if ( list == null ) {
            return null;
        }

        List<RoomServiceEntity> list1 = new ArrayList<RoomServiceEntity>( list.size() );
        for ( RoomService roomService : list ) {
            list1.add( roomServiceMapper.toEntity( roomService ) );
        }

        return list1;
    }

    protected List<RoomRatePlanEntity> roomRatePlanListToRoomRatePlanEntityList(List<RoomRatePlan> list) {
        if ( list == null ) {
            return null;
        }

        List<RoomRatePlanEntity> list1 = new ArrayList<RoomRatePlanEntity>( list.size() );
        for ( RoomRatePlan roomRatePlan : list ) {
            list1.add( roomRatePlanMapper.toEntity( roomRatePlan ) );
        }

        return list1;
    }
}
