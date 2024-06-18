package com.socoolheeya.travel.app.internal.api.common.handler;

import com.socoolheeya.travel.system.core.model.error.TravelError;
import com.socoolheeya.travel.system.core.model.exception.TravelBadRequestException;
import com.socoolheeya.travel.system.core.model.exception.TravelBookingException;
import com.socoolheeya.travel.system.core.model.exception.TravelPropertyException;
import com.socoolheeya.travel.system.core.model.exception.TravelRatePlanException;
import com.socoolheeya.travel.system.core.model.exception.TravelRoomException;
import com.socoolheeya.travel.system.core.model.exception.TravelServerErrorException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(TravelPropertyException.class)
    public ResponseEntity<TravelError> travelPropertyException(TravelPropertyException e) {
        return ResponseEntity.status(e.getStatus())
                .body(e.toTravelError());
    }

    @ExceptionHandler(TravelRoomException.class)
    public ResponseEntity<TravelError> travelRoomException(TravelRoomException e) {
        return ResponseEntity.status(e.getStatus())
                .body(e.toTravelError());
    }

    @ExceptionHandler(TravelRatePlanException.class)
    public ResponseEntity<TravelError> travelRatePlanException(TravelRatePlanException e) {
        return ResponseEntity.status(e.getStatus())
                .body(e.toTravelError());
    }

    @ExceptionHandler(TravelBookingException.class)
    public ResponseEntity<TravelError> travelBookingException(TravelBookingException e) {
        return ResponseEntity.status(e.getStatus())
                .body(e.toTravelError());
    }

    @ExceptionHandler(TravelBadRequestException.class)
    public ResponseEntity<TravelError> travelBadRequestException(TravelBadRequestException e) {
        return ResponseEntity.status(e.getStatus())
                .body(e.toTravelError());
    }

    @ExceptionHandler(TravelServerErrorException.class)
    public ResponseEntity<TravelError> travelServerErrorException(TravelServerErrorException e) {
        return ResponseEntity.status(e.getStatus())
                .body(e.toTravelError());
    }
}
