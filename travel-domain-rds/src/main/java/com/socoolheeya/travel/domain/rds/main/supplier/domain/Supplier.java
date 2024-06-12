package com.socoolheeya.travel.domain.rds.main.supplier.domain;

import com.socoolheeya.travel.domain.rds.main.property.domain.PropertySupplier;
import com.socoolheeya.travel.system.core.enums.SupplierEnums;

public record Supplier(
        Long id,
        String shortName,
        String name,
        SupplierEnums.Type type,
        Boolean isEnabled,
        SupplierOperationOption supplierOperationOption,
        PropertySupplier propertySupplier
) {

    public Supplier {
        type = SupplierEnums.Type.DC;
        isEnabled = true;
    }

}
