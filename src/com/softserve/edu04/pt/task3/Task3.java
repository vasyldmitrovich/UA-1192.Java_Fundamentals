package com.softserve.edu04.pt.task3;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your country");

        String country = scanner.nextLine();

        Continents result = switch (country) {
            case "Egypt", "Nigeria" -> Continents.Africa;
            case "China", "India" -> Continents.Asia;
            case "Germany", "France" -> Continents.Europe;
            case "United States", "Canada" -> Continents.NorthAmerica;
            case "Brazil", "Argentina" -> Continents.SouthAmerica;
            case "Australia", "Fiji" -> Continents.Australia;
            default -> null;
        };
        System.out.println("Your continent is " + result);
    }
}
