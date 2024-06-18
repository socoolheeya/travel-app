package com.socoolheeya.travel.domain.rds.main.rate.mapper;

import com.socoolheeya.travel.domain.rds.main.rate.domain.DailyRate;
import com.socoolheeya.travel.domain.rds.main.rate.entity.DailyRateEntity;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class DailyRateMapperImpl implements DailyRateMapper {

    @Override
    public DailyRate toDomain(DailyRateEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Long id = null;
        LocalDate salesDay = null;
        BigDecimal originPrice = null;
        BigDecimal sellingPrice = null;
        BigDecimal depositPrice = null;
        BigDecimal commission = null;
        BigDecimal commissionFee = null;

        id = entity.getId();
        salesDay = entity.getSalesDay();
        originPrice = entity.getOriginPrice();
        sellingPrice = entity.getSellingPrice();
        depositPrice = entity.getDepositPrice();
        commission = entity.getCommission();
        commissionFee = entity.getCommissionFee();

        Long rateId = null;

        DailyRate dailyRate = new DailyRate( id, salesDay, originPrice, sellingPrice, depositPrice, commission, commissionFee, rateId );

        return dailyRate;
    }

    @Override
    public DailyRateEntity toEntity(DailyRate domain) {
        if ( domain == null ) {
            return null;
        }

        DailyRateEntity.DailyRateEntityBuilder dailyRateEntity = DailyRateEntity.builder();

        dailyRateEntity.id( domain.id() );
        dailyRateEntity.salesDay( domain.salesDay() );
        dailyRateEntity.originPrice( domain.originPrice() );
        dailyRateEntity.sellingPrice( domain.sellingPrice() );
        dailyRateEntity.depositPrice( domain.depositPrice() );
        dailyRateEntity.commission( domain.commission() );
        dailyRateEntity.commissionFee( domain.commissionFee() );

        return dailyRateEntity.build();
    }
}
