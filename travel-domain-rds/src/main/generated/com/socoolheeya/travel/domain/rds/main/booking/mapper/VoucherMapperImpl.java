package com.socoolheeya.travel.domain.rds.main.booking.mapper;

import com.socoolheeya.travel.domain.rds.main.booking.domain.Booking;
import com.socoolheeya.travel.domain.rds.main.booking.domain.Voucher;
import com.socoolheeya.travel.domain.rds.main.booking.entity.VoucherEntity;
import com.socoolheeya.travel.system.core.enums.RoomEnums;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class VoucherMapperImpl implements VoucherMapper {

    @Autowired
    private BookingMapper bookingMapper;

    @Override
    public Voucher toDomain(VoucherEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Long id = null;
        Integer numberOfRoom = null;
        Integer adult = null;
        Integer children = null;
        RoomEnums.RoomType roomType = null;
        Booking booking = null;

        id = entity.getId();
        numberOfRoom = entity.getNumberOfRoom();
        adult = entity.getAdult();
        children = entity.getChildren();
        roomType = entity.getRoomType();
        booking = bookingMapper.toDomain( entity.getBooking() );

        Voucher voucher = new Voucher( id, numberOfRoom, adult, children, roomType, booking );

        return voucher;
    }

    @Override
    public VoucherEntity toEntity(Voucher voucher) {
        if ( voucher == null ) {
            return null;
        }

        VoucherEntity.VoucherEntityBuilder voucherEntity = VoucherEntity.builder();

        voucherEntity.id( voucher.id() );
        voucherEntity.numberOfRoom( voucher.numberOfRoom() );
        voucherEntity.adult( voucher.adult() );
        voucherEntity.children( voucher.children() );
        voucherEntity.roomType( voucher.roomType() );
        voucherEntity.booking( bookingMapper.toEntity( voucher.booking() ) );

        return voucherEntity.build();
    }
}
