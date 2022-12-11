package org.example;

import org.example.comportamiento.*;
import org.example.creacionales.Persona;
import org.example.creacionales.PersonaBuilder;
import org.example.creacionales.Singleton;
import org.example.estructurales.*;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {

        //Builder
        System.out.println("***********************************");

        Persona juan = new PersonaBuilder("Juan","Pérez","Ortiz", "Casado")
                .edad(30)
                .direccion("dir")
                .construir();

        System.out.println(juan.toString());

        //Singleton
        System.out.println("***********************************");

        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");

        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);

        //Adapter
        System.out.println("***********************************");

        StockMarketReport report = new StockMarketAdapter();
        String json = report.download();
        AnalysisiLibrary library = new AnalysisiLibrary();

        try {
            library.analyzeInformation(json);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //Calculadora
        System.out.println("***********************************");

        Scanner sc = new Scanner(System.in);
        String opcion, basura;
        int l;
        float resultado = 0;
        float entrada;
        boolean salir = false;
        Stack<ComandoC> pila = new Stack<>();

        while (!salir) {

            System.out.println("\nResultado: "+resultado);
            System.out.println("a.-Sumar");
            System.out.println("b.-Restar");
            System.out.println("c.-Multiplicar");
            System.out.println("d.-Dividir");
            System.out.println("e.-Desahacer último cambio");
            System.out.println("f.-Salir");

            opcion = sc.nextLine();

            switch (opcion) {
                case "a":
                    System.out.println("Ingresar número: ");
                    entrada = sc.nextFloat();
                    ComandoC comando = new ComandoSumar(resultado,entrada);
                    resultado = comando.ejecutar();
                    pila.add(comando);
                    basura = sc.nextLine();
                    break;
                case "b":
                    System.out.println("Ingresar número: ");
                    entrada = sc.nextFloat();
                    ComandoC comando2 = new ComandoRestar(resultado, entrada);
                    resultado = comando2.ejecutar();
                    pila.add(comando2);
                    basura = sc.nextLine();
                    break;
                case "c":
                    System.out.println("Ingresar número: ");
                    entrada = sc.nextFloat();
                    ComandoC comando3 = new ComandoMultiplicar(resultado, entrada);
                    resultado = comando3.ejecutar();
                    pila.add(comando3);
                    basura = sc.nextLine();
                    break;
                case "d":
                    System.out.println("Ingresar número: ");
                    entrada = sc.nextFloat();
                    ComandoC comando4 = new ComandoDividir(resultado, entrada);
                    resultado = comando4.ejecutar();
                    pila.add(comando4);
                    basura = sc.nextLine();
                    break;
                case "e":
                    if(!pila.isEmpty()){
                        ComandoC ultimo = pila.pop();
                        resultado = ultimo.deshacer();
                    }else {
                        System.out.println("No hay nada por deshacer10");
                    }
                    break;
                case "f":
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }



        //TextEditor, patron command.
        System.out.println("***********************************");

        TextEditor editor = new TextEditor();

        //El usuario presiona el boton de guardar
        editor.onPressSAveButton();

        //El usuario utiliza el menú
        editor.onMenuSaveOption();

        //El usuario presiona la combinación en el teclado
        editor.onShortcut();


        //Motor patrón adapter
        System.out.println("***********************************");
        System.out.println("***Creando Motor");
        Motor motor = new MotorElectricoAdapter();
        System.out.println("***Encendiendo Motor");
        motor.encender();
        System.out.println("***Acelerandof Motor");
        motor.acelerar();
        System.out.println("***Apagando Motor");
        motor.apagar();

    }
}


