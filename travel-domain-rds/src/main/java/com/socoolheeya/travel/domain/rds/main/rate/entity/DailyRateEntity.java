package com.socoolheeya.travel.domain.rds.main.rate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.aspectj.runtime.internal.cflowstack.ThreadStackImpl11;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Entity
@Table(name = "daily_rate")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DailyRateEntity {

    @Id
    @Column(name = "daily_rate_id", columnDefinition = "bigint comment '일별 요금 ID'")
    Long id;

    @NotNull
    @Column(columnDefinition = "date comment '판매일'")
    LocalDate salesDay;

    @NotNull
    @Column(columnDefinition = "decimal(15,4) comment '원 금액'")
    BigDecimal originPrice;

    @NotNull
    @Column(columnDefinition = "decimal(15,4) comment '판매 금액'")
    BigDecimal sellingPrice;

    @Column(columnDefinition = "decimal(15,4) comment '금액'")
    BigDecimal depositPrice;

    @Column(columnDefinition = "decimal(15,4) comment '커미션'")
    BigDecimal commission;

    @Column(columnDefinition = "decimal(15,4) comment '커미션 수수료'")
    BigDecimal commissionFee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rate_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    RateEntity rate;

    @Builder
    public DailyRateEntity(Long id, LocalDate salesDay, BigDecimal originPrice, BigDecimal sellingPrice, BigDecimal depositPrice, BigDecimal commission, BigDecimal commissionFee, RateEntity rate) {
        this.id = id;
        this.salesDay = salesDay;
        this.originPrice = originPrice;
        this.sellingPrice = sellingPrice;
        this.depositPrice = depositPrice;
        this.commission = commission;
        this.commissionFee = commissionFee;
        this.rate = rate;
    }

    @Builder
    public DailyRateEntity(Long id, LocalDate salesDay, BigDecimal originPrice, BigDecimal sellingPrice, BigDecimal depositPrice, BigDecimal commission, BigDecimal commissionFee) {
        this.id = id;
        this.salesDay = salesDay;
        this.originPrice = originPrice;
        this.sellingPrice = sellingPrice;
        this.depositPrice = depositPrice;
        this.commission = commission;
        this.commissionFee = commissionFee;
        this.rate = null;
    }
}
