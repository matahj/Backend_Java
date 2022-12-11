package org.example.estructurales;

public class AnalysisiLibrary {
    public void analyzeInformation(String json) throws Exception{
        if(!validateJSON(json)){
            throw new Exception("La información no tiene formato JSON");
        }

        System.out.println("Procesando la información...");
    }

    public boolean validateJSON(String data){
        //Valida si la información llaga en formato JSON
        return true;
    }
}
