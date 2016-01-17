package com.lynas.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by lynas on 1/17/16.
 */
@Aspect
public class Audience {

    @Pointcut("execution(public void com.lynas.interfaces.Knight.emberkOnQuest())")
    public void performace(){}

    @Around("performace()")
    public void watchPerformance(ProceedingJoinPoint joinPoint){
        try{
            System.out.println("silence phone");
            System.out.println("Sitting down");
            joinPoint.proceed();
            System.out.println("Clap Clap Clap !!!");

        }catch (Exception e){
            System.out.println("Demand a refund 222");
        } catch (Throwable throwable) {
            System.out.println("Demand a refund");
        }

    }
}
