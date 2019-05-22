package com.wei.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class UserConfig {

    @Bean
    public UserConfig getUserConfig() {
        return new UserConfig();
    }


}
