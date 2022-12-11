package org.example.comportamiento;

public class SaveCommand implements CommandA{

    @Override
    public void execute() {
        System.out.println("Guardando archivo...");
    }
}
