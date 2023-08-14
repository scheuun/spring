package com.spring.ch01.ex01;

public class DamselRescuingKnight implements Knight {
    private RescueDamselQuest quest;
    public DamselRescuingKnight() {
        this.quest = new  RescueDamselQuest();
    }
    public void embarkOnQuest() {
        quest.embark();
    }
}
