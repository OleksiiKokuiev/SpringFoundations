package production;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("production");
        MainDeliveryService deliveryService = context.getBean(MainDeliveryService.class);
        deliveryService.deliver(3);
    }
}
