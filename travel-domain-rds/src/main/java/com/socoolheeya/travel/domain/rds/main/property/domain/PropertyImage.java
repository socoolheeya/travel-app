package com.socoolheeya.travel.domain.rds.main.property.domain;

import com.socoolheeya.travel.system.core.enums.PropertyEnums;

public record PropertyImage(
        Long id,
        String name,
        PropertyEnums.ImageType type,
        String path,
        Integer sequence,
        Property property
) {
    public PropertyImage {
        sequence = 1;
    }

}
