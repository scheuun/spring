package com.spring.ch03.ambiguity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Qualifier("crispy")
public class Cookies implements Dessert {

    private Dessert dessert;

    @Autowired
    @Qualifier("crispy")
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    @Bean
    @Qualifier("crispy")
    public Dessert cookies() {
        return new Cookies();
    }

}
