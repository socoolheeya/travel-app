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
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

@Getter
@Entity
@Comment("숙소 연락 정보")
@Table(name = "property_contact")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
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

    @Builder
    public PropertyContactEntity(Long id, String email, String telephone, String secondTelephone, String website, PropertyEntity property) {
        this.id = id;
        this.email = email;
        this.telephone = telephone;
        this.secondTelephone = secondTelephone;
        this.website = website;
        this.property = property;
    }

    @Builder
    public PropertyContactEntity(Long id, String email, String telephone, String secondTelephone, String website) {
        this.id = id;
        this.email = email;
        this.telephone = telephone;
        this.secondTelephone = secondTelephone;
        this.website = website;
        this.property = null;
    }



}
