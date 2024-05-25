package com.socoolheeya.travel.domain.rds.main.channel.entity;

import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Getter
@Entity
@Table(name = "channel")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChannelEntity {
    @Id
    @Column(name = "channel_id", columnDefinition = "bigint comment '채널 ID'")
    Long id;

    @NotNull
    @Column(columnDefinition = "varchar(500) comment '채널명'")
    String name;

    @Column(columnDefinition = "decimal(15,4) comment '커미션'")
    BigDecimal commission = BigDecimal.ZERO;

    @NotNull
    @Column(columnDefinition = "bool comment '사용 여부'")
    Boolean isEnabled = true;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "channel_group_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    ChannelGroupEntity channelGroup;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "channel_manager_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    ChannelManagerEntity channelManager;
}
