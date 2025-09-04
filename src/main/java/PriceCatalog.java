package main.java;

import java.util.HashMap;
import java.util.Map;

public class PriceCatalog {
    private HashMap<String,Double> prices = new HashMap<>();

    //методи

    public void addPrice(String product, double price){
        if (price < 0){
            throw new IllegalArgumentException ( "Ціна за товар не може бути нижче 0 !!!");
        }
        prices.put(product, price);
    }

    public double getPrice(String product) throws NoSuchProductException{
        if(!prices.containsKey(product)) {
            throw new NoSuchProductException ( " Такого продукту немає" + product);
        }
        return prices.get(product);
    }

    public Map<String, Double> getPrices(){
        return prices;
    }
}
