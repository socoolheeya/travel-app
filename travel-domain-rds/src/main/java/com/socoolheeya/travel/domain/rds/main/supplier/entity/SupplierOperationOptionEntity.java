package com.socoolheeya.travel.domain.rds.main.supplier.entity;

import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

import java.time.LocalDateTime;

@Getter
@Entity
@Comment("공급사 운영 옵션")
@Table(name = "supplier_operation_option")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SupplierOperationOptionEntity {

    @Id
    @Column(name = "supplier_id", columnDefinition = "bigint comment '공급사 운영 옵션 ID'")
    Long id;

    @Column(name = "is_batch", columnDefinition = "bool comment '배치 사용 여부'")
    boolean isBatch = false;

    @Column(name = "shutdown_started_at", columnDefinition = "datetime comment '연동 중단 시작 시간'")
    LocalDateTime shutdownStartedAt;

    @Column(name = "shutdown_ended_at", columnDefinition = "datetime comment '연동 중단 종료 시간'")
    LocalDateTime shutdownEndedAt;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "supplier_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    SupplierEntity supplier;

    @Builder
    public SupplierOperationOptionEntity(Long id, boolean isBatch, LocalDateTime shutdownStartedAt, LocalDateTime  shutdownEndedAt, SupplierEntity supplier) {
        this.id = id;
        this.isBatch = isBatch;
        this.shutdownStartedAt = shutdownStartedAt;
        this.shutdownEndedAt = shutdownEndedAt;
        this.supplier = supplier;
    }

    @Builder
    public SupplierOperationOptionEntity(Long id, boolean isBatch, LocalDateTime shutdownStartedAt, LocalDateTime  shutdownEndedAt) {
        this(id, isBatch, shutdownStartedAt, shutdownEndedAt, null);
    }


}
