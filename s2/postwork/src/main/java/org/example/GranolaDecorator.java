package org.example;

public class GranolaDecorator implements Helado{
    Helado helado;

    GranolaDecorator(Helado helado){
        this.helado = helado;
    }
    @Override
    public String getDescription() {
        return helado.getDescription()+", con Granola extra";
    }

    @Override
    public int getPrice() {
        return helado.getPrice()+10;
    }
}
