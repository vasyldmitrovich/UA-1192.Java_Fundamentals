package com.softserve.edu04.pt;
import java.util.Scanner;
//pt

enum Continent {
    AFRICA, ASIA, AUSTRALIA, EUROPE, NORTH_AMERICA, SOUTH_AMERICA;

    public static Continent getCountry (String country) {
        return switch (country) {
            case "Albania", "Andorra", "Austria", "Belarus", "Belgium", "Bosnia and Herzegovina", "Bulgaria", "Croatia",
                 "Cyprus", "Czech", "Estonia", "Finland", "France", "Germany", "Greece", "Hungary", "Iceland",
                 "Ireland",
                 "Italy", "Latvia", "Liechtenstein", "Lithuania", "Luxembourg", "Malta", "Moldova", "Monaco",
                 "Montenegro", "Netherlands", "North Macedonia", "Norway", "Poland", "Portugal", "Romania",
                 "San Marino", "Serbia",
                 "Slovakia", "Slovenia", "Spain", "Sweden", "Switzerland", "Ukraine" -> EUROPE;

            case "Afghanistan", "Azerbaijan", "Bahrain", "Bangladesh", "Bhutan", "Brunei", "Cambodia", "China",
                 "Georgia", "India", "Indonesia", "Iran", "Iraq",
                 "Israel", "Japan", "Jordan", "Kazakhstan", "Kuwait", "Kyrgyzstan", "Laos", "Lebanon", "Malaysia",
                 "Maldives", "Mongolia", "Myanmar", "Nepal",
                 "North Korea", "Oman", "Pakistan", "Palestine", "Philippines", "Qatar", "Saudi Arabia", "Singapore",
                 "South Korea", "Sri Lanka", "Syria", "Taiwan", "Tajikistan", "Thailand", "Timor-Leste",
                 "Turkmenistan", "United Arab Emirates", "Uzbekistan", "Vietnam", "Yemen" -> ASIA;

            case "Antigua and Barbuda", "Bahamas", "Barbados", "Canada", "Cuba", "Dominica", "Dominican Republic",
                 "Grenada", "Jamaica", "Mexico", "Panama", "Papua New Guinea",
                 "Trinidad and Tobago", "United States of America" -> NORTH_AMERICA;

            case "Argentina", "Bolivia", "Brazil", "Chile", "Colombia", "Ecuador", "Guyana", "Paraguay", "Peru",
                 "Suriname", "Uruguay",
                 "Venezuela" -> SOUTH_AMERICA;

            case "Australia" -> AUSTRALIA;

            case " Nigeria", "Ethiopia", "Egypt", "Tanzania", "South Africa", "Kenya", "Uganda", "Sudan", "Algeria",
                 "Morocco", "Angola", "Ghana", "Mozambique", "Madagascar", "Niger",
                 "Mali", "Malawi", "Zambia", "Chad", "Somalia", "Zimbabwe", "Guinea", "Benin", "Burundi", "Tunisia",
                 "Togo", "Libya", "Republic of the Congo", "Liberia", "Mauritania",
                 "Namibia" -> AFRICA;

            default -> throw new IllegalStateException("Unexpected value: " + country);
        };}

        @Override

        public String toString () {
            String name = name();
            return name();
        }}

        public class pt3 {
            private static final Scanner scanner = new Scanner(System.in);

            public static void main(String[] args) {
                System.out.println("Please, enter country name: ");
                String country = scanner.nextLine();
                Continent continent = Continent.getCountry(country);
                System.out.println("This country " + country + " belongs to " + continent);

            }
        }

