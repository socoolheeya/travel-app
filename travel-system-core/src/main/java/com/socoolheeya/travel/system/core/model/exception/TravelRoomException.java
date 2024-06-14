package com.socoolheeya.travel.system.core.model.exception;

import com.socoolheeya.travel.system.core.enums.CommonSupplierEnums;
import com.socoolheeya.travel.system.core.enums.ErrorEnums;
import org.springframework.http.HttpStatus;

public class TravelRoomException extends BaseException {
    public TravelRoomException() {
        super(ErrorEnums.BAD_REQUEST.getMessage());
    }

    public TravelRoomException(int code, HttpStatus status, String message) {
        super(code, status, message);
    }

    public TravelRoomException(int code, HttpStatus status, String message, CommonSupplierEnums supplier) {
        super(code, status, message, supplier);
    }
}
