package com.socoolheeya.travel.domain.rds.main.rateplan.entity;

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
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Entity
@Table(name = "cancel_rate")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CancelRateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cancel_rate_id", columnDefinition = "bigint comment '취소 수수료 ID'")
    Long id;

    @Column(name = "\"offset\"", columnDefinition = "smallint comment '기준 단위'")
    Integer offset;

    @Column(name = "rate", columnDefinition = "smallint comment '취소 수수료율'")
    Integer rate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cancel_policy_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    CancelPolicyEntity cancelPolicy;

    @Builder
    public CancelRateEntity(Long id, Integer offset, Integer rate, CancelPolicyEntity cancelPolicy) {
        this.id = id;
        this.offset = offset;
        this.rate = rate;
        this.cancelPolicy = cancelPolicy;
    }

    @Builder
    public CancelRateEntity(Long id, Integer offset, Integer rate) {
        this.id = id;
        this.offset = offset;
        this.rate = rate;
        this.cancelPolicy = null;
    }
}
