package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Context1 {
   @Bean(name = "driverFirst")
    public Driver driver(){
        return new Driver("Василий");
    }
    @Bean(name = "engines")
    public Engine engine(){
       return new Engine("Dysel", 100);
    }
    @Bean(name = "carFirst")
    public Cars cars(){
       return new Cars("Dysel", 100, "Logan", 1 );
    }

}
