package com.softserve.edu12.pt.plant;

public enum Type {
    FLOWER, TREE, SHRUB, GRASS, MOSS;

    public static Type of(String value) {
        value = value.toUpperCase();
        try {
            return valueOf(value);
        } catch (IllegalArgumentException e) {
            throw new TypeException(value);
        }
    }
}
