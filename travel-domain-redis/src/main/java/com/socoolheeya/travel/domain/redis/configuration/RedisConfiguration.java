package com.socoolheeya.travel.domain.redis.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;

import java.time.Duration;

@EnableCaching
@Configuration
public class RedisConfiguration {

//    @Value("${spring.data.redis.host}")
//    private String host;
//
//    @Value("${spring.data.redis.port}")
//    private int port;
//
//    @Bean
//    public RedisConnectionFactory redisConnectionFactory() {
//        return new LettuceConnectionFactory(host, port);
//    }
//
//    @Bean
//    public CacheManager cacheManager() {
//        RedisCacheManager.RedisCacheManagerBuilder builder =
//                RedisCacheManager.RedisCacheManagerBuilder.fromConnectionFactory(redisConnectionFactory());
//
//        RedisCacheConfiguration configuration = RedisCacheConfiguration.defaultCacheConfig()
//                .serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(new GenericJackson2JsonRedisSerializer()))
//                .disableCachingNullValues()
//                .entryTtl(Duration.ofMinutes(10L));
//
//        builder.cacheDefaults(configuration);
//
//        return builder.build();
//    }
}
