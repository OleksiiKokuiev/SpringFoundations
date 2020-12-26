package quoters;

import framework.RunThisMethod;

public class ShakespeareQuoter implements Quoter {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @RunThisMethod(repeat = 3)
    public void sayQuote() {
        System.out.println(message);
    }
}
