package aspects.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Value;

import javax.xml.crypto.Data;
import java.util.Map;
import java.util.WeakHashMap;

@Aspect
public class ExceptionHandlingAspect {
    @Value("${dbaMails}")
    private String[] mails;

    private Map<DatabaseRuntimeException, Integer> cache = new WeakHashMap<DatabaseRuntimeException, Integer>();

    @Pointcut("execution(* quoters.*.*(..))")
    public void anyMethodsOfQuoters(){}

    @AfterThrowing(pointcut = "anyMethodsOfQuoters()", throwing = "ex")
    public void handleDBExceptoon(DatabaseRuntimeException ex){
        if (!cache.containsKey(ex)){
            cache.put(ex, 1);
        System.out.println("I'm exception handling aspect. Now I work...");
        for(String mail : mails){
            System.out.println("We have " + ex.getMessage() + " mail sent to " + mail);
        }
        }
    }
}
