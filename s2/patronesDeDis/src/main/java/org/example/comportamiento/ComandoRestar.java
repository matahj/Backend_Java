package org.example.comportamiento;

public class ComandoRestar extends ComandoCalculadora implements ComandoC {
    public ComandoRestar(float acumulador, float valor) {
        super(acumulador, valor);
    }
    @Override
    public float ejecutar() {
        return acumulador - valor;
    }



}

