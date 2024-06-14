package com.socoolheeya.travel.system.core.model.exception;

import com.socoolheeya.travel.system.core.enums.CommonSupplierEnums;
import com.socoolheeya.travel.system.core.enums.ErrorEnums;
import com.socoolheeya.travel.system.core.model.error.TravelError;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public abstract class BaseException extends RuntimeException {

    protected int code;
    protected HttpStatus status;
    protected String message;
    protected CommonSupplierEnums supplier;

    BaseException(String message) {
        super(message);
        this.code = ErrorEnums.BAD_REQUEST.getCode();
        this.status = HttpStatus.BAD_REQUEST;
        this.message = message;
        this.supplier = CommonSupplierEnums.UNKNOWN;
    }

    BaseException(int code, HttpStatus status, String message) {
        super(message);
        this.code = code;
        this.status = status;
        this.message = message;
        this.supplier = CommonSupplierEnums.UNKNOWN;
    }

    BaseException(int code, HttpStatus status, String message, CommonSupplierEnums supplier) {
        super(message);
        this.code = code;
        this.status = status;
        this.message = message;
        this.supplier = supplier;
    }

    public TravelError toTravelError() {
        return TravelError.builder()
                .errorCode(code)
                .status(status)
                .errorMessage(message)
                .supplier(supplier)
                .build();
    }

}
