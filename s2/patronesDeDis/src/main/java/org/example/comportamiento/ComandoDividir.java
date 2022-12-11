package org.example.comportamiento;

public class ComandoDividir extends ComandoCalculadora implements ComandoC {
    public ComandoDividir(float acumulador, float valor) {
        super(acumulador, valor);
    }
    @Override
    public float ejecutar() {
        if(valor==0){
            System.out.println("No se puede dividir entre 0");
            return acumulador;
        }else{
            return acumulador/valor;
        }
    }
}