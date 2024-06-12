package com.socoolheeya.travel.domain.rds.main.rate.entity;

import com.socoolheeya.travel.domain.rds.main.rateplan.entity.RatePlanEntity;
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

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

@Getter
@Entity
@Table(name = "rate")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rate_id", columnDefinition = "bigint comment '요금 ID'")
    Long id;

    @Column(name = "total_price", columnDefinition = "decimal(15,4) comment '총 금액'")
    BigDecimal totalPrice;

    @Column(name = "net_price", columnDefinition = "decimal(15,4) comment '네트 금액'")
    BigDecimal netPrice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rate_plan_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    RatePlanEntity ratePlan;

    @OneToMany(mappedBy = "rate")
    List<DailyRateEntity> dailyRates = new ArrayList<>();

    @OneToMany(mappedBy = "rate")
    List<ExtraRateEntity> extraRates = new ArrayList<>();

    @Builder
    public RateEntity(Long id, BigDecimal totalPrice, BigDecimal netPrice, RatePlanEntity ratePlan) {
        this.id = id;
        this.totalPrice = totalPrice;
        this.netPrice = netPrice;
        this.ratePlan = ratePlan;
        this.dailyRates = new ArrayList<>();
        this.extraRates = new ArrayList<>();
    }

}
