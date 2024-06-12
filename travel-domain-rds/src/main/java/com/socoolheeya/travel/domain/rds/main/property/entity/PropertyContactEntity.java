package com.socoolheeya.travel.domain.rds.main.property.entity;

import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "property_contact")
@Comment("숙소 연락 정보")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PropertyContactEntity {

    @Id
    @Column(name = "property_id", columnDefinition = "bigint comment '숙소 ID'")
    Long id;

    @Column(columnDefinition = "varchar(255) comment '이메일'")
    String email;

    @Column(columnDefinition = "varchar(255) comment '연락처'")
    String telephone;

    @Column(columnDefinition = "varchar(255) comment '연락처2'")
    String secondTelephone;

    @Column(columnDefinition = "varchar(255) comment '웹사이트 주소'")
    String website;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "property_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    PropertyEntity property;



}
