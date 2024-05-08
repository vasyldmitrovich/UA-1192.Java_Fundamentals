package com.softserve.edu04;

import java.util.Scanner;

public class Continents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of continents:");
        String country = sc.nextLine();

        String continent;

        switch (country) {
            case "Europe":
                continent = "Europe";
                break;
                // WHAT IS THE BORDER???????? WHY each case have border? it is not good
                case "Asia":
                    continent = "Asia";
                    break;

                    case "Africa":
                        continent = "Africa";
                        break;

                        case "North America":
                        continent = "North America";
                        break;

                        case "South America":
                            continent = "South America";
                            break;

                            case "Australia":
                                continent = "Australia";
                                break;

                                case "Antarctica":
                                    continent = "Antarctica";
                                    break;

                                      default:
                                          continent = "Unknown ";
        }

        System.out.println("Country: " + country + " depend to the continent: " + continent);
        sc.close();
    }
}
