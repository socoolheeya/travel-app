package com.socoolheeya.travel.domain.rds.main.booking.mapper;

import com.socoolheeya.travel.domain.rds.common.mapper.BaseEntityMapper;
import com.socoolheeya.travel.domain.rds.main.booking.domain.Booking;
import com.socoolheeya.travel.domain.rds.main.booking.entity.BookingEntity;
import com.socoolheeya.travel.domain.rds.main.booking.mapper.payment.PaymentMapper;
import com.socoolheeya.travel.domain.rds.main.rate.mapper.DailyRateMapper;
import com.socoolheeya.travel.domain.rds.main.rate.mapper.ExtraRateMapper;
import com.socoolheeya.travel.domain.rds.main.rateplan.mapper.RatePlanMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE
        , uses = {RatePlanMapper.class
        , VoucherMapper.class
        , PaymentMapper.class
        , BookingOccupancyMapper.class
        , DailyRateMapper.class, ExtraRateMapper.class})
public interface BookingMapper extends BaseEntityMapper<Booking, BookingEntity> {
    @Mapping(source = "entity.ratePlan.id", target = "ratePlanId")
    @Mapping(source = "entity.voucher.id", target = "voucherId")
    @Mapping(source = "entity.payment.id", target = "paymentId")
    Booking toDomain(BookingEntity entity);

    @Mapping(source = "ratePlanId", target = "ratePlan.id")
    @Mapping(source = "voucherId", target = "voucher.id")
    @Mapping(source = "paymentId", target = "payment.id")
    BookingEntity toEntity(Booking domain);
}
