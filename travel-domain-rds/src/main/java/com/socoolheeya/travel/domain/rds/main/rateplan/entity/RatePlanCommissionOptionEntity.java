package com.socoolheeya.travel.domain.rds.main.rateplan.entity;

import com.socoolheeya.travel.system.core.enums.RatePlanEnums;
import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Comment;

@Getter
@Entity
@Table(name = "rate_plan_commission_option")
@Comment("요금제 커미션 옵션")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RatePlanCommissionOptionEntity {
    @Id
    @Column(name = "property_id", columnDefinition = "bigint comment '커미션 옵션 ID'")
    Long id;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "varchar(20) comment '커미션 설정-구분'")
    RatePlanEnums.CommissionType type;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "varchar(20) comment '커미션 설정-기간'")
    RatePlanEnums.CommissionPeriod period;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "varchar(20) comment '커미션 설정-기준'")
    RatePlanEnums.CommissionStandard standard;

    @ColumnDefault("0")
    @Column(columnDefinition = "smallint(3) comment '기본 커미션(%)'")
    Integer defaultCommission = 0;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rate_plan_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    RatePlanEntity ratePlan;


}
