package com.socoolheeya.travel.domain.rds.main.booking.entity;

import com.socoolheeya.travel.system.core.enums.RoomEnums;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Entity
@Table(name = "voucher")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class VoucherEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "voucher_id", columnDefinition = "bigint comment '바우처 ID'")
    Long id;

    @Min(0)
    @ColumnDefault("1")
    @Column(columnDefinition = "smallint(3) comment '객실 수'")
    Integer numberOfRoom = 1;

    @Column(columnDefinition = "smallint(3) comment '객실 수'")
    Integer adult;

    @Column(columnDefinition = "smallint(3) comment '객실 수'")
    Integer children;

    @Enumerated(EnumType.STRING)
    RoomEnums.RoomType roomType;

    @OneToOne(mappedBy = "voucher")
    BookingEntity booking;

    @Builder
    public VoucherEntity(Long id, Integer numberOfRoom, Integer adult, Integer children, RoomEnums.RoomType roomType, BookingEntity booking) {
        this.id = id;
        this.numberOfRoom = numberOfRoom;
        this.adult = adult;
        this.children = children;
        this.roomType = roomType;
        this.booking = booking;
    }

    @Builder
    public VoucherEntity(Long id, Integer numberOfRoom, Integer adult, Integer children, RoomEnums.RoomType roomType) {
        this.id = id;
        this.numberOfRoom = numberOfRoom;
        this.adult = adult;
        this.children = children;
        this.roomType = roomType;
        this.booking = null;
    }


}
