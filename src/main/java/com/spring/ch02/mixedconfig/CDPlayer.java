package com.spring.ch02.mixedconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    @Autowired(required = false)
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }

    @Autowired
    public void setCompactDisc(CompactDisc cd) {
        this.cd = cd;
    }

    @Autowired
    public void insertDisc(CompactDisc cd) {
        this.cd = cd;
    }
}
