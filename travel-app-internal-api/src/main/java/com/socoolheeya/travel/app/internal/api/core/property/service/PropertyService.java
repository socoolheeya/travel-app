package com.socoolheeya.travel.app.internal.api.core.property.service;

import com.socoolheeya.travel.app.internal.api.core.property.domain.http.PropertyRequest;
import com.socoolheeya.travel.domain.rds.main.property.domain.Property;
import com.socoolheeya.travel.domain.rds.main.property.service.command.PropertyCommandService;
import com.socoolheeya.travel.domain.rds.main.property.service.query.PropertyQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PropertyService {

    private final PropertyQueryService propertyQueryService;
    private final PropertyCommandService propertyCommandService;

    public Property searchById(Long propertyId) {
        return propertyQueryService.searchPropertyById(propertyId)
                .orElseGet(Property.builder()::build);
    }

    public List<Property> searchByConditions(PropertyRequest.Search request) {
        return null;
        //return propertyQueryService.searchProperties(request);
    }

    public Property register(Property property) {
        return propertyCommandService.saveProperty(property);
    }

    public Property modify(Property property) {
        return null;
    }

    public void remove(Long propertyId) {

    }


}
