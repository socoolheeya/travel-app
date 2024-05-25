package com.socoolheeya.travel.app.internal.api.core.property.adapter;

import com.socoolheeya.travel.app.internal.api.core.property.domain.http.PropertyRequest;
import com.socoolheeya.travel.app.internal.api.core.property.port.LoadPropertyPort;
import com.socoolheeya.travel.domain.rds.main.property.domain.Property;
import com.socoolheeya.travel.domain.rds.main.property.service.PropertyJpaService;
import com.socoolheeya.travel.domain.rds.main.supplier.SupplierJpaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class PropertyAdapter implements LoadPropertyPort {

    private final PropertyJpaService propertyJpaService;
    private final SupplierJpaService supplierJpaService;
    @Override
    public Property load(Long propertyId) {
        return propertyJpaService.searchPropertyById(propertyId);
    }

    @Override
    public List<Property> loadBySearchConditions(PropertyRequest.Search request) {
        return propertyJpaService.searchPropertiesByIsEnabled(request.getIsEnabled());
        //supplierJpaService.searchSupplierByConditions(request.getSupplier());
    }
}
