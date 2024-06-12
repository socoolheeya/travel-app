package com.socoolheeya.travel.domain.rds.main.property.entity;

import com.socoolheeya.travel.domain.rds.common.entity.BaseEntity;
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
import org.hibernate.annotations.Comment;

@Getter
@Entity
@Comment("숙소 계약서")
@Table(name = "property_contract")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PropertyContractEntity extends BaseEntity {
    @Id
    @Column(name = "property_contract_id", columnDefinition = "bigint comment '숙소 계약서 ID'")
    Long id;

    @NotNull
    @Column(name = "file_path", columnDefinition = "varchar(1000) comment '계약서 파일 경로'")
    String filePath;

    @NotNull
    @Column(name = "file_name", columnDefinition = "varchar(1000) comment '계약서 파일명'")
    String fileName;

    @Column(columnDefinition = "bool comment '사용 여부'")
    Boolean isEnabled = true;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "property_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    PropertyEntity property;

    @Builder
    public PropertyContractEntity(@NotNull Long id, @NotNull String filePath, String fileName, Boolean isEnabled, PropertyEntity property) {
        this.id = id;
        this.filePath = filePath;
        this.fileName = fileName;
        this.isEnabled = isEnabled;
        this.property = property;
    }

    @Builder
    public PropertyContractEntity(Long id, String filePath, String fileName, Boolean isEnabled) {
        this.id = id;
        this.filePath = filePath;
        this.fileName = fileName;
        this.isEnabled = isEnabled;
        this.property = null;
    }
}
