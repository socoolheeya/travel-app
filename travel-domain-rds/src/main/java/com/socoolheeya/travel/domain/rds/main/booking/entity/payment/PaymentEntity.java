package com.socoolheeya.travel.domain.rds.main.booking.entity.payment;


import com.socoolheeya.travel.domain.rds.main.booking.entity.BookingEntity;
import com.socoolheeya.travel.domain.rds.main.booking.enums.BookingEnums;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@Entity
@Table(name = "payment")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PaymentEntity {

    @Id
    @Column(name = "payment_id", columnDefinition = "bigint comment '결재 ID'")
    Long id;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "varchar(100) comment '결재 타입'")
    BookingEnums.PaymentType paymentType;

    @OneToOne(mappedBy = "payment")
    BookingEntity booking;

    @Builder
    public PaymentEntity(Long id, BookingEnums.PaymentType paymentType, BookingEntity booking) {
        this.id = id;
        this.paymentType = paymentType;
        this.booking = booking;
    }

    @Builder
    public PaymentEntity(BookingEnums.PaymentType paymentType, BookingEntity booking) {
        this.id = null;
        this.booking = booking;
        this.paymentType = paymentType;
    }

}
