package com.socoolheeya.travel.domain.rds.main.channel.domain;

import java.math.BigDecimal;

public record Channel(
        Long id,
        String name,
        BigDecimal commission,
        Boolean isEnabled,
        Long channelGroupId,
        Long channelManagerId
) {
    public Channel {
        commission = BigDecimal.ZERO;
        isEnabled = true;
    }
}
