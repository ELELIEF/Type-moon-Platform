package elelief.typemoon.aop;

import elelief.typemoon.utils.CurrentHolder;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OperationLogAspect {
    @Around("execution(* elelief.typemoon.Controller.CompositionController.ResponseintroduceMessage(..))")
    private Object showCurrentId(ProceedingJoinPoint pjp) throws Throwable {

        Object result = pjp.proceed();//***

        System.out.println("登录id:" + CurrentHolder.getCurrent());
        return result;
    }
}
