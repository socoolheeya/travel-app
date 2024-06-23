package com.socoolheeya.travel.app.internal.api.core.property.service;

import com.socoolheeya.travel.app.internal.api.core.property.domain.http.PropertyRequest;
import com.socoolheeya.travel.domain.rds.main.property.domain.Property;
import com.socoolheeya.travel.domain.rds.main.property.service.command.PropertyCommandService;
import com.socoolheeya.travel.domain.rds.main.property.service.query.PropertyQueryService;
import com.socoolheeya.travel.system.core.model.param.PropertySearchCriteria;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PropertyService {

    private final PropertyQueryService propertyQueryService;
    private final PropertyCommandService propertyCommandService;

    public Property searchById(Long propertyId) {
        return propertyQueryService.searchPropertyById(propertyId)
                .orElseGet(Property.builder()::build);
    }

    public Page<Property> searchByConditions(PropertyRequest.Search request, Pageable pageable) {
        PropertySearchCriteria searchCriteria = PropertySearchCriteria.builder()
                .language(request.getLanguage())
                .isEnabled(request.getIsEnabled())
                .suppliers(request.getSuppliers())
                .build();
        return propertyQueryService.searchProperties(searchCriteria, pageable);
    }

    public Property register(Property property) {
        return propertyCommandService.saveProperty(property);
    }

    public Property modify(Property property) {
        return propertyCommandService.saveProperty(property);
    }

    public void remove(Long propertyId) {
        propertyCommandService.removeProperty(propertyId);
    }


}
