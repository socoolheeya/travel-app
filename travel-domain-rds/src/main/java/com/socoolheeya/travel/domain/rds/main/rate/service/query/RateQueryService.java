package com.socoolheeya.travel.domain.rds.main.rate.service.query;

import com.socoolheeya.travel.domain.rds.main.rate.domain.Rate;
import com.socoolheeya.travel.domain.rds.main.rate.mapper.RateMapper;
import com.socoolheeya.travel.domain.rds.main.rate.repository.RateJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class RateQueryService {
    private final RateJpaRepository rateJpaRepository;
    private final RateMapper rateMapper;

//    public Optional<List<Rate>> findByRatePlanId(Long ratePlanId) {
//        return rateJpaRepository.findByRatePlanId(ratePlanId)
//                .map(rateEntities -> rateEntities
//                        .stream()
//                        .map(rateMapper::toDomain)
//                        .collect(Collectors.toList())
//                );
//    }
}
