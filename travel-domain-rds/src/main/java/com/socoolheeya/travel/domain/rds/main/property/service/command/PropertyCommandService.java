package com.socoolheeya.travel.domain.rds.main.property.service.command;

import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyEntity;
import com.socoolheeya.travel.domain.rds.main.property.repository.PropertyJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PropertyCommandService {

    private final PropertyJpaRepository propertyJpaRepository;

    @Transactional
    public PropertyEntity saveProperty(PropertyEntity entity) throws DataAccessException {
        return propertyJpaRepository.save(entity);
    }

}
