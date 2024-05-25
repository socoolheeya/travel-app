package com.socoolheeya.travel.domain.rds.main.supplier.repository;

import com.socoolheeya.travel.domain.rds.main.supplier.entity.SupplierOperationOptionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierOperationOptionJpaRepository extends JpaRepository<SupplierOperationOptionEntity, Long> {
}
