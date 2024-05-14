package com.softserve.edu04.pt;

import java.util.Scanner;

public class pt3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Available countries: \n EGYPT NIGERIA \n SOUTH AFRICA \n CHINA \n INDIA \n JAPAN \n UKRAINE \n POLAND \n GERMANY \n AUSTRALIA");
        System.out.println("Enter the name of the country:");
        String countryName = scanner.nextLine();
        scanner.close();

        Continents continent = GetContinent(countryName);
        if (continent != null) {
            System.out.println("Continent: " + continent);
        } else {
            System.out.println("Country is not available");
        }
    }

    public static Continents GetContinent(String countryName) {
        String country = countryName.toUpperCase();
        Continents continent;

        switch (country) {
            case "EGYPT":
            case "NIGERIA":
            case "SOUTH AFRICA":
                continent = Continents.AFRICA;
                break;
            case "CHINA":
            case "INDIA":
            case "JAPAN":
                continent = Continents.ASIA;
                break;
            case "UKRAINE":
            case "POLAND":
            case "GERMANY":
                continent = Continents.EUROPE;
                break;
            case "AUSTRALIA":
                continent = Continents.AUSTRALIA;
                break;
            default:
                continent = null;
                break;
        }
        return continent;
    }
}