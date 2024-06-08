package com.socoolheeya.travel.domain.rds.main.rate.service.query;

import com.socoolheeya.travel.domain.rds.configuration.MainDatasourceConfiguration;
import com.socoolheeya.travel.domain.rds.main.rate.mapper.RateMapper;
import com.socoolheeya.travel.domain.rds.main.rate.repository.RateJpaRepository;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;


@ActiveProfiles("local")
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Import(MainDatasourceConfiguration.class)
class RateQueryServiceTest {

    @Autowired
    private EntityManager em;

    @Autowired
    private RateQueryService rateQueryService;

    @Autowired
    private RateJpaRepository rateJpaRepository;

    @Autowired
    private RateMapper rateMapper;

    @Test
    public void test() {
        rateQueryService.findByRatePlanId(1L);
    }

}