package com.socoolheeya.travel.app.internal.api.core.property.domain.http;

import com.socoolheeya.travel.domain.rds.main.property.domain.Property;
import com.socoolheeya.travel.system.core.enums.CommonSupplierEnums;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.UtilityClass;

import java.util.List;

@UtilityClass
public class PropertyResponse {

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public static class Search {
        Property property;

    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public static class SearchByConditions {
        List<Property> properties;

    }
}
