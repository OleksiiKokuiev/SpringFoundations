package colors;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.awt.*;
import java.util.Random;

@Configuration
@ComponentScan(basePackages = {"colors"})
public class Config {

    @Bean(destroyMethod = "toString", initMethod = "getName")
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public ColoredFrame frame(){
        return new ColoredFrame();
    }
    @Bean
    @Scope("prototype")
    public Color randomColor(){
        Random random = new Random();
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }
}
