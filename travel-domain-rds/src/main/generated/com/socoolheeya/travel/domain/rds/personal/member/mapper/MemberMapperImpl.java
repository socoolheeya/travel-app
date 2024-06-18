package com.socoolheeya.travel.domain.rds.personal.member.mapper;

import com.socoolheeya.travel.domain.rds.personal.member.domain.Member;
import com.socoolheeya.travel.domain.rds.personal.member.entity.MemberEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class MemberMapperImpl implements MemberMapper {

    @Override
    public Member toDomain(MemberEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        String email = null;
        String password = null;

        id = entity.getId();
        name = entity.getName();
        email = entity.getEmail();
        password = entity.getPassword();

        boolean isEnabled = false;
        Long roleId = null;

        Member member = new Member( id, name, email, password, isEnabled, roleId );

        return member;
    }

    @Override
    public MemberEntity toEntity(Member domain) {
        if ( domain == null ) {
            return null;
        }

        MemberEntity.MemberEntityBuilder memberEntity = MemberEntity.builder();

        memberEntity.id( domain.id() );
        memberEntity.name( domain.name() );
        memberEntity.email( domain.email() );
        memberEntity.password( domain.password() );
        memberEntity.isEnabled( domain.isEnabled() );

        return memberEntity.build();
    }
}
