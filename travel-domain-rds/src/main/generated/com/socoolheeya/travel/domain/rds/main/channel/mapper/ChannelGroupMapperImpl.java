package com.socoolheeya.travel.domain.rds.main.channel.mapper;

import com.socoolheeya.travel.domain.rds.main.channel.domain.Channel;
import com.socoolheeya.travel.domain.rds.main.channel.domain.ChannelGroup;
import com.socoolheeya.travel.domain.rds.main.channel.entity.ChannelEntity;
import com.socoolheeya.travel.domain.rds.main.channel.entity.ChannelGroupEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class ChannelGroupMapperImpl implements ChannelGroupMapper {

    @Autowired
    private ChannelMapper channelMapper;

    @Override
    public ChannelGroup toDomain(ChannelGroupEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        List<Channel> channels = null;

        id = entity.getId();
        name = entity.getName();
        channels = channelEntityListToChannelList( entity.getChannels() );

        ChannelGroup channelGroup = new ChannelGroup( id, name, channels );

        return channelGroup;
    }

    @Override
    public ChannelGroupEntity toEntity(ChannelGroup domain) {
        if ( domain == null ) {
            return null;
        }

        ChannelGroupEntity.ChannelGroupEntityBuilder channelGroupEntity = ChannelGroupEntity.builder();

        channelGroupEntity.id( domain.id() );
        channelGroupEntity.name( domain.name() );

        return channelGroupEntity.build();
    }

    protected List<Channel> channelEntityListToChannelList(List<ChannelEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<Channel> list1 = new ArrayList<Channel>( list.size() );
        for ( ChannelEntity channelEntity : list ) {
            list1.add( channelMapper.toDomain( channelEntity ) );
        }

        return list1;
    }
}
