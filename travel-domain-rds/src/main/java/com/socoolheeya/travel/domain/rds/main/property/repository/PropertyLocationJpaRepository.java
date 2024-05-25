package com.socoolheeya.travel.domain.rds.main.property.repository;

import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyLocationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyLocationJpaRepository extends JpaRepository<PropertyLocationEntity, Long> {
}
