package com.spring.ch03.ambiguity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Cold
@Fruity
public class Popsicle implements Dessert {

    private Dessert dessert;

    @Autowired
    @Cold
    @Fruity
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    @Bean
    @Cold
    @Fruity
    public Dessert popsicle() {
        return new Popsicle();
    }

}
