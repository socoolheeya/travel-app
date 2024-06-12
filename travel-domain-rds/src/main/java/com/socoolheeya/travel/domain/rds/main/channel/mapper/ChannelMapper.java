package com.socoolheeya.travel.domain.rds.main.channel.mapper;


import com.socoolheeya.travel.domain.rds.common.mapper.BaseEntityMapper;
import com.socoolheeya.travel.domain.rds.main.channel.domain.Channel;
import com.socoolheeya.travel.domain.rds.main.channel.entity.ChannelEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE
        , uses = {ChannelGroupMapper.class, ChannelManagerMapper.class})
public interface ChannelMapper extends BaseEntityMapper<Channel, ChannelEntity> {
    @Mapping(source = "entity.channelGroup.id", target = "channelGroupId")
    @Mapping(source = "entity.channelManager.id", target = "channelManagerId")
    Channel toDomain(ChannelEntity entity);

    @Mapping(source = "domain.channelGroupId", target = "channelGroup.id")
    @Mapping(source = "domain.channelManagerId", target = "channelManager.id")
    ChannelEntity toDomain(Channel domain);

}
