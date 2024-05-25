package com.socoolheeya.travel.domain.rds.main.supplier.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class SupplierEnums {

    @Getter
    @AllArgsConstructor
    public enum Type {
        DC, CMS, PMS
    }
}
