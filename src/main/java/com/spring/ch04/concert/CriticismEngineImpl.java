package com.spring.ch04.concert;

import java.util.List;

public class CriticismEngineImpl implements CriticismEngine {
    public CriticismEngineImpl() {}

    public String getCriticism() {
        int i = (int) (Math.random() * criticisPool.length);
        return criticisPool[i];
    }

    private String[] criticisPool;
    public void setCriticisms(String[] criticisPool) {
        this.criticisPool = criticisPool;
    }

}
