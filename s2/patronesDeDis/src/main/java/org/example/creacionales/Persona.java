package org.example.creacionales;

public class Persona {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;
    private String direccion;
    private String estadoCivil;

    public Persona(PersonaBuilder builder){
        this.nombre = builder.getNombre();
        this.apellidoPaterno = builder.getApellidoPaterno();
        this.apellidoMaterno = builder.getApellidoMaterno();
        this.edad = builder.getEdad();
        this.direccion = builder.getDireccion();
        this.estadoCivil = builder.getEstadoCivil();
    }

    @Override
    public String toString(){
        return "Nombre: "+nombre+", ApellidoPaterno: "+apellidoPaterno+", ApellidoMaterno: "+apellidoMaterno+", Edad: "+edad+", Dirección: "+direccion+", EstadoCivil: "+estadoCivil+".";
    }

//    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, String estadoCivil){
//        this.nombre = nombre;
//        this.apellidoPaterno = apellidoPaterno;
//        this.apellidoMaterno = apellidoMaterno;
//        this.estadoCivil = estadoCivil;
//    }
//
//    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, String estadoCivil, int edad){
//        this(nombre, apellidoPaterno, apellidoMaterno, estadoCivil);
//        this.edad = edad;
//    }
//
//    public String getNombre(){
//        return nombre;
//    }
//    public void setNombre(String nombre){
//        this.nombre = nombre;
//    }

}
