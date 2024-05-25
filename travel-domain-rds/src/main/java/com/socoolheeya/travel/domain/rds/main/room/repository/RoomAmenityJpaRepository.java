package com.socoolheeya.travel.domain.rds.main.room.repository;

import com.socoolheeya.travel.domain.rds.main.room.entity.RoomAmenityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomAmenityJpaRepository extends JpaRepository<RoomAmenityEntity, Long> {
}
