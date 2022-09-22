package com.saif;

import org.aspectj.lang.annotation.*;

@Aspect
public class LogAspect {


    @Pointcut("execution(* com.saif.BusinessLogic.businessLogic(..))")
    public void methodbusinessLogicFromTypeBusinessLogic() {
    }

    @Before("methodbusinessLogicFromTypeBusinessLogic()")
    public void beforeAspect() {
        System.out.println("Before Advice is executed ");
    }



    @AfterReturning( "methodbusinessLogicFromTypeBusinessLogic()")
    public void afterReturning() {

        System.out.println("After advice is executed");

    }

}
