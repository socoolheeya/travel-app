package com.socoolheeya.travel.domain.rds.main.booking.entity;

import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Bag;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Table(name = "booking_occupancy")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookingOccupancyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "occupancy_id", columnDefinition = "bigint comment '예약 인원 정보 ID'")
    Long id;

    @Column(name = "total_adults", columnDefinition = "smallint comment '총 성인 수'")
    Integer totalAdults;

    @Column(name = "total_children", columnDefinition = "smallint comment '총 아동 수'")
    Integer totalChildren;

    @OneToMany(mappedBy = "bookingOccupancy")
    List<BookingGuestEntity> bookingGuests = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "booking_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    BookingEntity booking;

    @Builder
    public BookingOccupancyEntity(Long id, Integer totalAdults, Integer totalChildren, BookingEntity booking) {
        this.id = id;
        this.totalAdults = totalAdults;
        this.totalChildren = totalChildren;
        this.booking = booking;
    }

    @Builder
    public BookingOccupancyEntity(Long id, Integer totalAdults, Integer totalChildren) {
        this.id = id;
        this.totalAdults = totalAdults;
        this.totalChildren = totalChildren;
        this.booking = null;
    }
}
