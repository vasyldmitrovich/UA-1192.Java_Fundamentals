package com.softserve.edu09_10_collec.pt9.pt1;

public class HeavyBox {
    int weight;
    String contents;

    public HeavyBox(int weight, String contents) {
        this.weight = weight;
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                ", contents='" + contents + '\'' +
                '}';
    }
}

