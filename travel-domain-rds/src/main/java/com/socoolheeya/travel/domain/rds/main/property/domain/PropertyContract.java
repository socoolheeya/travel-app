package com.socoolheeya.travel.domain.rds.main.property.domain;

public record PropertyContract(
        Long id,
        String filePath,
        String fileName,
        Boolean isEnabled,
        Long propertyId
) {
    public PropertyContract {
        isEnabled = true;
    }
}
