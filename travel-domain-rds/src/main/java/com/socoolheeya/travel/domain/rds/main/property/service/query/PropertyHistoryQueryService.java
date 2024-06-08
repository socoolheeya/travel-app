package com.socoolheeya.travel.domain.rds.main.property.service.query;

import com.socoolheeya.travel.domain.rds.main.property.repository.PropertyHistoryJpaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PropertyHistoryQueryService {
    private final PropertyHistoryJpaRepository propertyHistoryJpaRepository;

    public void getLastChangeRevision(Long id) {
        propertyHistoryJpaRepository.findById(id)
                .ifPresent(revision -> log.info(String.valueOf(revision)));
    }
}
