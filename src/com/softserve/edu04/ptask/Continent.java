package com.softserve.edu04.ptask;

enum Continent {
    Africa, Europe, Asia, America, Australia;

    @Override
    public String toString() {
        String name = name();
        return name();
    }

    public static Continent getForCountry(String country) {
        return switch (country.toUpperCase()) {
            case "UKRAINE", "POLAND", "GERMANY", "FRANCE", "ITALY" -> Europe;
            case "USA", "KANADA", "MEXICO", "BRAZIL", "COLUMBIA" -> America;
            case "EGYPT", "ETHIOPIA", "NIGERIA", "LIBYA", "MOROCCO" -> Africa;
            case "CHINA", "JAPAN", "KOREA", "INDIA", "KAZAKHSTAN" -> Asia;
            case "AUSTRALIA" -> Australia;
            default -> throw new IllegalArgumentException("Unknown country " + country);
        };
    }
}

