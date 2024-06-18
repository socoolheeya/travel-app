package com.socoolheeya.travel.domain.rds.main.booking.mapper;

import com.socoolheeya.travel.domain.rds.main.booking.domain.Booking;
import com.socoolheeya.travel.domain.rds.main.booking.domain.BookingOccupancy;
import com.socoolheeya.travel.domain.rds.main.booking.entity.BookingEntity;
import com.socoolheeya.travel.domain.rds.main.booking.entity.BookingOccupancyEntity;
import com.socoolheeya.travel.domain.rds.main.booking.entity.VoucherEntity;
import com.socoolheeya.travel.domain.rds.main.booking.entity.payment.PaymentEntity;
import com.socoolheeya.travel.domain.rds.main.booking.enums.BookingEnums;
import com.socoolheeya.travel.domain.rds.main.rateplan.entity.RatePlanEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class BookingMapperImpl implements BookingMapper {

    @Autowired
    private BookingOccupancyMapper bookingOccupancyMapper;

    @Override
    public Booking toDomain(BookingEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Long ratePlanId = null;
        Long voucherId = null;
        Long paymentId = null;
        Long id = null;
        BookingEnums.Status bookingStatus = null;
        String refBookingNo = null;
        List<BookingOccupancy> bookingOccupancies = null;

        ratePlanId = entityRatePlanId( entity );
        voucherId = entityVoucherId( entity );
        paymentId = entityPaymentId( entity );
        id = entity.getId();
        bookingStatus = entity.getBookingStatus();
        refBookingNo = entity.getRefBookingNo();
        bookingOccupancies = bookingOccupancyEntityListToBookingOccupancyList( entity.getBookingOccupancies() );

        Booking booking = new Booking( id, bookingStatus, refBookingNo, ratePlanId, voucherId, paymentId, bookingOccupancies );

        return booking;
    }

    @Override
    public BookingEntity toEntity(Booking domain) {
        if ( domain == null ) {
            return null;
        }

        BookingEntity.BookingEntityBuilder bookingEntity = BookingEntity.builder();

        bookingEntity.ratePlan( bookingToRatePlanEntity( domain ) );
        bookingEntity.voucher( bookingToVoucherEntity( domain ) );
        bookingEntity.payment( bookingToPaymentEntity( domain ) );
        bookingEntity.id( domain.id() );
        bookingEntity.bookingStatus( domain.bookingStatus() );
        bookingEntity.refBookingNo( domain.refBookingNo() );

        return bookingEntity.build();
    }

    private Long entityRatePlanId(BookingEntity bookingEntity) {
        if ( bookingEntity == null ) {
            return null;
        }
        RatePlanEntity ratePlan = bookingEntity.getRatePlan();
        if ( ratePlan == null ) {
            return null;
        }
        Long id = ratePlan.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityVoucherId(BookingEntity bookingEntity) {
        if ( bookingEntity == null ) {
            return null;
        }
        VoucherEntity voucher = bookingEntity.getVoucher();
        if ( voucher == null ) {
            return null;
        }
        Long id = voucher.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityPaymentId(BookingEntity bookingEntity) {
        if ( bookingEntity == null ) {
            return null;
        }
        PaymentEntity payment = bookingEntity.getPayment();
        if ( payment == null ) {
            return null;
        }
        Long id = payment.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected List<BookingOccupancy> bookingOccupancyEntityListToBookingOccupancyList(List<BookingOccupancyEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<BookingOccupancy> list1 = new ArrayList<BookingOccupancy>( list.size() );
        for ( BookingOccupancyEntity bookingOccupancyEntity : list ) {
            list1.add( bookingOccupancyMapper.toDomain( bookingOccupancyEntity ) );
        }

        return list1;
    }

    protected RatePlanEntity bookingToRatePlanEntity(Booking booking) {
        if ( booking == null ) {
            return null;
        }

        RatePlanEntity.RatePlanEntityBuilder ratePlanEntity = RatePlanEntity.builder();

        ratePlanEntity.id( booking.ratePlanId() );

        return ratePlanEntity.build();
    }

    protected VoucherEntity bookingToVoucherEntity(Booking booking) {
        if ( booking == null ) {
            return null;
        }

        VoucherEntity.VoucherEntityBuilder voucherEntity = VoucherEntity.builder();

        voucherEntity.id( booking.voucherId() );

        return voucherEntity.build();
    }

    protected PaymentEntity bookingToPaymentEntity(Booking booking) {
        if ( booking == null ) {
            return null;
        }

        PaymentEntity.PaymentEntityBuilder paymentEntity = PaymentEntity.builder();

        paymentEntity.id( booking.paymentId() );

        return paymentEntity.build();
    }
}
