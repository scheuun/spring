package com.spring.ch04.concert;

public aspect CriticAspect {
    public CriticAspect() {}

    pointcut performance() : execution(**concert.Performance.perform(..));

    after() returning : performance() {
        System.out.println(criticisEngine.getCriticism());
    }

    private CriticismEngine criticisEngine;

    public void setCriticisEngine(CriticismEngine criticisEngine) {
        this.criticisEngine = criticisEngine;
    }

}
