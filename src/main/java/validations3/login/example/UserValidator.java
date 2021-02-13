package validations3.login.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

@Component
public class UserValidator {
    @Autowired
    private Validator validator;

    public void printErrors(User user){
        Set<ConstraintViolation<User>> violationSet = validator.validate(user);
        for (ConstraintViolation<User> violation : violationSet){
            System.out.println(violation.getMessage());
        }
    }
}
