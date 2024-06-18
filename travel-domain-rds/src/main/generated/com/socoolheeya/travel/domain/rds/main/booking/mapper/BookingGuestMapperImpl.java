package com.socoolheeya.travel.domain.rds.main.booking.mapper;

import com.socoolheeya.travel.domain.rds.main.booking.domain.BookingGuest;
import com.socoolheeya.travel.domain.rds.main.booking.entity.BookingGuestEntity;
import com.socoolheeya.travel.domain.rds.main.booking.entity.BookingOccupancyEntity;
import com.socoolheeya.travel.domain.rds.main.booking.enums.BookingEnums;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class BookingGuestMapperImpl implements BookingGuestMapper {

    @Override
    public BookingGuest toDomain(BookingGuestEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Long bookingOccupancyId = null;
        Long id = null;
        String name = null;
        Integer age = null;
        String phone = null;
        BookingEnums.Gender gender = null;
        Boolean isMainHolder = null;

        bookingOccupancyId = entityBookingOccupancyId( entity );
        id = entity.getId();
        name = entity.getName();
        age = entity.getAge();
        phone = entity.getPhone();
        gender = entity.getGender();
        isMainHolder = entity.getIsMainHolder();

        BookingGuest bookingGuest = new BookingGuest( id, name, age, phone, gender, isMainHolder, bookingOccupancyId );

        return bookingGuest;
    }

    @Override
    public BookingGuestEntity toEntity(BookingGuest domain) {
        if ( domain == null ) {
            return null;
        }

        BookingGuestEntity.BookingGuestEntityBuilder bookingGuestEntity = BookingGuestEntity.builder();

        bookingGuestEntity.bookingOccupancy( bookingGuestToBookingOccupancyEntity( domain ) );
        bookingGuestEntity.id( domain.id() );
        bookingGuestEntity.name( domain.name() );
        bookingGuestEntity.age( domain.age() );
        bookingGuestEntity.phone( domain.phone() );
        bookingGuestEntity.gender( domain.gender() );
        bookingGuestEntity.isMainHolder( domain.isMainHolder() );

        return bookingGuestEntity.build();
    }

    private Long entityBookingOccupancyId(BookingGuestEntity bookingGuestEntity) {
        if ( bookingGuestEntity == null ) {
            return null;
        }
        BookingOccupancyEntity bookingOccupancy = bookingGuestEntity.getBookingOccupancy();
        if ( bookingOccupancy == null ) {
            return null;
        }
        Long id = bookingOccupancy.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected BookingOccupancyEntity bookingGuestToBookingOccupancyEntity(BookingGuest bookingGuest) {
        if ( bookingGuest == null ) {
            return null;
        }

        BookingOccupancyEntity.BookingOccupancyEntityBuilder bookingOccupancyEntity = BookingOccupancyEntity.builder();

        bookingOccupancyEntity.id( bookingGuest.bookingOccupancyId() );

        return bookingOccupancyEntity.build();
    }
}
