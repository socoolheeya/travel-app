package com.socoolheeya.travel.domain.rds.main.channel.entity;

import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
@Table(name = "channel_manager")
@Comment("채널 관리자 정보")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChannelManagerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "channel_manager_id", columnDefinition = "bigint comment '채널 관리자 ID'")
    Long id;

    @Column(columnDefinition = "varchar(1000) comment '패스워드'")
    String password;

    @Column(columnDefinition = "varchar(1000) comment ''")
    String accountKey;

    @Column(columnDefinition = "bool comment '사용 여부'")
    Boolean isEnabled = true;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "channel_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    ChannelEntity channel;

    @Builder
    public ChannelManagerEntity(Long id, String password, String accountKey, Boolean isEnabled, ChannelEntity channel) {
        this.id = id;
        this.password = password;
        this.accountKey = accountKey;
        this.isEnabled = isEnabled;
        this.channel = channel;
    }

    @Builder
    public ChannelManagerEntity(Long id, String password, String accountKey, Boolean isEnabled) {
        this(id, password, accountKey, isEnabled, null);
    }
}
