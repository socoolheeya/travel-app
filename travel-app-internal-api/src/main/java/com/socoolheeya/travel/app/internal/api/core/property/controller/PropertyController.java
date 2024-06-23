package com.socoolheeya.travel.app.internal.api.core.property.controller;

import com.socoolheeya.travel.app.internal.api.core.property.domain.http.PropertyRequest;
import com.socoolheeya.travel.app.internal.api.core.property.domain.http.PropertyResponse;
import com.socoolheeya.travel.app.internal.api.core.property.service.PropertyService;
import com.socoolheeya.travel.domain.rds.main.property.domain.Property;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1.0/app/properties")
public class PropertyController {

    private final PropertyService propertyService;

    @GetMapping("/{propertyId:\\d+}")
    public ResponseEntity<PropertyResponse.Search> searchProperty(@PathVariable Long propertyId) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(PropertyResponse.Search.builder()
                        .property(propertyService.searchById(propertyId))
                        .build());

    }

    @GetMapping("")
    public ResponseEntity<PropertyResponse.SearchByConditions> searchByConditions(@ModelAttribute PropertyRequest.Search request, Pageable pageable) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(PropertyResponse.SearchByConditions.builder()
                        .properties(propertyService.searchByConditions(request, pageable))
                        .build());
    }

    @PostMapping("")
    public ResponseEntity<PropertyResponse.Register> registerProperty(@RequestBody PropertyRequest.Register request) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(PropertyResponse.Register.builder()
                        .property(propertyService.register(request.getProperty()))
                        .build());
    }

    @PutMapping("/{propertyId:\\d+}")
    public ResponseEntity<PropertyResponse.Modify> modifyProperty(@PathVariable Long propertyId, @RequestBody PropertyRequest.Modify request) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(PropertyResponse.Modify.builder()
                        .property(propertyService.modify(Property.builder()
                                .id(propertyId)
                                .koName(request.getKoName())
                                .enName(request.getEnName())
                                .isEnabled(request.getIsEnabled())
                                .build()))
                        .build());
    }

    @DeleteMapping("/{propertyId:\\d+}")
    public ResponseEntity<Void> removeProperty(@PathVariable Long propertyId) {
        propertyService.remove(propertyId);
        return ResponseEntity.ok().build();
    }



}
