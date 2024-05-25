package com.socoolheeya.travel.app.internal.api.core.property.domain.http;

import com.socoolheeya.travel.system.core.enums.CommonSupplierEnums;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.UtilityClass;

@UtilityClass
public class PropertyRequest {

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public static class Search {
        String name;

        @Builder.Default
        CommonSupplierEnums supplier = CommonSupplierEnums.TAVI;

        @Builder.Default
        Boolean isEnabled = true;

        @Builder.Default
        Boolean canBookSameDay = false;
    }

}
