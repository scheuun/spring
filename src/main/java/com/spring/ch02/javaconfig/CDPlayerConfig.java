package com.spring.ch02.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CDPlayerConfig {

//    @Bean(name = "lonelyHeartsClubBand")
//    public CompactDisc sgtPeppers() {
//        return new SgtPeppers();
//    }

//    @Bean
//    public CompactDisc randomBeatlesCD() {
//        int choice = (int) Math.floor(Math.random() * 4);
//        if (choice == 0) {
//            return new SgtPeppers();
//        } else if (choice == 1) {
//            return new WhiteAlbum();
//        } else {
//            return new Revolver();
//        }
//    }

    @Bean
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }

//    @Bean
//    public CDPlayer anotherCDPlayer() {
//        return new CDPlayer(sgtPeppers());
//    }
}
