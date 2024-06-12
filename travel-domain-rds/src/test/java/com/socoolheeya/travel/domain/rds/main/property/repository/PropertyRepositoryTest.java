package com.socoolheeya.travel.domain.rds.main.property.repository;

import com.socoolheeya.travel.domain.rds.configuration.MainDatasourceConfiguration;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyEntity;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

@ActiveProfiles("local")
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Import(MainDatasourceConfiguration.class)
class PropertyRepositoryTest {

    @Autowired
    PropertyJpaRepository propertyJpaRepository;

    @Autowired
    private EntityManager em;



    @Test
    @Transactional
    @Rollback(false)
    void insertTest() {
        PropertyEntity propertyEntity = new PropertyEntity(null, "테스트 숙소", "Test Property", true);
        propertyJpaRepository.save(propertyEntity);
//        for(int i = 0 ; i < 1000; i++) {
//            PropertyEntity propertyEntity = new PropertyEntity(null, "테스트 숙소_" + i, "Test Property_" + i, true);
//            propertyJpaRepository.save(propertyEntity);
//        }

    }




}
