package com.socoolheeya.travel.domain.rds.main.booking.entity;

import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Getter
@Entity
@Table(name = "booking_basic_information")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookingBasicInformationEntity {
    @Id
    @Column(name = "booking_id", columnDefinition = "bigint comment '예약 ID'")
    Long id;

    @NotNull
    @Column(name = "checkin", columnDefinition = "date comment '체크인 날짜(yyyy-MM-dd)'")
    LocalDate checkin;

    @NotNull
    @Column(name = "checkout", columnDefinition = "date comment '체크아웃(yyyy-MM-dd)'")
    LocalDate checkout;

    @NotNull
    @Column(name = "nights", columnDefinition = "smallint comment '박수'")
    Integer nights;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "booking_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    BookingEntity booking;

    @Builder
    public BookingBasicInformationEntity(Long id, LocalDate checkin, LocalDate checkout, Integer nights, BookingEntity booking) {
        this.id = id;
        this.checkin = checkin;
        this.checkout = checkout;
        this.nights = nights;
        this.booking = booking;
    }

    @Builder
    public BookingBasicInformationEntity(Long id, LocalDate checkin, LocalDate checkout, Integer nights) {
        this.id = id;
        this.checkin = checkin;
        this.checkout = checkout;
        this.nights = nights;
        this.booking = null;
    }

    @Builder
    public BookingBasicInformationEntity(BookingEntity booking) {
        this.booking = booking;
    }


}
