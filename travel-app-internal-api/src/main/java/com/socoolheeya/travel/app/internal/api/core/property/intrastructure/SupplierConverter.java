package com.socoolheeya.travel.app.internal.api.core.property.intrastructure;

import com.socoolheeya.travel.system.core.enums.CommonSupplierEnums;
import org.springframework.core.convert.converter.Converter;
import org.springframework.util.ObjectUtils;

public class SupplierConverter implements Converter<Integer, CommonSupplierEnums> {

    @Override
    public CommonSupplierEnums convert(Integer source) {
        if(ObjectUtils.isArray(source)) {
            return null;
        }
        return CommonSupplierEnums.fromByCode(source);
    }
}
