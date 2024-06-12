package com.socoolheeya.travel.domain.rds.main.booking.mapper;

import com.socoolheeya.travel.domain.rds.common.mapper.BaseEntityMapper;
import com.socoolheeya.travel.domain.rds.main.booking.domain.BookingGuest;
import com.socoolheeya.travel.domain.rds.main.booking.entity.BookingGuestEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring"
        , unmappedTargetPolicy = ReportingPolicy.IGNORE
        , uses = {BookingOccupancyMapper.class})
public interface BookingGuestMapper extends BaseEntityMapper<BookingGuest, BookingGuestEntity> {
    @Mapping(source = "entity.bookingOccupancy.id", target = "bookingOccupancyId")
    BookingGuest toDomain(BookingGuestEntity entity);

    @Mapping(source = "domain.bookingOccupancyId", target = "bookingOccupancy.id")
    BookingGuestEntity toEntity(BookingGuest domain);
}
