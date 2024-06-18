package com.socoolheeya.travel.domain.rds.main.booking.mapper;

import com.socoolheeya.travel.domain.rds.main.booking.domain.BookingGuest;
import com.socoolheeya.travel.domain.rds.main.booking.domain.BookingOccupancy;
import com.socoolheeya.travel.domain.rds.main.booking.entity.BookingEntity;
import com.socoolheeya.travel.domain.rds.main.booking.entity.BookingGuestEntity;
import com.socoolheeya.travel.domain.rds.main.booking.entity.BookingOccupancyEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class BookingOccupancyMapperImpl implements BookingOccupancyMapper {

    @Autowired
    private BookingGuestMapper bookingGuestMapper;

    @Override
    public BookingOccupancy toDomain(BookingOccupancyEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Long bookingId = null;
        Long id = null;
        Integer totalAdults = null;
        Integer totalChildren = null;
        List<BookingGuest> bookingGuests = null;

        bookingId = entityBookingId( entity );
        id = entity.getId();
        totalAdults = entity.getTotalAdults();
        totalChildren = entity.getTotalChildren();
        bookingGuests = bookingGuestEntityListToBookingGuestList( entity.getBookingGuests() );

        BookingOccupancy bookingOccupancy = new BookingOccupancy( id, totalAdults, totalChildren, bookingGuests, bookingId );

        return bookingOccupancy;
    }

    @Override
    public BookingOccupancyEntity toEntity(BookingOccupancy domain) {
        if ( domain == null ) {
            return null;
        }

        BookingOccupancyEntity.BookingOccupancyEntityBuilder bookingOccupancyEntity = BookingOccupancyEntity.builder();

        bookingOccupancyEntity.booking( bookingOccupancyToBookingEntity( domain ) );
        bookingOccupancyEntity.id( domain.id() );
        bookingOccupancyEntity.totalAdults( domain.totalAdults() );
        bookingOccupancyEntity.totalChildren( domain.totalChildren() );

        return bookingOccupancyEntity.build();
    }

    private Long entityBookingId(BookingOccupancyEntity bookingOccupancyEntity) {
        if ( bookingOccupancyEntity == null ) {
            return null;
        }
        BookingEntity booking = bookingOccupancyEntity.getBooking();
        if ( booking == null ) {
            return null;
        }
        Long id = booking.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected List<BookingGuest> bookingGuestEntityListToBookingGuestList(List<BookingGuestEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<BookingGuest> list1 = new ArrayList<BookingGuest>( list.size() );
        for ( BookingGuestEntity bookingGuestEntity : list ) {
            list1.add( bookingGuestMapper.toDomain( bookingGuestEntity ) );
        }

        return list1;
    }

    protected BookingEntity bookingOccupancyToBookingEntity(BookingOccupancy bookingOccupancy) {
        if ( bookingOccupancy == null ) {
            return null;
        }

        BookingEntity.BookingEntityBuilder bookingEntity = BookingEntity.builder();

        bookingEntity.id( bookingOccupancy.bookingId() );

        return bookingEntity.build();
    }
}
