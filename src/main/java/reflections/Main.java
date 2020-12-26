package reflections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main (String [] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Person person = ObjectFactory.createObject(Person.class);
    }
}
