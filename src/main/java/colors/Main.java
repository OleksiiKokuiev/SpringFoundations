package colors;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        for (int i = 0; i < 50; i++){
            Thread.sleep(20);
            ColoredFrame coloredFrame = context.getBean(ColoredFrame.class);
            coloredFrame.showOnRandomPlace();
        }
    }
}
