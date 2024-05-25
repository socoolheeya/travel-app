package com.socoolheeya.travel.domain.rds.main.property.domain;

import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyEntity;
import com.socoolheeya.travel.domain.rds.main.supplier.domain.Supplier;
import lombok.Builder;

import java.util.List;

@Builder
public record Property(
        String koName,
        String enName,
        Boolean isEnabled,

        List<PropertySupplier> suppliers
) {

    public PropertyEntity toEntity() {
        return new PropertyEntity(null, koName, enName, isEnabled);
    }


}
