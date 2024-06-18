package com.socoolheeya.travel.domain.rds.main.property.service.query;

import com.socoolheeya.travel.domain.rds.main.property.domain.Property;
import com.socoolheeya.travel.domain.rds.main.property.mapper.PropertyMapper;
import com.socoolheeya.travel.domain.rds.main.property.repository.PropertyJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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

    /**
     *
     * @param propertyId 숙소 ID
     * @return
     */
    public Optional<Property> searchPropertyById(Long propertyId) {
        return propertyJpaRepository.findById(propertyId)
                .map(PropertyMapper.INSTANCE::toDomain);
    }

    public Page<Property> searchProperties(int pageNo, int pageSize, Sort sort) {
        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
        return propertyJpaRepository.findAll(pageable)
                .map(PropertyMapper.INSTANCE::toDomain);
    }

    /**
     * 검색 조건(사용여부)으로 숙소 목록 조회
     * @param isEnabled 사용여부
     * @return 숙소 목록
     */
    public List<Property> searchPropertiesByIsEnabled(Boolean isEnabled) {
        return propertyJpaRepository.findAll()
                .stream()
                .filter(x -> x.getIsEnabled().equals(isEnabled))
                .map(PropertyMapper.INSTANCE::toDomain)
                .collect(Collectors.toList());
    }

}
