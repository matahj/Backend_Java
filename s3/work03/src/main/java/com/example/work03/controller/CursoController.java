package com.example.work03.controller;

import com.example.work03.model.CrearCurso;
import com.example.work03.model.Curso;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@RestController
public class CursoController {
    private List<Curso> cursos;
    private long ultimoId = 1002L;

    public CursoController(){
        this.cursos = new LinkedList<>();
        cursos.add(new Curso(1000L, "FullStack Java"));
        cursos.add(new Curso(1001L, "FullStack JavaScript"));
        cursos.add(new Curso(1002L, "FullStack Python"));
    }

    @GetMapping("/obtenerCursos")
    public List<Curso> otenerCursos(){
        //Regresa la lista con formato JSON
        return cursos;
    }

    @GetMapping("/obtenerCurso/{id}")
    public Curso otenerCurso(@PathVariable long id){
        for (Curso c : cursos) {
            if(c.getId() == id){
                return c;
            }
        }
        return null;
    }

    @PostMapping("/crearCurso")
    public Curso crearCurso(@RequestBody CrearCurso data){//JSON to ObjetoJava
        Curso nuevo = new Curso(++ultimoId, data.getName());
        cursos.add(nuevo);
        return nuevo;
    }

    @PutMapping("/actualizarCurso")
    public Curso actualizarCurso(@RequestBody Curso data){
        for (Curso c : cursos) {
            if( c.getId() == (long)data.getId() ){
                c.setName(data.getName());
                return c;
            }
        }
        return null;
    }

    @DeleteMapping("borrarCurso/{id}")
    public Curso borrarCurso(@PathVariable long id){
        int count = 0;
        for (Curso c : cursos) {
            if( c.getId() == id ){
                Curso cursoRet = new Curso(c.getId(),c.getName());
                cursos.remove(count);
                return cursoRet;
            }
            count++;
        }
        return null;
    }
}
