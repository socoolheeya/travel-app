package com.socoolheeya.travel.domain.rds.main.channel.mapper;

import com.socoolheeya.travel.domain.rds.common.mapper.BaseEntityMapper;
import com.socoolheeya.travel.domain.rds.main.channel.domain.ChannelManager;
import com.socoolheeya.travel.domain.rds.main.channel.entity.ChannelManagerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE
        , uses = {ChannelMapper.class})
public interface ChannelManagerMapper extends BaseEntityMapper<ChannelManager, ChannelManagerEntity> {
}
