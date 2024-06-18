package com.socoolheeya.travel.domain.rds.main.property.service.command;

import com.socoolheeya.travel.domain.rds.main.property.domain.Property;
import com.socoolheeya.travel.domain.rds.main.property.mapper.PropertyMapper;
import com.socoolheeya.travel.domain.rds.main.property.repository.PropertyJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PropertyCommandService {

    private final PropertyJpaRepository propertyJpaRepository;

    @Transactional
    public Property saveProperty(Property property) {
        return Optional.of(propertyJpaRepository.save(PropertyMapper.INSTANCE.toEntity(property)))
                .map(PropertyMapper.INSTANCE::toDomain)
                .orElse(Property.builder().build());
    }

}
