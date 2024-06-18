package com.socoolheeya.travel.domain.rds.main.property.domain;


import org.springframework.data.geo.Point;

public record PropertyMapInformation(
        Long id,
        Double longitude,
        Double latitude,
        Point point
) {
}
