package com.socoolheeya.travel.domain.rds.main.rate.repository;

import com.socoolheeya.travel.domain.rds.main.rate.entity.RateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RateJpaRepository extends JpaRepository<RateEntity, Long> {
}
