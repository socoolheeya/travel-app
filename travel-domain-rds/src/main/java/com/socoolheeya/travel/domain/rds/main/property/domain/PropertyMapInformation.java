package com.socoolheeya.travel.domain.rds.main.property.domain;


import java.awt.Point;

public record PropertyMapInformation(
        Long id,
        Double longitude,
        Double latitude,
        Point point
) {
}
