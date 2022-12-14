package com.example.worka.config;

import com.example.worka.Greeting;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Greeting greeting(){
        return new Greeting();
    }
}
