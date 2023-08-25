package com.spring.ch02.mixedconfig;

import org.springframework.context.annotation.Bean;

public class CDConfig {

    @Bean
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }
}
