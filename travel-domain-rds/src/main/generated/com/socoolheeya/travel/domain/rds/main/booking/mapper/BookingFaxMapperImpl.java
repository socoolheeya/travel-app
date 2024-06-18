package com.socoolheeya.travel.domain.rds.main.booking.mapper;

import com.socoolheeya.travel.domain.rds.main.booking.domain.BookingFax;
import com.socoolheeya.travel.domain.rds.main.booking.entity.BookingEntity;
import com.socoolheeya.travel.domain.rds.main.booking.entity.BookingFaxEntity;
import com.socoolheeya.travel.domain.rds.main.booking.enums.BookingEnums;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class BookingFaxMapperImpl implements BookingFaxMapper {

    @Override
    public BookingFax toDomain(BookingFaxEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Long bookingId = null;
        Long id = null;
        BookingEnums.FaxStatus status = null;

        bookingId = entityBookingId( entity );
        id = entity.getId();
        status = entity.getStatus();

        BookingFax bookingFax = new BookingFax( id, status, bookingId );

        return bookingFax;
    }

    @Override
    public BookingFaxEntity toEntity(BookingFax domain) {
        if ( domain == null ) {
            return null;
        }

        BookingFaxEntity.BookingFaxEntityBuilder bookingFaxEntity = BookingFaxEntity.builder();

        bookingFaxEntity.booking( bookingFaxToBookingEntity( domain ) );
        bookingFaxEntity.id( domain.id() );
        bookingFaxEntity.status( domain.status() );

        return bookingFaxEntity.build();
    }

    private Long entityBookingId(BookingFaxEntity bookingFaxEntity) {
        if ( bookingFaxEntity == null ) {
            return null;
        }
        BookingEntity booking = bookingFaxEntity.getBooking();
        if ( booking == null ) {
            return null;
        }
        Long id = booking.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected BookingEntity bookingFaxToBookingEntity(BookingFax bookingFax) {
        if ( bookingFax == null ) {
            return null;
        }

        BookingEntity.BookingEntityBuilder bookingEntity = BookingEntity.builder();

        bookingEntity.id( bookingFax.bookingId() );

        return bookingEntity.build();
    }
}
