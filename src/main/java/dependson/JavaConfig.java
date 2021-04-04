package dependson;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class JavaConfig {
    @Bean
    public PropertyPlaceholderConfigurer configurer(){
        return new PropertyPlaceholderConfigurer();
    }
}
