package com.spring.ch03.externals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class EnvironmentConfigWithRequiredProperties {

    @Autowired
    Environment env;

    @Bean
    public BlankDisc disc() {
        return new BlankDisc(
                env.getRequiredProperty("disc.title"),
                env.getRequiredProperty("disc.artist"));
    }

    boolean titleExists = env.containsProperty("disc.title");

}
