package com.socoolheeya.travel.domain.rds.main.booking.repository;

import com.socoolheeya.travel.domain.rds.main.booking.entity.BookingFaxEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingFaxJpaRepository extends JpaRepository<BookingFaxEntity, Long> {
}
