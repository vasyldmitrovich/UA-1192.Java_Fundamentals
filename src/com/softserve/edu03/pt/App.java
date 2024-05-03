package com.softserve.edu03.pt;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        try {
            int a = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the second number");
            int b = sc.nextInt();
            sc.nextLine();
            PracticalTask1 practicalTask1 = new PracticalTask1(a, b);
            System.out.println(practicalTask1.getTotal() + "\n" + practicalTask1.getAverage());
        } catch (Exception e) {
            System.out.println("Error");
        }
        System.out.println("Enter the number");
        System.out.println(PracticalTask1.getNumber(sc.nextLine()));
    }
}
