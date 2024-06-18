package com.socoolheeya.travel.domain.rds.main.property.repository;

import com.socoolheeya.travel.domain.rds.configuration.MainDatasourceConfiguration;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyEntity;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StopWatch;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;


@DataJpaTest
@ActiveProfiles("test")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Import(MainDatasourceConfiguration.class)
class PropertyRepositoryTest {

    @Autowired
    private DataSource mainDataSource;

    @Autowired
    PropertyJpaRepository propertyJpaRepository;

    @Autowired
    private EntityManager em;


    @Test
    @Transactional
    @Rollback(false)
    void insertTest() {
        PropertyEntity propertyEntity = new PropertyEntity(null, "테스트 숙소", "Test Property", "숙소 설명", "Test Property Description", true);
        propertyJpaRepository.save(propertyEntity);
    }

    @Test
    @Transactional
    @Rollback(false)
    void saveAllTest() {
        List<PropertyEntity> propertyEntities = new ArrayList<>();
        for(int i = 0 ; i < 1000000; i++) {
            propertyEntities.add(new PropertyEntity(null, "테스트 숙소_" + i, "Test Property_" + i, "숙소 설명_" + i, "Test Property Description_" + i, true));
        }
        StopWatch watch = new StopWatch();
        watch.start();
        propertyJpaRepository.saveAll(propertyEntities);
        watch.stop();
        System.out.println(watch.getTotalTimeMillis());
    }

    @Test
    @Transactional
    @Rollback(false)
    void saveForTest() {
        StopWatch watch = new StopWatch();
        watch.start();
        for(int i = 0 ; i < 1000000; i++) {
            PropertyEntity entity = new PropertyEntity(null, "테스트 숙소_" + i, "Test Property_" + i, "숙소 설명_" + i, "Test Property Description_" + i, true);
            propertyJpaRepository.save(entity);
        }
        watch.stop();
        System.out.println(watch.getTotalTimeMillis());
    }

    @Test
    @Transactional
    @Rollback(false)
    public void syncSaveTest() throws ExecutionException, InterruptedException {
        List<PropertyEntity> propertyEntities = new ArrayList<>();
        for(int i = 0 ; i < 1000000; i++) {
            propertyEntities.add(new PropertyEntity(null, "테스트 숙소_" + i, "Test Property_" + i, "숙소 설명_" + i, "Test Property Description_" + i, true));
        }

        ForkJoinPool forkJoinPool = new ForkJoinPool(10);
        StopWatch watch = new StopWatch();
        watch.start();
        forkJoinPool.submit(() -> propertyEntities.parallelStream()
                .forEach(entity -> {
                    propertyJpaRepository.save(entity);
                })
        ).get();
        watch.stop();
        System.out.println(watch.getTotalTimeMillis());
    }






}
