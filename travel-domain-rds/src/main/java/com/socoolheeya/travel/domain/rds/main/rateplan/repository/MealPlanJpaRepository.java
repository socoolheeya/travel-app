package com.socoolheeya.travel.domain.rds.main.rateplan.repository;

import com.socoolheeya.travel.domain.rds.main.rateplan.entity.MealPlanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealPlanJpaRepository extends JpaRepository<MealPlanEntity, Long> {
}
