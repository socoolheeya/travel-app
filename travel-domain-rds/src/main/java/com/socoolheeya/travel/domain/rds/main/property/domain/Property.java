package com.socoolheeya.travel.domain.rds.main.property.domain;

import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyAddressEntity;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyContactEntity;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyContractEntity;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyImageEntity;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyLocationEntity;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertySupplierEntity;
import lombok.Builder;

import java.util.ArrayList;
import java.util.List;

@Builder
public record Property(
        Long id,
        String koName,
        String enName,
        Boolean isEnabled,
        List<PropertyImageEntity> images,
        PropertyAddressEntity address,
        PropertyContactEntity contact,
        PropertyLocationEntity location,
        List<PropertyContractEntity> propertyContracts,
        PropertySupplierEntity propertySupplier
) {
    public Property {
        isEnabled = true;
        images = new ArrayList<>();
        propertyContracts = new ArrayList<>();
    }

}
