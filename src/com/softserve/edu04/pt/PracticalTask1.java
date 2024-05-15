package com.softserve.edu04.pt;

import java.util.Scanner;

public class PracticalTask1 {

    private int a;
    private int b;
    private int c;
    private int count = 0;

    PracticalTask1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        try {
            this.a = sc.nextInt();
            if (this.a % 2 == 1) {
                this.count++;
            }
            System.out.println("Enter the second number");
            this.b = sc.nextInt();
            if (this.b % 2 == 1) {
                this.count++;
            }
            System.out.println("Enter the third number");
            this.c = sc.nextInt();
            if (this.c % 2 == 1) {
                this.count++;
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public void start() {
        System.out.println("The " + this.count + " numbers you entered are odd");
    }


}
