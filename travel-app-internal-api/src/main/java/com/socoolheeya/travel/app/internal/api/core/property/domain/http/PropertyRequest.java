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

import java.util.HashSet;
import java.util.Set;

@UtilityClass
public class PropertyRequest {

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public static class Search {
        String language;

        String name;

        Set<CommonSupplierEnums> suppliers;

        @Builder.Default
        Boolean isEnabled = true;

        @Builder.Default
        Boolean canBookSameDay = false;
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public static class Register {
        Property property;
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public static class Modify {
        Long id;
        String koName;
        String enName;
        Boolean isEnabled;
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public static class Remove {
        Long propertyId;
    }

}
