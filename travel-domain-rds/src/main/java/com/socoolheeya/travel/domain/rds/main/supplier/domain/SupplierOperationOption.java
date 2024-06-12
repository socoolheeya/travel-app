package com.socoolheeya.travel.domain.rds.main.supplier.domain;

import java.time.LocalDateTime;

public record SupplierOperationOption(
        Long id,
        boolean isBatch,
        LocalDateTime shutdownStartedAt,
        LocalDateTime shutdownEndedAt
) {
    public SupplierOperationOption {
        isBatch = false;
    }
}
