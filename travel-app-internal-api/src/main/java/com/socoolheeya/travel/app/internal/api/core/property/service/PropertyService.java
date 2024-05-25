package com.socoolheeya.travel.app.internal.api.core.property.service;

import com.socoolheeya.travel.app.internal.api.core.property.domain.http.PropertyRequest;
import com.socoolheeya.travel.app.internal.api.core.property.domain.http.PropertyResponse;
import com.socoolheeya.travel.app.internal.api.core.property.port.LoadPropertyPort;
import com.socoolheeya.travel.app.internal.api.core.property.usecase.PropertyUseCase;
import com.socoolheeya.travel.domain.rds.main.property.repository.PropertyJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PropertyService implements PropertyUseCase {

    private final LoadPropertyPort loadPropertyPort;

    @Override
    public PropertyResponse.Search searchById(Long propertyId) {
        return PropertyResponse.Search.builder()
                .property(loadPropertyPort.load(propertyId))
                .build();

    }

    @Override
    public PropertyResponse.SearchByConditions searchByConditions(PropertyRequest.Search request) {
        loadPropertyPort.loadBySearchConditions(request);
        return null;
    }


}
