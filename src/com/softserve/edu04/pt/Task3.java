package com.softserve.edu04.pt;

import java.util.Scanner;
public class Task3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Continents continent;
        System.out.println("Enter the country name: ");
        String countryName = sc.nextLine();
        countryName = countryName.toUpperCase();
        continent = switch (countryName) {
            case "GERMANY", "ITALY", "SWEDEN" -> Continents.EUROPE;
            case "JAPAN", "CHINA", "SOUTH KOREA" -> Continents.ASIA;
            case "NIGER", "SUDAN", "SOMALI" -> Continents.AFRICA;
            case "USA", "CANADA", "MEXICO" -> Continents.AMERICA;
            case "AUSTRALIA" -> Continents.AUSTRALIA;
            default -> throw new IllegalArgumentException("Unknown country for this program :) ");
        };
        System.out.println("This country placed in " + continent);
    }
}
enum Continents {
    EUROPE, ASIA, AFRICA, AMERICA, AUSTRALIA
}
