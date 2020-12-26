package quoters;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main (String [] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        TalkingRobot talkingRobot = context.getBean(TalkingRobot.class);
        talkingRobot.talk();


    }
}