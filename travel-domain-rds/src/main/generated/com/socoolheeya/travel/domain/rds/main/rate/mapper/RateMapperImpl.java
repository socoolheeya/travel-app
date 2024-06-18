package com.socoolheeya.travel.domain.rds.main.rate.mapper;

import com.socoolheeya.travel.domain.rds.main.rate.domain.DailyRate;
import com.socoolheeya.travel.domain.rds.main.rate.domain.ExtraRate;
import com.socoolheeya.travel.domain.rds.main.rate.domain.Rate;
import com.socoolheeya.travel.domain.rds.main.rate.entity.DailyRateEntity;
import com.socoolheeya.travel.domain.rds.main.rate.entity.ExtraRateEntity;
import com.socoolheeya.travel.domain.rds.main.rate.entity.RateEntity;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class RateMapperImpl implements RateMapper {

    @Autowired
    private DailyRateMapper dailyRateMapper;
    @Autowired
    private ExtraRateMapper extraRateMapper;

    @Override
    public Rate toDomain(RateEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Long id = null;
        BigDecimal totalPrice = null;
        BigDecimal netPrice = null;
        List<ExtraRate> extraRates = null;
        List<DailyRate> dailyRates = null;

        id = entity.getId();
        totalPrice = entity.getTotalPrice();
        netPrice = entity.getNetPrice();
        extraRates = extraRateEntityListToExtraRateList( entity.getExtraRates() );
        dailyRates = dailyRateEntityListToDailyRateList( entity.getDailyRates() );

        Long ratePlanId = null;

        Rate rate = new Rate( id, totalPrice, netPrice, ratePlanId, extraRates, dailyRates );

        return rate;
    }

    @Override
    public RateEntity toEntity(Rate domain) {
        if ( domain == null ) {
            return null;
        }

        RateEntity.RateEntityBuilder rateEntity = RateEntity.builder();

        rateEntity.id( domain.id() );
        rateEntity.totalPrice( domain.totalPrice() );
        rateEntity.netPrice( domain.netPrice() );

        return rateEntity.build();
    }

    protected List<ExtraRate> extraRateEntityListToExtraRateList(List<ExtraRateEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<ExtraRate> list1 = new ArrayList<ExtraRate>( list.size() );
        for ( ExtraRateEntity extraRateEntity : list ) {
            list1.add( extraRateMapper.toDomain( extraRateEntity ) );
        }

        return list1;
    }

    protected List<DailyRate> dailyRateEntityListToDailyRateList(List<DailyRateEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<DailyRate> list1 = new ArrayList<DailyRate>( list.size() );
        for ( DailyRateEntity dailyRateEntity : list ) {
            list1.add( dailyRateMapper.toDomain( dailyRateEntity ) );
        }

        return list1;
    }
}
