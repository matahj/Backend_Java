package org.example;

public class Main {
    public static void main(String[] args) {
        Helado suave = new HeladoSuave();

        suave = new CoberturaDecorator(suave);
        suave = new GranolaDecorator(suave);
        suave = new ToppingDecorator(suave);
        suave = new MermeladaDecorator(suave);
        suave = new GalletaDecorador(suave);

        System.out.println("[Ticket de compra]");
        System.out.println(suave.getDescription());
        System.out.println(suave.getPrice());
    }
}