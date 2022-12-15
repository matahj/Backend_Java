package com.example.work06a.config;

import com.example.work06a.model.Person;
import com.example.work06a.repository.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Seeder implements CommandLineRunner {

    private IPersonRepository repository;

    @Autowired
    public Seeder(IPersonRepository repository){
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.setName("Pedro");
        p1.setLastName("Alemán");

        p2.setName("Juán");
        p2.setLastName("Morales");
        p2.setAge(25); //puede ser null

        repository.save(p1);
        repository.save(p2);
    }
}
