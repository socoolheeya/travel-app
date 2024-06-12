package com.socoolheeya.travel.domain.rds.main.room.entity;

import com.socoolheeya.travel.domain.rds.main.room.entity.pk.RoomRatePlanId;
import com.socoolheeya.travel.domain.rds.main.rateplan.entity.RatePlanEntity;
import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.domain.Persistable;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "room_rate_plan")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoomRatePlanEntity implements Persistable<RoomRatePlanId> {

    @EmbeddedId
    RoomRatePlanId id;

    @MapsId("roomId")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    RoomEntity room;

    @MapsId("ratePlanId")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rate_plan_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    RatePlanEntity ratePlan;

    @Column(name = "is_enabled", columnDefinition = "bool comment '사용 여부'")
    Boolean isEnabled = true;

    @CreatedDate
    @Column(name = "created_at", updatable = false, columnDefinition = "datetime comment '생성일'")
    LocalDateTime createdAt;

    public void setParent(RoomEntity room) {
        this.room = room;
        this.id = new RoomRatePlanId(room.getId(), ratePlan.getId());
    }

    @Override
    public RoomRatePlanId getId() {
        return id;
    }

    @Override
    public boolean isNew() {
        return createdAt == null;
    }

    @Builder
    public RoomRatePlanEntity (Boolean isEnabled, RoomEntity room, RatePlanEntity ratePlan) {
        this.id = null;
        this.isEnabled = isEnabled;
        this.room = room;
        this.ratePlan = ratePlan;
    }

    @Builder
    public RoomRatePlanEntity(RoomRatePlanId id, Boolean isEnabled) {
        this.id = id;
        this.isEnabled = isEnabled;
        this.room = null;
        this.ratePlan = null;
    }
}
