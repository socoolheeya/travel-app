package com.socoolheeya.travel.domain.rds.main.property.domain;

import com.socoolheeya.travel.domain.rds.main.supplier.domain.Supplier;
import lombok.Builder;

@Builder
public record PropertySupplier(
        Long id,
        Property property,
        Supplier supplier
) {

}
