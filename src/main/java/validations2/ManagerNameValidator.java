package validations2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

@Component
public class ManagerNameValidator {

    @Autowired
    private Validator validator;

    public void printErrors(Person person){
        Set<ConstraintViolation<Person>> violationSet = validator.validate(person);
        for (ConstraintViolation<Person> violation : violationSet){
            System.out.println(violation.getMessage());
    }
    }
}
