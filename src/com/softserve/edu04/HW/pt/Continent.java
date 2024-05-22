package com.softserve.edu04.HW.pt;

enum Continent {
    ASIA, AFRICA, AMERICA, EUROPE;

    public static Continent getForCountry(String country) {
        return switch (country.toLowerCase()) {
            case "china", "japan", "india", "south korea" -> Continent.ASIA;
            case "egypt", "nigeria", "south africa", "kenya" -> Continent.AFRICA;
            case "usa", "canada", "mexico", "brazil", "argentina", "chile" -> Continent.AMERICA;
            case "ukraine", "france", "germany", "italy" -> Continent.EUROPE;
            default -> null;
        };
    }

    @Override
    public String toString() {
        String name = name();
        return name.charAt(0) + name.substring(1).toLowerCase();
    }
}

