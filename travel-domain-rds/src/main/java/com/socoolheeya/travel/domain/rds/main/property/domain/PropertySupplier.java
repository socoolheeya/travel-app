package com.socoolheeya.travel.domain.rds.main.property.domain;

import lombok.Builder;

@Builder
public record PropertySupplier(
        Long propertySupplierId,
        Long propertyId,
        Long supplierId
) {

}
