package validations3.login.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import validations2.ManagerNameValidator;
import validations2.Person;

@Configuration
public class JavaConfig {

    @Bean
    LocalValidatorFactoryBean validatorFactoryBean(){
        return new LocalValidatorFactoryBean();
    }

    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("validations3.login.example");
        UserValidator validator = context.getBean(UserValidator.class);
        validator.printErrors(new User(new Login("Jeka", "124445")));
    }
}
