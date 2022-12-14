package com.example.workb;

import com.example.workb.model.Persona;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorkBApplication implements CommandLineRunner {

    Persona persona;

    @Autowired //opiconal
    public WorkBApplication(Persona persona){
        this.persona = persona;
    }

    @PostConstruct
    public void init(){
        persona.setName("Pedro");
    }

    public static void main(String[] args) {
        SpringApplication.run(WorkBApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(persona.getName());
        System.out.println(persona.greet("Juan"));
    }
}
