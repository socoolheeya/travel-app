package com.socoolheeya.travel.domain.rds.main.rateplan.domain;

public record CancelRate(
        Long id,
        Integer offset,
        Integer rate,
        Long cancelPolicyId
) {
}
