package com.softserve.edu04.HW.pt;

import java.util.Scanner;

public class App {
    public static final Scanner scanner=new Scanner(System.in);

    public static void main(String... args) {

        pt1();
        pt2();
        pt3();
        pt4();
    }

        public static void pt1() {
            System.out.println("Enter three numbers:");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();

            int count = 0;
            if (num1 % 2 != 0) count++;
            if (num2 % 2 != 0) count++;
            if (num3 % 2 != 0) count++;
            System.out.println("There are " + count + "odd numbers");
        }

    public static void pt2() {
        System.out.println("Enter the number of a day of a week");
        int dayNumber = scanner.nextInt();
        DayOfWeek dayOfWeek=DayOfWeek.getByNumber(dayNumber);

        System.out.println("This number corresponds to: " + dayOfWeek.englishName);

        System.out.println("Цей номер відповідає дню: " + dayOfWeek.ukrainianName);

        }


        public static void pt3() {
            System.out.println("Enter the name of the country:");

            String country = scanner.nextLine();

            Continent continent = Continent.getForCountry(country);

            System.out.println("Country named'" + country + "'belongs to" + continent);
        }

public static void pt4(){

        Product product1 = new Product("IPhone", 54555.5, 17);
        Product product2 = new Product("Laptop", 78554.9, 10);
        Product product3 = new Product("Smartphone", 14552.9, 6);
        Product product4 = new Product("Tablet", 8554.9, 4);

        // Find the most expensive item

        Product mostExpensive = product1;
        if (product2.getPrice() > mostExpensive.getPrice()) {
            mostExpensive = product2;
        }
        if (product3.getPrice() > mostExpensive.getPrice()) {
            mostExpensive = product3;
        }
        if (product4.getPrice() > mostExpensive.getPrice()) {
            mostExpensive = product4;
        }
        System.out.println("The most expensive product is:\n"
                + "name=" + mostExpensive.getName() + "\n" +
                "quantity=" + mostExpensive.getQuantity()
        );
        int maxQuantity = product1.getQuantity();
        if (product2.getQuantity() > maxQuantity) {
            maxQuantity = product2.getQuantity();
        }
        if (product3.getQuantity() > maxQuantity) {
            maxQuantity = product3.getQuantity();
        }
        if (product4.getQuantity() > maxQuantity) {
            maxQuantity = product4.getQuantity();
        }

        System.out.println("The products with maximum quantity of" + maxQuantity + " are the following : ");

        if (product1.getQuantity() == maxQuantity) {
            System.out.println(" " + product1.getName());
        }
        if (product2.getQuantity() == maxQuantity) {
            System.out.println(" " + product2.getName());
        }
        if (product3.getQuantity() == maxQuantity) {
            System.out.println(" " + product3.getName());
        }
        if (product4.getQuantity() == maxQuantity) {
            System.out.println(" " + product4.getName());
        }
    }

}