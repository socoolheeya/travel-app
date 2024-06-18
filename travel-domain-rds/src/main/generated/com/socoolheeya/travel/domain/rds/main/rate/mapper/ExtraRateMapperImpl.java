package com.socoolheeya.travel.domain.rds.main.rate.mapper;

import com.socoolheeya.travel.domain.rds.main.rate.domain.ExtraRate;
import com.socoolheeya.travel.domain.rds.main.rate.entity.ExtraRateEntity;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class ExtraRateMapperImpl implements ExtraRateMapper {

    @Override
    public ExtraRate toDomain(ExtraRateEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        BigDecimal adultPrice = null;
        BigDecimal childPrice = null;
        BigDecimal excessAmount = null;

        id = entity.getId();
        name = entity.getName();
        adultPrice = entity.getAdultPrice();
        childPrice = entity.getChildPrice();
        excessAmount = entity.getExcessAmount();

        Long rateId = null;

        ExtraRate extraRate = new ExtraRate( id, name, adultPrice, childPrice, excessAmount, rateId );

        return extraRate;
    }

    @Override
    public ExtraRateEntity toEntity(ExtraRate domain) {
        if ( domain == null ) {
            return null;
        }

        ExtraRateEntity.ExtraRateEntityBuilder extraRateEntity = ExtraRateEntity.builder();

        extraRateEntity.id( domain.id() );
        extraRateEntity.name( domain.name() );
        extraRateEntity.adultPrice( domain.adultPrice() );
        extraRateEntity.childPrice( domain.childPrice() );
        extraRateEntity.excessAmount( domain.excessAmount() );

        return extraRateEntity.build();
    }
}
