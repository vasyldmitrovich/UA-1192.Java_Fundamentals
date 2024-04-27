package com.softserve.edu01.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class App {
        public static void main(String[] args) throws IOException  {
                App.exercise1();
                App.exercise2();
                App.exercise3();

        }
        public static void exercise1() throws IOException {
                BufferedReader exercise1 = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Flower bed is shaped like a circle.Let's Calculate its perimeter and area!\nInput the radius: ");
                Double r = Double.parseDouble(exercise1.readLine());
                Double p = 3.14;
                Double perimetr = 2*p*r;
                Double area = p*(r*r);
                System.out.println("Perimetr of flower bed is " + perimetr);
                System.out.println("Area of flower bed is " + area);

        }

        public static void exercise2() throws IOException {
                BufferedReader exercise2 = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("\nWhat is your name?");
                String name = exercise2.readLine();
                System.out.println("\nWhere do you live, " + name+ "?");
                String adress = exercise2.readLine();
                System.out.println("\nOkay, your name is "+name + " and you are living in " + adress);
        }
        public static void exercise3() throws IOException {
                BufferedReader exercise3 = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("\nSpecify the cost of the first call: ");
                Double c1 = Double.parseDouble(exercise3.readLine());
                System.out.println("\nSpecify the duration of the first call: ");
                Double t1 = Double.parseDouble(exercise3.readLine());
                Double c1value = c1*t1;

                System.out.println("\nSpecify the cost of the second call: ");
                Double c2 = Double.parseDouble(exercise3.readLine());
                System.out.println("\nSpecify the duration of the second call: ");
                Double t2 = Double.parseDouble(exercise3.readLine());
                Double c2value = c2*t2;

                System.out.println("\nSpecify the cost of the third call: ");
                Double c3 = Double.parseDouble(exercise3.readLine());
                System.out.println("\nSpecify the duration of the third call: ");
                Double t3 = Double.parseDouble(exercise3.readLine());
                Double c3value = c3*t3;

                Double totalsum = c1value + c2value + c3value;
                System.out.println("\nCost of the first call was: " + c1value);
                System.out.println("\nCost of the second call was: " + c2value);
                System.out.println("\nCost of the third call was: " + c3value);
                System.out.println("\nTotal amount of all calls is: " + totalsum);

        }

}

