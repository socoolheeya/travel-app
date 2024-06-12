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
import jakarta.validation.constraints.Min;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Entity
@Table(name = "booking_guest")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookingGuestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_guest_id", columnDefinition = "bigint comment '예약 게스트 ID'")
    Long id;

    @Column(columnDefinition = "varchar(255) comment '이름'")
    String name;

    @Column(columnDefinition = "smallint comment '나이'")
    Integer age;

    @Column(columnDefinition = "varchar(255) comment '전화번호'")
    String phone;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "varchar(10) comment '성별'")
    BookingEnums.Gender gender;

    @ColumnDefault("0")
    @Column(columnDefinition = "bool comment '대표 예약자 여부'")
    Boolean isMainHolder = false;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "booking_occupancy_id", nullable = false, foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    BookingOccupancyEntity bookingOccupancy;

    @Builder
    public BookingGuestEntity(Long id, String name, Integer age, String phone, BookingEnums.Gender gender, Boolean isMainHolder, BookingOccupancyEntity bookingOccupancy) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.gender = gender;
        this.isMainHolder = isMainHolder;
        this.bookingOccupancy = bookingOccupancy;
    }

    @Builder
    public BookingGuestEntity(Long id, String name, Integer age, String phone, BookingEnums.Gender gender, Boolean isMainHolder) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.gender = gender;
        this.isMainHolder = isMainHolder;
        this.bookingOccupancy = null;
    }
}
