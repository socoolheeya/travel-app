package com.socoolheeya.travel.domain.rds.main.rateplan.repository;

import com.socoolheeya.travel.domain.rds.main.rateplan.entity.RatePlanCheckinEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatePlanCheckinJpaRepository extends JpaRepository<RatePlanCheckinEntity, Long> {
}
