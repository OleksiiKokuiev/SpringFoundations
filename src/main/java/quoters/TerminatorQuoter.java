package quoters;

import framework.Benchmark;
import framework.MyDeprecated;
import framework.RunThisMethod;

import java.util.List;

@MyDeprecated(newClass = T1000.class)
public class TerminatorQuoter implements Quoter {

    private List<String> messages;

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void sayQuote() {
        for (String message : messages){
            System.out.println(message);
        }
    }
}
