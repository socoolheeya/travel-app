package com.socoolheeya.travel.domain.rds.main.property.repository;

import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyHistoryJpaRepository extends JpaRepository<PropertyHistoryEntity, Long>, RevisionRepository<PropertyHistoryEntity, Long, Integer> {
}
