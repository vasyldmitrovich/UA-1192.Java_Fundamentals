package com.softserve.edu04.pt;

public enum Continent {
    EUROPE, ASIA, AFRICA, AUSTRALIA, NORTH_AMERICA, SOUTH_AMERICA;

    public static Continent of(String country) {
        switch (country.toLowerCase()) {
            case "germany", "united kingdom", "ukraine" -> {
                return EUROPE;
            }
            case "china", "india", "japan" -> {
                return ASIA;
            }
            case "sudan", "uganda", "madagascar" -> {
                return AFRICA;
            }
            case "australia" -> {
                return AUSTRALIA;
            }
            case "united states", "usa", "canada", "mexico" -> {
                return NORTH_AMERICA;
            }
            case "brazil", "colombia", "peru" -> {
                return SOUTH_AMERICA;
            }
            default -> {
                return null;
            }
        }
    }
}
