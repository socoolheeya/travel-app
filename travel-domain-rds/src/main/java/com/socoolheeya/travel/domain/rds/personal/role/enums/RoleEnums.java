package com.socoolheeya.travel.domain.rds.personal.role.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class RoleEnums {

    /**
     * SUPER_ADMIN: 슈퍼 관리자(CRUD + 설정 셋팅 권한)
     * ADMIN: 관리자(READ, CREATE, UPDATE, DELETE)
     * MEMBER: 일반 사용자(READ)
     * CUSTOMER: 외부 고객
     */
    @Getter
    @AllArgsConstructor
    public enum Type {
        SUPER_ADMIN, ADMIN, MEMBER, CUSTOMER
    }
}
