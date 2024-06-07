package com.softserve.edu12_excep.pt;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

//        task1();
        task2();

    }

    public static void task1() {

        System.out.println("Pt 12 task 1");


        try {
            System.out.print("Enter first size: ");
            int a = SCANNER.nextInt();

            System.out.print("Enter second size: ");
            int b = SCANNER.nextInt();

            System.out.println(squareRectangle(a, b));
        } catch (InputMismatchException e) {
            System.err.println("enter a positive integer");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Exception");

        }

        System.out.println("Finish task 1");
    }


    public static void task2() {

//не зрозумів завдання. Enum перевіряє значення, інакше Compiling error. Навіщо ще одна перевірка

        Plant[] plants = new Plant[5];

        try {

            plants[0] = new Plant(25, Color.black, Type.ficus);
            plants[1] = new Plant(54, Color.white, Type.picus);
            plants[2] = new Plant(2, Color.green, Type.ficus);
            plants[3] = new Plant(63, Color.black, Type.picus);
            plants[4] = new Plant(1, null, Type.ficus);


        } catch (ColorException | TypeException e) {
            System.err.println(e.getMessage());
        }

        // Выводим информацию о растениях
        for (Plant plant : plants) {
            if (plant != null) {
                System.out.println(plant);
            }
        }


    }


    public static int squareRectangle(int a, int b) throws InputMismatchException, IllegalArgumentException, Exception {

        if (a > 0 && b > 0) {
            int area = a * b;
            return area;
        } else { //  Create and call exception
            throw new IllegalArgumentException("input value is below zero!");
        }

    }


}
