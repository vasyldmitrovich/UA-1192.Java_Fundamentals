package com.softserve.edu4.pt;

import java.util.Scanner;

public class PracticalTask3 {

    private Continents continent;
    private String name;

    PracticalTask3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the country");
        this.name = sc.nextLine();
    }

    public void start() {
        switch (this.name) {
            case "Australia":
            case "New Zealand": {
                this.continent = Continents.AUSTRALIA;
                System.out.println("Country belongs to continent Australia");
                break;
            }
            case "Ukraine":
            case "France":
            case "Germany": {
                this.continent = Continents.EUROPE;
                System.out.println("Country belongs to continent Europe");
                break;
            }
            case "Antarctica": {
                this.continent = Continents.ANTARCTICA;
                System.out.println("Country belongs to continent Antarctica");
                break;
            }
            case "Argentina":
            case "Bolivia":
            case "Brazil": {
                this.continent = Continents.SOUTH_AMERICA;
                System.out.println("Country belongs to continent South America");
                break;
            }
            case "USA":
            case "Canada":
            case "Mexico": {
                this.continent = Continents.NORTH_AMERICA;
                System.out.println("Country belongs to continent North America");
                break;
            }
            case "Egypt":
            case "Sudan":
            case "Algeria": {
                this.continent = Continents.AFRICA;
                System.out.println("Country belongs to continent Africa");
                break;
            }
            case "China":
            case "Japan":
            case "India": {
                this.continent = Continents.ASIA;
                System.out.println("Country belongs to continent Asia");
                break;
            }
            default:
                System.out.println("Country not recognized");
        }
    }
}
