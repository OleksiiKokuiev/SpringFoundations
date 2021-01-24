package quoters;

import aspects.aop.DatabaseRuntimeException;
import framework.RunThisMethod;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Component
public class ShakespeareQuoter implements Quoter {

    @Value("${shakespeareQuote}")
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @RunThisMethod(repeat = 3)
    public void sayQuote() throws DatabaseRuntimeException {

        System.out.println(message);
        throw new DatabaseRuntimeException("fire all dba");
    }
}
