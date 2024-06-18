package com.socoolheeya.travel.domain.rds.main.channel.mapper;

import com.socoolheeya.travel.domain.rds.main.channel.domain.Channel;
import com.socoolheeya.travel.domain.rds.main.channel.entity.ChannelEntity;
import com.socoolheeya.travel.domain.rds.main.channel.entity.ChannelGroupEntity;
import com.socoolheeya.travel.domain.rds.main.channel.entity.ChannelManagerEntity;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class ChannelMapperImpl implements ChannelMapper {

    @Override
    public ChannelEntity toEntity(Channel domain) {
        if ( domain == null ) {
            return null;
        }

        ChannelEntity.ChannelEntityBuilder channelEntity = ChannelEntity.builder();

        channelEntity.id( domain.id() );
        channelEntity.name( domain.name() );
        channelEntity.commission( domain.commission() );
        channelEntity.isEnabled( domain.isEnabled() );

        return channelEntity.build();
    }

    @Override
    public Channel toDomain(ChannelEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Long channelGroupId = null;
        Long channelManagerId = null;
        Long id = null;
        String name = null;
        BigDecimal commission = null;
        Boolean isEnabled = null;

        channelGroupId = entityChannelGroupId( entity );
        channelManagerId = entityChannelManagerId( entity );
        id = entity.getId();
        name = entity.getName();
        commission = entity.getCommission();
        isEnabled = entity.getIsEnabled();

        Channel channel = new Channel( id, name, commission, isEnabled, channelGroupId, channelManagerId );

        return channel;
    }

    @Override
    public ChannelEntity toDomain(Channel domain) {
        if ( domain == null ) {
            return null;
        }

        ChannelEntity.ChannelEntityBuilder channelEntity = ChannelEntity.builder();

        channelEntity.channelGroup( channelToChannelGroupEntity( domain ) );
        channelEntity.channelManager( channelToChannelManagerEntity( domain ) );
        channelEntity.id( domain.id() );
        channelEntity.name( domain.name() );
        channelEntity.commission( domain.commission() );
        channelEntity.isEnabled( domain.isEnabled() );

        return channelEntity.build();
    }

    private Long entityChannelGroupId(ChannelEntity channelEntity) {
        if ( channelEntity == null ) {
            return null;
        }
        ChannelGroupEntity channelGroup = channelEntity.getChannelGroup();
        if ( channelGroup == null ) {
            return null;
        }
        Long id = channelGroup.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityChannelManagerId(ChannelEntity channelEntity) {
        if ( channelEntity == null ) {
            return null;
        }
        ChannelManagerEntity channelManager = channelEntity.getChannelManager();
        if ( channelManager == null ) {
            return null;
        }
        Long id = channelManager.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected ChannelGroupEntity channelToChannelGroupEntity(Channel channel) {
        if ( channel == null ) {
            return null;
        }

        ChannelGroupEntity.ChannelGroupEntityBuilder channelGroupEntity = ChannelGroupEntity.builder();

        channelGroupEntity.id( channel.channelGroupId() );

        return channelGroupEntity.build();
    }

    protected ChannelManagerEntity channelToChannelManagerEntity(Channel channel) {
        if ( channel == null ) {
            return null;
        }

        ChannelManagerEntity.ChannelManagerEntityBuilder channelManagerEntity = ChannelManagerEntity.builder();

        channelManagerEntity.id( channel.channelManagerId() );

        return channelManagerEntity.build();
    }
}
