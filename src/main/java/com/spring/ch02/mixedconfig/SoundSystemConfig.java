package com.spring.ch02.mixedconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import({CDPlayer.class, CDConfig.class})
@ImportResource("classpath:cd-config.xml")
public class SoundSystemConfig {
}
