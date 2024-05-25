package com.socoolheeya.travel.app.internal.api.core.property.usecase;

import com.socoolheeya.travel.app.internal.api.core.property.domain.http.PropertyRequest;
import com.socoolheeya.travel.app.internal.api.core.property.domain.http.PropertyResponse;

public interface PropertyUseCase {
    PropertyResponse.Search searchById(Long propertyId);
    PropertyResponse.SearchByConditions searchByConditions(PropertyRequest.Search request);


}
