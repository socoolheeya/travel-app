package com.socoolheeya.travel.app.internal.api.core.property.adapter;

import com.socoolheeya.travel.app.internal.api.core.property.domain.http.PropertyRequest;
import com.socoolheeya.travel.app.internal.api.core.property.domain.http.PropertyResponse;
import com.socoolheeya.travel.app.internal.api.core.property.usecase.PropertyUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1.0/app/properties")
public class PropertyController {

    private final PropertyUseCase propertyUseCase;

    @GetMapping("/{propertyId:\\d+}")
    public ResponseEntity<PropertyResponse.Search> searchProperty(@PathVariable Long propertyId) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(null);

    }

    @GetMapping("")
    public ResponseEntity<PropertyResponse.Search> searchByConditions(PropertyRequest.Search request) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(null);
    }



}
