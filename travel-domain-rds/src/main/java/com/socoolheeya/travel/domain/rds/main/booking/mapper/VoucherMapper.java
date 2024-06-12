package com.socoolheeya.travel.domain.rds.main.booking.mapper;

import com.socoolheeya.travel.domain.rds.common.mapper.BaseEntityMapper;
import com.socoolheeya.travel.domain.rds.main.booking.domain.Voucher;
import com.socoolheeya.travel.domain.rds.main.booking.entity.VoucherEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE
        , uses = {BookingMapper.class})
public interface VoucherMapper extends BaseEntityMapper<Voucher, VoucherEntity> {
    Voucher toDomain(VoucherEntity entity);
    VoucherEntity toEntity(Voucher voucher);
}
