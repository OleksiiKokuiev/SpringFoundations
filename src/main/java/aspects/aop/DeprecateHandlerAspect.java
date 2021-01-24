package aspects.aop;

import framework.MyDeprecated;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class DeprecateHandlerAspect {
    @Around("execution((@framework.MyDeprecated *) quoters.*.kill* (..))")
    //@Around("execution((@framework.MyDeprecated *) quoters.*.* (..))")
    public Object replaceDeprecated(ProceedingJoinPoint pjp) throws Throwable {
        String methodName = pjp.getSignature().getName();
        System.out.println("Entering: " + methodName);
        try {
            Object retVal = pjp.proceed();
            MyDeprecated annotation = retVal.getClass().getAnnotation(MyDeprecated.class);
            Object newRetVal = annotation.newClass().newInstance();
            return newRetVal;
        } finally {
            System.out.println("Existing: " + methodName);
        }
    }
}
