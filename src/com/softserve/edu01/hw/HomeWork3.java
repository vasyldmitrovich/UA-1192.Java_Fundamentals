package com.softserve.edu01.hw;

/*PS: знаю, що це можна зробити якось короче і простіше, але я поки не знаю як то зробити
(новачок в цих справах). Тому поки так:) */

import java.util.Scanner;

public class HomeWork3 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Input the cost per minute for the first country");
        double c1 = scanner.nextDouble();
        System.out.println("Input duration for the first country");
        double t1 = scanner.nextDouble();
        System.out.println(c1*t1);
        System.out.println("Input the cost per minute for the second country");
        double c2 = scanner.nextDouble();
        System.out.println("Input duration for the second country");
        double t2 = scanner.nextDouble();
        System.out.println(c2*t2);
        System.out.println("Input the cost per minute for the third country");
        double c3 = scanner.nextDouble();
        System.out.println("Input duration for the third country");
        double t3 = scanner.nextDouble();
        System.out.println(c3*t3);
        double totalCost = c1 * t1 + c2 * t2 + c3 * t3;
        System.out.println("Total cost: " + totalCost);
    }
}
