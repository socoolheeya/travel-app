package com.socoolheeya.travel.domain.rds.main.channel.mapper;

import com.socoolheeya.travel.domain.rds.common.mapper.BaseEntityMapper;
import com.socoolheeya.travel.domain.rds.main.channel.domain.ChannelGroup;
import com.socoolheeya.travel.domain.rds.main.channel.entity.ChannelGroupEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE
        , uses = {ChannelMapper.class})
public interface ChannelGroupMapper extends BaseEntityMapper<ChannelGroup, ChannelGroupEntity> {
}
