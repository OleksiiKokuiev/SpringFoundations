package validations3.login.example;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CredentialsValidations implements ConstraintValidator<ValidCredentials, Login> {
    @Override
    public void initialize(ValidCredentials validCredentials) {
    }

    @Override
    public boolean isValid(Login login, ConstraintValidatorContext constraintValidatorContext) {
        return login.getName().length() > login.getPassword().length();
    }
}
