package com.socoolheeya.travel.domain.rds.main.channel.mapper;

import com.socoolheeya.travel.domain.rds.main.channel.domain.ChannelManager;
import com.socoolheeya.travel.domain.rds.main.channel.entity.ChannelManagerEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class ChannelManagerMapperImpl implements ChannelManagerMapper {

    @Override
    public ChannelManager toDomain(ChannelManagerEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Long id = null;
        String password = null;
        String accountKey = null;
        Boolean isEnabled = null;

        id = entity.getId();
        password = entity.getPassword();
        accountKey = entity.getAccountKey();
        isEnabled = entity.getIsEnabled();

        Long channelId = null;

        ChannelManager channelManager = new ChannelManager( id, password, accountKey, isEnabled, channelId );

        return channelManager;
    }

    @Override
    public ChannelManagerEntity toEntity(ChannelManager domain) {
        if ( domain == null ) {
            return null;
        }

        ChannelManagerEntity.ChannelManagerEntityBuilder channelManagerEntity = ChannelManagerEntity.builder();

        channelManagerEntity.id( domain.id() );
        channelManagerEntity.password( domain.password() );
        channelManagerEntity.accountKey( domain.accountKey() );
        channelManagerEntity.isEnabled( domain.isEnabled() );

        return channelManagerEntity.build();
    }
}
