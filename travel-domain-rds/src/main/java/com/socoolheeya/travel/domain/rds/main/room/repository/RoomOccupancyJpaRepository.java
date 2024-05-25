package com.socoolheeya.travel.domain.rds.main.room.repository;

import com.socoolheeya.travel.domain.rds.main.room.entity.RoomOccupancyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomOccupancyJpaRepository extends JpaRepository<RoomOccupancyEntity, Long> {
}
