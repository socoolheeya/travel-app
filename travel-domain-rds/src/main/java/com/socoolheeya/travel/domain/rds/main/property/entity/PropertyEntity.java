package com.socoolheeya.travel.domain.rds.main.property.entity;

import com.socoolheeya.travel.domain.rds.common.converter.BooleanToStringConverter;
import com.socoolheeya.travel.domain.rds.common.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Table(name = "property")
@Comment("시설 정보")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PropertyEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "property_id", columnDefinition = "bigint comment '시설 ID'")
    Long id;

    @NotNull
    @Column(columnDefinition = "varchar(500) comment '시설명(KR)'")
    String koName;

    @NotNull
    @Column(columnDefinition = "varchar(500) comment '시설명(EN)'")
    String enName;

    @Column(columnDefinition = "text comment '시설 설명(KR)'")
    String koDescription;

    @Column(columnDefinition = "text comment '시설 설명(EN)'")
    String enDescription;

    @Convert(converter = BooleanToStringConverter.class)
    @Column(columnDefinition = "char(1) comment '사용 여부'")
    Boolean isEnabled = true;

    @OneToMany(mappedBy = "property")
    List<PropertyImageEntity> images = new ArrayList<>();

    @OneToOne(mappedBy = "property")
    PropertyAddressEntity address;

    @OneToOne(mappedBy = "property")
    PropertyContactEntity contact;

    @OneToOne(mappedBy = "property")
    PropertyLocationEntity location;

    @OneToMany(mappedBy = "property", orphanRemoval = true)
    List<PropertyContractEntity> propertyContracts = new ArrayList<>();

    @OneToOne(mappedBy = "property", orphanRemoval = true)
    PropertySupplierEntity propertySupplier;

    @Builder
    public PropertyEntity(Long id, String koName, String enName, Boolean isEnabled, List<PropertyImageEntity> images, PropertyAddressEntity address, PropertyContactEntity contact, PropertyLocationEntity location) {
        this.id = id;
        this.koName = koName;
        this.enName = enName;
        this.isEnabled = isEnabled;
        this.images = images;
        this.address = address;
        this.contact = contact;
        this.location = location;
    }

    @Builder
    public PropertyEntity(Long id, String koName, String enName, String koDescription, String enDescription, Boolean isEnabled) {
        this.id = id;
        this.koName = koName;
        this.enName = enName;
        this.koDescription = koDescription;
        this.enDescription = enDescription;
        this.isEnabled = isEnabled;
        this.images = null;
        this.address = null;
        this.contact = null;
        this.location = null;
    }

}
