package com.socoolheeya.travel.domain.rds.main.property.domain;

import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyImageEntity;
import com.socoolheeya.travel.system.core.enums.PropertyEnums;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PropertyImage {
    Long id;
    String name;
    PropertyEnums.ImageType type;
    String path;
    Integer sequence;

    public PropertyImageEntity toEntity() {
        return new PropertyImageEntity(id, name, type, path, sequence, null);
    }
}
