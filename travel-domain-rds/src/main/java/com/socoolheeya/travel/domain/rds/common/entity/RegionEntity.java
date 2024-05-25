package com.socoolheeya.travel.domain.rds.common.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Table(name = "region")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RegionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "region_id", columnDefinition = "bigint comment '지역 ID'")
    Long id;

    @NotNull
    @Column(name = "\"code\"", columnDefinition = "varchar(255) comment '지역 코드'")
    String code;

    @NotNull
    @Column(name = "\"name\"", columnDefinition = "varchar(255) comment '지역명'")
    String name;

    @OneToMany(mappedBy = "region")
    List<CountryEntity> countries = new ArrayList<>();
}
