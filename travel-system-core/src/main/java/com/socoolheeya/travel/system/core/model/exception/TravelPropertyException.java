package com.socoolheeya.travel.system.core.model.exception;

import com.socoolheeya.travel.system.core.enums.CommonSupplierEnums;
import com.socoolheeya.travel.system.core.enums.ErrorEnums;
import org.springframework.http.HttpStatus;

public class TravelPropertyException extends BaseException {

    public TravelPropertyException() {
        super(ErrorEnums.BAD_REQUEST.getMessage());
    }

    public TravelPropertyException(int code, HttpStatus status, String message) {
        super(code, status, message);
    }

    public TravelPropertyException(int code, HttpStatus status, String message, CommonSupplierEnums supplier) {
        super(code, status, message, supplier);
    }
}
