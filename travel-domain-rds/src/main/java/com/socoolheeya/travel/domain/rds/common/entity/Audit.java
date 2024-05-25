package com.socoolheeya.travel.domain.rds.common.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Getter
@Setter
@Embeddable
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Audit {

    @CreatedBy
    @Column(name = "created_by")
    Long createdBy;

    @CreatedDate
    @Column(name = "created_at")
    LocalDateTime createdAt;

    @LastModifiedBy
    @Column(name = "updated_by")
    Long updatedBy;

    @LastModifiedDate
    @Column(name = "updated_at")
    LocalDateTime updatedAt;
}
