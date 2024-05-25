package com.socoolheeya.travel.domain.rds.main.rateplan.repository;

import com.socoolheeya.travel.domain.rds.main.rateplan.entity.RatePlanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatePlanJpaRepository extends JpaRepository<RatePlanEntity, Long> {
}
