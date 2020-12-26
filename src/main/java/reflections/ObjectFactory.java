package reflections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ObjectFactory {
    public static <T> T createObject(Class<T> clazz) throws IllegalAccessException, InstantiationException,
            InvocationTargetException {
        T newObject = clazz.newInstance();

        Method[] methods = clazz.getMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(RunThisMethod.class)) {

                int count = method.getAnnotation(RunThisMethod.class).repeat();

                while (count > 0) {
                    method.invoke(newObject);
                    count--;
                }
            }
        }
        return newObject;
    }
}
