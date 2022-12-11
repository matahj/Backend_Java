package org.example.comportamiento;

public class TextEditor {
    private CommandA saveComand;

    public TextEditor(){
        saveComand = new SaveCommand();
    }

    //Guarda archivo mediante el botón
    public void onPressSAveButton(){
        System.out.println("[Save Button]");
        saveComand.execute();
    }

    //Guarda archivo mediante el menú
    public void onMenuSaveOption(){
        System.out.println("[Menu]");
        saveComand.execute();
    }

    //Guarda archivo mediante una combinación de teclas
    public void onShortcut(){
        System.out.println("[Shortcut]");
        saveComand.execute();
    }
}
