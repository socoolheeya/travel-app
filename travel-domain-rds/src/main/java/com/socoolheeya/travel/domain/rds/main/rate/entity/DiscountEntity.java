package com.socoolheeya.travel.domain.rds.main.rate.entity;

import com.socoolheeya.travel.system.core.enums.DiscountEnums;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "discount")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DiscountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "discount_id", columnDefinition = "bigint comment '할인 ID'")
    Long id;

    @NotNull
    @Column(name = "discount_label", columnDefinition = "varchar(255) comment '라벨명'")
    String discountLabel;

    @Column(name = "description", columnDefinition = "varchar(4000) comment '할인 설명'")
    String description;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "discount_unit", columnDefinition = "varchar(20) comment '할인 단위'")
    DiscountEnums.DiscountUnit discountUnit;

    @NotNull
    @Column(name = "discount_value", columnDefinition = "decimal(15,4) comment '할인금액 or 할인율'")
    BigDecimal discountValue;

    @NotNull
    @Column(name = "started_at", columnDefinition = "datetime comment '시작일'")
    LocalDateTime statedAt;

    @NotNull
    @Column(name = "expired_at", columnDefinition = "datetime comment '만료일'")
    LocalDateTime expiredAt;
}
