package com.socoolheeya.travel.domain.rds.main.rateplan.domain;

import java.util.ArrayList;
import java.util.List;

public record CancelPolicy(
        Long id,
        Boolean isCancel,
        String description,
        List<CancelRate> cancelRates,
        Long ratePlanId
) {
    public CancelPolicy {
        cancelRates = new ArrayList<>();
    }
}
