package validations2;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Size;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@CheckCase(value = CaseType.UPPER_CASE, message = "manager name must be upper cased")
@Size(min = 5, max = 10, message = "manager name must be between 5 and 10 letters")
@Constraint(validatedBy = {})
public @interface ManagerName {
    String message() default "{com.mycompany.constraints.validlicenseplate}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
