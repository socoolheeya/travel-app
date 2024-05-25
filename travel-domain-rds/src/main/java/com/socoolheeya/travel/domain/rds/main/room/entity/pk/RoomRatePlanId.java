package com.socoolheeya.travel.domain.rds.main.room.entity.pk;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class RoomRatePlanId implements Serializable {

    @Column(name = "room_id", columnDefinition = "bigint comment '객실 ID'")
    Long roomId;

    @Column(name = "rate_plan_id", columnDefinition = "bigint comment '요금제 ID'")
    Long ratePlanId;
}
