package com.softserve.edu04.pt.task4;
import java.util.Scanner;

public class NewProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product product1 = new Product("Product1", 10, 3);
        Product product2 = new Product("Product2", 15, 20);
        Product product3 = new Product("Product3", 3, 12);
        Product product4 = new Product("Product4", 5, 7);

        Product mostExpensive = (product1.getPrice() > product2.getPrice()) ? product1 : product2;
        mostExpensive = (mostExpensive.getPrice() > product3.getPrice()) ? mostExpensive : product3;
        mostExpensive = (mostExpensive.getPrice() > product4.getPrice()) ? mostExpensive : product4;
        System.out.println("The most expensive item is: " + mostExpensive.getName() + ", Quantity: " + mostExpensive.getQuantity());

        Product biggestQuantity = (product1.getQuantity() > product2.getQuantity()) ? product1 : product2;
        biggestQuantity = (biggestQuantity.getQuantity() > product3.getQuantity()) ? biggestQuantity : product3;
        biggestQuantity = (biggestQuantity.getQuantity() > product4.getQuantity()) ? biggestQuantity : product4;
        System.out.println("The item with the biggest quantity is: " + biggestQuantity.getName());
    }
}
