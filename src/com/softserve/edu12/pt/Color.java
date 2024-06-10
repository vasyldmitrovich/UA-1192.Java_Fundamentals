package com.softserve.edu12.pt;

public enum Color {
    RED("Red"), ORANGE("Orange"), YELLOW("Yellow"), GREEN("Green"), BLUE("Blue"), INDIGO("Indigo"), VIOLET("Violet");

    private final String color;

    Color(String color){
        this.color = color;
    }

    public String getValue() {
        return color;
    }
}
