package com.socoolheeya.travel.domain.rds.main.booking.mapper;

import com.socoolheeya.travel.domain.rds.common.mapper.BaseEntityMapper;
import com.socoolheeya.travel.domain.rds.main.booking.domain.BookingFax;
import com.socoolheeya.travel.domain.rds.main.booking.entity.BookingFaxEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE
        , uses = {BookingMapper.class})
public interface BookingFaxMapper extends BaseEntityMapper<BookingFax, BookingFaxEntity> {

    @Mapping(source = "entity.booking.id", target = "bookingId")
    BookingFax toDomain(BookingFaxEntity entity);

    @Mapping(source = "domain.bookingId", target = "booking.id")
    BookingFaxEntity toEntity(BookingFax domain);
}
