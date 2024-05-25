package com.socoolheeya.travel.domain.rds.common.entity;

import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "country")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CountryEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id", columnDefinition = "bigint comment '국가 ID'")
    Long id;

    @NotNull
    @Column(name = "\"code\"", columnDefinition = "varchar(50) comment '국가 코드'")
    String code;

    @NotNull
    @Column(name = "\"name\"",columnDefinition = "varchar(500) comment '국가명'")
    String name;

    @Column(name = "is_enabled", columnDefinition = "bool comment '사용 여부'")
    boolean isEnabled = true;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "region_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    RegionEntity region;

    @OneToMany(mappedBy = "country")
    List<CityEntity> cities = new ArrayList<>();

}
