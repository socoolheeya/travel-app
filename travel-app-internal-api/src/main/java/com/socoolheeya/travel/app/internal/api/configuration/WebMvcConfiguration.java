package com.socoolheeya.travel.app.internal.api.configuration;

import com.socoolheeya.travel.app.internal.api.core.property.intrastructure.SupplierConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new SupplierConverter());
    }
}
