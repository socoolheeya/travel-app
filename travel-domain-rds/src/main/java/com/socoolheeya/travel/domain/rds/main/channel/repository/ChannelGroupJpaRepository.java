package com.socoolheeya.travel.domain.rds.main.channel.repository;

import com.socoolheeya.travel.domain.rds.main.channel.entity.ChannelGroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChannelGroupJpaRepository extends JpaRepository<ChannelGroupEntity, Long> {
}
