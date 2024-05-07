package com.softserve.edu03.hw;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//       Created 5 objects by Person class;

        Person obj1 = new Person();
        Person obj2 = new Person();
        Person obj3 = new Person();
        Person obj4 = new Person();
        Person obj5 = new Person();

//        Use method input();

        obj1.input("John","Wick",1975);
        obj2.input("Henry","Ford",1863);
        obj3.input("Jack","Sparrow",1749);
        obj4.input("Dean","Winchester",1989);
        obj5.input("Rostyslav","Kushpit",1997);


//      Calling method output();

        obj1.output();
        obj2.output();
        obj3.output();
        obj4.output();
        obj5.output();

    }
//      Created methods getArea(); and getMin();
    public static void getArea() {
        Scanner sc = new Scanner(System.in);
        double array[] = new double[3];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Input the " + (i + 1) + " side: ");
            array[i] = sc.nextInt();
        }
        double p = (array[0] + array[1] + array[2]) / 2;
        double i = Math.sqrt(p * (p - array[0]) * (p - array[1]) * (p - array[2]));
        System.out.print("The area of the triangle is: " + i);

    }

    public static void getMin(){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        for (int i = 0; i< arr.length;i++){
            System.out.print("Enter " + (i+1) + " number: ");
            arr[i]= sc.nextInt();
        }
        int min = arr[2];
        for (int i = 0; i< arr.length;i++){
            if (min>arr[i])
                min = arr[i];
        }
        System.out.println("The smallest value is: " + min);
    }
}
















