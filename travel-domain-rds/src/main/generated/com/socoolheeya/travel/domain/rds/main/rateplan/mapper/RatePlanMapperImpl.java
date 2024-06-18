package com.socoolheeya.travel.domain.rds.main.rateplan.mapper;

import com.socoolheeya.travel.domain.rds.main.booking.domain.Booking;
import com.socoolheeya.travel.domain.rds.main.booking.mapper.BookingMapper;
import com.socoolheeya.travel.domain.rds.main.rate.domain.Rate;
import com.socoolheeya.travel.domain.rds.main.rate.entity.RateEntity;
import com.socoolheeya.travel.domain.rds.main.rate.mapper.RateMapper;
import com.socoolheeya.travel.domain.rds.main.rateplan.domain.CancelPolicy;
import com.socoolheeya.travel.domain.rds.main.rateplan.domain.MealPlan;
import com.socoolheeya.travel.domain.rds.main.rateplan.domain.RatePlan;
import com.socoolheeya.travel.domain.rds.main.rateplan.domain.RatePlanCoupon;
import com.socoolheeya.travel.domain.rds.main.rateplan.entity.RatePlanCouponEntity;
import com.socoolheeya.travel.domain.rds.main.rateplan.entity.RatePlanEntity;
import com.socoolheeya.travel.domain.rds.main.room.domain.RoomRatePlan;
import com.socoolheeya.travel.domain.rds.main.room.entity.RoomRatePlanEntity;
import com.socoolheeya.travel.domain.rds.main.room.mapper.RoomRatePlanMapper;
import com.socoolheeya.travel.system.core.enums.RatePlanEnums;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class RatePlanMapperImpl implements RatePlanMapper {

    @Autowired
    private RoomRatePlanMapper roomRatePlanMapper;
    @Autowired
    private RateMapper rateMapper;
    @Autowired
    private RatePlanCouponMapper ratePlanCouponMapper;
    @Autowired
    private CancelPolicyMapper cancelPolicyMapper;
    @Autowired
    private BookingMapper bookingMapper;

    @Override
    public RatePlan toDomain(RatePlanEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        LocalTime checkinTime = null;
        LocalTime checkoutTime = null;
        RatePlanEnums.RateClassification rateClassification = null;
        Integer minStay = null;
        Integer maxStay = null;
        RatePlanEnums.Status status = null;
        List<RoomRatePlan> roomRatePlans = null;
        List<Rate> rates = null;
        List<RatePlanCoupon> ratePlanCoupons = null;
        CancelPolicy cancelPolicy = null;
        Booking booking = null;

        id = entity.getId();
        name = entity.getName();
        checkinTime = entity.getCheckinTime();
        checkoutTime = entity.getCheckoutTime();
        rateClassification = entity.getRateClassification();
        minStay = entity.getMinStay();
        maxStay = entity.getMaxStay();
        status = entity.getStatus();
        roomRatePlans = roomRatePlanEntityListToRoomRatePlanList( entity.getRoomRatePlans() );
        rates = rateEntityListToRateList( entity.getRates() );
        ratePlanCoupons = ratePlanCouponEntityListToRatePlanCouponList( entity.getRatePlanCoupons() );
        cancelPolicy = cancelPolicyMapper.toDomain( entity.getCancelPolicy() );
        booking = bookingMapper.toDomain( entity.getBooking() );

        boolean isEarlyCheckin = false;
        boolean isSmoking = false;
        MealPlan mealPlans = null;

        RatePlan ratePlan = new RatePlan( id, name, checkinTime, checkoutTime, rateClassification, isEarlyCheckin, isSmoking, minStay, maxStay, status, roomRatePlans, rates, ratePlanCoupons, cancelPolicy, mealPlans, booking );

        return ratePlan;
    }

    @Override
    public RatePlanEntity toEntity(RatePlan domain) {
        if ( domain == null ) {
            return null;
        }

        RatePlanEntity.RatePlanEntityBuilder ratePlanEntity = RatePlanEntity.builder();

        ratePlanEntity.id( domain.id() );
        ratePlanEntity.name( domain.name() );
        ratePlanEntity.rateClassification( domain.rateClassification() );
        ratePlanEntity.checkinTime( domain.checkinTime() );
        ratePlanEntity.checkoutTime( domain.checkoutTime() );
        ratePlanEntity.isEarlyCheckin( domain.isEarlyCheckin() );
        ratePlanEntity.isSmoking( domain.isSmoking() );
        ratePlanEntity.minStay( domain.minStay() );
        ratePlanEntity.maxStay( domain.maxStay() );
        ratePlanEntity.status( domain.status() );

        return ratePlanEntity.build();
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

    protected List<Rate> rateEntityListToRateList(List<RateEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<Rate> list1 = new ArrayList<Rate>( list.size() );
        for ( RateEntity rateEntity : list ) {
            list1.add( rateMapper.toDomain( rateEntity ) );
        }

        return list1;
    }

    protected List<RatePlanCoupon> ratePlanCouponEntityListToRatePlanCouponList(List<RatePlanCouponEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<RatePlanCoupon> list1 = new ArrayList<RatePlanCoupon>( list.size() );
        for ( RatePlanCouponEntity ratePlanCouponEntity : list ) {
            list1.add( ratePlanCouponMapper.toDomain( ratePlanCouponEntity ) );
        }

        return list1;
    }
}
