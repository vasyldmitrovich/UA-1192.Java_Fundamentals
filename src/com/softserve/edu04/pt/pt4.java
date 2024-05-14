package com.softserve.edu04.pt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class pt4 {
    public static void main(String[] args) {

        Product product1 = new Product("Product 1", 10.0, 5);
        Product product2 = new Product("Product 2", 15.0, 7);
        Product product3 = new Product("Product 3", 29.0, 3);
        Product product4 = new Product("Product 4", 12.1, 100);

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);

        // can find by cycle
        Product mostExpensive = findMostExpensiveItem(products);
        System.out.println("Most expensive item: " + mostExpensive.getName() + ", Quantity: " + mostExpensive.getQuantity());

        // or by default methods
        Product maxQuantityItem = Collections.max(products, Comparator.comparing(Product::getQuantity));
        System.out.println("The biggest quantity item: " + maxQuantityItem.getName());
    }

    public static Product findMostExpensiveItem(List<Product> products) {
        if (products.isEmpty()) {
            return null;
        }

        Product mostExpensiveProduct = products.getFirst();

        for (int i = 1; i < products.size(); i++) {
            Product currentProduct = products.get(i);
            if (currentProduct.getPrice() > mostExpensiveProduct.getPrice()) {
                mostExpensiveProduct = currentProduct;
            }
        }
        return mostExpensiveProduct;
    }
}


