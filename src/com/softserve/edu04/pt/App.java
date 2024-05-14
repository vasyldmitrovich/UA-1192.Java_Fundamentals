package com.softserve.edu04.pt;

import java.util.Scanner;


public class App {

    public static void main(String[] args) {
//Create 4 objects by Product class

        Product product1 = new Product("Milk", 27.49, 10);
        Product product2 = new Product("Tomato", 99.99, 7);
        Product product3 = new Product("Kit-Kat", 29.49, 3);
        Product product4 = new Product("Ice cream", 32.49, 19);

//Calling 4 methods which show the work of practical tasks methods

        gePracticalTask1();
        gePracticalTask2();
        gePracticalTask3();
        getPracticalTask4(product1, product2, product3, product4);

    }


    public static void gePracticalTask1() {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        int[] arr = new int[3];
        System.out.println("Enter 3 numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result = result + 1;
            }
        }
        System.out.println("The quantity of odd numbers is: " + result);
    }

    public static void gePracticalTask2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the day of the week number: ");
        String input = scanner.nextLine();
        String result = switch (input) {
            case "1" -> "Monday/Понеділок";
            case "2" -> "Tuesday/Вівторок";
            case "3" -> "Wednesday/Середа";
            case "4" -> "Thursday/Четвер";
            case "5" -> "Friday/П'ятниця";
            case "6" -> "Saturday/Субота";
            case "7" -> "Sunday/Неділя";
            default -> "Wrong number!";
        };
        System.out.println(result);
    }

    public static void gePracticalTask3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n***Input a contry\nand i will name the continent\nto which it belongs: ");
        String input = sc.nextLine();
        String result = switch (input) {
            case "ukraine", "germany", "united kingdom", "france", "italy", "spain", "belgium", "greece" ->
                    "The continent of " + input.toUpperCase().charAt(0) + input.substring(1).toLowerCase() + " is: " + Continents.EUROPE.toString();

            case "india", "china", "indonesia", "japan", "philippines", "israel", "singapore", "cyprus" ->
                    "The continent of " + input.toUpperCase().charAt(0) + input.substring(1).toLowerCase() + " is: " + Continents.ASIA.toString();

            case "nigeria", "ethiopia", "egypt", "congo", "tanzania", "south africa", "uganda", "morocco", "tunisia" ->
                    "The continent of " + input.toUpperCase().charAt(0) + input.substring(1).toLowerCase() + " is: " + Continents.AFRICA.toString();

            default -> "Can't find it. Try to input other country, please.";
        };
        System.out.println(result);
    }

    public static void getPracticalTask4(Product product1, Product product2, Product product3, Product product4) {
        int total = product1.getQuantity();
        String name = product1.getName();
        if (product1.getPrice() < product2.getPrice()) {
            total = product2.getQuantity();
            name = product2.getName();
        } else if (product1.getPrice() < product3.getPrice()) {
            total = product3.getQuantity();
            name = product3.getName();
        } else if (product1.getPrice() < product4.getPrice()) {
            total = product4.getQuantity();
            name = product3.getName();
        }
        System.out.println("The most expensive price has a " + name + ", which quantity is : " + total + " pcs.");
    }
}

