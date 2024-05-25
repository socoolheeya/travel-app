package com.socoolheeya.travel.domain.rds.common.entity;


import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@MappedSuperclass
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class WeekEntity {

    @Column(columnDefinition = "bool comment '적용 요일-월요일'")
    boolean monday;

    @Column(columnDefinition = "bool comment '적용 요일-화요일'")
    boolean tuesday;

    @Column(columnDefinition = "bool comment '적용 요일-수요일'")
    boolean wednesday;

    @Column(columnDefinition = "bool comment '적용 요일-목요일'")
    boolean thursday;

    @Column(columnDefinition = "bool comment '적용 요일-금요일'")
    boolean friday;

    @Column(columnDefinition = "bool comment '적용 요일-토요일'")
    boolean saturday;

    @Column(columnDefinition = "bool comment '적용 요일-일요일'")
    boolean sunday;
}
