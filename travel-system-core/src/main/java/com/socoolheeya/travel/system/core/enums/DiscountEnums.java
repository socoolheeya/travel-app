package com.socoolheeya.travel.system.core.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
public class DiscountEnums {

    @Getter
    @AllArgsConstructor
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public enum DiscountUnit {
        PERCENT, AMOUNT
    }

}
