package com.socoolheeya.travel.domain.rds.main.rate.repository;

import com.socoolheeya.travel.domain.rds.main.rate.entity.DailyRateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DailyRateJpaRepository extends JpaRepository<DailyRateEntity, Long> {
}
