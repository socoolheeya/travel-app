package com.socoolheeya.travel.domain.rds.main.rate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@Entity
@Table(name = "currency")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CurrencyEntity {

    @Id
    @Column(name = "code", columnDefinition = "char(5) comment '코드'")
    String code;

    @Column(name = "symbol", columnDefinition = "char(5) comment '심볼'")
    String symbol;

}
