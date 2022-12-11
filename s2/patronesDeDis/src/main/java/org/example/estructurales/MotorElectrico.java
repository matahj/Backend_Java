package org.example.estructurales;

public class MotorElectrico {
    private boolean conectado = false;

    public MotorElectrico(){
        System.out.println("Creando motor eléctrico.");
        this.conectado = false;
    }

    public void conectar(){
        System.out.println("Conectando motor eléctrico.");
        this.conectado = true;
    }

    public void desconectar(){
        System.out.println("Desconectando motor eléctrico.");
        this.conectado = false;
    }

    public void activar(){
        if(!this.conectado){
            System.out.println("No se puede activar el motor eéctrico porque no está conectado.");
        } else {
            System.out.println("Motor eléctrico conectado, activando motor...");
        }
    }

    public void moverMasRapido(){
        if(!this.conectado){
            System.out.println("No se puede mover más rápido, motor eléctrico no conectado");
        } else {
            System.out.println("Moviendo más rápido...Aumentando voltaje en motor eléctrico");
        }
    }

    public void detener(){
        if(!this.conectado){
            System.out.println("No se puede detener, motor eléctrico desconectado");
        }else {
            System.out.println("Deteniendo motor eléctrico.");
        }
    }
}
