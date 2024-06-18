package com.socoolheeya.travel.domain.rds.main.rateplan.mapper;

import com.socoolheeya.travel.domain.rds.main.rateplan.domain.CancelPolicy;
import com.socoolheeya.travel.domain.rds.main.rateplan.domain.CancelRate;
import com.socoolheeya.travel.domain.rds.main.rateplan.entity.CancelPolicyEntity;
import com.socoolheeya.travel.domain.rds.main.rateplan.entity.CancelRateEntity;
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
public class CancelPolicyMapperImpl implements CancelPolicyMapper {

    @Autowired
    private CancelRateMapper cancelRateMapper;

    @Override
    public CancelPolicy toDomain(CancelPolicyEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Long ratePlanId = null;
        Long id = null;
        Boolean isCancel = null;
        String description = null;
        List<CancelRate> cancelRates = null;

        ratePlanId = entityRatePlanId( entity );
        id = entity.getId();
        isCancel = entity.getIsCancel();
        description = entity.getDescription();
        cancelRates = cancelRateEntityListToCancelRateList( entity.getCancelRates() );

        CancelPolicy cancelPolicy = new CancelPolicy( id, isCancel, description, cancelRates, ratePlanId );

        return cancelPolicy;
    }

    @Override
    public CancelPolicyEntity toEntity(CancelPolicy domain) {
        if ( domain == null ) {
            return null;
        }

        CancelPolicyEntity.CancelPolicyEntityBuilder cancelPolicyEntity = CancelPolicyEntity.builder();

        cancelPolicyEntity.ratePlan( cancelPolicyToRatePlanEntity( domain ) );
        cancelPolicyEntity.id( domain.id() );
        cancelPolicyEntity.isCancel( domain.isCancel() );
        cancelPolicyEntity.description( domain.description() );
        cancelPolicyEntity.cancelRates( cancelRateListToCancelRateEntityList( domain.cancelRates() ) );

        return cancelPolicyEntity.build();
    }

    private Long entityRatePlanId(CancelPolicyEntity cancelPolicyEntity) {
        if ( cancelPolicyEntity == null ) {
            return null;
        }
        RatePlanEntity ratePlan = cancelPolicyEntity.getRatePlan();
        if ( ratePlan == null ) {
            return null;
        }
        Long id = ratePlan.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected List<CancelRate> cancelRateEntityListToCancelRateList(List<CancelRateEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<CancelRate> list1 = new ArrayList<CancelRate>( list.size() );
        for ( CancelRateEntity cancelRateEntity : list ) {
            list1.add( cancelRateMapper.toDomain( cancelRateEntity ) );
        }

        return list1;
    }

    protected RatePlanEntity cancelPolicyToRatePlanEntity(CancelPolicy cancelPolicy) {
        if ( cancelPolicy == null ) {
            return null;
        }

        RatePlanEntity.RatePlanEntityBuilder ratePlanEntity = RatePlanEntity.builder();

        ratePlanEntity.id( cancelPolicy.ratePlanId() );

        return ratePlanEntity.build();
    }

    protected List<CancelRateEntity> cancelRateListToCancelRateEntityList(List<CancelRate> list) {
        if ( list == null ) {
            return null;
        }

        List<CancelRateEntity> list1 = new ArrayList<CancelRateEntity>( list.size() );
        for ( CancelRate cancelRate : list ) {
            list1.add( cancelRateMapper.toEntity( cancelRate ) );
        }

        return list1;
    }
}
