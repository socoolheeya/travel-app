package com.socoolheeya.travel.domain.rds.main.channel.domain;

public record ChannelManager(
        Long id,
        String password,
        String accountKey,
        Boolean isEnabled,
        Long channelId
) {
    public ChannelManager {
        isEnabled = true;
    }
}
