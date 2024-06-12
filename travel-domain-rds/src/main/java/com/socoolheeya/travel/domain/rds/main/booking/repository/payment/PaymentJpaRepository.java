package com.socoolheeya.travel.domain.rds.main.booking.repository.payment;

import com.socoolheeya.travel.domain.rds.main.booking.entity.payment.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentJpaRepository extends JpaRepository<PaymentEntity, Long> {
}
