package com.softserve.edu04.pt;

public enum Continents {
    EUROPE, ASIA, AFRICA;

    @Override
    public String toString() {
        String name = name();
        return name.charAt(0) + name.substring(1).toLowerCase();
    }
}









