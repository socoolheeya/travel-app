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

    String name;

    BigDecimal adultPrice;

    BigDecimal childPrice;

    int excessAmount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rate_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    RateEntity rateEntity;






}
