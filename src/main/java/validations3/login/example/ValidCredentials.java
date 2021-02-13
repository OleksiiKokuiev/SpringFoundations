package validations3.login.example;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CredentialsValidations.class)
public @interface ValidCredentials {
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String message() default "password must be shorter than name";
}
