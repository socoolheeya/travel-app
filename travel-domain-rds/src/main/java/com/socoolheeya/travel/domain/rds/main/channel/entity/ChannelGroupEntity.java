package com.socoolheeya.travel.domain.rds.main.channel.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Table(name = "channel_group")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChannelGroupEntity {
    @Id
    @Column(name = "channel_group_id", columnDefinition = "bigint comment '채널 그룹 ID'")
    Long id;

    @NotNull
    @Column(columnDefinition = "varchar(500) comment '채널 그룹명'")
    String name;

    @OneToMany(mappedBy = "channelGroup")
    List<ChannelEntity> channels = new ArrayList<>();

    @Builder
    public ChannelGroupEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
