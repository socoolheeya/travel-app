package com.socoolheeya.travel.system.core.model.error;

import com.socoolheeya.travel.system.core.enums.CommonSupplierEnums;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TravelError {
    private int errorCode;
    private HttpStatus status;
    private String errorMessage;
    private CommonSupplierEnums supplier;
}
