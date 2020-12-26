package quoters;

import org.springframework.stereotype.Component;

@Component
public class RussianFilmsQuoter implements Quoter {
    @Override
    public void sayQuote() {
        System.out.println("Москва слезам не верит.");
    }
}
