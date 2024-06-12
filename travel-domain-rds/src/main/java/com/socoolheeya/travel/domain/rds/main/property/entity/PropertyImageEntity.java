package com.socoolheeya.travel.domain.rds.main.property.entity;

import com.socoolheeya.travel.domain.rds.common.entity.BaseEntity;
import com.socoolheeya.travel.system.core.enums.PropertyEnums;
import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Comment;

@Getter
@Entity
@Table(name = "property_image")
@Comment("숙소 이미지")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PropertyImageEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "property_image_id", columnDefinition = "bigint comment '숙소 이미지 ID'")
    Long id;

    @NotNull
    @Column(columnDefinition = "varchar(500) comment '이미지 명'")
    String name;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "varchar(50) comment '이미지 타입'")
    PropertyEnums.ImageType type;

    @NotNull
    @Column(columnDefinition = "varchar(1000) comment '이미지 경로'")
    String path;

    @ColumnDefault("1")
    @Column(columnDefinition = "smallint comment '이미지 순서'")
    Integer sequence = 1;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "property_id", nullable = false, foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    PropertyEntity property;

    @Builder
    public PropertyImageEntity(Long id, String name, String path, Integer sequence, PropertyEnums.ImageType type, PropertyEntity property) {
        this.id = id;
        this.name = name;
        this.path = path;
        this.sequence = sequence;
        this.type = type;
        this.property = property;
    }

    @Builder
    public PropertyImageEntity(Long id, String name, String path, Integer sequence, PropertyEnums.ImageType type) {
        this(id, name, path, sequence, type, null);
    }

}
