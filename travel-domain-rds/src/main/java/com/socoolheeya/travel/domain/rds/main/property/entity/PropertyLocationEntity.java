package com.socoolheeya.travel.domain.rds.main.property.entity;

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
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "property_location")
@Comment("시설 위치 정보")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PropertyLocationEntity {

    @Id
    @Column(name = "property_id", columnDefinition = "bigint comment '숙소 위치정보 ID'")
    Long id;

    @Column(columnDefinition = "varchar(500) comment '국가'")
    String country;

    @Column(columnDefinition = "varchar(500) comment '지역'")
    String region;

    @Column(columnDefinition = "varchar(500) comment '도시'")
    String city;

    @OneToOne(mappedBy = "location")
    PropertyMapInformationEntity mapInformation;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "property_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    PropertyEntity property;
}
