package main.java;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
        private ArrayList<String> cart = new ArrayList<>();


//методи

    public void addToCart(String product){
        cart.add(product);
    }


    public void checkout(PriceCatalog catalog, double payment)
        throws InsufficientFundsException, NoSuchProductException{
        double total = 0.0;

        for(String product : cart){
            total += catalog.getPrice(product);
        }

        double tax = total * 0.10;
        double discount = total * (0.05 + Math.random() * 0.10);
        double subtotal = total + tax - discount;

        System.out.println( " Сума без податку: " + total);
        System.out.println( " Податок 10 %: "  + tax);
        System.out.println( " Знижка: " + String.format("%.2f", discount));
        System.out.println( " Всього до оплати: " +  String.format("%.2f", subtotal));

        if (payment < subtotal){
            throw new InsufficientFundsException ( " Недостатньо коштів(((. Потрібна сума: " + total);
        }
        System.out.println(" Оплата пройшла успішно! ");
    }



    public List<String> getCart(){
        return cart;
    }
}
