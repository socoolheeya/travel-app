package com.socoolheeya.travel.app.internal.api.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
public class AsyncConfiguration {

    @Bean
    public TaskExecutor taskExecutor() {
        int processors = Runtime.getRuntime().availableProcessors();
        int corePoolSize = processors + 1;
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(processors);
        executor.setMaxPoolSize(corePoolSize * 2);
        executor.setQueueCapacity(400);
        executor.setThreadNamePrefix("Async-");
        executor.initialize();
        return executor;
    }
}
