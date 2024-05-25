package com.socoolheeya.travel.domain.rds.main.supplier;

import com.socoolheeya.travel.domain.rds.main.supplier.domain.Supplier;
import com.socoolheeya.travel.domain.rds.main.supplier.entity.SupplierEntity;
import com.socoolheeya.travel.domain.rds.main.supplier.repository.SupplierJpaRepository;
import com.socoolheeya.travel.system.core.enums.CommonSupplierEnums;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class SupplierJpaService {
    private final SupplierJpaRepository supplierJpaRepository;

    public Supplier searchSupplierById(Long id) {
        return supplierJpaRepository.findById(id)
                .map(SupplierEntity::toDomain)
                .orElse(null);
    }

    public Supplier searchSupplierByConditions(CommonSupplierEnums supplierEnums) {
        return supplierJpaRepository.findById(supplierEnums.getCode().longValue())
                .map(SupplierEntity::toDomain)
                .orElse(null);
    }
}
