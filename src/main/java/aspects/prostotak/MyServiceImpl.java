package aspects.prostotak;

import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {
    //@Override
    public int work() {
        System.out.println("Я работаю!");
        return 41;
    }
}
