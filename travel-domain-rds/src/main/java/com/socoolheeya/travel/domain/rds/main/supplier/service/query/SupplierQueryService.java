package com.socoolheeya.travel.domain.rds.main.supplier.service.query;

import com.socoolheeya.travel.domain.rds.main.supplier.entity.SupplierEntity;
import com.socoolheeya.travel.domain.rds.main.supplier.repository.SupplierJpaRepository;
import com.socoolheeya.travel.domain.rds.main.supplier.repository.SupplierOperationOptionJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class SupplierQueryService {
    private final SupplierJpaRepository supplierJpaRepository;
    private final SupplierOperationOptionJpaRepository supplierOperationOptionJpaRepository;

    public Optional<SupplierEntity> getSupplier(Long id) {
        return supplierJpaRepository.findById(id);
    }

}
