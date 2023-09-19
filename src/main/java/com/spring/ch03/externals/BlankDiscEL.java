package com.spring.ch03.externals;

import org.springframework.beans.factory.annotation.Value;

public class BlankDiscEL {

    private final String title;
    private final String artist;

    public BlankDiscEL(@Value("#{systemProperties['disc.title']}") String title,
                       @Value("#{systemProperties['disc.artist']}") String artist) {
        this.title = title;
        this.artist = artist;
    }

}
