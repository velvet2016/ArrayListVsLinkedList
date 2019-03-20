package com.company.aop;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class InterceptAroundMethod implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Method name :                                                      " +
                "" + methodInvocation.getMethod().getName());
        String collect = Arrays.stream(methodInvocation.getArguments())
                .map(i -> Collection.class.isAssignableFrom(i.getClass()) ? i.getClass().getName() : i)
                .map(Object::toString)
                .map(i->i.replace("java.util.",""))
                .collect(Collectors.joining("; "));
        System.out.println("params : "+ collect);

        LocalDateTime start = LocalDateTime.now();
        Object result = methodInvocation.proceed();
        LocalDateTime stop = LocalDateTime.now();
        System.out.println("timing:                                                               "
                + ChronoUnit.MILLIS.between(start,stop) + " milliseconds");

        return result;

    }
}