package com.socoolheeya.travel.domain.rds.main.booking.entity;

import com.socoolheeya.travel.domain.rds.main.booking.enums.BookingEnums;
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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

@Getter
@Entity
@Table(name = "booking_fax")
@Comment("예약-팩스 정보")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookingFaxEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_fax_id", columnDefinition = "bigint comment '팩스 ID'")
    Long id;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "varchar(20) comment '전송 상태'")
    BookingEnums.FaxStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "booking_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    BookingEntity booking;

    @Builder
    public BookingFaxEntity(Long id, BookingEnums.FaxStatus status, BookingEntity booking) {
        this.id = id;
        this.status = status;
        this.booking = booking;
    }

    @Builder
    public BookingFaxEntity(BookingEnums.FaxStatus status) {
        this.id = null;
        this.status = status;
        this.booking = null;
    }
}
