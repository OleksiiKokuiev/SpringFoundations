package quoters;

import framework.Benchmark;
import framework.RunThisMethod;
import framework.Transaction;

import java.util.List;

@Transaction
public class TalkingRobotImpl implements TalkingRobot {

    private List<Quoter> quoters;

    public TalkingRobotImpl() {
    }

    public TalkingRobotImpl(List<Quoter> quoters) {
        this.quoters = quoters;
    }

    public List<Quoter> getQuoters() {
        return quoters;
    }

    public void setQuoters(List<Quoter> quoters) {
        this.quoters = quoters;
    }

    @Benchmark
    public void talk() {
        for (Quoter quote : quoters){
            quote.sayQuote();
        }

    }
}
