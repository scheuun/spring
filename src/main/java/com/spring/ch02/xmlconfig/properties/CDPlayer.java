package com.spring.ch02.xmlconfig.properties;

import com.spring.ch02.xmlconfig.CompactDisc;
import com.spring.ch02.xmlconfig.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer implements MediaPlayer {
    private CompactDisc compactDisc;

    @Autowired
    public void setCompactDisc(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    public void play() {
        compactDisc.play();
    }
}
