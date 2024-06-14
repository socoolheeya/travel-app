package com.socoolheeya.travel.domain.rds.personal.member.mapper;

import com.socoolheeya.travel.domain.rds.common.mapper.BaseEntityMapper;
import com.socoolheeya.travel.domain.rds.personal.member.domain.Member;
import com.socoolheeya.travel.domain.rds.personal.member.entity.MemberEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MemberMapper extends BaseEntityMapper<Member, MemberEntity> {

}
