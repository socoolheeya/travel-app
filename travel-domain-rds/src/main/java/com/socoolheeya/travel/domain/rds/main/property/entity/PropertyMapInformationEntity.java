package com.socoolheeya.travel.domain.rds.main.property.entity;

import com.socoolheeya.travel.domain.rds.common.entity.CoordinateEntity;
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
import org.springframework.data.geo.Point;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "property_map_information")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PropertyMapInformationEntity extends CoordinateEntity {
    @Id
    @Column(name = "property_id", columnDefinition = "bigint comment '숙소 위치정보 ID'")
    Long id;

    @Column(name = "longitude", columnDefinition = "double comment '숙소 위치정보 ID'")
    Double longitude;

    @Column(name = "latitude", columnDefinition = "double comment '숙소 위치정보 ID'")
    Double latitude;

    @Column(name = "point", columnDefinition = "point comment '숙소 위치정보 ID'")
    Point point;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "property_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    PropertyLocationEntity location;
}
