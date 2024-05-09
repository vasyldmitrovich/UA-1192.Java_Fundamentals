package com.softserve.edu04.pt;

import java.util.Scanner;

public class App {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//       App.task1 ();
//         App.task2();
         App.task3();

    }

        public static void task1() {
            System.out.print("Input first number: ");
            double number1 = scanner.nextDouble();

            System.out.print("Input second number: ");
            double number2 = scanner.nextDouble();

            System.out.print("Input third number: ");
            double number3 = scanner.nextDouble();

            int count = 0;
            if (number1 % 2 != 0) {
                count++;
            }
            if (number2 % 2 != 0) {
                count++;
            }
            if (number3 % 2 != 0) {
                count++;
            }

            System.out.println("Number of odd is: " + count);

        }

    public static void task2() {
        System.out.print("Input the number of the day of the week: ");
        int dayOfWeek = scanner.nextInt();
        String result;

        switch (dayOfWeek) {
            case 1:
                result = "Monday, Полнеділок";
                break;
            case 2:
                result = "Tuesday, Вівторок";
                break;
            case 3:
                result = "Wednesday, Середа";
                break;
            case 4:
                result = "Thursday, Четвер";
                break;
            case 5:
                result = "Friday, П'ятниця";
                break;
            case 6:
                result = "Saturday, Субота";
                break;
            case 7:
                result = "Sunday, Неділя";
                break;
            default:
                result = "Wrong number";

                   }
        System.out.println(result);
    }

    public static void task3() {
        Continents continents;

        System.out.print("Input the name of country: ");
        String country = scanner.nextLine();

        continents = switch (country) {
            case "Ukraine", "Poland" -> Continents.Eurasia;
            case "USA", "Canada" -> Continents.North_America;
            case "Brazil" -> Continents.South_America;
            case "SAR" -> Continents.Africa;
            case "Australia" -> Continents.Australia;
            default -> Continents.Undefined;
        };
        System.out.println("The names of continent of " + country +" is " + continents);
    }
}
