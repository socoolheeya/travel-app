package com.socoolheeya.travel.domain.rds.personal.role.repository;

import com.socoolheeya.travel.domain.rds.personal.role.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleJpaRepository extends JpaRepository<RoleEntity, Long> {
}
