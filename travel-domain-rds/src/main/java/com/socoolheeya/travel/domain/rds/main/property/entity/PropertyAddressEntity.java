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
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "property_address")
@Comment("숙소 주소")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PropertyAddressEntity {
    @Id
    @Column(name = "property_id", columnDefinition = "bigint comment '숙소 ID'")
    Long id;

    @Column(name = "address", columnDefinition = "varchar(1000) comment '주소'")
    String address;

    @Column(name = "address_detail", columnDefinition = "varchar(1000) comment '상세 주소'")
    String addressDetail;

    @Column(name = "zip_code", columnDefinition = "varchar(500) comment '우편번호'")
    String zipCode;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "property_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    PropertyEntity property;
}
