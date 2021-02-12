package rmi.server;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;
import org.springframework.remoting.rmi.RmiServiceExporter;
import rmi.common.Greeter;

@Configuration
public class ServerConfig {

    @Bean
    public RomanianGreeter romanianGreeter(){
        return new RomanianGreeter();
    }

    @Bean
    public RmiServiceExporter exporter(){
        RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
        rmiServiceExporter.setService(romanianGreeter());
        rmiServiceExporter.setServiceName("Greeter123");
        rmiServiceExporter.setServiceInterface(Greeter.class);
        return rmiServiceExporter;
    }
}
