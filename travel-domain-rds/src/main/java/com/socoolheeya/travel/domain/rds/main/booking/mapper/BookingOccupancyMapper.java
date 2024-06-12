package com.socoolheeya.travel.domain.rds.main.booking.mapper;

import com.socoolheeya.travel.domain.rds.common.mapper.BaseEntityMapper;
import com.socoolheeya.travel.domain.rds.main.booking.domain.BookingOccupancy;
import com.socoolheeya.travel.domain.rds.main.booking.entity.BookingOccupancyEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring"
        , unmappedTargetPolicy = ReportingPolicy.IGNORE
        , uses = {BookingGuestMapper.class, BookingMapper.class})
public interface BookingOccupancyMapper extends BaseEntityMapper<BookingOccupancy, BookingOccupancyEntity> {
    @Mapping(source = "entity.booking.id", target = "bookingId")
    BookingOccupancy toDomain(BookingOccupancyEntity entity);

    @Mapping(source = "domain.bookingId", target = "booking.id")
    BookingOccupancyEntity toEntity(BookingOccupancy domain);
}
