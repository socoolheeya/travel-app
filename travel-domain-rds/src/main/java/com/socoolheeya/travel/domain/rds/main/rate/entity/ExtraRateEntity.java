package com.socoolheeya.travel.domain.rds.main.rate.entity;

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
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Getter
@Entity
@Table(name = "extra_rate")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ExtraRateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "additional_rate_id", columnDefinition = "bigint comment '추가요금 ID'")
    Long id;

    @Column(name = "name", columnDefinition = "varchar(1000) comment '추가요금 명'")
    String name;

    @Column(name = "adult_price", columnDefinition = "decimal(15,4) comment '성인 요금'")
    BigDecimal adultPrice;

    @Column(name = "child_price", columnDefinition = "decimal(15,4) comment '어린이 요금'")
    BigDecimal childPrice;

    @Column(name = "excess_amount", columnDefinition = "decimal(15,4) comment '초과금액'")
    BigDecimal excessAmount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rate_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    RateEntity rate;

    @Builder
    public ExtraRateEntity(Long id, String name, BigDecimal adultPrice, BigDecimal childPrice, BigDecimal excessAmount, RateEntity rate) {
        this.id = id;
        this.name = name;
        this.adultPrice = adultPrice;
        this.childPrice = childPrice;
        this.excessAmount = excessAmount;
        this.rate = rate;
    }

    @Builder
    public ExtraRateEntity(Long id, String name, BigDecimal adultPrice, BigDecimal childPrice, BigDecimal excessAmount) {
        this.id = id;
        this.name = name;
        this.adultPrice = adultPrice;
        this.childPrice = childPrice;
        this.excessAmount = excessAmount;
        this.rate = null;
    }
}
