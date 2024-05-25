package com.socoolheeya.travel.domain.rds.main.booking.entity.payment;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Getter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class VccEntity {

    @Id
    @Column(name = "vcc_id", columnDefinition = "bigint comment 'VCC ID'")
    Long id;

    @NotNull
    @Column(name = "card_no", columnDefinition = "varchar(100) comment '카드번호'")
    String cardNo;

    @NotNull
    @Column(name = "expiation_date", columnDefinition = "date comment '유효기간'")
    LocalDate expirationDate;

    @NotNull
    @Column(name = "card_holder", columnDefinition = "varchar(200) comment '카드 사용자명'")
    String cardHolder;
}
