package com.softserve.edu01.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        App.task1();
        task2();
        task3();
    }

    private static void task1() throws IOException {
        System.out.println("Enter the radius");

        double radius = Double.parseDouble (br.readLine());
        double perimeter = (2 * Math.PI * radius);
        double area = (Math.PI * Math.pow(radius,2));

        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
    }

    private static void task2() throws IOException {
        System.out.println("What is your name?");

        String name = br.readLine();
        System.out.println("Where do you live, " + name + "?");

        String address = br.readLine();
        System.out.println(name + " lives in " + address);
    }

    private static void task3() throws IOException {
        System.out.println("Enter the cost per minute of the first call ($)" );
        double c1 = Double.parseDouble(br.readLine());

        System.out.println("Enter the duration of the first call (min)" );
        double t1 = Double.parseDouble(br.readLine());

        System.out.println("Enter the cost per minute of the second call ($)" );
        double c2 = Double.parseDouble(br.readLine());

        System.out.println("Enter the duration of the second call (min)" );
        double t2 = Double.parseDouble(br.readLine());

        System.out.println("Enter the cost per minute of the third call ($)" );
        double c3 = Double.parseDouble(br.readLine());

        System.out.println("Enter the duration of the third call (min)" );
        double t3 = Double.parseDouble(br.readLine());

        double costFirstCall = c1 * t1;
        double costSecondCall = c2 * t2;
        double costThirdCall = c3 * t3;
        double totalCost = costFirstCall + costSecondCall + costThirdCall;

        System.out.println("The cost of the first call = " + costFirstCall + "$");
        System.out.println("The cost of the second call = " + costSecondCall + "$");
        System.out.println("The cost of the third call = " + costThirdCall + "$");
        System.out.println("The total cost = " + totalCost + "$");
    }
    }











