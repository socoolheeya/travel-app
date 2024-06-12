package com.socoolheeya.travel.domain.rds.main.property.service.query;

import com.socoolheeya.travel.domain.rds.main.property.domain.Property;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyEntity;
import com.socoolheeya.travel.domain.rds.main.property.repository.PropertyJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PropertyQueryService {

    private final PropertyJpaRepository propertyJpaRepository;

    public Property searchPropertyById(Long propertyId) {
        Optional<PropertyEntity> optional = propertyJpaRepository.findById(propertyId);
        if(optional.isEmpty()) {
           return null;
        }

        return null;
    }

    /**
     * 검색 조건(사용여부)으로 숙소 목록 조회
     * @param isEnabled 사용여부
     * @return 숙소 목록
     */
    public List<Property> searchPropertiesByIsEnabled(Boolean isEnabled) {
        return null;
//        return propertyJpaRepository.findAll()
//                .stream()
//                .filter(x -> x.getIsEnabled().equals(isEnabled))
//                .map(PropertyEntity::toDomain)
//                .collect(Collectors.toList());
    }

}
