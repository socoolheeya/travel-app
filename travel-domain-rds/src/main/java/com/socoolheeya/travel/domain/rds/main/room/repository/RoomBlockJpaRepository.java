package com.socoolheeya.travel.domain.rds.main.room.repository;

import com.socoolheeya.travel.domain.rds.main.room.entity.RoomBlockEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomBlockJpaRepository extends JpaRepository<RoomBlockEntity, Long> {
}
