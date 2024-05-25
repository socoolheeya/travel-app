package com.socoolheeya.travel.domain.rds.main.rateplan.repository;

import com.socoolheeya.travel.domain.rds.main.rateplan.entity.RatePlanCommissionOptionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatePlanCommissionOptionJpaRepository extends JpaRepository<RatePlanCommissionOptionEntity, Long> {
}
