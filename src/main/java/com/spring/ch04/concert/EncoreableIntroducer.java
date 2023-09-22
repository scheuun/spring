package com.spring.ch04.concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EncoreableIntroducer {

    @DeclareParents(value = "com.spring.ch04.concert.Performanc+",
                    defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;

}
