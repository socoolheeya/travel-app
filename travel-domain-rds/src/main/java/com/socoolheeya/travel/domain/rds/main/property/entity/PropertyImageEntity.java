package com.socoolheeya.travel.domain.rds.main.property.entity;

import com.socoolheeya.travel.domain.rds.common.entity.BaseEntity;
import com.socoolheeya.travel.domain.rds.main.property.domain.PropertyImage;
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
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Comment;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "property_image")
@Comment("숙소 이미지")
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

    public PropertyImage toDomain() {
        return PropertyImage.builder()
                .id(id)
                .name(name)
                .type(type)
                .path(path)
                .sequence(sequence)
                .build();
    }

}
