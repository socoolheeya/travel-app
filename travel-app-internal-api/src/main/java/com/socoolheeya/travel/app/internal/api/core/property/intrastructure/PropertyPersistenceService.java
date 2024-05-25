package com.socoolheeya.travel.app.internal.api.core.property.intrastructure;

import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyEntity;

public interface PropertyPersistenceService {
    PropertyEntity findById(Long propertyId);
}
