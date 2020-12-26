package quoters;

import org.springframework.stereotype.Component;

@Component
public class T1000 extends TerminatorQuoter {
    @Override
    public void sayQuote() {
        System.out.println("New implementation of Terminator quoter");
        super.sayQuote();
    }
}
