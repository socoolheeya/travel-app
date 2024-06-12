package com.socoolheeya.travel.domain.rds.main.booking.repository;

import com.socoolheeya.travel.domain.rds.main.booking.entity.VoucherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoucherJpaRepository extends JpaRepository<VoucherEntity, Long> {
}
