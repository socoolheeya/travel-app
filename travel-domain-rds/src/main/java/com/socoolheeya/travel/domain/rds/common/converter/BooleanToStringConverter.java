package com.socoolheeya.travel.domain.rds.common.converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.springframework.util.StringUtils;

@Converter
public class BooleanToStringConverter implements AttributeConverter<Boolean, String> {

    @Override
    public String convertToDatabaseColumn(Boolean flag) {
        return Boolean.TRUE.equals(flag) ? "Y" : "N";
    }

    @Override
    public Boolean convertToEntityAttribute(String s) {
        if(!StringUtils.hasText(s)) {
           return false;
        }
        return "Y".equalsIgnoreCase(s);
    }
}
