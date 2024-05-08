package com.softserve.edu04.pt;
//pt task 4
public class Product {
    private final String name;
    private final double price;
    private final int quantity;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    class productItems {
        public static void main(String [] args) {
            Product product1 = new Product("Table", 100, 12);
            Product product2 = new Product("Laptop", 230, 3);
            Product product3 = new Product("Sofa", 599, 2);
            Product product4 = new Product("Lamp", 35, 15);

            Product mostExpensive = product1;
            if (product2.getPrice() > mostExpensive.getPrice()) {
            mostExpensive = product2;}
            if (product3.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = product3;}
            if (product4.getPrice() > mostExpensive.getPrice()){
                mostExpensive = product4;}

            System.out.println("The most product is: " +mostExpensive);

            int  maxQuantity = product1.getQuantity();
            if(product2.getQuantity() > maxQuantity) {
                maxQuantity = product2.getQuantity();}

            if(product3.getQuantity() > maxQuantity) {
                maxQuantity = product3.getQuantity();}

            if(product4.getQuantity() > maxQuantity) {
                maxQuantity = product4.getQuantity();}

            System.out.println("The items with max quantity is: " +maxQuantity);

        }
    }
}
