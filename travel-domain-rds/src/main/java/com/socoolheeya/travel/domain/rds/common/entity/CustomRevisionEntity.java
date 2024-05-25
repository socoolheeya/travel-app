package com.socoolheeya.travel.domain.rds.common.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.hibernate.envers.RevisionEntity;
import org.hibernate.envers.RevisionNumber;
import org.hibernate.envers.RevisionTimestamp;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

@Getter
@Entity
@RevisionEntity
@Table(name = "revision_history")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CustomRevisionEntity {

    @Id
    @RevisionNumber
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "revision_id", columnDefinition = "bigint comment 'revision ID'")
    Long revisionId;

    @RevisionTimestamp
    @Column(name = "updated_at")
    Long updatedAt;

    public LocalDateTime getUpdatedAt() {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(updatedAt), ZoneId.systemDefault());
    }
}
