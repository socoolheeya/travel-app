package com.socoolheeya.travel.domain.rds.main.property.entity;

import com.socoolheeya.travel.domain.rds.common.entity.Audit;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.hibernate.envers.Audited;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter
@Entity
@Table(name = "property_history")
@Audited(withModifiedFlag = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
@EntityListeners(value = {AuditingEntityListener.class})
public class PropertyHistoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "property_history_seq")
    @SequenceGenerator(name = "property_history_seq", sequenceName = "property_history_seq")
    @Column(name = "\"key\"")
    Long propertyKey;

    @Column(name = "property_id", columnDefinition = "bigint comment '시설 ID'")
    Long id;

    @NotNull
    @Column(columnDefinition = "varchar(500) comment '시설명(KR)'")
    String koName;

    @Column(columnDefinition = "varchar(500) comment '시설명(EN)'")
    String enName;

    @Column(columnDefinition = "bool comment '사용 여부'")
    Boolean isEnabled = true;

    @Embedded
    Audit audit;

    public Long getCreatedBy() {
        return audit.getCreatedBy();
    }


}
