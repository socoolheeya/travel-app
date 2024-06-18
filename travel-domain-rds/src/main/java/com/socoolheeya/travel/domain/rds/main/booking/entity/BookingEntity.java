package com.socoolheeya.travel.domain.rds.main.booking.entity;

import com.socoolheeya.travel.domain.rds.main.booking.entity.payment.PaymentEntity;
import com.socoolheeya.travel.domain.rds.main.booking.enums.BookingEnums;
import com.socoolheeya.travel.domain.rds.common.entity.BaseEntity;
import com.socoolheeya.travel.domain.rds.main.rateplan.entity.RatePlanEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Table(name = "booking")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookingEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id", columnDefinition = "bigint comment '예약 ID'")
    Long id;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "booking_status", columnDefinition = "varchar(20) comment '예약 상태'")
    BookingEnums.Status bookingStatus = BookingEnums.Status.REQUESTED;

    @Column(name = "ref_booking_no", columnDefinition = "varchar(500) comment 'CMS 예약 번호'")
    String refBookingNo;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "rate_plan_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    RatePlanEntity ratePlan;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "voucher_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    VoucherEntity voucher;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "payment_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    PaymentEntity payment;

    @OneToMany(mappedBy = "booking")
    List<BookingOccupancyEntity> bookingOccupancies = new ArrayList<>();

    @Builder
    public BookingEntity(Long id, BookingEnums.Status bookingStatus, String refBookingNo) {
        this.id = id;
        this.bookingStatus = bookingStatus;
        this.refBookingNo = refBookingNo;
        this.ratePlan = null;
        this.voucher = null;
        this.payment = null;
    }

    @Builder
    public BookingEntity(Long id, BookingEnums.Status bookingStatus, String refBookingNo, RatePlanEntity ratePlan, VoucherEntity voucher, PaymentEntity payment) {
        this.id = id;
        this.bookingStatus = bookingStatus;
        this.refBookingNo = refBookingNo;
        this.ratePlan = ratePlan;
        this.voucher = voucher;
        this.payment = payment;
    }


}
