package edu07;

interface Volumetric {
    double PI = 3.14;

    double getVolume();

    static double getPI() {
        return Volumetric.PI;
    }

    default String info() {
        return definition() +
                "1 litre = (10 cm)^3 = 1000 cubic centimetres = 0.001 cubic metres";
    }

    private String definition() {
        return "Volume is the quantity of three-dimensional space" +
                "enclosed by a closed surface.\n";
    }
}
