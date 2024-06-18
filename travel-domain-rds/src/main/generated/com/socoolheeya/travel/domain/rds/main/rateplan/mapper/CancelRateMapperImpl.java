package com.socoolheeya.travel.domain.rds.main.rateplan.mapper;

import com.socoolheeya.travel.domain.rds.main.rateplan.domain.CancelRate;
import com.socoolheeya.travel.domain.rds.main.rateplan.entity.CancelPolicyEntity;
import com.socoolheeya.travel.domain.rds.main.rateplan.entity.CancelRateEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class CancelRateMapperImpl implements CancelRateMapper {

    @Override
    public CancelRate toDomain(CancelRateEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Long cancelPolicyId = null;
        Long id = null;
        Integer offset = null;
        Integer rate = null;

        cancelPolicyId = entityCancelPolicyId( entity );
        id = entity.getId();
        offset = entity.getOffset();
        rate = entity.getRate();

        CancelRate cancelRate = new CancelRate( id, offset, rate, cancelPolicyId );

        return cancelRate;
    }

    @Override
    public CancelRateEntity toEntity(CancelRate domain) {
        if ( domain == null ) {
            return null;
        }

        CancelRateEntity.CancelRateEntityBuilder cancelRateEntity = CancelRateEntity.builder();

        cancelRateEntity.cancelPolicy( cancelRateToCancelPolicyEntity( domain ) );
        cancelRateEntity.id( domain.id() );
        cancelRateEntity.offset( domain.offset() );
        cancelRateEntity.rate( domain.rate() );

        return cancelRateEntity.build();
    }

    private Long entityCancelPolicyId(CancelRateEntity cancelRateEntity) {
        if ( cancelRateEntity == null ) {
            return null;
        }
        CancelPolicyEntity cancelPolicy = cancelRateEntity.getCancelPolicy();
        if ( cancelPolicy == null ) {
            return null;
        }
        Long id = cancelPolicy.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected CancelPolicyEntity cancelRateToCancelPolicyEntity(CancelRate cancelRate) {
        if ( cancelRate == null ) {
            return null;
        }

        CancelPolicyEntity.CancelPolicyEntityBuilder cancelPolicyEntity = CancelPolicyEntity.builder();

        cancelPolicyEntity.id( cancelRate.cancelPolicyId() );

        return cancelPolicyEntity.build();
    }
}
