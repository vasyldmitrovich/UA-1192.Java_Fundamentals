package com.softserve.edu03.hw;

import java.util.Scanner;

public class AppHomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //код для тесту першого домашнього завадання
        /*double first = getNumber(scanner,"Enter the first side");
        double second = getNumber(scanner,"Enter the second side");
        double third = getNumber(scanner,"Enter the third side");
        double area = findArea(first,second,third);
        System.out.println("Your area of the triangle: "+area);*/
        //код для тесту другого домашнього завадання
        /*System.out.println("Input first int");
        int first = scanner.nextInt();
        System.out.println("Input second int");
        int second = scanner.nextInt();
        System.out.println("Input third int");
        int third = scanner.nextInt();
        System.out.println("Your min integer is:"+findMin(first,second,third));*/
        //код для тесту третього домашнього завадання
        Person person1 = new Person("Pavlo","Chernyavckii");
        person1.output();
        Person person2 = new Person();
        person2.output();
        Person person3 = new Person();
        person3.input("Zhenya","Saenko",1990);
        person3.output();
        person3.changeName("Dima","Kasper");
        person3.output();
        Person person4 = new Person("Ivan","Backmet");
        person4.setBirthYear(2003);
        person4.output();
        Person person5 = new Person();
        person5.input( "Polina","Chernishova",2010);
        person5.output();





    }
    public static double findArea(double first,double second, double third){
        double perimetr = (first+second+third)/2;
        return Math.sqrt((perimetr*(perimetr-first)*(perimetr-second)*(perimetr-third)));
    }
    public static double getNumber(Scanner scanner,String prompt){
        System.out.println(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Please enter a valid number:");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public static int findMin(int first,int second,int third){
        int min=first;
        if(min>second){
            min=second;
        } else if (min>third) {
            min = third;
        }
        return min;
    }

}
