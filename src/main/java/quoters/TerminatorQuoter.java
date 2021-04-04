package quoters;

import framework.Benchmark;
import framework.MyDeprecated;
import framework.RunThisMethod;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@MyDeprecated(newClass = T1000.class)
@Component
public class TerminatorQuoter implements Quoter {

    private List<String> messages;

    @Value("${terminatorQuotes}")
    public void setMessages(String[] messages) {
        this.messages = Arrays.asList(messages);
    }


    public void sayQuote() {
        for (String message : messages){
            System.out.println(message);
        }
    }
}
