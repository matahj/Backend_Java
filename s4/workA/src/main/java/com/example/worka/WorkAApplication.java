package com.example.worka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorkAApplication implements CommandLineRunner {

    private Greeting greeting;

    //@Autowired o en los argumentos
    public WorkAApplication(@Autowired Greeting greeting){
        this.greeting = greeting;
    }

    /*
    private Greeting greeting;
    @Autowired
    public void setGreeting(Greeting greeting) {
        this.greeting = greeting;
    }
     */

    /*
    @Autowired
    private Greeting greeting;
     */


    public static void main(String[] args) {
        SpringApplication.run(WorkAApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println( greeting.greeting("Pedro") );
    }
}
