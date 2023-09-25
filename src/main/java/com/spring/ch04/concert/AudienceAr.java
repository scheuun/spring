package com.spring.ch04.concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AudienceAr {

//    @Around("performance()")
//    public void watchPerformance(ProceedingJoinPoint jp) {
//        try {
//            System.out.println("Silencing cell phones"); System.out.println("Taking Seats");
//            jp.proceed();
//            System.out.println("CLAP CLAP CLAP!!!");
//        } catch (Throwable e) {
//            System.out.println("Demanding a refund");
//        }
//    }

    public void watchPerformance(ProceedingJoinPoint jp) {
        try {
            System.out.println("Silencing cell phones"); System.out.println("Taking Seats");
            jp.proceed();
            System.out.println("CLAP CLAP CLAP!!!");
        } catch (Throwable e) {
            System.out.println("Demanding a refund");
        }
    }

}
