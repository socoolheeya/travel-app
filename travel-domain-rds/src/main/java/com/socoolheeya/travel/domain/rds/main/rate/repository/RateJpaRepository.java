package com.socoolheeya.travel.domain.rds.main.rate.repository;

import com.socoolheeya.travel.domain.rds.main.rate.entity.RateEntity;
import com.socoolheeya.travel.domain.rds.main.rateplan.entity.RatePlanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RateJpaRepository extends JpaRepository<RateEntity, Long> {

    Optional<List<RateEntity>> findByRatePlanId(Long ratePlanId);
}
