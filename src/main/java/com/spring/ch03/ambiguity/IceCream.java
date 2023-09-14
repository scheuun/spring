package com.spring.ch03.ambiguity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Cold
@Creamy
public class IceCream implements Dessert {

    private Dessert dessert;

    @Autowired
    @Cold
    @Creamy
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    @Bean
    @Cold
    @Creamy
    public Dessert iceCream() {
        return new IceCream();
    }

}
