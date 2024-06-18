package com.socoolheeya.travel.domain.rds.main.supplier.mapper;

import com.socoolheeya.travel.domain.rds.main.supplier.domain.SupplierOperationOption;
import com.socoolheeya.travel.domain.rds.main.supplier.entity.SupplierOperationOptionEntity;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class SupplierOperationOptionMapperImpl implements SupplierOperationOptionMapper {

    @Override
    public SupplierOperationOption toDomain(SupplierOperationOptionEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Long id = null;
        LocalDateTime shutdownStartedAt = null;
        LocalDateTime shutdownEndedAt = null;

        id = entity.getId();
        shutdownStartedAt = entity.getShutdownStartedAt();
        shutdownEndedAt = entity.getShutdownEndedAt();

        boolean isBatch = false;

        SupplierOperationOption supplierOperationOption = new SupplierOperationOption( id, isBatch, shutdownStartedAt, shutdownEndedAt );

        return supplierOperationOption;
    }

    @Override
    public SupplierOperationOptionEntity toEntity(SupplierOperationOption domain) {
        if ( domain == null ) {
            return null;
        }

        SupplierOperationOptionEntity.SupplierOperationOptionEntityBuilder supplierOperationOptionEntity = SupplierOperationOptionEntity.builder();

        supplierOperationOptionEntity.id( domain.id() );
        supplierOperationOptionEntity.isBatch( domain.isBatch() );
        supplierOperationOptionEntity.shutdownStartedAt( domain.shutdownStartedAt() );
        supplierOperationOptionEntity.shutdownEndedAt( domain.shutdownEndedAt() );

        return supplierOperationOptionEntity.build();
    }
}
