package quoters;

import framework.PostInitialized;
import org.springframework.stereotype.Component;

@Component
public class CacheProviderImpl implements CacheProvider {
    @Override
    @PostInitialized
    public void warmCache() {
        System.out.println("Warming cache!");
    }
}
