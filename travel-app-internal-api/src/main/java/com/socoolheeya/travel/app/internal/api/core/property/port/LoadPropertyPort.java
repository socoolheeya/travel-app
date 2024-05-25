package com.socoolheeya.travel.app.internal.api.core.property.port;

import com.socoolheeya.travel.app.internal.api.core.property.domain.http.PropertyRequest;
import com.socoolheeya.travel.domain.rds.main.property.domain.Property;

import java.util.List;

public interface LoadPropertyPort {
    Property load(Long propertyId);

    List<Property> loadBySearchConditions(PropertyRequest.Search request);
}
