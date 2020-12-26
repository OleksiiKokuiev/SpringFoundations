package framework;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class TransactionAnnotationBeanPostProcessor implements BeanPostProcessor {
    private Map<String, Class> map = new HashMap<String, Class>();
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        Class<?> originalClass = o.getClass();
        if (originalClass.isAnnotationPresent(Transaction.class)){
            map.put(s, originalClass);
        }
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(final Object o, String s) throws BeansException {
        Class<?> clazz = o.getClass();
        Class originalClass = map.get(s);
        if(originalClass != null){
            return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    System.out.println("Transaction opened");
                    Object retVal = method.invoke(o, args);
                    System.out.println("Transaction closed");
                    return retVal;
                }
            });
        }
        return o;
    }
}
