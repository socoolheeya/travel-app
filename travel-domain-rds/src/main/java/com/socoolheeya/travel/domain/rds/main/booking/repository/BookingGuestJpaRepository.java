package com.socoolheeya.travel.domain.rds.main.booking.repository;

import com.socoolheeya.travel.domain.rds.main.booking.entity.BookingGuestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingGuestJpaRepository extends JpaRepository<BookingGuestEntity, Long> {
}
