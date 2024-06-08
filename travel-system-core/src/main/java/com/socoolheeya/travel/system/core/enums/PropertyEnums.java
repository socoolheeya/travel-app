package com.socoolheeya.travel.system.core.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
public class PropertyEnums {

    @Getter
    @AllArgsConstructor
    public enum Star {
        STAR1("1STAR"),
        STAR2("2STAR"),
        STAR3("3STAR"),
        STAR4("4STAR"),
        STAR5("5STAR");

        private final String code;

        @JsonCreator
        public Star from(String code) {
            return Arrays.stream(Star.values())
                    .filter(x -> x.code.equals(code))
                    .findFirst()
                    .orElse(null);
        }

    }

    @Getter
    @AllArgsConstructor
    public enum ImageType {
        MAIN, AMENITY, FACILITY, ROOM, EXTERIOR
    }
}
