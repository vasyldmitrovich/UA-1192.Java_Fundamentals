package com.softserve.edu04.pt;

import java.util.Scanner;

public class AppPt {
   public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {// This class and methods is good
        System.out.println("///////////////////////////////////////////////////////////");
        firstTask();
        System.out.println("///////////////////////////////////////////////////////////");
        secondTask();
        System.out.println("///////////////////////////////////////////////////////////");
        thirdTask();
        System.out.println("///////////////////////////////////////////////////////////");
        // код для перевірки 4 практичного завдання.
        Product product1 = new Product("Iphone 15",52000,12);
        Product product2 = new Product("Galaxy S24",57000,19);
        Product product3 = new Product("Pixel 7",308000,7);
        Product product4 = new Product("Xiaomi mi 10",25000,10);

        findMostExpensive(product1,product2,product3,product4);
        findMostQuantity(product1,product2,product3,product4);


    }

    public static void firstTask(){
        int array [] = new int[3];
        int counter = 0;
        System.out.println("Please enter a three numbers using 'Enter'");
        for (int i = 0; i<array.length;i++){
            array[i]=scanner.nextInt();
            if(array[i]%2 !=0){
                counter++;
            }
        }
        System.out.print("Your 3 numbers:");
        for (int i = 0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("\nThe count of odd numbers:"+ counter);
    }

    public static void secondTask(){
        int number;
        do{
            System.out.println("Please enter a number of the day of the week (1-7)");
            number = scanner.nextInt();
            switch (number){
                case 1:{
                    System.out.println("The name of the day of the week: Понеділок, Monday");
                    break;
                }
                case 2:{
                    System.out.println("The name of the day of the week: Вівторок, Tuesday ");
                    break;
                }
                case 3:{
                    System.out.println("The name of the day of the week: Середа, Wednesday ");
                    break;
                }
                case 4:{
                    System.out.println("The name of the day of the week: Четвер, Thursday ");
                    break;
                }
                case 5:{
                    System.out.println("The name of the day of the week: П'ятниця, Friday ");
                    break;
                }
                case 6:{
                    System.out.println("The name of the day of the week: Субота, Saturday ");
                    break;
                }
                case 7:{
                    System.out.println("The name of the day of the week: Неділя, Sunday ");
                    break;
                }
                default:{
                    System.out.println("You entered wrong number!");
                    break;
                }
            }
        }while((number<1)||(number>7));
    }


    public static void thirdTask(){
        Continents continents = null;
        System.out.println("Enter a country");
        scanner.nextLine();
        String country = scanner.nextLine().toLowerCase();
        switch (country){
            case "ukraine","germany","france","italy","poland" ->continents=Continents.EUROPE;
            case "nigeria","south africa","egypt","kenya","morocco" ->continents=Continents.AFRICA;
            case "china","india","japan","south korea","indonesia" ->continents=Continents.ASIA;
            case "united states","brazil","canada","mexico","argentina" ->continents=Continents.AMERICA;
            case "australia" ->continents=Continents.AUSTRALIA;
            default -> System.out.println("You entered an incorrect country or the country is not in the list" );
    }
        System.out.println("Does your country belong to the following continent:"+continents);
    }

    public static void findMostExpensive(Product product1,Product product2,Product product3,Product product4){
        if((product1.getPrice()>product2.getPrice()&&product1.getPrice()>product3.getPrice()&&product1.getPrice()>product4.getPrice())){
            System.out.println("The most expensive item\nName:"+product1.getName()+"\nQuantity:"+product1.getQuantity());
        }
        else if((product2.getPrice()>product1.getPrice()&&product2.getPrice()>product3.getPrice()&&product2.getPrice()>product4.getPrice())){
            System.out.println("The most expensive item\nName:" + product2.getName() + "\nQuantity:" + product2.getQuantity());
        }
        else if((product3.getPrice()>product1.getPrice()&&product3.getPrice()>product2.getPrice()&&product3.getPrice()>product4.getPrice())){
            System.out.println("The most expensive item\nName:" + product3.getName() + "\nQuantity:" + product3.getQuantity());
        }
        else {
            System.out.println("The most expensive item\nName:" + product4.getName() + "\nQuantity:" + product4.getQuantity());
        }
    }

    public static void findMostQuantity(Product product1,Product product2,Product product3,Product product4){
        if((product1.getQuantity()>product2.getQuantity()&&product1.getQuantity()>product3.getQuantity()&&product1.getQuantity()>product4.getQuantity())){
            System.out.println("The product with the biggest Quantity:\nName:"+product1.getName());
        }
        else if((product2.getQuantity()>product1.getQuantity()&&product2.getQuantity()>product3.getQuantity()&&product2.getQuantity()>product4.getQuantity())){
            System.out.println("The product with the biggest Quantity:\nName:" + product2.getName());
        }
        else if((product3.getQuantity()>product1.getQuantity()&&product3.getQuantity()>product2.getQuantity()&&product3.getQuantity()>product4.getQuantity())){
            System.out.println("The product with the biggest Quantity:\nName:" + product3.getName());
        }
        else {
            System.out.println("The product with the biggest Quantity:\nName:" + product4.getName());
        }
    }

}
