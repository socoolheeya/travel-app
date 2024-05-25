package com.socoolheeya.travel.domain.rds.main.property.repository;

import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyAddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyAddressJpaRepository extends JpaRepository<PropertyAddressEntity, Long> {
}
