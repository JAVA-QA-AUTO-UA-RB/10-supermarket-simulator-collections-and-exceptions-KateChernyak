package main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductInventory {
    private ArrayList<String> products = new ArrayList<>();

    //методи

    public void addProduct(String product) {
        products.add(product);
    }


    public void removeProduct(String name) throws OutOfStockException {
        if (!products.remove(name)) {
            throw new OutOfStockException( " Вибачте, товар " + name + " тимчасово відсутній. ");
        }
    }


    public void sortProducts(){
        Collections.sort(products);
    }

    public List<String> getProducts() {
        return products;
    }
}
