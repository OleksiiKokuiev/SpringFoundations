package aspects.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    @Pointcut("execution(* aspects.prostotak.*.w*())")
    public void prostoTakMethods(){}

    @AfterReturning(pointcut = "prostoTakMethods()", returning = "retVal")
    public void printReturningValue(int retVal){
        System.out.println("I'm your aspect and I know returning value is: ");
        System.out.println(retVal);
    }
}
