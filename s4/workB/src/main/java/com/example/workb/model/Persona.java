package com.example.workb.model;

import org.springframework.stereotype.Component;

@Component
public class Persona {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String greet(String anotherName){
        return "Hello, "+anotherName+" my name is "+name+".";
    }
}
