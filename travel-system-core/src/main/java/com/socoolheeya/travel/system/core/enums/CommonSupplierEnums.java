package com.socoolheeya.travel.system.core.enums;


import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Objects;

@Getter
@AllArgsConstructor
public enum CommonSupplierEnums {

    TAVI(1, "DC", "Tide Square"),
    DERBY(2, "DS","Derby"),
    TL_LINCOLN(3, "TL", "Tl_Lincoln"),
    TRIPANZEE(4, "TZ", "Tripanzee"),
    SITE_MINDER(5, "SM", "Site Minder"),
    SONO(6, "SN", "Sono"),
    SANHA(7, "SH", "Sanha"),
    HANWHA(8, "HW", "Hanwha"),
    KUMHO(9, "KH", "Kumho"),
    DDNAYO(10, "DD", "Ddnayo"),
    COUPANG(11, "CP", "Coupang"),
    D_EDGE(12, "DE", "D_Edge"),
    TEMAIRAZU(13, "TR", "Temairazu"),
    ONDA(14, "OD", "ONDA"),
    HOTEL_STORY(14, "HS", "Hotel Story"),
    HOTEL_STORY_DISTRIBUTOR(15, "HD", "Derby"),
    UNKNOWN(0, null, "Unknown");

    private final Integer code;
    private final String shortName;
    private final String description;

    @JsonCreator
    public static CommonSupplierEnums fromByCode(Integer code) {
        return Arrays.stream(CommonSupplierEnums.values())
                .filter(x -> Objects.equals(x.getCode(), code))
                .findFirst()
                .orElse(null);
    }
}
