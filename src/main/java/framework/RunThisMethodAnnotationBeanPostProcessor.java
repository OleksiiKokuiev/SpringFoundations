package framework;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunThisMethodAnnotationBeanPostProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {

        Method[] methods = o.getClass().getMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(RunThisMethod.class)) {
                int count = method.getAnnotation(RunThisMethod.class).repeat();

                while (count > 0) {
                    try {
                        method.invoke(o);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                    count--;
                }
            }
        }
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        return o;
    }
}
