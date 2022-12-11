package org.example.comportamiento;

public class ComandoSumar extends ComandoCalculadora implements ComandoC {
    public ComandoSumar(float acumulador, float valor) {
        super(acumulador, valor);
    }

    @Override
    public float ejecutar(){
        return acumulador + valor;
    }
}
