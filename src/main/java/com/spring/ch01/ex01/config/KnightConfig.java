package com.spring.ch01.ex01.config;

import com.spring.ch01.ex01.BraveKnight;
import com.spring.ch01.ex01.Minstrel;
import com.spring.ch01.ex01.Quest;
import com.spring.ch01.ex01.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {

    @Bean
    public BraveKnight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Minstrel minstrel() {
        return new Minstrel(System.out);
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }

}
