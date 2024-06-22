package com.socoolheeya.travel.domain.rds.main.property.repository;

import com.socoolheeya.travel.domain.rds.configuration.MainDatasourceConfiguration;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyEntity;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StopWatch;

import javax.sql.DataSource;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


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
        StopWatch watch = new StopWatch();
        watch.start();
        IntStream.range(0, 1000)
                .mapToObj(i -> new PropertyEntity(null, "테스트 숙소_" + i, "Test Property_" + i, "숙소 설명_" + i, "Test Property Description_" + i, true))
                .collect(Collectors.collectingAndThen(Collectors.toList(), propertyJpaRepository::saveAll));

        watch.stop();
        System.out.println("saveAllTest execution time:" + watch.getTotalTimeMillis());
    }

    @Test
    @Transactional
    @Rollback(false)
    void saveForTest() {
        StopWatch watch = new StopWatch();
        watch.start();
        IntStream.range(0, 1000)
                .mapToObj(i -> new PropertyEntity(null, "테스트 숙소_" + i, "Test Property_" + i, "숙소 설명_" + i, "Test Property Description_" + i, true))
                .forEach(propertyJpaRepository::save);
        watch.stop();
        System.out.println("saveForTest execution time: " + watch.getTotalTimeMillis());
    }

    @Test
    @Timeout(5)
    @Transactional
    @Rollback(false)
    void syncSaveTest() {
        List<PropertyEntity> propertyEntities = IntStream.range(0, 1000)
                .mapToObj(i -> new PropertyEntity(null, "테스트 숙소_" + i, "Test Property_" + i, "숙소 설명_" + i, "Test Property Description_" + i, true))
                .toList();

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        CompletableFuture.allOf(propertyEntities.parallelStream()
                        .map(entity -> CompletableFuture.runAsync(() -> propertyJpaRepository.save(entity)))
                        .toArray(CompletableFuture[]::new))
                .join();

        stopWatch.stop();
        System.out.println("syncSaveTest execution time: " + stopWatch.getTotalTimeMillis());
    }

}
