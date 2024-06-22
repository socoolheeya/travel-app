package com.socoolheeya.travel.domain.rds.configuration;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class MemberAuditorAware implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("wonhee.lee@travel.com");
    }
}
