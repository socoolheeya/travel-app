package com.socoolheeya.travel.domain.rds.personal.member.domain;

public record Member(
        Long id,
        String name,
        String email,
        String password,
        boolean isEnabled,
        Long roleId
) {
    public Member {
        isEnabled = true;
    }
}
