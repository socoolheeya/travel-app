package com.socoolheeya.travel.domain.rds.main.property.service.command;

import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyAddressEntity;
import com.socoolheeya.travel.domain.rds.main.property.repository.PropertyAddressJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PropertyAddressCommandService {

    private PropertyAddressJpaRepository propertyAddressJpaRepository;

    @Transactional
    public void save(PropertyAddressEntity entity) {
        propertyAddressJpaRepository.save(entity);
    }
}
