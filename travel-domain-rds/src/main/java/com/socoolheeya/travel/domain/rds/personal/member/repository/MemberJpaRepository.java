package com.socoolheeya.travel.domain.rds.personal.member.repository;

import com.socoolheeya.travel.domain.rds.personal.member.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberJpaRepository extends JpaRepository<MemberEntity, Long> {
}
