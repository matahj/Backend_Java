package org.example.creacionales;

public class PersonaBuilder {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;
    private String direccion;
    private String estadoCivil;

    public PersonaBuilder(String nombre, String apellidoPaterno, String apellidoMaterno, String estadoCivil){
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.estadoCivil = estadoCivil;
    }

    public PersonaBuilder edad(int edad){
        this.edad = edad;
        return this;
    }

    public PersonaBuilder direccion(String direccion){
        this.direccion = direccion;
        return this;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void validar() throws Exception{
        if(edad < 18){
            throw new Exception("La edad debe ser mayor que 18");
        }

    }

    public Persona construir() throws Exception{
        validar();
        return new Persona(this);
    }
}
