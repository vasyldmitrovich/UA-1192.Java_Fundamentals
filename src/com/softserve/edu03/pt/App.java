package com.softserve.edu03.pt;

public class App {

    public static void main(String[] args) {
        int a = Task1.getNumber("Enter the first number : ");
        int b = Task1.getNumber("Enter the second number : ");

        int total = Task1.getTotal(a, b);
        double avg = Task1.getAverage();

        System.out.println("The sum of " + a + " and " + b + " is " + total);
        System.out.println("The average of " + a + " and " + b + " is " + avg);


    }

}
