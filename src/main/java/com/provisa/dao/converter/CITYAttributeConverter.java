package com.provisa.dao.converter;

import com.provisa.consts.CITY;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class CITYAttributeConverter implements AttributeConverter<CITY, String> {
    @Override
    public String convertToDatabaseColumn(CITY attribute) {
        return attribute != null ? attribute.getCityName() : null;
    }

    @Override
    public CITY convertToEntityAttribute(String dbData) {
        if (dbData == null) return null;
        for (CITY city : CITY.values()) {
            if (city.getCityName().equalsIgnoreCase(dbData) || city.name().equalsIgnoreCase(dbData)) {
                return city;
            }
        }
        return null;
    }
}

