package com.spring.ch04.concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Bean;

@Aspect
public class Audience {

//    @Pointcut("execution(**concert.Performance.perform(..))")
//    public void performance() {}

//    @Before("performance()")
//    public void silenceCellPhones() {
//        System.out.println("Silencing cell phones");
//    }
//
//    @Before("performance()")
//    public void takeSeats() {
//        System.out.println("Taking Seats");
//    }
//
//    @AfterReturning("performance()")
//    public void applause() {
//        System.out.println("CLAP CLAP CLAP!!!");
//    }
//
//    @AfterThrowing("performance()")
//    public void demandRefund() {
//        System.out.println("Demanding a refund");
//    }

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

    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }

    public void takeSeats() {
        System.out.println("Taking Seats");
    }

    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!");
    }

    public void demandRefund() {
        System.out.println("Demanding a refund");
    }

}
