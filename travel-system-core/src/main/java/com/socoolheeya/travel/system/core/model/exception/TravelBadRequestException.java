package com.socoolheeya.travel.system.core.model.exception;

import com.socoolheeya.travel.system.core.enums.CommonSupplierEnums;
import com.socoolheeya.travel.system.core.enums.ErrorEnums;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class TravelBadRequestException extends BaseException {

    public TravelBadRequestException() {
        super(ErrorEnums.BAD_REQUEST.getMessage());
    }

    public TravelBadRequestException(int code, String message) {
        super(code, HttpStatus.BAD_REQUEST, message);
    }

    public TravelBadRequestException(int code, HttpStatus status, String message) {
        super(code, status, message);
    }

    public TravelBadRequestException(int code, HttpStatus status, String message, CommonSupplierEnums supplier) {
        super(code, status, message, supplier);
    }
}
