package com.spring.ch03.ambiguity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("soft")
public class Cake implements Dessert {

    private Dessert dessert;

    @Autowired
    @Qualifier("soft")
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    @Bean
    @Qualifier("soft")
    public Dessert cake() {
        return new Cake();
    }

}
