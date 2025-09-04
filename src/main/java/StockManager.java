package main.java;

import java.util.HashMap;
import java.util.Map;

public class StockManager {
    private HashMap<String, Integer> stock = new HashMap<>();

    //методи

public void addStock(String product, int quantity) {
    if (quantity < 0) {
        throw new IllegalArgumentException ( " Кількість товару не може бути меншою за 0 !!!");
    }
    stock.put(product, stock.getOrDefault(product, 0) + quantity);
}

public void reduceStock(String product) throws OutOfStockException {
    int current = stock.getOrDefault(product, 0);
    if (current<=0) {
        throw new OutOfStockException(" Зараз, на жаль, немає в наявності товару " + product);
    }
    stock.put(product, current - 1);
}


public Map<String, Integer> getStock() {
     return stock;
    }
}
