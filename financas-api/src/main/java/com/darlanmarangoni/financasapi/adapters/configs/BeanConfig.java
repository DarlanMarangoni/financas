package com.darlanmarangoni.financasapi.adapters.configs;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public ModelMapper createModelMapper() {
        return new ModelMapper();
    }
}
