package com.socoolheeya.travel.domain.rds.common.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.springframework.data.geo.Point;

@Getter
@MappedSuperclass
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class CoordinateEntity {

    @Column(columnDefinition = "double comment '위도(x)'")
    Double longitude;

    @Column(columnDefinition = "double comment '경도(y)'")
    Double latitude;

    @Column(columnDefinition = "varbinary(255) comment '좌표'")
    Point point;

    public void setPoint(Double longitude, Double latitude) {
        this.point = new Point(longitude, latitude);
    }
}
