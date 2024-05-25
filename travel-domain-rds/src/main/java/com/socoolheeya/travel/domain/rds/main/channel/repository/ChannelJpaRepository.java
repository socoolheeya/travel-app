package com.socoolheeya.travel.domain.rds.main.channel.repository;

import com.socoolheeya.travel.domain.rds.main.channel.entity.ChannelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChannelJpaRepository extends JpaRepository<ChannelEntity, Long> {
}
