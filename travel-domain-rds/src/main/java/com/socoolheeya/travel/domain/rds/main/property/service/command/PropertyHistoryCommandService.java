package com.socoolheeya.travel.domain.rds.main.property.service.command;

import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyHistoryEntity;
import com.socoolheeya.travel.domain.rds.main.property.repository.PropertyHistoryJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PropertyHistoryCommandService {

    private final PropertyHistoryJpaRepository propertyHistoryJpaRepository;

    @Transactional
    public void save(PropertyHistoryEntity entity) throws DataAccessException {
        propertyHistoryJpaRepository.save(entity);
    }
}
