package com.socoolheeya.travel.system.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RoomEnums {

    @Getter
    @AllArgsConstructor
    public enum Status {
        READY, ON_SALE
    }

    @Getter
    @AllArgsConstructor
    public enum RoomType {
        SINGLE, DOUBLE, TRIPLE, QUAD, QUEEN, KING, TWIN, DOUBLE_DOUBLE, STUDIO,
        STANDARD, DELUXE, SUITE, APARTMENT, VILLA
    }

    public enum RoomSizeUnit {
        SQUARE_METERS, PYOUNG, FEET, DADAMI
    }

    @Getter
    @AllArgsConstructor
    public enum Amenity {
        SHAMPOO, HAIR_DRYER, SOFA, PEN, TOWEL
    }

    @Getter
    @AllArgsConstructor
    public enum Equipment {
        TV, AIR_CONDITIONER,
        REFRIGERATOR, DESK_LAMP,
        SAFE, COSET,
        COAT_HANGERS, BLANKET,
        AUSTIN,
        LUGGAGE_RACK, MINI_BAR
    }

    @Getter
    @AllArgsConstructor
    public enum Facility {
        ATM("", ""),
        LIBRARY("", ""),
        SHOPPING_CENTER("", ""),
        CONVENIENCE_STORE("", ""),
        LAUNDRY_ROOM("", ""),
        BUSINESS_CENTER("", ""),
        PRIVATE_BEACH("", ""),
        CONFERENCE_CENTER("", ""),
        ARCADE("entertainment", "오락실"),
        NIGHT_CLUB("entertainment", "나이트 클럽"),
        CASINO("entertainment", "카지노");

        private final String category;
        private final String description;
    }

    @Getter
    @AllArgsConstructor
    public enum Service {
        WEDDING, VIDEO_RENTAL, LUGGAGE_STORAGE, SHUTTLE_BUS,

    }

    public enum View {
        SEA, MOUNTAIN, LAKE, RIVER, CITY, HOVER, BEACH
    }
}
