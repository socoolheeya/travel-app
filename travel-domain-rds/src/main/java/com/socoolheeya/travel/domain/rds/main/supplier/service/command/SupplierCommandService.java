package com.socoolheeya.travel.domain.rds.main.supplier.service.command;

import com.socoolheeya.travel.domain.rds.main.supplier.domain.Supplier;
import com.socoolheeya.travel.domain.rds.main.supplier.repository.SupplierJpaRepository;
import com.socoolheeya.travel.domain.rds.main.supplier.repository.SupplierOperationOptionJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class SupplierCommandService {

    private final SupplierJpaRepository supplierJpaRepository;
    private final SupplierOperationOptionJpaRepository supplierOperationOptionJpaRepository;

    @Transactional
    public void save(Supplier supplier) {

    }
}
