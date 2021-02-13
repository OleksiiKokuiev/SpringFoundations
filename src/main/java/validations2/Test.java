package validations2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;


public class Test {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("validations2");
        ManagerNameValidator validator = context.getBean(ManagerNameValidator.class);
        /*Set<ConstraintViolation<Person>> violationSet = validator.validate(new Person("vasya"));
        for (ConstraintViolation<Person> violation : violationSet){
            System.out.println(violation.getMessage());
        }*/
        validator.printErrors(new Person("vas"));
    }
}
