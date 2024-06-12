package com.socoolheeya.travel.domain.rds.main.channel.domain;

import java.util.ArrayList;
import java.util.List;

public record ChannelGroup(
        Long id,
        String name,
        List<Channel> channels
) {
    public ChannelGroup {
        channels = new ArrayList<>();
    }
}
