package com.softserve.edu09.pt09.task1;

public class HeavyBox {
    int weight;// Make private and add getters and setters
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
