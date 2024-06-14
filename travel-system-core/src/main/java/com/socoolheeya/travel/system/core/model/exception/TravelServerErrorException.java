package com.socoolheeya.travel.system.core.model.exception;

import com.socoolheeya.travel.system.core.enums.CommonSupplierEnums;
import com.socoolheeya.travel.system.core.enums.ErrorEnums;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class TravelServerErrorException extends BaseException {
    public TravelServerErrorException() {
        super(ErrorEnums.SERVER_ERROR.getMessage());
    }

    public TravelServerErrorException(int code, String message) {
        super(code, HttpStatus.INTERNAL_SERVER_ERROR, message);
    }

    public TravelServerErrorException(int code, HttpStatus status, String message) {
        super(code, status, message);
    }

    public TravelServerErrorException(int code, HttpStatus status, String message, CommonSupplierEnums supplier) {
        super(code, status, message, supplier);
    }
}
