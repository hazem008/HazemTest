package tn.esprit.kharroubihazem.config;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Aspect
public class LoggingAspect {
    @Pointcut(" execution(* tn.esprit.kharroubihazem.services.*.*(..)) ")
    public void methodCall(){
    }

    @Before(" execution(* tn.esprit.kharroubihazem.services.*.*(..)) ")
    public void logMethodEntry(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info(" In method " + name + " : ");
    }

    @After(" execution(* tn.esprit.kharroubihazem.services.*.*(..)) ")
    public void logMethodExit(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info(" Out of method " + name + " : ");
    }

    @AfterReturning(" execution(* tn.esprit.kharroubihazem.services.*.*(..)) ")
    public void logMethodExitReturn(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info(" Out of method After Returning " + name + " : ");
    }

    @AfterThrowing(" execution(* tn.esprit.kharroubihazem.services.*.*(..)) ")
    public void logMethodExitthrow(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info(" Out of method After Throwing " + name + " : ");
    }

}
