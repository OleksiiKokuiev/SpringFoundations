package quoters;

import aspects.aop.DatabaseRuntimeException;
import framework.Benchmark;
import framework.RunThisMethod;
import framework.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

//@Transaction
@Component
public class TalkingRobotImpl implements TalkingRobot {

    @Autowired
    private List<Quoter> quoters;

    //@Benchmark
    @Override
    public void talk() throws DatabaseRuntimeException {
        for (Quoter quote : quoters){
            quote.sayQuote();
        }

    }
}
