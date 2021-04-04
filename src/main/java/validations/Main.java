package validations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("validations");
        DriverValidator driverValidator = context.getBean(DriverValidator.class);
        Driver driver = new Driver(null, 8);
        //driverValidator.printAllErrorMessages(driver);
        //System.out.println(driverValidator.isValid(driver));
        System.out.println("-------------------------------");
        DriverService driverService = new DriverService(driver);
        driverValidator.printErrorMessagesForDriverService(driverService);

    }
}
