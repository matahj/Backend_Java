package org.example.comportamiento;

public class ComandoMultiplicar extends ComandoCalculadora implements ComandoC {
    public ComandoMultiplicar(float acumulador, float valor) {
        super(acumulador, valor);
    }
    @Override
    public float ejecutar() {
        return acumulador*valor;
    }
}
