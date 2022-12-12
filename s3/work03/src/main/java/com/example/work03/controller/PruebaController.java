package com.example.work03.controller;

import com.example.work03.model.Curso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prueba")
public class PruebaController {

    @GetMapping("/hello")
    public String helloWorld(){
        return "¡Hello World!";
    }

    @GetMapping("/goodbye")
    public String goodBye(){
        return "¡Good Bye!";
    }

    @GetMapping("/curso")
    public Curso enviarCurso(){
        //Convierte el objeto en JSON
        return new Curso(100L,"Backend Java 1");
    }
}
