package quoters;

import aspects.aop.DeprecateHandlerAspect;
import aspects.aop.ExceptionHandlingAspect;
import framework.MyApplicationListener;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan(basePackages = {"quoters"})
@PropertySource("classpath:quotes.properties")
@EnableAspectJAutoProxy
public class JavaConfig {
    @Bean
    public PropertySourcesPlaceholderConfigurer configurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public DeprecateHandlerAspect aspect(){
        return new DeprecateHandlerAspect();
    }
    @Bean
    public MyApplicationListener listener(){
        return new MyApplicationListener();
    }
}
