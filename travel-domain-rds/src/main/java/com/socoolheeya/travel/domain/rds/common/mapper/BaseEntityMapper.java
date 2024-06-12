package com.socoolheeya.travel.domain.rds.common.mapper;

public interface BaseEntityMapper<D, E> {
    D toDomain(E entity);
    E toEntity(D domain);
}
