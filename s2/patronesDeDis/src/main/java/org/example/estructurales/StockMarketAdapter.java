package org.example.estructurales;

public class StockMarketAdapter implements StockMarketReport{
    private StockMarket stockMarket;

    public StockMarketAdapter(){
        stockMarket = new StockMarket();
    }

    @Override
    public String download() {
        String xml = stockMarket.download();
        return convertToJson(xml);
    }

    public String convertToJson(String xml){
        String json = "";

        //proceso para convertir de xml a json
        System.out.println("Convirtiendo la información de XML a JSON");
        return json;
    }
}
