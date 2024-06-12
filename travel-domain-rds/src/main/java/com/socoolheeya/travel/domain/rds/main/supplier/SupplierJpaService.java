package com.socoolheeya.travel.domain.rds.main.supplier;

import com.socoolheeya.travel.domain.rds.main.supplier.domain.Supplier;
import com.socoolheeya.travel.domain.rds.main.supplier.mapper.SupplierMapper;
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
                .map(SupplierMapper.INSTANCE::toDomain)
                .orElse(null);
    }

    public Supplier searchSupplierByConditions(CommonSupplierEnums supplierEnums) {
        return supplierJpaRepository.findById(supplierEnums.getCode().longValue())
                .map(SupplierMapper.INSTANCE::toDomain)
                .orElse(null);
    }
}
