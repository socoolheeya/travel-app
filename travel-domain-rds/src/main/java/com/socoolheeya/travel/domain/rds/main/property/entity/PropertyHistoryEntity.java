package com.socoolheeya.travel.domain.rds.main.property.entity;

import com.socoolheeya.travel.domain.rds.common.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@Entity
@Table(name = "property_history")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PropertyHistoryEntity extends BaseEntity {

    @Id
    @Column(name = "property_history_id", columnDefinition = "bigint comment '시설 히스토리 ID'")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotNull
    @Column(name = "property_id", columnDefinition = "bigint comment '시설 ID'")
    Long propertyId;

    @NotNull
    @Column(columnDefinition = "varchar(500) comment '시설명(KR)'")
    String koName;

    @Column(columnDefinition = "varchar(500) comment '시설명(EN)'")
    String enName;

    @Column(columnDefinition = "bool comment '사용 여부'")
    Boolean isEnabled = true;

    @Builder
    public PropertyHistoryEntity(Long id, Long propertyId, String koName, String enName, Boolean isEnabled) {
        this.id = id;
        this.propertyId = propertyId;
        this.koName = koName;
        this.enName = enName;
        this.isEnabled = isEnabled;
    }
}
