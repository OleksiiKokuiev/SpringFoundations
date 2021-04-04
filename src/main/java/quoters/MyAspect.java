package quoters;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    @Pointcut("execution(* quoters.*.talk())")
    public void talkMethods(){}

    @After("talkMethods()")
    public void beforeTalkMethods(JoinPoint jp){
        String methodName = jp.getSignature().getName();
        System.out.println(methodName);
    }
}
